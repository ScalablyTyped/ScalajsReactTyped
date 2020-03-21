package typingsJapgolly.hapiPino

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hapiPino.mod.Serializers
import typingsJapgolly.pino.mod.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var level: js.UndefOr[Level | String] = js.undefined
  var serializers: js.UndefOr[Serializers] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    level: Level | String = null,
    serializers: Serializers = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

