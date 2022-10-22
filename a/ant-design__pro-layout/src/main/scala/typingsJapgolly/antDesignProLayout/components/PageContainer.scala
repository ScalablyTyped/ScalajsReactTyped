package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.OmitAffixPropschildren
import typingsJapgolly.antDesignProLayout.anon.PartialPageHeaderPropschi
import typingsJapgolly.antDesignProLayout.anon.TabPanePropskeyReactTextu
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

object PageContainer {
  
  @JSImport("@ant-design/pro-layout", "PageContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def affixProps(value: OmitAffixPropschildren): this.type = set("affixProps", value.asInstanceOf[js.Any])
    
    inline def avatar(value: AvatarProps): this.type = set("avatar", value.asInstanceOf[js.Any])
    
    inline def backIcon(value: VdomNode): this.type = set("backIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def backIconNull: this.type = set("backIcon", null)
    
    inline def backIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("backIcon", js.Array(value*))
    
    inline def backIconVdomElement(value: VdomElement): this.type = set("backIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def breadcrumb(value: BreadcrumbProps): this.type = set("breadcrumb", value.asInstanceOf[js.Any])
    
    inline def breadcrumbRender(value: (js.Function2[PageContainerProps, /* defaultDom */ Node, Node]) | `false`): this.type = set("breadcrumbRender", value.asInstanceOf[js.Any])
    
    inline def breadcrumbRenderFunction2(value: (PageContainerProps, /* defaultDom */ Node) => Node): this.type = set("breadcrumbRender", js.Any.fromFunction2(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraContent(value: VdomNode): this.type = set("extraContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraContentNull: this.type = set("extraContent", null)
    
    inline def extraContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extraContent", js.Array(value*))
    
    inline def extraContentVdomElement(value: VdomElement): this.type = set("extraContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def fixHeader(value: Boolean): this.type = set("fixHeader", value.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
    
    inline def footer(value: js.Array[Node]): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerVarargs(value: Node*): this.type = set("footer", js.Array(value*))
    
    inline def ghost(value: Boolean): this.type = set("ghost", value.asInstanceOf[js.Any])
    
    inline def header(value: PartialPageHeaderPropschi): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean | SpinProps | Node): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingNull: this.type = set("loading", null)
    
    inline def loadingVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("loading", js.Array(value*))
    
    inline def loadingVdomElement(value: VdomElement): this.type = set("loading", value.rawElement.asInstanceOf[js.Any])
    
    inline def onBack(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): this.type = set("onBack", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def onTabChange(value: /* activeKey */ String => Callback): this.type = set("onTabChange", js.Any.fromFunction1((t0: /* activeKey */ String) => value(t0).runNow()))
    
    inline def pageHeaderRender(value: WithFalse[js.Function1[PageContainerProps, Node]]): this.type = set("pageHeaderRender", value.asInstanceOf[js.Any])
    
    inline def pageHeaderRenderFunction1(value: PageContainerProps => Node): this.type = set("pageHeaderRender", js.Any.fromFunction1(value))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def subTitle(value: VdomNode): this.type = set("subTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subTitleNull: this.type = set("subTitle", null)
    
    inline def subTitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subTitle", js.Array(value*))
    
    inline def subTitleVdomElement(value: VdomElement): this.type = set("subTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def tabActiveKey(value: String): this.type = set("tabActiveKey", value.asInstanceOf[js.Any])
    
    inline def tabBarExtraContent(value: TabBarExtraContent): this.type = set("tabBarExtraContent", value.asInstanceOf[js.Any])
    
    inline def tabBarExtraContentNull: this.type = set("tabBarExtraContent", null)
    
    inline def tabBarExtraContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tabBarExtraContent", js.Array(value*))
    
    inline def tabBarExtraContentVdomElement(value: VdomElement): this.type = set("tabBarExtraContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def tabList(value: js.Array[TabPanePropskeyReactTextu]): this.type = set("tabList", value.asInstanceOf[js.Any])
    
    inline def tabListVarargs(value: TabPanePropskeyReactTextu*): this.type = set("tabList", js.Array(value*))
    
    inline def tabProps(value: TabsProps): this.type = set("tabProps", value.asInstanceOf[js.Any])
    
    inline def tags(value: Element | js.Array[Element]): this.type = set("tags", value.asInstanceOf[js.Any])
    
    inline def tagsVarargs(value: Element*): this.type = set("tags", js.Array(value*))
    
    inline def tagsVdomElement(value: VdomElement): this.type = set("tags", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: Node | `false`): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def token(value: pageContainerToken): this.type = set("token", value.asInstanceOf[js.Any])
    
    inline def waterMarkProps(value: WaterMarkProps): this.type = set("waterMarkProps", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PageContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PageContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
