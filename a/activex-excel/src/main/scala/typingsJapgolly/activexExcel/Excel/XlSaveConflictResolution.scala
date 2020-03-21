package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelNumbers.`1`
import typingsJapgolly.activexExcel.activexExcelNumbers.`2`
import typingsJapgolly.activexExcel.activexExcelNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexExcel.activexExcelNumbers.`2`
  - typingsJapgolly.activexExcel.activexExcelNumbers.`3`
  - typingsJapgolly.activexExcel.activexExcelNumbers.`1`
*/
trait XlSaveConflictResolution extends js.Object

object XlSaveConflictResolution {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlLocalSessionChanges: `2` = this.cast(2)
  @scala.inline
  def xlOtherSessionChanges: `3` = this.cast(3)
  @scala.inline
  def xlUserResolution: `1` = this.cast(1)
}

