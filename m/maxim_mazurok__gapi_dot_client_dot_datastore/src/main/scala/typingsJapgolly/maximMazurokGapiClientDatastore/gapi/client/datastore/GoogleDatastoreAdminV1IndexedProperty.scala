package typingsJapgolly.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1IndexedProperty extends StObject {
  
  /** Required. The indexed property's direction. Must not be DIRECTION_UNSPECIFIED. */
  var direction: js.UndefOr[String] = js.undefined
  
  /** Required. The property name to index. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1IndexedProperty {
  
  inline def apply(): GoogleDatastoreAdminV1IndexedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1IndexedProperty]
  }
  
  extension [Self <: GoogleDatastoreAdminV1IndexedProperty](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
