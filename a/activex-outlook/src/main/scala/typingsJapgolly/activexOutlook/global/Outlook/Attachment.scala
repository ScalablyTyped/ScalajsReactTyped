package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlAttachmentBlockLevel
import typingsJapgolly.activexOutlook.Outlook.OlAttachmentType
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Attachment")
@js.native
/* private */ open class Attachment ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Attachment {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val BlockLevel: OlAttachmentBlockLevel = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var DisplayName: String = js.native
  
  /* CompleteClass */
  override val FileName: String = js.native
  
  /* CompleteClass */
  override def GetTemporaryFilePath(): String = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override val MAPIOBJECT: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Attachment_typekey")
  var OutlookDotAttachment_typekey: typingsJapgolly.activexOutlook.Outlook.Attachment = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val PathName: String = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  override val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  
  /* CompleteClass */
  override def SaveAsFile(Path: String): Unit = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val Size: Double = js.native
  
  /* CompleteClass */
  override val Type: OlAttachmentType = js.native
}
