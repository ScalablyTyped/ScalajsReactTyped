package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelNumbers.`1`
import typingsJapgolly.activexExcel.activexExcelNumbers.`2`
import typingsJapgolly.activexExcel.activexExcelNumbers.`3`
import typingsJapgolly.activexExcel.activexExcelNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexExcel.activexExcelNumbers.`1`
  - typingsJapgolly.activexExcel.activexExcelNumbers.`2`
  - typingsJapgolly.activexExcel.activexExcelNumbers.`4`
  - typingsJapgolly.activexExcel.activexExcelNumbers.`3`
*/
trait XlReferenceType extends js.Object

object XlReferenceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlAbsRowRelColumn: `2` = this.cast(2)
  @scala.inline
  def xlAbsolute: `1` = this.cast(1)
  @scala.inline
  def xlRelRowAbsColumn: `3` = this.cast(3)
  @scala.inline
  def xlRelative: `4` = this.cast(4)
}

