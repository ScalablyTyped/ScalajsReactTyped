package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scenario extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  def ChangeScenario(ChangingCells: Range): Any = js.native
  def ChangeScenario(ChangingCells: Range, Values: SafeArray[Any]): Any = js.native
  
  def ChangingCells(Address: String): Range = js.native
  def ChangingCells(RowIndex: Double): Range = js.native
  def ChangingCells(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("ChangingCells")
  val ChangingCells_Original: Range = js.native
  
  var Comment: String = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Any = js.native
  
  /* private */ @JSName("Excel.Scenario_typekey")
  var ExcelDotScenario_typekey: Scenario = js.native
  
  var Hidden: Boolean = js.native
  
  val Index: Double = js.native
  
  var Locked: Boolean = js.native
  
  var Name: String = js.native
  
  val Parent: Any = js.native
  
  def Show(): Any = js.native
  
  def Values(): SafeArray[Any] = js.native
  def Values(Index: Double): Any = js.native
}
