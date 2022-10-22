package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libUtilsErrorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppCheckAppCheckApiClientInternalMod {
  
  @JSImport("firebase-admin/lib/app-check/app-check-api-client-internal", "FirebaseAppCheckError")
  @js.native
  open class FirebaseAppCheckError protected () extends PrefixedFirebaseError {
    def this(code: AppCheckErrorCode, message: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-credential`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`app-check-token-expired`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`
  */
  trait AppCheckErrorCode extends StObject
  object AppCheckErrorCode {
    
    inline def aborted: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted = "aborted".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted]
    
    inline def `app-check-token-expired`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`app-check-token-expired` = "app-check-token-expired".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`app-check-token-expired`]
    
    inline def `internal-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `invalid-credential`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-credential` = "invalid-credential".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-credential`]
    
    inline def `not-found`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `permission-denied`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied`]
    
    inline def unauthenticated: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated]
    
    inline def `unknown-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}
