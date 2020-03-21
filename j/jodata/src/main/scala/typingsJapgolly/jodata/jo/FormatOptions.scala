package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  def atom(): typingsJapgolly.jodata.jo
  def custom(value: String): typingsJapgolly.jodata.jo
  def json(): typingsJapgolly.jodata.jo
  def xml(): typingsJapgolly.jodata.jo
}

object FormatOptions {
  @scala.inline
  def apply(
    atom: CallbackTo[typingsJapgolly.jodata.jo],
    custom: String => CallbackTo[typingsJapgolly.jodata.jo],
    json: CallbackTo[typingsJapgolly.jodata.jo],
    xml: CallbackTo[typingsJapgolly.jodata.jo]
  ): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atom")(atom.toJsFn)
    __obj.updateDynamic("custom")(js.Any.fromFunction1((t0: java.lang.String) => custom(t0).runNow()))
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("xml")(xml.toJsFn)
    __obj.asInstanceOf[FormatOptions]
  }
}

