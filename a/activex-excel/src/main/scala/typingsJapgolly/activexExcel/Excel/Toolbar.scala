package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Toolbar")
@js.native
class Toolbar protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val BuiltIn: Boolean = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Toolbar_typekey")
  var ExcelDotToolbar_typekey: Toolbar = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  var Protection: XlToolbarProtection = js.native
  @JSName("ToolbarButtons")
  val ToolbarButtons_Original: ToolbarButtons = js.native
  var Top: Double = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  def Delete(): Unit = js.native
  def Reset(): Unit = js.native
  def ToolbarButtons(Index: Double): ToolbarButton = js.native
}

