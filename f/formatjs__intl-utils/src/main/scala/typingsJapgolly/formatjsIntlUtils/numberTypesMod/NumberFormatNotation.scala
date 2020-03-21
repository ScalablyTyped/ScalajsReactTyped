package typingsJapgolly.formatjsIntlUtils.numberTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.standard
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.scientific
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.engineering
  - typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.compact
*/
trait NumberFormatNotation extends js.Object

object NumberFormatNotation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compact: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.compact = this.cast("compact")
  @scala.inline
  def engineering: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.engineering = this.cast("engineering")
  @scala.inline
  def scientific: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.scientific = this.cast("scientific")
  @scala.inline
  def standard: typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.standard = this.cast("standard")
}

