package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.anon.Body
import typingsJapgolly.firebaseAdmin.libUtilsErrorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFunctionsFunctionsApiClientInternalMod {
  
  @JSImport("firebase-admin/lib/functions/functions-api-client-internal", "FirebaseFunctionsError")
  @js.native
  open class FirebaseFunctionsError protected () extends PrefixedFirebaseError {
    def this(code: FunctionsErrorCode, message: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-credential`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`failed-precondition`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    inline def aborted: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted = "aborted".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.aborted]
    
    inline def `failed-precondition`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`failed-precondition`]
    
    inline def `internal-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error` = "internal-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`internal-error`]
    
    inline def `invalid-argument`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `invalid-credential`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-credential` = "invalid-credential".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-credential`]
    
    inline def `not-found`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found` = "not-found".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`not-found`]
    
    inline def `permission-denied`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`permission-denied`]
    
    inline def unauthenticated: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.unauthenticated]
    
    inline def `unknown-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
  
  trait Task extends StObject {
    
    var dispatchDeadline: js.UndefOr[String] = js.undefined
    
    var httpRequest: Body
    
    var scheduleTime: js.UndefOr[String] = js.undefined
  }
  object Task {
    
    inline def apply(httpRequest: Body): Task = {
      val __obj = js.Dynamic.literal(httpRequest = httpRequest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setDispatchDeadline(value: String): Self = StObject.set(x, "dispatchDeadline", value.asInstanceOf[js.Any])
      
      inline def setDispatchDeadlineUndefined: Self = StObject.set(x, "dispatchDeadline", js.undefined)
      
      inline def setHttpRequest(value: Body): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
      
      inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
      
      inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    }
  }
}
