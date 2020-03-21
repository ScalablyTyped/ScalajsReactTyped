package typingsJapgolly.puppeteer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONObject
  extends /* key */ StringDictionary[Serializable]
     with _Serializable

object JSONObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[Serializable] = null): JSONObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONObject]
  }
}

