package typingsJapgolly.antd.components

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antd.anon.`0`
import typingsJapgolly.antd.libBreadcrumbBreadcrumbItemMod.BreadcrumbItemProps
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.Route
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumb {
  
  object Item {
    
    @JSImport("antd", "Breadcrumb.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_BreadcrumbItemProps_603766034 = new SharedBuilder_BreadcrumbItemProps_603766034(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BreadcrumbItemProps): SharedBuilder_BreadcrumbItemProps_603766034 = new SharedBuilder_BreadcrumbItemProps_603766034(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Separator {
    
    @JSImport("antd", "Breadcrumb.Separator")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Separator.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: `0`): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Breadcrumb")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def itemRender(
      value: (/* route */ Route, /* params */ Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("itemRender", js.Any.fromFunction4(value))
    
    inline def params(value: Any): this.type = set("params", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def routes(value: js.Array[Route]): this.type = set("routes", value.asInstanceOf[js.Any])
    
    inline def routesVarargs(value: Route*): this.type = set("routes", js.Array(value*))
    
    inline def separator(value: VdomNode): this.type = set("separator", value.rawNode.asInstanceOf[js.Any])
    
    inline def separatorNull: this.type = set("separator", null)
    
    inline def separatorVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("separator", js.Array(value*))
    
    inline def separatorVdomElement(value: VdomElement): this.type = set("separator", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Breadcrumb.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
