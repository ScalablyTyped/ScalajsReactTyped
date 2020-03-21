package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`key-down`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewKeyDownEvent extends js.Object {
  var key: String
  var native: js.Any
  var repeat: Boolean
  var stopPropagation: js.Function
  var timestamp: Double
  var `type`: `key-down`
}

object SceneViewKeyDownEvent {
  @scala.inline
  def apply(
    key: String,
    native: js.Any,
    repeat: Boolean,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: `key-down`
  ): SceneViewKeyDownEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewKeyDownEvent]
  }
}

