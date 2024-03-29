package typingsJapgolly.reactLeaflet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLeaflet.mod.PaneProps
import typingsJapgolly.reactLeaflet.mod.PaneState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Pane {
  
  def apply[P /* <: PaneProps */, S /* <: PaneState */](p: P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-leaflet", "Pane")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: PaneProps */, S /* <: PaneState */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLeaflet.mod.Pane[P, S]]
  
  implicit def make[P /* <: PaneProps */, S /* <: PaneState */](companion: Pane.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}
