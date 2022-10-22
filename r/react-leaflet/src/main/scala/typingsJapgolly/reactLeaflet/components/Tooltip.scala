package typingsJapgolly.reactLeaflet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.leaflet.mod.Tooltip_
import typingsJapgolly.reactLeaflet.mod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Tooltip {
  
  def apply[P /* <: TooltipProps */, E /* <: Tooltip_ */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "Tooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: TooltipProps */, E /* <: Tooltip_ */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeaflet.mod.Tooltip[P, E]]
  
  implicit def make[P /* <: TooltipProps */, E /* <: Tooltip_ */](companion: Tooltip.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
