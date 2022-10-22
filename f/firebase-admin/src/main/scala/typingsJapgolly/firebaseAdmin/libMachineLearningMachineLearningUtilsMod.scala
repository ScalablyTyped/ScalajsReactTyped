package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libUtilsErrorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMachineLearningMachineLearningUtilsMod {
  
  @JSImport("firebase-admin/lib/machine-learning/machine-learning-utils", "FirebaseMachineLearningError")
  @js.native
  open class FirebaseMachineLearningError protected () extends PrefixedFirebaseError {
    def this(code: MachineLearningErrorCode, message: String) = this()
  }
  /* static members */
  object FirebaseMachineLearningError {
    
    @JSImport("firebase-admin/lib/machine-learning/machine-learning-utils", "FirebaseMachineLearningError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromOperationError(code: Double, message: String): FirebaseMachineLearningError = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOperationError")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[FirebaseMachineLearningError]
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
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.cancelled
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`deadline-exceeded`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`failed-precondition`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`out-of-range`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`data-loss`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated
  */
  trait MachineLearningErrorCode extends StObject
  object MachineLearningErrorCode {
    
    inline def aborted: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted = "aborted".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted]
    
    inline def `already-exists`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`already-exists` = "already-exists".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`already-exists`]
    
    inline def `authentication-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`authentication-error` = "authentication-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`authentication-error`]
    
    inline def cancelled: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.cancelled = "cancelled".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.cancelled]
    
    inline def `data-loss`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`data-loss` = "data-loss".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`data-loss`]
    
    inline def `deadline-exceeded`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`deadline-exceeded`]
    
    inline def `failed-precondition`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`failed-precondition`]
    
    inline def `internal-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `invalid-server-response`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-server-response` = "invalid-server-response".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-server-response`]
    
    inline def `not-found`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `out-of-range`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`out-of-range` = "out-of-range".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`out-of-range`]
    
    inline def `permission-denied`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied`]
    
    inline def `resource-exhausted`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`resource-exhausted`]
    
    inline def `service-unavailable`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`service-unavailable` = "service-unavailable".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`service-unavailable`]
    
    inline def unauthenticated: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated]
    
    inline def `unknown-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}
