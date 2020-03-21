package typingsJapgolly.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingParams
  extends /* key */ StringDictionary[js.Any] {
  var utc: js.UndefOr[String] = js.undefined
  var utl: js.UndefOr[String] = js.undefined
  var utt: js.UndefOr[String | Double] = js.undefined
  var utv: js.UndefOr[String] = js.undefined
}

object TimingParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    utc: String = null,
    utl: String = null,
    utt: String | Double = null,
    utv: String = null
  ): TimingParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (utc != null) __obj.updateDynamic("utc")(utc.asInstanceOf[js.Any])
    if (utl != null) __obj.updateDynamic("utl")(utl.asInstanceOf[js.Any])
    if (utt != null) __obj.updateDynamic("utt")(utt.asInstanceOf[js.Any])
    if (utv != null) __obj.updateDynamic("utv")(utv.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingParams]
  }
}

