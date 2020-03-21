package typingsJapgolly.sendmail

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var debug: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function0[Unit]] = js.undefined
  var info: js.UndefOr[js.Function0[Unit]] = js.undefined
  var warn: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(
    debug: js.UndefOr[Callback] = js.undefined,
    error: js.UndefOr[Callback] = js.undefined,
    info: js.UndefOr[Callback] = js.undefined,
    warn: js.UndefOr[Callback] = js.undefined
  ): AnonDebug = {
    val __obj = js.Dynamic.literal()
    debug.foreach(p => __obj.updateDynamic("debug")(p.toJsFn))
    error.foreach(p => __obj.updateDynamic("error")(p.toJsFn))
    info.foreach(p => __obj.updateDynamic("info")(p.toJsFn))
    warn.foreach(p => __obj.updateDynamic("warn")(p.toJsFn))
    __obj.asInstanceOf[AnonDebug]
  }
}

