package typingsJapgolly.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateValueMap extends /* key */ StringDictionary[StateValue]

object StateValueMap {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[StateValue] = null): StateValueMap = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[StateValueMap]
  }
}

