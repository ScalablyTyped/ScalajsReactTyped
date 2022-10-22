package typingsJapgolly.reactMapGl.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMapGl.mod.DraggableControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object DraggableControl {
  
  def apply[T /* <: DraggableControlProps */](p: T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-map-gl", "DraggableControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: DraggableControlProps */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.DraggableControl[T]]
  
  implicit def make[T /* <: DraggableControlProps */](companion: DraggableControl.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
