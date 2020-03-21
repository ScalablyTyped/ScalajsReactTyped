package typingsJapgolly.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.significantDigits
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.fractionDigits
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.compactRounding
*/
trait NumberFormatRoundingType extends js.Object

object NumberFormatRoundingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compactRounding: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.compactRounding = this.cast("compactRounding")
  @scala.inline
  def fractionDigits: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.fractionDigits = this.cast("fractionDigits")
  @scala.inline
  def significantDigits: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.significantDigits = this.cast("significantDigits")
}

