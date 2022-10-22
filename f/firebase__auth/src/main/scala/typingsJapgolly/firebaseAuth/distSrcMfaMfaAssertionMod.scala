package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distSrcApiAuthenticationMfaMod.FinalizeMfaResponse
import typingsJapgolly.firebaseAuth.distSrcMfaMfaSessionMod.MultiFactorSessionImpl
import typingsJapgolly.firebaseAuth.distSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.FactorId
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.MultiFactorAssertion
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMfaMfaAssertionMod {
  
  /* note: abstract class */ @JSImport("@firebase/auth/dist/src/mfa/mfa_assertion", "MultiFactorAssertionImpl")
  @js.native
  open class MultiFactorAssertionImpl protected ()
    extends StObject
       with MultiFactorAssertion {
    /* protected */ def this(factorId: FactorId) = this()
    
    def _finalizeEnroll(auth: AuthInternal, idToken: String): js.Promise[FinalizeMfaResponse] = js.native
    def _finalizeEnroll(auth: AuthInternal, idToken: String, displayName: String): js.Promise[FinalizeMfaResponse] = js.native
    
    def _finalizeSignIn(auth: AuthInternal, mfaPendingCredential: String): js.Promise[FinalizeMfaResponse] = js.native
    
    def _process(auth: AuthInternal, session: MultiFactorSessionImpl): js.Promise[FinalizeMfaResponse] = js.native
    def _process(auth: AuthInternal, session: MultiFactorSessionImpl, displayName: String): js.Promise[FinalizeMfaResponse] = js.native
    
    /** The identifier of the second factor. */
    /* CompleteClass */
    override val factorId: phone = js.native
    @JSName("factorId")
    val factorId_MultiFactorAssertionImpl: FactorId = js.native
  }
}
