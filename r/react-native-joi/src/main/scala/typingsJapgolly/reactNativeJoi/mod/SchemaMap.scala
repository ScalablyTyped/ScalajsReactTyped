package typingsJapgolly.reactNativeJoi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaMap
  extends /* key */ StringDictionary[SchemaLike | js.Array[SchemaLike]]
     with _SchemaLike

object SchemaMap {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[SchemaLike | js.Array[SchemaLike]] = null): SchemaMap = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SchemaMap]
  }
}

