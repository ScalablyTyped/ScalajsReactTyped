package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the properties of the new list item. */
trait ListItemCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_folderUrl(): String
  
  def get_leafName(): String
  
  def get_underlyingObjectType(): FileSystemObjectType
  
  /** Sets a value that specifies the folder for the new list item. */
  def set_folderUrl(value: String): Unit
  
  /** Sets a value that specifies the name of the new list item. It must be the name of the file if the parent list of the list item is a document library. */
  def set_leafName(value: String): Unit
  
  /** Sets a value that specifies whether the new list item is a file or a folder. */
  def set_underlyingObjectType(value: FileSystemObjectType): Unit
}
object ListItemCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_folderUrl: CallbackTo[String],
    get_leafName: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_underlyingObjectType: CallbackTo[FileSystemObjectType],
    set_folderUrl: String => Callback,
    set_leafName: String => Callback,
    set_underlyingObjectType: FileSystemObjectType => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ListItemCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_folderUrl = get_folderUrl.toJsFn, get_leafName = get_leafName.toJsFn, get_typeId = get_typeId.toJsFn, get_underlyingObjectType = get_underlyingObjectType.toJsFn, set_folderUrl = js.Any.fromFunction1((t0: String) => set_folderUrl(t0).runNow()), set_leafName = js.Any.fromFunction1((t0: String) => set_leafName(t0).runNow()), set_underlyingObjectType = js.Any.fromFunction1((t0: FileSystemObjectType) => set_underlyingObjectType(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ListItemCreationInformation]
  }
  
  extension [Self <: ListItemCreationInformation](x: Self) {
    
    inline def setGet_folderUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_folderUrl", value.toJsFn)
    
    inline def setGet_leafName(value: CallbackTo[String]): Self = StObject.set(x, "get_leafName", value.toJsFn)
    
    inline def setGet_underlyingObjectType(value: CallbackTo[FileSystemObjectType]): Self = StObject.set(x, "get_underlyingObjectType", value.toJsFn)
    
    inline def setSet_folderUrl(value: String => Callback): Self = StObject.set(x, "set_folderUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_leafName(value: String => Callback): Self = StObject.set(x, "set_leafName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_underlyingObjectType(value: FileSystemObjectType => Callback): Self = StObject.set(x, "set_underlyingObjectType", js.Any.fromFunction1((t0: FileSystemObjectType) => value(t0).runNow()))
  }
}
