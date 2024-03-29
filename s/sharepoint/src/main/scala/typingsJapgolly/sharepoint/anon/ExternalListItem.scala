package typingsJapgolly.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalListItem extends StObject {
  
  var ExternalListItem: Boolean
  
  var FsObjType: Double
  
  var Id: Double
  
  var Url: String
}
object ExternalListItem {
  
  inline def apply(ExternalListItem: Boolean, FsObjType: Double, Id: Double, Url: String): ExternalListItem = {
    val __obj = js.Dynamic.literal(ExternalListItem = ExternalListItem.asInstanceOf[js.Any], FsObjType = FsObjType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalListItem]
  }
  
  extension [Self <: ExternalListItem](x: Self) {
    
    inline def setExternalListItem(value: Boolean): Self = StObject.set(x, "ExternalListItem", value.asInstanceOf[js.Any])
    
    inline def setFsObjType(value: Double): Self = StObject.set(x, "FsObjType", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
