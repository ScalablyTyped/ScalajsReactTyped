package typingsJapgolly.nteractTransformVdom.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typingsJapgolly.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typingsJapgolly.nteractTransformVdom.objectToReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var data: VDOMEl
  var mediaType: applicationSlashvdomDotv1Plussignjson
  def onVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit
}

object Props {
  @scala.inline
  def apply(
    data: VDOMEl,
    mediaType: applicationSlashvdomDotv1Plussignjson,
    onVDOMEvent: (String, SerializedEvent[js.Any]) => Callback
  ): Props = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("onVDOMEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.nteractTransformVdom.eventToObjectMod.SerializedEvent[js.Any]) => onVDOMEvent(t0, t1).runNow()))
    __obj.asInstanceOf[Props]
  }
}

