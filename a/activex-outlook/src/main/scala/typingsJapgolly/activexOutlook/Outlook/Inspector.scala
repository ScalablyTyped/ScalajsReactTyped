package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inspector extends StObject {
  
  def Activate(): Unit = js.native
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  val AttachmentSelection: typingsJapgolly.activexOutlook.Outlook.AttachmentSelection = js.native
  
  val Caption: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  val CommandBars: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBars */ Any = js.native
  
  val CurrentItem: Any = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: Any): Unit = js.native
  
  val EditorType: OlEditorType = js.native
  
  val HTMLEditor: Any = js.native
  
  var Height: Double = js.native
  
  def HideFormPage(PageName: String): Unit = js.native
  
  def IsWordMail(): Boolean = js.native
  
  var Left: Double = js.native
  
  val ModifiedFormPages: Any = js.native
  
  def NewFormRegion(): Any = js.native
  
  def OpenFormRegion(Path: String): Any = js.native
  
  /* private */ @JSName("Outlook.Inspector_typekey")
  var OutlookDotInspector_typekey: Inspector = js.native
  
  val Parent: Any = js.native
  
  def SaveFormRegion(Page: Any, FileName: String): Unit = js.native
  
  val Session: NameSpace = js.native
  
  def SetControlItemProperty(Control: Any, PropertyName: String): Unit = js.native
  
  def SetCurrentFormPage(PageName: String): Unit = js.native
  
  def SetSchedulingStartTime(Start: VarDate): Unit = js.native
  
  def ShowFormPage(PageName: String): Unit = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
  
  var WindowState: OlWindowState = js.native
  
  val WordEditor: Any = js.native
}
