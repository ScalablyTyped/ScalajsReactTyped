package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.Route
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProBreadcrumb {
  
  @JSImport("@ant-design/pro-layout", "ProBreadcrumb")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def itemRender(
      value: (/* route */ Route, /* params */ Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => Node
    ): this.type = set("itemRender", js.Any.fromFunction4(value))
    
    inline def params(value: Any): this.type = set("params", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def routes(value: js.Array[Route]): this.type = set("routes", value.asInstanceOf[js.Any])
    
    inline def routesVarargs(value: Route*): this.type = set("routes", js.Array(value*))
    
    inline def separator(value: VdomNode): this.type = set("separator", value.rawNode.asInstanceOf[js.Any])
    
    inline def separatorNull: this.type = set("separator", null)
    
    inline def separatorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("separator", js.Array(value*))
    
    inline def separatorVdomElement(value: VdomElement): this.type = set("separator", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ProBreadcrumb.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
