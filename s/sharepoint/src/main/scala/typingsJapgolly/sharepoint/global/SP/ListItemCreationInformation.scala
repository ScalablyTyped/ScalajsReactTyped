package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the properties of the new list item. */
@JSGlobal("SP.ListItemCreationInformation")
@js.native
open class ListItemCreationInformation ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ListItemCreationInformation {
  
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
  override def get_folderUrl(): String = js.native
  
  /* CompleteClass */
  override def get_leafName(): String = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def get_underlyingObjectType(): typingsJapgolly.sharepoint.SP.FileSystemObjectType = js.native
  
  /** Sets a value that specifies the folder for the new list item. */
  /* CompleteClass */
  override def set_folderUrl(value: String): Unit = js.native
  
  /** Sets a value that specifies the name of the new list item. It must be the name of the file if the parent list of the list item is a document library. */
  /* CompleteClass */
  override def set_leafName(value: String): Unit = js.native
  
  /** Sets a value that specifies whether the new list item is a file or a folder. */
  /* CompleteClass */
  override def set_underlyingObjectType(value: typingsJapgolly.sharepoint.SP.FileSystemObjectType): Unit = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
