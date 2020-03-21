package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCountSettings extends ISettings {
  var DefaultInlineCount: String
  var InlineCount: String
}

object InlineCountSettings {
  @scala.inline
  def apply(DefaultInlineCount: String, InlineCount: String, isSet: CallbackTo[Boolean], reset: Callback): InlineCountSettings = {
    val __obj = js.Dynamic.literal(DefaultInlineCount = DefaultInlineCount.asInstanceOf[js.Any], InlineCount = InlineCount.asInstanceOf[js.Any])
    __obj.updateDynamic("isSet")(isSet.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[InlineCountSettings]
  }
}

