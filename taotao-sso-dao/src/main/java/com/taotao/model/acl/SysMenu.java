package com.taotao.model.acl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 菜单
 */

@NoArgsConstructor
@AllArgsConstructor
@Table(name="menu")
public class SysMenu extends WebModule{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "module_url")
    private String moduleurl;
    @Column(name = "match_order")
    private Integer matchorder; //在权限分配时的匹配顺序
    @Column(name = "menu_code")
    private String menucode;
    @Column(name = "menu_title")
    private String menutitle;
    @Column(name = "target")
    private String target;
    @Column(name = "display")
    private String display; //是否
    @Column(name = "tag")
    private String tag;		//分类：gewa，partner
    @Column(name = "role_names")
    private String rolenames;
    @Column(name = "top")
    private boolean top;

    public Integer getMatchorder() {
        return matchorder;
    }

    public void setMatchorder(Integer matchorder) {
        this.matchorder = matchorder;
    }

    @Override
    public Serializable realId() {
        return id;
    }

    @Override
    public String getModuleurl() {
        return moduleurl;
    }

    public void setModuleurl(String moduleurl) {
        this.moduleurl = moduleurl;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode;
    }

    @Override
    public String getMenutitle() {
        return menutitle;
    }

    public void setMenutitle(String menutitle) {
        this.menutitle = menutitle;
    }

    @Override
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public boolean isTop() {
        if (top) {
            return top;
        }
        return StringUtils.length(menucode) == 2;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    @Override
    public String getParentcode() {
        return StringUtils.substring(menucode, 0, 2);
    }

    @Override
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getTopMenucode() {
        if (StringUtils.isNotBlank(menucode) && menucode.length() == 4) {
            return menucode.substring(0, 2);
        }
        return null;
    }

    @Override
    public String getRolenames() {
        return rolenames;
    }

    public void setRolenames(String rolenames) {
        this.rolenames = rolenames;
    }
}
