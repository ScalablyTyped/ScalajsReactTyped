package typingsJapgolly.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Research")
@js.native
class Research protected () extends js.Object {
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Research_typekey")
  var ExcelDotResearch_typekey: Research = js.native
  val Parent: js.Any = js.native
  def IsResearchService(ServiceID: String): Boolean = js.native
  def Query(ServiceID: String): js.Any = js.native
  def Query(ServiceID: String, QueryString: String): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: js.Any): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: js.Any, UseSelection: Boolean): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: js.Any,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def SetLanguagePair(LanguageFrom: Double, LanguageTo: Double): js.Any = js.native
}

