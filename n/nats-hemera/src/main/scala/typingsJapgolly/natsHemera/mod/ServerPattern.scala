package typingsJapgolly.natsHemera.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerPattern
  extends /* key */ StringDictionary[js.Any] {
  @JSName("maxMessages$")
  var maxMessages$: js.UndefOr[Double] = js.undefined
  @JSName("pubsub$")
  var pubsub$: js.UndefOr[Boolean] = js.undefined
  var topic: String
}

object ServerPattern {
  @scala.inline
  def apply(
    topic: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    maxMessages$: Int | Double = null,
    pubsub$: js.UndefOr[Boolean] = js.undefined
  ): ServerPattern = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxMessages$ != null) __obj.updateDynamic("maxMessages$")(maxMessages$.asInstanceOf[js.Any])
    if (!js.isUndefined(pubsub$)) __obj.updateDynamic("pubsub$")(pubsub$.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerPattern]
  }
}

