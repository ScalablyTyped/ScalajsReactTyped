package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlSelectionContents
import typingsJapgolly.activexOutlook.Outlook.OlSelectionLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.AttachmentSelection")
@js.native
/* private */ open class AttachmentSelection ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.AttachmentSelection {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetSelection(SelectionContents: OlSelectionContents): typingsJapgolly.activexOutlook.Outlook.Selection = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.Attachment = js.native
  
  /* CompleteClass */
  override val Location: OlSelectionLocation = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.AttachmentSelection_typekey")
  var OutlookDotAttachmentSelection_typekey: typingsJapgolly.activexOutlook.Outlook.AttachmentSelection = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
