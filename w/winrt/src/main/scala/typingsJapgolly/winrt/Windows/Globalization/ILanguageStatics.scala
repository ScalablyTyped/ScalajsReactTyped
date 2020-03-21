package typingsJapgolly.winrt.Windows.Globalization

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageStatics extends js.Object {
  var currentInputMethodLanguageTag: String
  def isWellFormed(languageTag: String): Boolean
}

object ILanguageStatics {
  @scala.inline
  def apply(currentInputMethodLanguageTag: String, isWellFormed: String => CallbackTo[Boolean]): ILanguageStatics = {
    val __obj = js.Dynamic.literal(currentInputMethodLanguageTag = currentInputMethodLanguageTag.asInstanceOf[js.Any])
    __obj.updateDynamic("isWellFormed")(js.Any.fromFunction1((t0: java.lang.String) => isWellFormed(t0).runNow()))
    __obj.asInstanceOf[ILanguageStatics]
  }
}

