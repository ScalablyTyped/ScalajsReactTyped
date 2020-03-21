package typingsJapgolly.zepto

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeptoAnimateSettings extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
}

object ZeptoAnimateSettings {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    duration: Int | Double = null,
    easing: String = null
  ): ZeptoAnimateSettings = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoAnimateSettings]
  }
}

