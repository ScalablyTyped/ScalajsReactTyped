package typingsJapgolly.webextensionPolyfill.namespacesTabsMod.Tabs

import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.user_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event that caused a muted state change.
  *
  * "user": A user input action has set/overridden the muted state.
  * "capture": Tab capture started, forcing a muted state change.
  * "extension": An extension, identified by the extensionId field, set the muted state.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.user_
  - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.capture
  - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.`extension`
*/
trait MutedInfoReason extends StObject
object MutedInfoReason {
  
  inline def capture: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.capture = "capture".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.capture]
  
  inline def `extension`: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.`extension` = "extension".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.`extension`]
  
  inline def user: user_ = "user".asInstanceOf[user_]
}
