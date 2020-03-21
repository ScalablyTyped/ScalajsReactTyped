package typingsJapgolly.reactNativeTabView.pagerMod

import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.reactNativeGestureHandler.mod.PanGestureHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentState extends js.Object {
  var childPanGestureHandlerRefs: js.Array[RefHandle[PanGestureHandler]]
  var enabled: Boolean
}

object ComponentState {
  @scala.inline
  def apply(childPanGestureHandlerRefs: js.Array[RefHandle[PanGestureHandler]], enabled: Boolean): ComponentState = {
    val __obj = js.Dynamic.literal(childPanGestureHandlerRefs = childPanGestureHandlerRefs.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentState]
  }
}

