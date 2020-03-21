package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Databar")
@js.native
class Databar protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  val AxisColor: FormatColor = js.native
  var AxisPosition: XlDataBarAxisPosition = js.native
  val BarBorder: DataBarBorder = js.native
  val BarColor: FormatColor = js.native
  var BarFillType: XlDataBarFillType = js.native
  val Creator: XlCreator = js.native
  var Direction: Double = js.native
  @JSName("Excel.Databar_typekey")
  var ExcelDotDatabar_typekey: Databar = js.native
  var Formula: String = js.native
  val MaxPoint: ConditionValue = js.native
  val MinPoint: ConditionValue = js.native
  val NegativeBarFormat: typingsJapgolly.activexExcel.Excel.NegativeBarFormat = js.native
  val PTCondition: Boolean = js.native
  val Parent: js.Any = js.native
  var PercentMax: Double = js.native
  var PercentMin: Double = js.native
  var Priority: Double = js.native
  var ScopeType: XlPivotConditionScope = js.native
  var ShowValue: Boolean = js.native
  val StopIfTrue: Boolean = js.native
  val Type: Double = js.native
  def AppliesTo(Address: String): Range = js.native
  def AppliesTo(RowIndex: Double): Range = js.native
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Delete(): Unit = js.native
  def ModifyAppliesToRange(Range: Range): Unit = js.native
  def SetFirstPriority(): Unit = js.native
  def SetLastPriority(): Unit = js.native
}

