package typingsJapgolly.protractor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReporter
  extends /* key */ StringDictionary[js.Any] {
  var reporter: js.UndefOr[String] = js.undefined
  var ui: js.UndefOr[String] = js.undefined
}

object AnonReporter {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    reporter: String = null,
    ui: String = null
  ): AnonReporter = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReporter]
  }
}

