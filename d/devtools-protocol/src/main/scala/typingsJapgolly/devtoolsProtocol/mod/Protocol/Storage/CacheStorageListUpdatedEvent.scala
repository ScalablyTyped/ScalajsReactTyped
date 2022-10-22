package typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheStorageListUpdatedEvent extends StObject {
  
  /**
    * Origin to update.
    */
  var origin: String
}
object CacheStorageListUpdatedEvent {
  
  inline def apply(origin: String): CacheStorageListUpdatedEvent = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheStorageListUpdatedEvent]
  }
  
  extension [Self <: CacheStorageListUpdatedEvent](x: Self) {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
