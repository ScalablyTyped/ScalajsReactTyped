package typingsJapgolly.bootbox

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ButtonMap options for alerts modals */
trait BootboxAlertButtonMap extends BootboxButtonMap {
  var ok: BootboxButton | js.Function
}

object BootboxAlertButtonMap {
  @scala.inline
  def apply(
    ok: BootboxButton | js.Function,
    StringDictionary: StringDictionary[BootboxButton | js.Function] = null
  ): BootboxAlertButtonMap = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BootboxAlertButtonMap]
  }
}

