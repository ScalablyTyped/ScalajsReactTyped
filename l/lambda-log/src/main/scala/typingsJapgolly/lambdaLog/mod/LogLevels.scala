package typingsJapgolly.lambdaLog.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lambdaLog.lambdaLogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevels
  extends /* key */ StringDictionary[js.Any] {
  var debug: typingsJapgolly.lambdaLog.lambdaLogStrings.log | `false`
  var error: typingsJapgolly.lambdaLog.lambdaLogStrings.error
  var info: typingsJapgolly.lambdaLog.lambdaLogStrings.info
  var warn: typingsJapgolly.lambdaLog.lambdaLogStrings.warn
}

object LogLevels {
  @scala.inline
  def apply(
    debug: typingsJapgolly.lambdaLog.lambdaLogStrings.log | `false`,
    error: typingsJapgolly.lambdaLog.lambdaLogStrings.error,
    info: typingsJapgolly.lambdaLog.lambdaLogStrings.info,
    warn: typingsJapgolly.lambdaLog.lambdaLogStrings.warn,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): LogLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevels]
  }
}

