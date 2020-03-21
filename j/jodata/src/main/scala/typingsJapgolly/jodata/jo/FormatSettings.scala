package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatSettings extends ISettings {
  var DefaultFormat: String
  var Format: String
}

object FormatSettings {
  @scala.inline
  def apply(DefaultFormat: String, Format: String, isSet: CallbackTo[Boolean], reset: Callback): FormatSettings = {
    val __obj = js.Dynamic.literal(DefaultFormat = DefaultFormat.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.updateDynamic("isSet")(isSet.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[FormatSettings]
  }
}

