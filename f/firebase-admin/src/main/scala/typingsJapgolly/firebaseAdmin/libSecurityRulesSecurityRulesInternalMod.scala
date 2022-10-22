package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libUtilsErrorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityRulesSecurityRulesInternalMod {
  
  @JSImport("firebase-admin/lib/security-rules/security-rules-internal", "FirebaseSecurityRulesError")
  @js.native
  open class FirebaseSecurityRulesError protected () extends PrefixedFirebaseError {
    def this(code: SecurityRulesErrorCode, message: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`already-exists`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`authentication-error`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-server-response`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`service-unavailable`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`
  */
  trait SecurityRulesErrorCode extends StObject
  object SecurityRulesErrorCode {
    
    inline def `already-exists`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`already-exists` = "already-exists".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`already-exists`]
    
    inline def `authentication-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`authentication-error` = "authentication-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`authentication-error`]
    
    inline def `internal-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `invalid-server-response`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-server-response` = "invalid-server-response".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-server-response`]
    
    inline def `not-found`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `resource-exhausted`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`]
    
    inline def `service-unavailable`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`service-unavailable` = "service-unavailable".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`service-unavailable`]
    
    inline def `unknown-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}
