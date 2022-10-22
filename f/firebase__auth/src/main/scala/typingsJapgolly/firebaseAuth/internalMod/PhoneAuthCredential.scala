package typingsJapgolly.firebaseAuth.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/internal", "PhoneAuthCredential")
@js.native
/* private */ open class PhoneAuthCredential ()
  extends typingsJapgolly.firebaseAuth.distInternalMod.PhoneAuthCredential
/* static members */
object PhoneAuthCredential {
  
  @JSImport("@firebase/auth/internal", "PhoneAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromTokenResponse(phoneNumber: String, temporaryProof: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromTokenResponse")(phoneNumber.asInstanceOf[js.Any], temporaryProof.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
  
  /** @internal */
  inline def _fromVerification(verificationId: String, verificationCode: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromVerification")(verificationId.asInstanceOf[js.Any], verificationCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential]
  
  inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
  /** Generates a phone credential based on a plain object or a JSON string. */
  inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsPhoneMod.PhoneAuthCredential | Null]
}
