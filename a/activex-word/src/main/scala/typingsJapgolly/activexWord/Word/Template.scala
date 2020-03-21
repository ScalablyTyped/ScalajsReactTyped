package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexOffice.Office.DocumentProperties
import typingsJapgolly.activexOffice.Office.DocumentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Template")
@js.native
class Template protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val AutoTextEntries: typingsJapgolly.activexWord.Word.AutoTextEntries = js.native
  val BuildingBlockEntries: typingsJapgolly.activexWord.Word.BuildingBlockEntries = js.native
  val BuildingBlockTypes: typingsJapgolly.activexWord.Word.BuildingBlockTypes = js.native
  @JSName("BuiltInDocumentProperties")
  val BuiltInDocumentProperties_Original: DocumentProperties[typingsJapgolly.activexWord.Word.Application] = js.native
  val Creator: Double = js.native
  @JSName("CustomDocumentProperties")
  val CustomDocumentProperties_Original: DocumentProperties[typingsJapgolly.activexWord.Word.Application] = js.native
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  val FullName: String = js.native
  var JustificationMode: WdJustificationMode = js.native
  var KerningByAlgorithm: Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  val ListTemplates: typingsJapgolly.activexWord.Word.ListTemplates = js.native
  val Name: String = js.native
  var NoLineBreakAfter: String = js.native
  var NoLineBreakBefore: String = js.native
  var NoProofing: Double = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  var Saved: Boolean = js.native
  val Type: WdTemplateType = js.native
  val VBProject: typingsJapgolly.activexVbide.VBIDE.VBProject = js.native
  @JSName("Word.Template_typekey")
  var WordDotTemplate_typekey: Template = js.native
  def BuiltInDocumentProperties(index: String): DocumentProperty[typingsJapgolly.activexWord.Word.Application] = js.native
  def BuiltInDocumentProperties(index: Double): DocumentProperty[typingsJapgolly.activexWord.Word.Application] = js.native
  def CustomDocumentProperties(index: String): DocumentProperty[typingsJapgolly.activexWord.Word.Application] = js.native
  def CustomDocumentProperties(index: Double): DocumentProperty[typingsJapgolly.activexWord.Word.Application] = js.native
  def OpenAsDocument(): Document = js.native
  def Save(): Unit = js.native
}

