package typingsJapgolly.webextensionPolyfill.namespacesRuntimeMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The reason that the event is being dispatched. 'app_update' is used when the restart is needed because the application
  * is updated to a newer version. 'os_update' is used when the restart is needed because the browser/OS is updated to a
  * newer version. 'periodic' is used when the system runs for more than the permitted uptime set in the enterprise policy.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.app_update
  - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.os_update
  - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.periodic
*/
trait OnRestartRequiredReason extends StObject
object OnRestartRequiredReason {
  
  inline def app_update: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.app_update = "app_update".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.app_update]
  
  inline def os_update: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.os_update = "os_update".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.os_update]
  
  inline def periodic: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.periodic = "periodic".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.periodic]
}
