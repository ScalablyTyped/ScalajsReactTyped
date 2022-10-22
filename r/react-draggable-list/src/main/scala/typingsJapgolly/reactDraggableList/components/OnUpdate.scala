package typingsJapgolly.reactDraggableList.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDraggableList.distSrcOnUpdateMod.Props
import typingsJapgolly.reactDraggableList.distSrcOnUpdateMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnUpdate {
  
  inline def apply(cb: Callback): Default[default] = {
    val __props = js.Dynamic.literal(cb = cb.toJsFn)
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-draggable-list/dist/src/OnUpdate", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
