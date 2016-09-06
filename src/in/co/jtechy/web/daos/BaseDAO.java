package in.co.jtechy.web.daos;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

@SuppressWarnings("rawtypes")
public abstract class BaseDAO extends HibernateDaoSupport {

    public BaseDAO() {
        super();

    }

    public boolean contains(Object entity) throws Exception {
        return getHibernateTemplate().contains(entity);
    }

    public Object save(Object entity) throws Exception {
        return getHibernateTemplate().save(entity);
    }

    public void saveOrUpdate(Object entity) throws Exception {
        getHibernateTemplate().saveOrUpdate(entity);
    }

    public void delete(Object entity) throws Exception {
        getHibernateTemplate().delete(entity);
    }

    public void deleteAll(Collection entities) throws Exception {
        getHibernateTemplate().deleteAll(entities);
    }

	public List find(String queryString) throws Exception {
        return getHibernateTemplate().find(queryString);
    }

    public List find(String queryString, Object value) throws Exception {
        return getHibernateTemplate().find(queryString, value);
    }

    public List find(String queryString, Object[] values) throws Exception {
        return getHibernateTemplate().find(queryString, values);
    }

    public List findAll(Class entityClass) {
        return getHibernateTemplate().find("from " + entityClass.getName());
    }

    public Object get(Class entityClass, Object id) throws Exception {
        return getHibernateTemplate().get(entityClass, (Serializable) id);
    }

    public void clear() throws Exception {
        getHibernateTemplate().clear();
    }

    public void flush() throws Exception {
        getHibernateTemplate().flush();
    }

    public Object getBinding() {
        return getHibernateTemplate();
    }

    public void setFetchSize(int fetchSize) {
        getHibernateTemplate().setFetchSize(fetchSize);
    }

    public void setMaxResults(int maxResults) {
        getHibernateTemplate().setMaxResults(maxResults);
    }

    public void update(Object entity) throws Exception {
        getHibernateTemplate().update(entity);

    }

    public void refresh(Object entity) throws Exception {
        getHibernateTemplate().refresh(entity);

    }

    public List runQuery(String queryString) throws Exception {
        Session ss = null;
        List list = null;
        try {
            ss = getSession();
            Query query = ss.createQuery(queryString);
            list = query.list();
            ss.close();
        } catch (Exception e) {
            if (ss != null) {
                ss.close();
            }
        }
        return list;
    }
    
    public int executeQuery(String queryString) throws Exception {
        Session ss = null;
        int result = 0;        
        try {
            ss = getSession();
            Query query = ss.createQuery(queryString);
            result = query.executeUpdate();            
            ss.close();
        } catch (Exception e) {
            if (ss != null) {
                ss.close();
            }
        }
        return result;
    }
    
    public int executeNativeQuery(String queryString) throws Exception {
        Session ss = null;
        int result = 0;        
        try {
            ss = getSession();
            SQLQuery query = ss.createSQLQuery(queryString);
            result = query.executeUpdate();            
            ss.close();
        } catch (Exception e) {
            if (ss != null) {
                ss.close();
            }
        }
        return result;
    }
    
}
