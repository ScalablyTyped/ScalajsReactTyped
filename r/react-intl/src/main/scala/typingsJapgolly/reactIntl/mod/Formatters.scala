package typingsJapgolly.reactIntl.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formatjsIntlListformat.mod.default
import typingsJapgolly.reactIntl.AnonCall
import typingsJapgolly.reactIntl.AnonInstantiable
import typingsJapgolly.reactIntl.AnonSupportedLocalesOf
import typingsJapgolly.reactIntl.TypeofIntlListFormat
import typingsJapgolly.reactIntl.TypeofIntlMessageFormat
import typingsJapgolly.reactIntl.TypeofIntlRelativeTimeFor
import typingsJapgolly.std.ConstructorParameters
import typingsJapgolly.std.Intl.DateTimeFormat
import typingsJapgolly.std.Intl.NumberFormat
import typingsJapgolly.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[AnonCall]
  ): DateTimeFormat
  def getDisplayNames(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof DisplayNames> is not an array type */ args: ConstructorParameters[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayNames */ _
    ]
  ): js.Any
  def getListFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlListFormat> is not an array type */ args: ConstructorParameters[TypeofIntlListFormat]
  ): default
  def getMessageFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlMessageFormat> is not an array type */ args: ConstructorParameters[TypeofIntlMessageFormat]
  ): typingsJapgolly.intlMessageformat.mod.default
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[AnonInstantiable]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[AnonSupportedLocalesOf]
  ): PluralRules
  def getRelativeTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof IntlRelativeTimeFormat> is not an array type */ args: ConstructorParameters[TypeofIntlRelativeTimeFor]
  ): typingsJapgolly.formatjsIntlRelativetimeformat.mod.default
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[AnonCall] => CallbackTo[DateTimeFormat],
    getDisplayNames: ConstructorParameters[js.Any] => CallbackTo[js.Any],
    getListFormat: ConstructorParameters[TypeofIntlListFormat] => CallbackTo[default],
    getMessageFormat: ConstructorParameters[TypeofIntlMessageFormat] => CallbackTo[typingsJapgolly.intlMessageformat.mod.default],
    getNumberFormat: ConstructorParameters[AnonInstantiable] => CallbackTo[NumberFormat],
    getPluralRules: ConstructorParameters[AnonSupportedLocalesOf] => CallbackTo[PluralRules],
    getRelativeTimeFormat: ConstructorParameters[TypeofIntlRelativeTimeFor] => CallbackTo[typingsJapgolly.formatjsIntlRelativetimeformat.mod.default]
  ): Formatters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDateTimeFormat")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[typingsJapgolly.reactIntl.AnonCall]) => getDateTimeFormat(t0).runNow()))
    __obj.updateDynamic("getDisplayNames")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[js.Any]) => getDisplayNames(t0).runNow()))
    __obj.updateDynamic("getListFormat")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[typingsJapgolly.reactIntl.TypeofIntlListFormat]) => getListFormat(t0).runNow()))
    __obj.updateDynamic("getMessageFormat")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[typingsJapgolly.reactIntl.TypeofIntlMessageFormat]) => getMessageFormat(t0).runNow()))
    __obj.updateDynamic("getNumberFormat")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[typingsJapgolly.reactIntl.AnonInstantiable]) => getNumberFormat(t0).runNow()))
    __obj.updateDynamic("getPluralRules")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[typingsJapgolly.reactIntl.AnonSupportedLocalesOf]) => getPluralRules(t0).runNow()))
    __obj.updateDynamic("getRelativeTimeFormat")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[typingsJapgolly.reactIntl.TypeofIntlRelativeTimeFor]) => getRelativeTimeFormat(t0).runNow()))
    __obj.asInstanceOf[Formatters]
  }
}

