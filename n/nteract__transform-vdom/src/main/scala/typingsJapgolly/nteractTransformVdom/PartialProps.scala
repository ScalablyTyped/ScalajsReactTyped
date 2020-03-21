package typingsJapgolly.nteractTransformVdom

import japgolly.scalajs.react.Callback
import typingsJapgolly.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typingsJapgolly.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typingsJapgolly.nteractTransformVdom.objectToReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nteract/transform-vdom.@nteract/transform-vdom.Props> */
trait PartialProps extends js.Object {
  var data: js.UndefOr[VDOMEl] = js.undefined
  var mediaType: js.UndefOr[applicationSlashvdomDotv1Plussignjson] = js.undefined
  var onVDOMEvent: js.UndefOr[js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]] = js.undefined
}

object PartialProps {
  @scala.inline
  def apply(
    data: VDOMEl = null,
    mediaType: applicationSlashvdomDotv1Plussignjson = null,
    onVDOMEvent: (/* targetName */ String, /* event */ SerializedEvent[js.Any]) => Callback = null
  ): PartialProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (onVDOMEvent != null) __obj.updateDynamic("onVDOMEvent")(js.Any.fromFunction2((t0: /* targetName */ java.lang.String, t1: /* event */ typingsJapgolly.nteractTransformVdom.eventToObjectMod.SerializedEvent[js.Any]) => onVDOMEvent(t0, t1).runNow()))
    __obj.asInstanceOf[PartialProps]
  }
}

