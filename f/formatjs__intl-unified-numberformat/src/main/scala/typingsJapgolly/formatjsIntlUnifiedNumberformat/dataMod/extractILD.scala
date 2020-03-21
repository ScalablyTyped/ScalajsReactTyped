package typingsJapgolly.formatjsIntlUnifiedNumberformat.dataMod

import typingsJapgolly.formatjsIntlUtils.numberTypesMod.CurrencyData
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NumberILD
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.RawNumberData
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.UnitData
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-unified-numberformat/lib/data", "extractILD")
@js.native
object extractILD extends js.Object {
  def apply(
    units: Record[String, UnitData],
    currencies: Record[String, CurrencyData],
    numbers: RawNumberData,
    numberingSystem: String
  ): NumberILD = js.native
}

