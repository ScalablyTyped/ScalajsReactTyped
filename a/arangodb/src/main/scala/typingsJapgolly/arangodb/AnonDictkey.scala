package typingsJapgolly.arangodb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var _from: js.UndefOr[String] = js.undefined
  var _to: js.UndefOr[String] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _from: String = null,
    _to: String = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_from != null) __obj.updateDynamic("_from")(_from.asInstanceOf[js.Any])
    if (_to != null) __obj.updateDynamic("_to")(_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

