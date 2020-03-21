package typingsJapgolly.nteractTransformVdom

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaType extends js.Object {
  var mediaType: String
  def onVDOMEvent(): Unit
}

object AnonMediaType {
  @scala.inline
  def apply(mediaType: String, onVDOMEvent: Callback): AnonMediaType = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("onVDOMEvent")(onVDOMEvent.toJsFn)
    __obj.asInstanceOf[AnonMediaType]
  }
}

