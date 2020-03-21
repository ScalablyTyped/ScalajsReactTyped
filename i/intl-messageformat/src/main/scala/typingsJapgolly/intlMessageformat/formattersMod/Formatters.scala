package typingsJapgolly.intlMessageformat.formattersMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.intlMessageformat.AnonCall
import typingsJapgolly.intlMessageformat.AnonInstantiable
import typingsJapgolly.intlMessageformat.AnonSupportedLocalesOf
import typingsJapgolly.std.ConstructorParameters
import typingsJapgolly.std.Intl.DateTimeFormat
import typingsJapgolly.std.Intl.NumberFormat
import typingsJapgolly.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatters extends js.Object {
  def getDateTimeFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[AnonInstantiable]
  ): DateTimeFormat
  def getNumberFormat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[AnonCall]
  ): NumberFormat
  def getPluralRules(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[AnonSupportedLocalesOf]
  ): PluralRules
}

object Formatters {
  @scala.inline
  def apply(
    getDateTimeFormat: ConstructorParameters[AnonInstantiable] => CallbackTo[DateTimeFormat],
    getNumberFormat: ConstructorParameters[AnonCall] => CallbackTo[NumberFormat],
    getPluralRules: ConstructorParameters[AnonSupportedLocalesOf] => CallbackTo[PluralRules]
  ): Formatters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDateTimeFormat")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[typingsJapgolly.intlMessageformat.AnonInstantiable]) => getDateTimeFormat(t0).runNow()))
    __obj.updateDynamic("getNumberFormat")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[typingsJapgolly.intlMessageformat.AnonCall]) => getNumberFormat(t0).runNow()))
    __obj.updateDynamic("getPluralRules")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConstructorParameters[typingsJapgolly.intlMessageformat.AnonSupportedLocalesOf]) => getPluralRules(t0).runNow()))
    __obj.asInstanceOf[Formatters]
  }
}

