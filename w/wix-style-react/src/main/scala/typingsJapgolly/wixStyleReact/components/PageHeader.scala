package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.HasBackgroundImage
import typingsJapgolly.wixStyleReact.distTypesPageHeaderMod.ActionsBarRenderFn
import typingsJapgolly.wixStyleReact.distTypesPageHeaderMod.BreadcrumbsRenderFn
import typingsJapgolly.wixStyleReact.distTypesPageHeaderMod.PageHeaderProps
import typingsJapgolly.wixStyleReact.distTypesPageHeaderMod.TitleRenderFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageHeader {
  
  @JSImport("wix-style-react", "PageHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.PageHeader] {
    
    inline def actionsBar(value: Node | ActionsBarRenderFn): this.type = set("actionsBar", value.asInstanceOf[js.Any])
    
    inline def actionsBarFunction1(value: /* data */ HasBackgroundImage => Node): this.type = set("actionsBar", js.Any.fromFunction1(value))
    
    inline def actionsBarNull: this.type = set("actionsBar", null)
    
    inline def actionsBarVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("actionsBar", js.Array(value*))
    
    inline def actionsBarVdomElement(value: VdomElement): this.type = set("actionsBar", value.rawElement.asInstanceOf[js.Any])
    
    inline def breadcrumbs(value: Node | BreadcrumbsRenderFn): this.type = set("breadcrumbs", value.asInstanceOf[js.Any])
    
    inline def breadcrumbsFunction1(value: /* minimized */ Boolean => Node): this.type = set("breadcrumbs", js.Any.fromFunction1(value))
    
    inline def breadcrumbsNull: this.type = set("breadcrumbs", null)
    
    inline def breadcrumbsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("breadcrumbs", js.Array(value*))
    
    inline def breadcrumbsVdomElement(value: VdomElement): this.type = set("breadcrumbs", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def hasBackgroundImage(value: Boolean): this.type = set("hasBackgroundImage", value.asInstanceOf[js.Any])
    
    inline def minimized(value: Boolean): this.type = set("minimized", value.asInstanceOf[js.Any])
    
    inline def onBackClicked(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onBackClicked", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def showBackButton(value: Boolean): this.type = set("showBackButton", value.asInstanceOf[js.Any])
    
    inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subtitleNull: this.type = set("subtitle", null)
    
    inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
    
    inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: Node | TitleRenderFn): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleFunction1(value: /* minimized */ Boolean => Node): this.type = set("title", js.Any.fromFunction1(value))
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PageHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PageHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
