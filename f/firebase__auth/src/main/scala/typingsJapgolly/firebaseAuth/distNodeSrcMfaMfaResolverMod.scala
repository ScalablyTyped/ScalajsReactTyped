package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcMfaMfaAssertionMod.MultiFactorAssertionImpl
import typingsJapgolly.firebaseAuth.distNodeSrcMfaMfaErrorMod.MultiFactorError
import typingsJapgolly.firebaseAuth.distNodeSrcMfaMfaInfoMod.MultiFactorInfoImpl
import typingsJapgolly.firebaseAuth.distNodeSrcMfaMfaSessionMod.MultiFactorSessionImpl
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.MultiFactorAssertion
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.MultiFactorInfo
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.MultiFactorResolver
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.MultiFactorSession
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcMfaMfaResolverMod {
  
  @JSImport("@firebase/auth/dist/node/src/mfa/mfa_resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/node/src/mfa/mfa_resolver", "MultiFactorResolverImpl")
  @js.native
  /* private */ open class MultiFactorResolverImpl ()
    extends StObject
       with MultiFactorResolver {
    
    /**
      * The list of hints for the second factors needed to complete the sign-in for the current
      * session.
      */
    /* CompleteClass */
    override val hints: js.Array[MultiFactorInfo] = js.native
    @JSName("hints")
    val hints_MultiFactorResolverImpl: js.Array[MultiFactorInfoImpl] = js.native
    
    def resolveSignIn(assertionExtern: MultiFactorAssertionImpl): js.Promise[UserCredential] = js.native
    /**
      * A helper function to help users complete sign in with a second factor using an
      * {@link MultiFactorAssertion} confirming the user successfully completed the second factor
      * challenge.
      *
      * @example
      * ```javascript
      * const phoneAuthCredential = PhoneAuthProvider.credential(verificationId, verificationCode);
      * const multiFactorAssertion = PhoneMultiFactorGenerator.assertion(phoneAuthCredential);
      * const userCredential = await resolver.resolveSignIn(multiFactorAssertion);
      * ```
      *
      * @param assertion - The multi-factor assertion to resolve sign-in with.
      * @returns The promise that resolves with the user credential object.
      */
    /* CompleteClass */
    override def resolveSignIn(assertion: MultiFactorAssertion): js.Promise[UserCredential] = js.native
    
    /**
      * The session identifier for the current sign-in flow, which can be used to complete the second
      * factor sign-in.
      */
    /* CompleteClass */
    override val session: MultiFactorSession = js.native
    @JSName("session")
    val session_MultiFactorResolverImpl: MultiFactorSessionImpl = js.native
    
    /* private */ val signInResolver: Any = js.native
  }
  /* static members */
  object MultiFactorResolverImpl {
    
    @JSImport("@firebase/auth/dist/node/src/mfa/mfa_resolver", "MultiFactorResolverImpl")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromError(authExtern: Auth, error: MultiFactorError): MultiFactorResolverImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromError")(authExtern.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolverImpl]
  }
  
  inline def getMultiFactorResolver(auth: Auth, error: typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
}
