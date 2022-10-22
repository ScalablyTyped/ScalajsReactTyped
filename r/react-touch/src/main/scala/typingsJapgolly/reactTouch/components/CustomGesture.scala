package typingsJapgolly.reactTouch.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactTouch.mod.CustomGestureProps
import typingsJapgolly.reactTouch.mod.moves
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomGesture {
  
  inline def apply(config: js.Array[moves], onGesture: Callback): Default[typingsJapgolly.reactTouch.mod.CustomGesture] = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onGesture = onGesture.toJsFn)
    new Default[typingsJapgolly.reactTouch.mod.CustomGesture](js.Array(this.component, __props.asInstanceOf[CustomGestureProps]))
  }
  
  @JSImport("react-touch", "CustomGesture")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CustomGestureProps): Default[typingsJapgolly.reactTouch.mod.CustomGesture] = new Default[typingsJapgolly.reactTouch.mod.CustomGesture](js.Array(this.component, p.asInstanceOf[js.Any]))
}
