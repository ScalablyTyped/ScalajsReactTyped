package typingsJapgolly.linguiCore.i18nMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.linguiCore.linguiCoreStrings.cardinal
import typingsJapgolly.linguiCore.linguiCoreStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageData extends js.Object {
  var plurals: js.UndefOr[
    js.Function2[/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal], String]
  ] = js.undefined
}

object LanguageData {
  @scala.inline
  def apply(
    plurals: (/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal]) => CallbackTo[String] = null
  ): LanguageData = {
    val __obj = js.Dynamic.literal()
    if (plurals != null) __obj.updateDynamic("plurals")(js.Any.fromFunction2((t0: /* n */ scala.Double, t1: /* pluralType */ js.UndefOr[
  typingsJapgolly.linguiCore.linguiCoreStrings.cardinal | typingsJapgolly.linguiCore.linguiCoreStrings.ordinal]) => plurals(t0, t1).runNow()))
    __obj.asInstanceOf[LanguageData]
  }
}

