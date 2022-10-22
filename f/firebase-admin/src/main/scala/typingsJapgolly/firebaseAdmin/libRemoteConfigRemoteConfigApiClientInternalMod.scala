package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libUtilsErrorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRemoteConfigRemoteConfigApiClientInternalMod {
  
  @JSImport("firebase-admin/lib/remote-config/remote-config-api-client-internal", "FirebaseRemoteConfigError")
  @js.native
  open class FirebaseRemoteConfigError protected () extends PrefixedFirebaseError {
    def this(code: RemoteConfigErrorCode, message: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`already-exists`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`failed-precondition`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`out-of-range`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`
  */
  trait RemoteConfigErrorCode extends StObject
  object RemoteConfigErrorCode {
    
    inline def aborted: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted = "aborted".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted]
    
    inline def `already-exists`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`already-exists` = "already-exists".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`already-exists`]
    
    inline def `failed-precondition`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`failed-precondition`]
    
    inline def `internal-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `not-found`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `out-of-range`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`out-of-range` = "out-of-range".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`out-of-range`]
    
    inline def `permission-denied`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`]
    
    inline def unauthenticated: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated]
    
    inline def `unknown-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}
