package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeEsmSrcMfaMfaAssertionMod.MultiFactorAssertionImpl
import typingsJapgolly.firebaseAuth.distNodeEsmSrcMfaMfaErrorMod.MultiFactorError
import typingsJapgolly.firebaseAuth.distNodeEsmSrcMfaMfaInfoMod.MultiFactorInfoImpl
import typingsJapgolly.firebaseAuth.distNodeEsmSrcMfaMfaSessionMod.MultiFactorSessionImpl
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.MultiFactorAssertion
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.MultiFactorInfo
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.MultiFactorResolver
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.MultiFactorSession
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcMfaMfaResolverMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/mfa/mfa_resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/node-esm/src/mfa/mfa_resolver", "MultiFactorResolverImpl")
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
    
    @JSImport("@firebase/auth/dist/node-esm/src/mfa/mfa_resolver", "MultiFactorResolverImpl")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def _fromError(authExtern: Auth, error: MultiFactorError): MultiFactorResolverImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromError")(authExtern.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolverImpl]
  }
  
  inline def getMultiFactorResolver(auth: Auth, error: typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.MultiFactorError): MultiFactorResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiFactorResolver")(auth.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MultiFactorResolver]
}
