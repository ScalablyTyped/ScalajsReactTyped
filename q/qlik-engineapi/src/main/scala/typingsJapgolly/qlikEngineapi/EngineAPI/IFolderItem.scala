package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FolderItem...
  */
trait IFolderItem extends StObject {
  
  /**
    * Name of the folder item.
    */
  var qName: String
  
  /**
    * Type of the folder item.
    */
  var qType: FolderItemType
}
object IFolderItem {
  
  inline def apply(qName: String, qType: FolderItemType): IFolderItem = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderItem]
  }
  
  extension [Self <: IFolderItem](x: Self) {
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQType(value: FolderItemType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
