package typingsJapgolly.antDesignProLayout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antDesignProLayout.anon.AutoClose
import typingsJapgolly.antDesignProLayout.anon.AvatarPropstitleReactNode
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.group
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.light
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.side
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.sub
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.top
import typingsJapgolly.antDesignProLayout.esComponentsSiderMenuSiderMenuMod.PrivateSiderMenuProps
import typingsJapgolly.antDesignProLayout.esDefaultSettingsMod.ContentWidth
import typingsJapgolly.antDesignProLayout.esTypingsMod.MenuDataItem
import typingsJapgolly.antDesignProLayout.esTypingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsHeaderMod {
  
  @JSImport("@ant-design/pro-layout/es/components/Header", "DefaultHeader")
  @js.native
  val DefaultHeader: FC[HeaderViewProps & PrivateSiderMenuProps] = js.native
  
  /* Inlined @ant-design/pro-layout.@ant-design/pro-layout/es/components/GlobalHeader.GlobalHeaderProps & {  isMobile :boolean | undefined,   logo :react.react.ReactNode | undefined,   headerRender :@ant-design/pro-layout.@ant-design/pro-layout/es/typings.WithFalse<(props : @ant-design/pro-layout.@ant-design/pro-layout/es/components/Header.HeaderViewProps, defaultDom : react.react.ReactNode): react.react.ReactNode> | undefined,   headerTitleRender :@ant-design/pro-layout.@ant-design/pro-layout/es/typings.WithFalse<(logo : react.react.ReactNode, title : react.react.ReactNode, props : @ant-design/pro-layout.@ant-design/pro-layout/es/components/Header.HeaderViewProps): react.react.ReactNode> | undefined,   headerContentRender :@ant-design/pro-layout.@ant-design/pro-layout/es/typings.WithFalse<(props : @ant-design/pro-layout.@ant-design/pro-layout/es/components/Header.HeaderViewProps, defaultDom : react.react.ReactNode): react.react.ReactNode> | undefined,   siderWidth :number | undefined,   hasSiderMenu :boolean | undefined} */
  trait HeaderViewProps extends StObject {
    
    /** Layout的操作功能列表，不同的 layout 会放到不同的位置 */
    var actionsRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, js.Array[Node]]]] = js.undefined
    
    /** 头像的设置 */
    var avatarProps: js.UndefOr[WithFalse[AvatarPropstitleReactNode]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var collapsedButtonRender: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/es/components/SiderMenu/SiderMenu.SiderMenuProps['collapsedButtonRender'] */ js.Any
      ] = js.undefined
    
    var colorPrimary: js.UndefOr[String] = js.undefined
    
    var colorWeak: js.UndefOr[Boolean] = js.undefined
    
    var contentWidth: js.UndefOr[ContentWidth] = js.undefined
    
    var fixSiderbar: js.UndefOr[Boolean] = js.undefined
    
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var hasSiderMenu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name 顶部区域的渲染，包含内部的 menu
      *
      * @example headerContentRender={(props) => <div>管理控制台 </div>}
      */
    var headerContentRender: js.UndefOr[WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ Node, Node]]] = js.undefined
    
    var headerRender: js.UndefOr[WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ Node, Node]]] = js.undefined
    
    var headerTitleRender: js.UndefOr[
        WithFalse[js.Function3[/* logo */ Node, /* title */ Node, /* props */ this.type, Node]]
      ] = js.undefined
    
    var iconfontUrl: js.UndefOr[String] = js.undefined
    
    var isMobile: js.UndefOr[Boolean] = js.undefined
    
    var layout: js.UndefOr[side | top | mix] = js.undefined
    
    var logo: js.UndefOr[Node] = js.undefined
    
    var menu: js.UndefOr[AutoClose] = js.undefined
    
    var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
    
    var menuHeaderRender: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/es/components/SiderMenu/SiderMenu.SiderMenuProps['menuHeaderRender'] */ js.Any
      ] = js.undefined
    
    /**
      * @name 虽然叫menuRender，但是其实是整个 SiderMenu 面板的渲染函数
      *
      * @example 收起时完成不展示菜单 menuRender={(props,defaultDom)=> props.collapsed ? null : defaultDom}
      * @example 不展示菜单 menuRender={false}
      */
    var menuRender: js.UndefOr[WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ Node, Node]]] = js.undefined
    
    var navTheme: js.UndefOr[realDark | light] = js.undefined
    
    var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
    
    var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /**
      * @name 右侧顶部操作区域的渲染逻辑,一般会展示一个头像和一些操作
      *
      * @example 展示一个头像: rightRender={(props) => <Avatar shape="square" size="small" icon={<UserOutlined />} />}
      * @example 展示一些操作: rightRender={(props) => [<Button type="primary">操作</Button>,<Button type="primary">管理控制台</Button>]}
      */
    var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, Node]]] = js.undefined
    
    var siderMenuType: js.UndefOr[sub | group] = js.undefined
    
    var siderWidth: js.UndefOr[Double] = js.undefined
    
    var splitMenus: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String | `false`] = js.undefined
  }
  object HeaderViewProps {
    
    inline def apply(): HeaderViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderViewProps]
    }
    
    extension [Self <: HeaderViewProps](x: Self) {
      
      inline def setActionsRender(value: WithFalse[js.Function1[HeaderViewProps, js.Array[Node]]]): Self = StObject.set(x, "actionsRender", value.asInstanceOf[js.Any])
      
      inline def setActionsRenderFunction1(value: HeaderViewProps => js.Array[Node]): Self = StObject.set(x, "actionsRender", js.Any.fromFunction1(value))
      
      inline def setActionsRenderUndefined: Self = StObject.set(x, "actionsRender", js.undefined)
      
      inline def setAvatarProps(value: WithFalse[AvatarPropstitleReactNode]): Self = StObject.set(x, "avatarProps", value.asInstanceOf[js.Any])
      
      inline def setAvatarPropsUndefined: Self = StObject.set(x, "avatarProps", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedButtonRender(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/es/components/SiderMenu/SiderMenu.SiderMenuProps['collapsedButtonRender'] */ js.Any
      ): Self = StObject.set(x, "collapsedButtonRender", value.asInstanceOf[js.Any])
      
      inline def setCollapsedButtonRenderUndefined: Self = StObject.set(x, "collapsedButtonRender", js.undefined)
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
      
      inline def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
      
      inline def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
      
      inline def setContentWidth(value: ContentWidth): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      inline def setFixSiderbar(value: Boolean): Self = StObject.set(x, "fixSiderbar", value.asInstanceOf[js.Any])
      
      inline def setFixSiderbarUndefined: Self = StObject.set(x, "fixSiderbar", js.undefined)
      
      inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setHasSiderMenu(value: Boolean): Self = StObject.set(x, "hasSiderMenu", value.asInstanceOf[js.Any])
      
      inline def setHasSiderMenuUndefined: Self = StObject.set(x, "hasSiderMenu", js.undefined)
      
      inline def setHeaderContentRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ Node, Node]]): Self = StObject.set(x, "headerContentRender", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentRenderFunction2(value: (HeaderViewProps, /* defaultDom */ Node) => Node): Self = StObject.set(x, "headerContentRender", js.Any.fromFunction2(value))
      
      inline def setHeaderContentRenderUndefined: Self = StObject.set(x, "headerContentRender", js.undefined)
      
      inline def setHeaderRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ Node, Node]]): Self = StObject.set(x, "headerRender", value.asInstanceOf[js.Any])
      
      inline def setHeaderRenderFunction2(value: (HeaderViewProps, /* defaultDom */ Node) => Node): Self = StObject.set(x, "headerRender", js.Any.fromFunction2(value))
      
      inline def setHeaderRenderUndefined: Self = StObject.set(x, "headerRender", js.undefined)
      
      inline def setHeaderTitleRender(value: WithFalse[js.Function3[/* logo */ Node, /* title */ Node, HeaderViewProps, Node]]): Self = StObject.set(x, "headerTitleRender", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitleRenderFunction3(value: (/* logo */ Node, /* title */ Node, HeaderViewProps) => Node): Self = StObject.set(x, "headerTitleRender", js.Any.fromFunction3(value))
      
      inline def setHeaderTitleRenderUndefined: Self = StObject.set(x, "headerTitleRender", js.undefined)
      
      inline def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
      
      inline def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      inline def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLogo(value: VdomNode): Self = StObject.set(x, "logo", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLogoNull: Self = StObject.set(x, "logo", null)
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setLogoVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "logo", js.Array(value*))
      
      inline def setLogoVdomElement(value: VdomElement): Self = StObject.set(x, "logo", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMenu(value: AutoClose): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuData(value: js.Array[MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
      
      inline def setMenuDataUndefined: Self = StObject.set(x, "menuData", js.undefined)
      
      inline def setMenuDataVarargs(value: MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value*))
      
      inline def setMenuHeaderRender(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/es/components/SiderMenu/SiderMenu.SiderMenuProps['menuHeaderRender'] */ js.Any
      ): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      inline def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      inline def setMenuRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ Node, Node]]): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      inline def setMenuRenderFunction2(value: (HeaderViewProps, /* defaultDom */ Node) => Node): Self = StObject.set(x, "menuRender", js.Any.fromFunction2(value))
      
      inline def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setNavTheme(value: realDark | light): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      inline def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      inline def setOnCollapse(value: /* collapsed */ Boolean => Callback): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1((t0: /* collapsed */ Boolean) => value(t0).runNow()))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setOnMenuHeaderClick(value: /* e */ ReactMouseEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "onMenuHeaderClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnMenuHeaderClickUndefined: Self = StObject.set(x, "onMenuHeaderClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRightContentRender(value: WithFalse[js.Function1[HeaderViewProps, Node]]): Self = StObject.set(x, "rightContentRender", value.asInstanceOf[js.Any])
      
      inline def setRightContentRenderFunction1(value: HeaderViewProps => Node): Self = StObject.set(x, "rightContentRender", js.Any.fromFunction1(value))
      
      inline def setRightContentRenderUndefined: Self = StObject.set(x, "rightContentRender", js.undefined)
      
      inline def setSiderMenuType(value: sub | group): Self = StObject.set(x, "siderMenuType", value.asInstanceOf[js.Any])
      
      inline def setSiderMenuTypeUndefined: Self = StObject.set(x, "siderMenuType", js.undefined)
      
      inline def setSiderWidth(value: Double): Self = StObject.set(x, "siderWidth", value.asInstanceOf[js.Any])
      
      inline def setSiderWidthUndefined: Self = StObject.set(x, "siderWidth", js.undefined)
      
      inline def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
      
      inline def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
