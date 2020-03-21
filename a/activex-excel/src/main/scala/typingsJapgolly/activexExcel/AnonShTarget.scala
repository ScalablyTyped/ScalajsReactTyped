package typingsJapgolly.activexExcel

import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShTarget extends js.Object {
  val Sh: Worksheet = js.native
  @JSName("Target")
  val Target_Original: Range = js.native
  def Target(Address: String): Range = js.native
  def Target(RowIndex: Double): Range = js.native
  def Target(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

