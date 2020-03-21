package typingsJapgolly.reactNativeTabView

import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.reactNativeGestureHandler.mod.PanGestureHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildPanGestureHandlerRefs extends js.Object {
  var childPanGestureHandlerRefs: js.Array[RefHandle[PanGestureHandler]]
  var enabled: Boolean
}

object AnonChildPanGestureHandlerRefs {
  @scala.inline
  def apply(childPanGestureHandlerRefs: js.Array[RefHandle[PanGestureHandler]], enabled: Boolean): AnonChildPanGestureHandlerRefs = {
    val __obj = js.Dynamic.literal(childPanGestureHandlerRefs = childPanGestureHandlerRefs.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildPanGestureHandlerRefs]
  }
}

