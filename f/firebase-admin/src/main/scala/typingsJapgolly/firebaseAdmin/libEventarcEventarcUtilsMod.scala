package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libEventarcCloudeventMod.CloudEvent
import typingsJapgolly.firebaseAdmin.libUtilsErrorMod.PrefixedFirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventarcEventarcUtilsMod {
  
  @JSImport("firebase-admin/lib/eventarc/eventarc-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/eventarc/eventarc-utils", "FirebaseEventarcError")
  @js.native
  open class FirebaseEventarcError protected () extends PrefixedFirebaseError {
    def this(code: EventarcErrorCode, message: String) = this()
  }
  
  inline def toCloudEventProtoFormat(ce: CloudEvent): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toCloudEventProtoFormat")(ce.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`
    - typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`
  */
  trait EventarcErrorCode extends StObject
  object EventarcErrorCode {
    
    inline def `invalid-argument`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`invalid-argument`]
    
    inline def `unknown-error`: typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error` = "unknown-error".asInstanceOf[typingsJapgolly.firebaseAdmin.firebaseAdminStrings.`unknown-error`]
  }
}
