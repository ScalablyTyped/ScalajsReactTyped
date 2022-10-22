package typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearDataForOriginRequest extends StObject {
  
  /**
    * Security origin.
    */
  var origin: String
  
  /**
    * Comma separated list of StorageType to clear.
    */
  var storageTypes: String
}
object ClearDataForOriginRequest {
  
  inline def apply(origin: String, storageTypes: String): ClearDataForOriginRequest = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], storageTypes = storageTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearDataForOriginRequest]
  }
  
  extension [Self <: ClearDataForOriginRequest](x: Self) {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setStorageTypes(value: String): Self = StObject.set(x, "storageTypes", value.asInstanceOf[js.Any])
  }
}
