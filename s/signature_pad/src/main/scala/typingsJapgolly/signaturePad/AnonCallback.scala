package typingsJapgolly.signaturePad

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.ErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var callback: js.UndefOr[js.Function1[/* error */ js.UndefOr[ErrorEvent], Unit]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonCallback {
  @scala.inline
  def apply(
    callback: /* error */ js.UndefOr[ErrorEvent] => Callback = null,
    height: Int | Double = null,
    ratio: Int | Double = null,
    width: Int | Double = null
  ): AnonCallback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[org.scalajs.dom.raw.ErrorEvent]) => callback(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
}

