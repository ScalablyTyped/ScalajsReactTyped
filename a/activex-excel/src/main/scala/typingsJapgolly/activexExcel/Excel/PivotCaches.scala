package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelNumbers.`1`
import typingsJapgolly.activexExcel.activexExcelNumbers.`2`
import typingsJapgolly.activexExcel.activexExcelNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotCaches extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): PivotCache = js.native
  def Add(SourceType: XlPivotTableSourceType): PivotCache = js.native
  def Add(SourceType: XlPivotTableSourceType, SourceData: js.Any): PivotCache = js.native
  @JSName("Create")
  def Create_1(SourceType: `1`, SourceData: String): PivotCache = js.native
  @JSName("Create")
  def Create_1(SourceType: `1`, SourceData: String, Version: XlPivotTableVersionList): PivotCache = js.native
  @JSName("Create")
  def Create_2(SourceType: `2`, SourceData: WorkbookConnection): PivotCache = js.native
  @JSName("Create")
  def Create_2(SourceType: `2`, SourceData: WorkbookConnection, Version: XlPivotTableVersionList): PivotCache = js.native
  @JSName("Create")
  def Create_3(SourceType: `3`, SourceData: String): PivotCache = js.native
  @JSName("Create")
  def Create_3(SourceType: `3`, SourceData: String, Version: XlPivotTableVersionList): PivotCache = js.native
  def Item(Index: Double): PivotCache = js.native
  def _Default(Index: js.Any): PivotCache = js.native
}

