package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotLineCells extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): PivotCell = js.native
  def Item(Index: Double): PivotCell = js.native
  def _Default(Index: js.Any): PivotCell = js.native
}

