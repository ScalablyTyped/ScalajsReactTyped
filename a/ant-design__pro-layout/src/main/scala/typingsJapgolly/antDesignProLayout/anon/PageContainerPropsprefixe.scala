package typingsJapgolly.antDesignProLayout.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsJapgolly.antDesignProLayout.esComponentsPageContainerMod.PageContainerProps
import typingsJapgolly.antDesignProLayout.esComponentsPageContainerStyleMod.pageContainerToken
import typingsJapgolly.antDesignProLayout.esComponentsWaterMarkMod.WaterMarkProps
import typingsJapgolly.antDesignProLayout.esTypingsMod.WithFalse
import typingsJapgolly.antd.libAvatarAvatarMod.AvatarProps
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.antd.libSpinMod.SpinProps
import typingsJapgolly.antd.libTabsMod.TabsProps
import typingsJapgolly.rcTabs.esInterfaceMod.TabBarExtraContent
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/es/components/PageContainer.PageContainerProps & {  prefixedClassName :string} */
trait PageContainerPropsprefixe extends StObject {
  
  /**
    * 与 antd 完全相同
    *
    * @name 固钉的配置
    */
  var affixProps: js.UndefOr[OmitAffixPropschildren] = js.undefined
  
  var avatar: js.UndefOr[AvatarProps] = js.undefined
  
  var backIcon: js.UndefOr[Node] = js.undefined
  
  /** @name 配置面包屑 */
  var breadcrumb: js.UndefOr[BreadcrumbProps] = js.undefined
  
  /** 自定义 breadcrumb,返回false不展示 */
  var breadcrumbRender: js.UndefOr[(js.Function2[/* props */ this.type, /* defaultDom */ Node, Node]) | `false`] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[Node] = js.undefined
  
  var extra: js.UndefOr[Node] = js.undefined
  
  var extraContent: js.UndefOr[Node] = js.undefined
  
  /**
    * @deprecated 请使用 fixedHeader
    * @name 固定 PageHeader 到页面顶部
    */
  var fixHeader: js.UndefOr[Boolean] = js.undefined
  
  /** @name 固定 PageHeader 到页面顶部 */
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  
  var footer: js.UndefOr[js.Array[Node]] = js.undefined
  
  var ghost: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 与 antd 完全相同
    *
    * @name PageHeader 的配置
    */
  var header: js.UndefOr[PartialPageHeaderPropschi] = js.undefined
  
  /**
    * 只加载内容区域
    *
    * @name 是否加载
    */
  var loading: js.UndefOr[Boolean | SpinProps | Node] = js.undefined
  
  var onBack: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], Unit]] = js.undefined
  
  /** @name tab 修改时触发 */
  var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.undefined
  
  /** @name 自定义 pageHeader */
  var pageHeaderRender: js.UndefOr[WithFalse[js.Function1[/* props */ PageContainerProps, Node]]] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var prefixedClassName: String
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var subTitle: js.UndefOr[Node] = js.undefined
  
  /** @name 当前选中 tab 的 key */
  var tabActiveKey: js.UndefOr[String] = js.undefined
  
  /** @name tab 上额外的区域 */
  var tabBarExtraContent: js.UndefOr[TabBarExtraContent] = js.undefined
  
  /** @name tabs 的列表 */
  var tabList: js.UndefOr[js.Array[TabPanePropskeyReactTextu]] = js.undefined
  
  /** @name tabs 的其他配置 */
  var tabProps: js.UndefOr[TabsProps] = js.undefined
  
  var tags: js.UndefOr[Element | js.Array[Element]] = js.undefined
  
  var title: js.UndefOr[Node | `false`] = js.undefined
  
  /**
    * 自定义的 token
    */
  var token: js.UndefOr[pageContainerToken] = js.undefined
  
  /** @name 水印的配置 */
  var waterMarkProps: js.UndefOr[WaterMarkProps] = js.undefined
}
object PageContainerPropsprefixe {
  
  inline def apply(prefixedClassName: String): PageContainerPropsprefixe = {
    val __obj = js.Dynamic.literal(prefixedClassName = prefixedClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageContainerPropsprefixe]
  }
  
  extension [Self <: PageContainerPropsprefixe](x: Self) {
    
    inline def setAffixProps(value: OmitAffixPropschildren): Self = StObject.set(x, "affixProps", value.asInstanceOf[js.Any])
    
    inline def setAffixPropsUndefined: Self = StObject.set(x, "affixProps", js.undefined)
    
    inline def setAvatar(value: AvatarProps): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setBackIcon(value: VdomNode): Self = StObject.set(x, "backIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setBackIconNull: Self = StObject.set(x, "backIcon", null)
    
    inline def setBackIconUndefined: Self = StObject.set(x, "backIcon", js.undefined)
    
    inline def setBackIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "backIcon", js.Array(value*))
    
