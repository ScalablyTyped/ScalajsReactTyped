package typingsJapgolly.domBackgroundSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerRegistration extends StObject {
  
  // https://wicg.github.io/background-sync/spec/#dom-serviceworkerregistration-sync
  val sync: SyncManager
}
object ServiceWorkerRegistration {
  
  inline def apply(sync: SyncManager): ServiceWorkerRegistration = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistration]
  }
  
  extension [Self <: ServiceWorkerRegistration](x: Self) {
    
    inline def setSync(value: SyncManager): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}
