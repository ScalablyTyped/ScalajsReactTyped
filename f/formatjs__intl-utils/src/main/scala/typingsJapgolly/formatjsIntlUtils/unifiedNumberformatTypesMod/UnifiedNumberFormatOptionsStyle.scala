package typingsJapgolly.formatjsIntlUtils.unifiedNumberformatTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.decimal
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.percent
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.currency
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.unit
*/
trait UnifiedNumberFormatOptionsStyle extends js.Object

object UnifiedNumberFormatOptionsStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currency: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.currency = this.cast("currency")
  @scala.inline
  def decimal: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.decimal = this.cast("decimal")
  @scala.inline
  def percent: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.percent = this.cast("percent")
  @scala.inline
  def unit: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.unit = this.cast("unit")
}

