package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPageBreaks extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): HPageBreak = js.native
  def Add(Before: Range): HPageBreak = js.native
  def Item(Index: Double): HPageBreak = js.native
  def _Default(Index: Double): HPageBreak = js.native
}

