package co.chatsdk.core.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here

import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.DaoException;

import co.chatsdk.core.interfaces.CoreEntity;

@org.greenrobot.greendao.annotation.Entity
public class UserThreadLink implements CoreEntity {

    @Id
    private Long id;
    private Long userId;
    private Long threadId;



    @ToOne(joinProperty = "userId")
    private BUser bUser;
    @ToOne(joinProperty = "threadId")
    private BThread bThread;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1486061129)
    private transient UserThreadLinkDao myDao;
    @Generated(hash = 226855027)
    private transient Long bUser__resolvedKey;
    @Generated(hash = 1121973162)
    private transient Long bThread__resolvedKey;

    public void setEntityID (String entityID) {

    }

    public String getEntityID () {
        return id.toString();
    }


    @Generated(hash = 1628597386)
    public UserThreadLink(Long id, Long userId, Long threadId) {
        this.id = id;
        this.userId = userId;
        this.threadId = threadId;
    }
    @Generated(hash = 1452575878)
    public UserThreadLink() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return this.userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getThreadId() {
        return this.threadId;
    }
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1701642235)
    public BUser getBUser() {
        Long __key = this.userId;
        if (bUser__resolvedKey == null || !bUser__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BUserDao targetDao = daoSession.getBUserDao();
            BUser bUserNew = targetDao.load(__key);
            synchronized (this) {
                bUser = bUserNew;
                bUser__resolvedKey = __key;
            }
        }
        return bUser;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1454431172)
    public void setBUser(BUser bUser) {
        synchronized (this) {
            this.bUser = bUser;
            userId = bUser == null ? null : bUser.getId();
            bUser__resolvedKey = userId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 814214276)
    public BThread getBThread() {
        Long __key = this.threadId;
        if (bThread__resolvedKey == null || !bThread__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BThreadDao targetDao = daoSession.getBThreadDao();
            BThread bThreadNew = targetDao.load(__key);
            synchronized (this) {
                bThread = bThreadNew;
                bThread__resolvedKey = __key;
            }
        }
        return bThread;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1312423644)
    public void setBThread(BThread bThread) {
        synchronized (this) {
            this.bThread = bThread;
            threadId = bThread == null ? null : bThread.getId();
            bThread__resolvedKey = threadId;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 2059316886)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserThreadLinkDao() : null;
    }


}