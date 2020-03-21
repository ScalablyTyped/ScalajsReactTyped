package typingsJapgolly.reactMaskedinput.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatCharacter extends js.Object {
  var transform: js.UndefOr[js.Function1[/* char */ String, String]] = js.undefined
  def validate(char: String): String
}

object FormatCharacter {
  @scala.inline
  def apply(validate: String => CallbackTo[String], transform: /* char */ String => CallbackTo[String] = null): FormatCharacter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: java.lang.String) => validate(t0).runNow()))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: /* char */ java.lang.String) => transform(t0).runNow()))
    __obj.asInstanceOf[FormatCharacter]
  }
}

