package typingsJapgolly.firebaseAuth.distNodeEsmInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/node-esm/internal", "EmailAuthCredential")
@js.native
/** @internal */
/* private */ open class EmailAuthCredential ()
  extends typingsJapgolly.firebaseAuth.distNodeEsmMod.EmailAuthCredential
/* static members */
object EmailAuthCredential {
  
  @JSImport("@firebase/auth/dist/node-esm/internal", "EmailAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _fromEmailAndCode(email: String, oobCode: String): typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential]
  inline def _fromEmailAndCode(email: String, oobCode: String, tenantId: String): typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndCode")(email.asInstanceOf[js.Any], oobCode.asInstanceOf[js.Any], tenantId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential]
  
  /** @internal */
  inline def _fromEmailAndPassword(email: String, password: String): typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromEmailAndPassword")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential]
  
  inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
  /**
    * Static method to deserialize a JSON representation of an object into an {@link  AuthCredential}.
    *
    * @param json - Either `object` or the stringified representation of the object. When string is
    * provided, `JSON.parse` would be called first.
    *
    * @returns If the JSON input does not represent an {@link AuthCredential}, null is returned.
    */
  inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsEmailMod.EmailAuthCredential | Null]
}
