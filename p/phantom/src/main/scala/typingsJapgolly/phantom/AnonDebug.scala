package typingsJapgolly.phantom

import typingsJapgolly.phantom.mod.winstonLeveledLogMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var debug: js.UndefOr[winstonLeveledLogMethod] = js.undefined
  var error: js.UndefOr[winstonLeveledLogMethod] = js.undefined
  var info: js.UndefOr[winstonLeveledLogMethod] = js.undefined
  var warn: js.UndefOr[winstonLeveledLogMethod] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(
    debug: winstonLeveledLogMethod = null,
    error: winstonLeveledLogMethod = null,
    info: winstonLeveledLogMethod = null,
    warn: winstonLeveledLogMethod = null
  ): AnonDebug = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebug]
  }
}

