package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scenarios extends StObject {
  
  def apply(Index: String): Scenario = js.native
  def apply(Index: Double): Scenario = js.native
  
  def Add(Name: String, ChangingCells: Range): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: String): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: String, Locked: Boolean): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: Unit,
    Comment: String,
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: String, Locked: Unit, Hidden: Boolean): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: Unit, Locked: Boolean): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: Unit, Locked: Boolean, Hidden: Boolean): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: Unit, Comment: Unit, Locked: Unit, Hidden: Boolean): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[Any]): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[Any], Comment: String): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[Any], Comment: String, Locked: Boolean): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[Any],
    Comment: String,
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[Any],
    Comment: String,
    Locked: Unit,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[Any], Comment: Unit, Locked: Boolean): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[Any],
    Comment: Unit,
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[Any],
    Comment: Unit,
    Locked: Unit,
    Hidden: Boolean
  ): Scenario = js.native
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  /** @param ReportType [ReportType=1] */
  def CreateSummary(): Any = js.native
  def CreateSummary(ReportType: Unit, ResultCells: Range): Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType): Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType, ResultCells: Range): Any = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Scenario = js.native
  def Item(Index: Double): Scenario = js.native
  
  def Merge(Source: String): Any = js.native
  def Merge(Source: Worksheet): Any = js.native
  
  val Parent: Any = js.native
}
