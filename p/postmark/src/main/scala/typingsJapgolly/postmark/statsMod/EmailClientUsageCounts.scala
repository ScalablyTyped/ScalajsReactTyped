package typingsJapgolly.postmark.statsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.postmark.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailClientUsageCounts
  extends /* key */ StringDictionary[js.Any] {
  var Days: js.Array[AnonDictkey]
}

object EmailClientUsageCounts {
  @scala.inline
  def apply(Days: js.Array[AnonDictkey], StringDictionary: /* key */ StringDictionary[js.Any] = null): EmailClientUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EmailClientUsageCounts]
  }
}

