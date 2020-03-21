package typingsJapgolly.activexExcel

import typingsJapgolly.activexExcel.Excel.PivotTable
import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTargetPivotTable extends js.Object {
  val Sh: Worksheet = js.native
  val TargetPivotTable: PivotTable = js.native
  @JSName("TargetRange")
  val TargetRange_Original: Range = js.native
  def TargetRange(Address: String): Range = js.native
  def TargetRange(RowIndex: Double): Range = js.native
  def TargetRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

