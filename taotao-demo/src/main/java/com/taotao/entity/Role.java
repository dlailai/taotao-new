package com.taotao.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_role")
public class Role {
    /**
     * ��ɫid
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**
     * ��ɫ����
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * ����ʱ��
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * ������
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * ������
     */
    @Column(name = "updated_by")
    private String updatedBy;

    /**
     * ������ʱ��
     */
    @Column(name = "last_updated_at")
    private Date lastUpdatedAt;

    /**
     * ��ȡ��ɫid
     *
     * @return role_id - ��ɫid
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * ���ý�ɫid
     *
     * @param roleId ��ɫid
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * ��ȡ��ɫ����
     *
     * @return role_name - ��ɫ����
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * ���ý�ɫ����
     *
     * @param roleName ��ɫ����
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return created_at - ����ʱ��
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createdAt ����ʱ��
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * ��ȡ������
     *
     * @return created_by - ������
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * ���ô�����
     *
     * @param createdBy ������
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * ��ȡ������
     *
     * @return updated_by - ������
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * ���ø�����
     *
     * @param updatedBy ������
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * ��ȡ������ʱ��
     *
     * @return last_updated_at - ������ʱ��
     */
    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * ����������ʱ��
     *
     * @param lastUpdatedAt ������ʱ��
     */
    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
}