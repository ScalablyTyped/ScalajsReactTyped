package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.FileCreationInformation")
@js.native
open class FileCreationInformation ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.FileCreationInformation {
  
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
  override def get_content(): typingsJapgolly.sharepoint.SP.Base64EncodedByteArray = js.native
  
  /* CompleteClass */
  override def get_overwrite(): Boolean = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def get_url(): String = js.native
  
  /* CompleteClass */
  override def set_content(value: typingsJapgolly.sharepoint.SP.Base64EncodedByteArray): Unit = js.native
  
  /* CompleteClass */
  override def set_overwrite(value: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def set_url(value: String): Unit = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
