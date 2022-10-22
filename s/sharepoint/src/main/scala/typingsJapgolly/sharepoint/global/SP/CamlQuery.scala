package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a Collaborative Application Markup Language (CAML) query on a list. */
@JSGlobal("SP.CamlQuery")
@js.native
open class CamlQuery ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.CamlQuery {
  
  /* CompleteClass */
  override def customFromJson(obj: Any): Boolean = js.native
  
  /* CompleteClass */
  override def customWriteToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  
  /* CompleteClass */
  override def fromJson(obj: Any): Unit = js.native
  
  /** Returns true if the query returns dates in Coordinated Universal Time (UTC) format. */
  /* CompleteClass */
  override def get_datesInUtc(): Boolean = js.native
  
  /** Server relative URL of a list folder from which results will be returned. */
  /* CompleteClass */
  override def get_folderServerRelativeUrl(): String = js.native
  
  /* CompleteClass */
  override def get_listItemCollectionPosition(): typingsJapgolly.sharepoint.SP.ListItemCollectionPosition = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /** Gets value that specifies the XML schema that defines the list view. */
  /* CompleteClass */
  override def get_viewXml(): String = js.native
  
  /** Sets a value that indicates whether the query returns dates in Coordinated Universal Time (UTC) format. */
  /* CompleteClass */
  override def set_datesInUtc(value: Boolean): Unit = js.native
  
  /** Sets a value that specifies the server relative URL of a list folder from which results will be returned. */
  /* CompleteClass */
  override def set_folderServerRelativeUrl(value: String): Unit = js.native
  
  /** Sets a value that specifies the information required to get the next page of data for the list view. */
  /* CompleteClass */
  override def set_listItemCollectionPosition(value: typingsJapgolly.sharepoint.SP.ListItemCollectionPosition): Unit = js.native
  
  /** Sets value that specifies the XML schema that defines the list view. It must be null, empty, or an XML fragment that conforms to the ViewDefinition type.  */
  /* CompleteClass */
  override def set_viewXml(value: String): Unit = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
object CamlQuery {
  
  @JSGlobal("SP.CamlQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the folders in a list, including
    the subfolders. */
  /* static member */
  inline def createAllFoldersQuery(): typingsJapgolly.sharepoint.SP.CamlQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("createAllFoldersQuery")().asInstanceOf[typingsJapgolly.sharepoint.SP.CamlQuery]
  
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the items in a list, including
    the items in the subfolders. */
  /* static member */
  inline def createAllItemsQuery(): typingsJapgolly.sharepoint.SP.CamlQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("createAllItemsQuery")().asInstanceOf[typingsJapgolly.sharepoint.SP.CamlQuery]
}
