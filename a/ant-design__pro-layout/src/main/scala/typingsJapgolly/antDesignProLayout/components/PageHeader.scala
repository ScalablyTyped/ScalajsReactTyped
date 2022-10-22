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
import typingsJapgolly.antDesignProLayout.esComponentsPageHeaderMod.PageHeaderProps
import typingsJapgolly.antd.libAvatarAvatarMod.AvatarProps
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageHeader {
  
  @JSImport("@ant-design/pro-layout", "PageHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def avatar(value: AvatarProps): this.type = set("avatar", value.asInstanceOf[js.Any])
    
    inline def backIcon(value: VdomNode): this.type = set("backIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def backIconNull: this.type = set("backIcon", null)
    
    inline def backIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("backIcon", js.Array(value*))
    
    inline def backIconVdomElement(value: VdomElement): this.type = set("backIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def breadcrumb(value: BreadcrumbProps | Element): this.type = set("breadcrumb", value.asInstanceOf[js.Any])
    
    inline def breadcrumbRender(value: (PageHeaderProps, /* defaultDom */ Node) => Node): this.type = set("breadcrumbRender", js.Any.fromFunction2(value))
    
    inline def breadcrumbVdomElement(value: VdomElement): this.type = set("breadcrumb", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def ghost(value: Boolean): this.type = set("ghost", value.asInstanceOf[js.Any])
    
    inline def onBack(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): this.type = set("onBack", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def subTitle(value: VdomNode): this.type = set("subTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subTitleNull: this.type = set("subTitle", null)
    
    inline def subTitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subTitle", js.Array(value*))
    
    inline def subTitleVdomElement(value: VdomElement): this.type = set("subTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def tags(value: Element | js.Array[Element]): this.type = set("tags", value.asInstanceOf[js.Any])
    
    inline def tagsVarargs(value: Element*): this.type = set("tags", js.Array(value*))
    
    inline def tagsVdomElement(value: VdomElement): this.type = set("tags", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PageHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PageHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
