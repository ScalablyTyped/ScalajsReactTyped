package typingsJapgolly.winrt.Windows.Globalization.Fonts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFontGroupFactory extends js.Object {
  def createLanguageFontGroup(languageTag: String): LanguageFontGroup
}

object ILanguageFontGroupFactory {
  @scala.inline
  def apply(createLanguageFontGroup: String => CallbackTo[LanguageFontGroup]): ILanguageFontGroupFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createLanguageFontGroup")(js.Any.fromFunction1((t0: java.lang.String) => createLanguageFontGroup(t0).runNow()))
    __obj.asInstanceOf[ILanguageFontGroupFactory]
  }
}

