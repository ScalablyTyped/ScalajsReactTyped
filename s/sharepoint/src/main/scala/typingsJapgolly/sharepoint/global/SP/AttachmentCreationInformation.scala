package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AttachmentCreationInformation")
@js.native
open class AttachmentCreationInformation ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.AttachmentCreationInformation {
  
  /* CompleteClass */
  override def customFromJson(obj: Any): Boolean = js.native
  
  /* CompleteClass */
  override def customWriteToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  
  /* CompleteClass */
  override def fromJson(obj: Any): Unit = js.native
  
  /* CompleteClass */
  override def get_contentStream(): typingsJapgolly.sharepoint.SP.Base64EncodedByteArray = js.native
  
  /* CompleteClass */
  override def get_fileName(): String = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def set_contentStream(value: typingsJapgolly.sharepoint.SP.Base64EncodedByteArray): Unit = js.native
  
  /* CompleteClass */
  override def set_fileName(value: String): Unit = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
