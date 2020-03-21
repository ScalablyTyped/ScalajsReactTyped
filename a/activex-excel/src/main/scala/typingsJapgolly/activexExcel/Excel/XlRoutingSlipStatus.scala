package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelNumbers.`0`
import typingsJapgolly.activexExcel.activexExcelNumbers.`1`
import typingsJapgolly.activexExcel.activexExcelNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexExcel.activexExcelNumbers.`0`
  - typingsJapgolly.activexExcel.activexExcelNumbers.`2`
  - typingsJapgolly.activexExcel.activexExcelNumbers.`1`
*/
trait XlRoutingSlipStatus extends js.Object

object XlRoutingSlipStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlNotYetRouted: `0` = this.cast(0)
  @scala.inline
  def xlRoutingComplete: `2` = this.cast(2)
  @scala.inline
  def xlRoutingInProgress: `1` = this.cast(1)
}

