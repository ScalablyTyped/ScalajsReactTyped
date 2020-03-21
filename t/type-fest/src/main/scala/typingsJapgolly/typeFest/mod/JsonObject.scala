package typingsJapgolly.typeFest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonObject
  extends /* key */ StringDictionary[JsonValue]
     with _JsonValue

object JsonObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[JsonValue] = null): JsonObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JsonObject]
  }
}

