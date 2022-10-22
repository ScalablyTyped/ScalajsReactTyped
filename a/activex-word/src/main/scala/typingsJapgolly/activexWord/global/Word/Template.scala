package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexOffice.Office.DocumentProperties
import typingsJapgolly.activexOffice.Office.DocumentProperty
import typingsJapgolly.activexWord.Word.WdFarEastLineBreakLanguageID
import typingsJapgolly.activexWord.Word.WdFarEastLineBreakLevel
import typingsJapgolly.activexWord.Word.WdJustificationMode
import typingsJapgolly.activexWord.Word.WdLanguageID
import typingsJapgolly.activexWord.Word.WdTemplateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Template")
@js.native
/* private */ open class Template ()
  extends StObject
     with typingsJapgolly.activexWord.Word.Template {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val AutoTextEntries: typingsJapgolly.activexWord.Word.AutoTextEntries = js.native
  
  /* CompleteClass */
  override val BuildingBlockEntries: typingsJapgolly.activexWord.Word.BuildingBlockEntries = js.native
  
  /* CompleteClass */
  override val BuildingBlockTypes: typingsJapgolly.activexWord.Word.BuildingBlockTypes = js.native
  
  /* CompleteClass */
  override def BuiltInDocumentProperties(index: String): DocumentProperty[typingsJapgolly.activexWord.Word.Application] = js.native
  /* CompleteClass */
  override def BuiltInDocumentProperties(index: Double): DocumentProperty[typingsJapgolly.activexWord.Word.Application] = js.native
  /* CompleteClass */
  @JSName("BuiltInDocumentProperties")
  override val BuiltInDocumentProperties_Original: DocumentProperties[typingsJapgolly.activexWord.Word.Application] = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def CustomDocumentProperties(index: String): DocumentProperty[typingsJapgolly.activexWord.Word.Application] = js.native
  /* CompleteClass */
  override def CustomDocumentProperties(index: Double): DocumentProperty[typingsJapgolly.activexWord.Word.Application] = js.native
  /* CompleteClass */
  @JSName("CustomDocumentProperties")
  override val CustomDocumentProperties_Original: DocumentProperties[typingsJapgolly.activexWord.Word.Application] = js.native
  
  /* CompleteClass */
  var FarEastLineBreakLanguage: WdFarEastLineBreakLanguageID = js.native
  
  /* CompleteClass */
  var FarEastLineBreakLevel: WdFarEastLineBreakLevel = js.native
  
  /* CompleteClass */
  override val FullName: String = js.native
  
  /* CompleteClass */
  var JustificationMode: WdJustificationMode = js.native
  
  /* CompleteClass */
  var KerningByAlgorithm: Boolean = js.native
  
  /* CompleteClass */
  var LanguageID: WdLanguageID = js.native
  
  /* CompleteClass */
  var LanguageIDFarEast: WdLanguageID = js.native
  
  /* CompleteClass */
  override val ListTemplates: typingsJapgolly.activexWord.Word.ListTemplates = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  var NoLineBreakAfter: String = js.native
  
  /* CompleteClass */
  var NoLineBreakBefore: String = js.native
  
  /* CompleteClass */
  var NoProofing: Double = js.native
  
  /* CompleteClass */
  override def OpenAsDocument(): typingsJapgolly.activexWord.Word.Document = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Path: String = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  var Saved: Boolean = js.native
  
  /* CompleteClass */
  override val Type: WdTemplateType = js.native
  
  /* CompleteClass */
  override val VBProject: typingsJapgolly.activexVbide.VBIDE.VBProject = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Template_typekey")
  var WordDotTemplate_typekey: typingsJapgolly.activexWord.Word.Template = js.native
}
