package typingsJapgolly.reactMapGl.components

import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMapGl.mod.BaseControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object BaseControl {
  
  def apply[T /* <: BaseControlProps */, S /* <: Element */](p: T): Builder[T, S] = new Builder[T, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-map-gl", "BaseControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: BaseControlProps */, S /* <: Element */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.BaseControl[T, S]]
  
  implicit def make[T /* <: BaseControlProps */, S /* <: Element */](companion: BaseControl.type): Builder[T, S] = new Builder[T, S](js.Array(this.component, js.Dictionary.empty))()
}
