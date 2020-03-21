package typingsJapgolly.winrt.Windows.Globalization

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFactory extends js.Object {
  def createLanguage(languageTag: String): Language
}

object ILanguageFactory {
  @scala.inline
  def apply(createLanguage: String => CallbackTo[Language]): ILanguageFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createLanguage")(js.Any.fromFunction1((t0: java.lang.String) => createLanguage(t0).runNow()))
    __obj.asInstanceOf[ILanguageFactory]
  }
}

