package typingsJapgolly.reactRouter.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouter.distLibHooksMod.RenderErrorBoundaryProps
import typingsJapgolly.remixRunRouter.distHistoryMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenderErrorBoundary {
  
  inline def apply(error: Any, location: Location): Builder = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RenderErrorBoundaryProps]))
  }
  
  @JSImport("react-router/dist/lib/hooks", "RenderErrorBoundary")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouter.distLibHooksMod.RenderErrorBoundary] {
    
    inline def component(value: VdomNode): this.type = set("component", value.rawNode.asInstanceOf[js.Any])
    
    inline def componentNull: this.type = set("component", null)
    
    inline def componentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("component", js.Array(value*))
    
    inline def componentVdomElement(value: VdomElement): this.type = set("component", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: RenderErrorBoundaryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
