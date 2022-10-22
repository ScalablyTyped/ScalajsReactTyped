package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.anon.IdToken
import typingsJapgolly.firebaseAuth.anon.PartialSerializedMultiFac
import typingsJapgolly.firebaseAuth.distEsm5SrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.MultiFactorSession
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.enroll
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.signin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcMfaMfaSessionMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/mfa/mfa_session", "MultiFactorSessionImpl")
  @js.native
  /* private */ open class MultiFactorSessionImpl ()
    extends StObject
       with MultiFactorSession {
    
    val auth: js.UndefOr[AuthInternal] = js.native
    
    val credential: String = js.native
    
    def toJSON(): SerializedMultiFactorSession = js.native
    
    val `type`: MultiFactorSessionType = js.native
  }
  /* static members */
  object MultiFactorSessionImpl {
    
    @JSImport("@firebase/auth/dist/esm5/src/mfa/mfa_session", "MultiFactorSessionImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _fromIdtoken(idToken: String): MultiFactorSessionImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdtoken")(idToken.asInstanceOf[js.Any]).asInstanceOf[MultiFactorSessionImpl]
    inline def _fromIdtoken(idToken: String, auth: AuthInternal): MultiFactorSessionImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdtoken")(idToken.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[MultiFactorSessionImpl]
    
    inline def _fromMfaPendingCredential(mfaPendingCredential: String): MultiFactorSessionImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("_fromMfaPendingCredential")(mfaPendingCredential.asInstanceOf[js.Any]).asInstanceOf[MultiFactorSessionImpl]
    
    inline def fromJSON(obj: PartialSerializedMultiFac): MultiFactorSessionImpl | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[MultiFactorSessionImpl | Null]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.enroll
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.signin_
  */
  trait MultiFactorSessionType extends StObject
  object MultiFactorSessionType {
    
    inline def ENROLL: enroll = "enroll".asInstanceOf[enroll]
    
    inline def SIGN_IN: signin_ = "signin".asInstanceOf[signin_]
  }
  
  trait SerializedMultiFactorSession extends StObject {
    
    var multiFactorSession: IdToken
  }
  object SerializedMultiFactorSession {
    
    inline def apply(multiFactorSession: IdToken): SerializedMultiFactorSession = {
      val __obj = js.Dynamic.literal(multiFactorSession = multiFactorSession.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedMultiFactorSession]
    }
    
    extension [Self <: SerializedMultiFactorSession](x: Self) {
      
      inline def setMultiFactorSession(value: IdToken): Self = StObject.set(x, "multiFactorSession", value.asInstanceOf[js.Any])
    }
  }
}
