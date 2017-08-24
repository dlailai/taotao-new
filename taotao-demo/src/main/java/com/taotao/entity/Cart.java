package com.taotao.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_cart")
public class Cart {
    @Id
    private Long pid;

    /**
     * ��������
     */
    @Column(name = "cart_id")
    private String cartId;

    /**
     * ���ƺ���
     */
    @Column(name = "cart_brand_code")
    private String cartBrandCode;

    /**
     * ��������
     */
    @Column(name = "cart_name")
    private String cartName;

    /**
     * ��������
     */
    @Column(name = "cart_type")
    private String cartType;

    /**
     * ״̬ 1:����  2:ͣ�� 3:�޸���·��
     */
    private Integer status;

    /**
     * ��ʻԱ����
     */
    @Column(name = "driver_id")
    private String driverId;

    /**
     * ·�߱���
     */
    @Column(name = "way_id")
    private String wayId;

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
     * @return pid
     */
    public Long getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * ��ȡ��������
     *
     * @return cart_id - ��������
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * ���ó�������
     *
     * @param cartId ��������
     */
    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    /**
     * ��ȡ���ƺ���
     *
     * @return cart_brand_code - ���ƺ���
     */
    public String getCartBrandCode() {
        return cartBrandCode;
    }

    /**
     * ���ó��ƺ���
     *
     * @param cartBrandCode ���ƺ���
     */
    public void setCartBrandCode(String cartBrandCode) {
        this.cartBrandCode = cartBrandCode;
    }

    /**
     * ��ȡ��������
     *
     * @return cart_name - ��������
     */
    public String getCartName() {
        return cartName;
    }

    /**
     * ���ó�������
     *
     * @param cartName ��������
     */
    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    /**
     * ��ȡ��������
     *
     * @return cart_type - ��������
     */
    public String getCartType() {
        return cartType;
    }

    /**
     * ���ó�������
     *
     * @param cartType ��������
     */
    public void setCartType(String cartType) {
        this.cartType = cartType;
    }

    /**
     * ��ȡ״̬ 1:����  2:ͣ�� 3:�޸���·��
     *
     * @return status - ״̬ 1:����  2:ͣ�� 3:�޸���·��
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ����״̬ 1:����  2:ͣ�� 3:�޸���·��
     *
     * @param status ״̬ 1:����  2:ͣ�� 3:�޸���·��
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ��ʻԱ����
     *
     * @return driver_id - ��ʻԱ����
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * ���ü�ʻԱ����
     *
     * @param driverId ��ʻԱ����
     */
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    /**
     * ��ȡ·�߱���
     *
     * @return way_id - ·�߱���
     */
    public String getWayId() {
        return wayId;
    }

    /**
     * ����·�߱���
     *
     * @param wayId ·�߱���
     */
    public void setWayId(String wayId) {
        this.wayId = wayId;
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