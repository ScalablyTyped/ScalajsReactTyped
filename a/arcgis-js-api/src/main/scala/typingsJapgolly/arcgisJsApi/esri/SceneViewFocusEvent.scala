package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewFocusEvent extends js.Object {
  var native: js.Any
  var target: View
}

object SceneViewFocusEvent {
  @scala.inline
  def apply(native: js.Any, target: View): SceneViewFocusEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SceneViewFocusEvent]
  }
}

