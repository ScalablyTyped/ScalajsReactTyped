package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scenarios extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Scenario = js.native
  def apply(Index: Double): Scenario = js.native
  def Add(Name: String, ChangingCells: Range): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[_]): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[_], Comment: String): Scenario = js.native
  def Add(Name: String, ChangingCells: Range, Values: SafeArray[_], Comment: String, Locked: Boolean): Scenario = js.native
  def Add(
    Name: String,
    ChangingCells: Range,
    Values: SafeArray[_],
    Comment: String,
    Locked: Boolean,
    Hidden: Boolean
  ): Scenario = js.native
  /** @param ReportType [ReportType=1] */
  def CreateSummary(): js.Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType): js.Any = js.native
  def CreateSummary(ReportType: XlSummaryReportType, ResultCells: Range): js.Any = js.native
  def Item(Index: String): Scenario = js.native
  def Item(Index: Double): Scenario = js.native
  def Merge(Source: String): js.Any = js.native
  def Merge(Source: Worksheet): js.Any = js.native
}

