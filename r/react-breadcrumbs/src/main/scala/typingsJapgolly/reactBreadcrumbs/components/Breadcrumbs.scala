package typingsJapgolly.reactBreadcrumbs.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactBreadcrumbs.mod.BreadcrumbsProps
import typingsJapgolly.reactBreadcrumbs.mod.Crumbs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumbs {
  
  @JSImport("react-breadcrumbs", "Breadcrumbs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBreadcrumbs.mod.Breadcrumbs] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def separator(value: VdomNode): this.type = set("separator", value.rawNode.asInstanceOf[js.Any])
    
    inline def separatorNull: this.type = set("separator", null)
    
    inline def separatorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("separator", js.Array(value*))
    
    inline def separatorVdomElement(value: VdomElement): this.type = set("separator", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCrumbs(value: /* crumbs */ Crumbs => Node): this.type = set("setCrumbs", js.Any.fromFunction1(value))
    
    inline def wrapper(value: FunctionComponent[js.Object] | ComponentClassP[js.Object]): this.type = set("wrapper", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Breadcrumbs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[BreadcrumbsProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
