package typingsJapgolly.reachRouter.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachRouter.mod.History
import typingsJapgolly.reachRouter.mod.LocationContext
import typingsJapgolly.reachRouter.mod.LocationProviderProps
import typingsJapgolly.reachRouter.mod.LocationProviderRenderFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocationProvider {
  
  @JSImport("@reach/router", "LocationProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reachRouter.mod.LocationProvider] {
    
    inline def children(value: Node | LocationProviderRenderFn): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* context */ LocationContext => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def history(value: History): this.type = set("history", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LocationProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LocationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
