package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelInts.`1`
import typingsJapgolly.activexExcel.activexExcelInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatCondition extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  def AppliesTo(Address: String): Range = js.native
  def AppliesTo(RowIndex: Double): Range = js.native
  def AppliesTo(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("AppliesTo")
  val AppliesTo_Original: Range = js.native
  
  def Borders(Index: XlBordersIndex): Border = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  
  val Creator: XlCreator = js.native
  
  var DateOperator: XlTimePeriods = js.native
  
  def Delete(): Unit = js.native
  
  /* private */ @JSName("Excel.FormatCondition_typekey")
  var ExcelDotFormatCondition_typekey: FormatCondition = js.native
  
  val Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  
  val Formula1: String = js.native
  
  val Formula2: String = js.native
  
  val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  def Modify(Type: XlFormatConditionType): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: `1` | `2`, Formula1: String, Formula2: String): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: String): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: String, Formula2: String): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: String, Formula2: String, String: Any): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: Unit,
    Formula1: String,
    Formula2: String,
    String: Any,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: Unit,
    Formula1: String,
    Formula2: String,
    String: Unit,
    Operator2: Any
  ): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: String, Formula2: Unit, String: Any): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: Unit,
    Formula1: String,
    Formula2: Unit,
    String: Any,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: Unit,
    Formula1: String,
    Formula2: Unit,
    String: Unit,
    Operator2: Any
  ): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: Unit, Formula2: String): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: Unit, Formula2: String, String: Any): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: Unit,
    Formula1: Unit,
    Formula2: String,
    String: Any,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: Unit,
    Formula1: Unit,
    Formula2: String,
    String: Unit,
    Operator2: Any
  ): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: Unit, Formula2: Unit, String: Any): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: Unit,
    Formula1: Unit,
    Formula2: Unit,
    String: Any,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: Unit,
    Formula1: Unit,
    Formula2: Unit,
    String: Unit,
    Operator2: Any
  ): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: XlFormatConditionOperator): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: XlFormatConditionOperator, Formula1: String): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: String
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: String,
    String: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: String,
    String: Any,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: String,
    String: Unit,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: Unit,
    String: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: Unit,
    String: Any,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: String,
    Formula2: Unit,
    String: Unit,
    Operator2: Any
  ): Unit = js.native
  def Modify(Type: XlFormatConditionType, Operator: XlFormatConditionOperator, Formula1: Unit, Formula2: String): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: Unit,
    Formula2: String,
    String: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: Unit,
    Formula2: String,
    String: Any,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: Unit,
    Formula2: String,
    String: Unit,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: Unit,
    Formula2: Unit,
    String: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: Unit,
    Formula2: Unit,
    String: Any,
    Operator2: Any
  ): Unit = js.native
  def Modify(
    Type: XlFormatConditionType,
    Operator: XlFormatConditionOperator,
    Formula1: Unit,
    Formula2: Unit,
    String: Unit,
    Operator2: Any
  ): Unit = js.native
  
  def ModifyAppliesToRange(Range: Range): Unit = js.native
  
  @JSName("Modify")
  def Modify_2(Type: `2`, Operator: Unit, Formula1: String): Unit = js.native
  
  var NumberFormat: String = js.native
  
  val Operator: Double = js.native
  
  val PTCondition: Boolean = js.native
  
  val Parent: Any = js.native
  
  var Priority: Double = js.native
  
  var ScopeType: XlPivotConditionScope = js.native
  
  def SetFirstPriority(): Unit = js.native
  
  def SetLastPriority(): Unit = js.native
  
  var StopIfTrue: Boolean = js.native
  
  var Text: String = js.native
  
  var TextOperator: XlContainsOperator = js.native
  
  val Type: Double = js.native
  
  def _Modify(Type: XlFormatConditionType): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: Any): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: Any, Formula1: Any): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: Any, Formula1: Any, Formula2: Any): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: Any, Formula1: Unit, Formula2: Any): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: Any): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: Any, Formula2: Any): Unit = js.native
  def _Modify(Type: XlFormatConditionType, Operator: Unit, Formula1: Unit, Formula2: Any): Unit = js.native
}