    inline def setBackIconVdomElement(value: VdomElement): Self = StObject.set(x, "backIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setBreadcrumb(value: BreadcrumbProps): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
    
    inline def setBreadcrumbRender(value: (js.Function2[PageContainerPropsprefixe, /* defaultDom */ Node, Node]) | `false`): Self = StObject.set(x, "breadcrumbRender", value.asInstanceOf[js.Any])
    
    inline def setBreadcrumbRenderFunction2(value: (PageContainerPropsprefixe, /* defaultDom */ Node) => Node): Self = StObject.set(x, "breadcrumbRender", js.Any.fromFunction2(value))
    
    inline def setBreadcrumbRenderUndefined: Self = StObject.set(x, "breadcrumbRender", js.undefined)
    
    inline def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExtra(value: VdomNode): Self = StObject.set(x, "extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def setExtraContent(value: VdomNode): Self = StObject.set(x, "extraContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setExtraContentNull: Self = StObject.set(x, "extraContent", null)
    
    inline def setExtraContentUndefined: Self = StObject.set(x, "extraContent", js.undefined)
    
    inline def setExtraContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extraContent", js.Array(value*))
    
    inline def setExtraContentVdomElement(value: VdomElement): Self = StObject.set(x, "extraContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExtraNull: Self = StObject.set(x, "extra", null)
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setExtraVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extra", js.Array(value*))
    
    inline def setExtraVdomElement(value: VdomElement): Self = StObject.set(x, "extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
    
    inline def setFixHeaderUndefined: Self = StObject.set(x, "fixHeader", js.undefined)
    
    inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    inline def setFooter(value: js.Array[Node]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterVarargs(value: Node*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
    
    inline def setHeader(value: PartialPageHeaderPropschi): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setLoading(value: Boolean | SpinProps | Node): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingNull: Self = StObject.set(x, "loading", null)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setLoadingVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loading", js.Array(value*))
    
    inline def setLoadingVdomElement(value: VdomElement): Self = StObject.set(x, "loading", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnBack(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): Self = StObject.set(x, "onBack", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
    
    inline def setOnTabChange(value: /* activeKey */ String => Callback): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1((t0: /* activeKey */ String) => value(t0).runNow()))
    
    inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
    
    inline def setPageHeaderRender(value: WithFalse[js.Function1[/* props */ PageContainerProps, Node]]): Self = StObject.set(x, "pageHeaderRender", value.asInstanceOf[js.Any])
    
    inline def setPageHeaderRenderFunction1(value: /* props */ PageContainerProps => Node): Self = StObject.set(x, "pageHeaderRender", js.Any.fromFunction1(value))
    
    inline def setPageHeaderRenderUndefined: Self = StObject.set(x, "pageHeaderRender", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setPrefixedClassName(value: String): Self = StObject.set(x, "prefixedClassName", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubTitle(value: VdomNode): Self = StObject.set(x, "subTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSubTitleNull: Self = StObject.set(x, "subTitle", null)
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setSubTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subTitle", js.Array(value*))
    
    inline def setSubTitleVdomElement(value: VdomElement): Self = StObject.set(x, "subTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
    
    inline def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
    
    inline def setTabBarExtraContent(value: TabBarExtraContent): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
    
    inline def setTabBarExtraContentNull: Self = StObject.set(x, "tabBarExtraContent", null)
    
    inline def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
    
    inline def setTabBarExtraContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tabBarExtraContent", js.Array(value*))
    
    inline def setTabBarExtraContentVdomElement(value: VdomElement): Self = StObject.set(x, "tabBarExtraContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTabList(value: js.Array[TabPanePropskeyReactTextu]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
    
    inline def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
    
    inline def setTabListVarargs(value: TabPanePropskeyReactTextu*): Self = StObject.set(x, "tabList", js.Array(value*))
    
    inline def setTabProps(value: TabsProps): Self = StObject.set(x, "tabProps", value.asInstanceOf[js.Any])
    
    inline def setTabPropsUndefined: Self = StObject.set(x, "tabProps", js.undefined)
    
    inline def setTags(value: Element | js.Array[Element]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Element*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTagsVdomElement(value: VdomElement): Self = StObject.set(x, "tags", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTitle(value: Node | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    
    inline def setToken(value: pageContainerToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setWaterMarkProps(value: WaterMarkProps): Self = StObject.set(x, "waterMarkProps", value.asInstanceOf[js.Any])
    
    inline def setWaterMarkPropsUndefined: Self = StObject.set(x, "waterMarkProps", js.undefined)
  }
}
