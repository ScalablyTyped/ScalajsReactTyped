package typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RedirectFunction extends StObject
@JSImport("@firebase/auth/dist/node/test/integration/webdriver/util/functions", "RedirectFunction")
@js.native
object RedirectFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RedirectFunction & String] = js.native
  
  @js.native
  sealed trait CREATE_FAKE_GOOGLE_USER
    extends StObject
       with RedirectFunction
  /* "redirect.createFakeGoogleUser" */ val CREATE_FAKE_GOOGLE_USER: typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.CREATE_FAKE_GOOGLE_USER & String = js.native
  
  @js.native
  sealed trait GENERATE_CREDENTIAL_FROM_RESULT
    extends StObject
       with RedirectFunction
  /* "redirect.generateCredentialFromRedirectResultAndStore" */ val GENERATE_CREDENTIAL_FROM_RESULT: typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.GENERATE_CREDENTIAL_FROM_RESULT & String = js.native
  
  @js.native
  sealed trait IDP_LINK_REDIRECT
    extends StObject
       with RedirectFunction
  /* "redirect.idpLinkRedirect" */ val IDP_LINK_REDIRECT: typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.IDP_LINK_REDIRECT & String = js.native
  
  @js.native
  sealed trait IDP_REAUTH_REDIRECT
    extends StObject
       with RedirectFunction
  /* "redirect.idpReauthRedirect" */ val IDP_REAUTH_REDIRECT: typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.IDP_REAUTH_REDIRECT & String = js.native
  
  @js.native
  sealed trait IDP_REDIRECT
    extends StObject
       with RedirectFunction
  /* "redirect.idpRedirect" */ val IDP_REDIRECT: typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.IDP_REDIRECT & String = js.native
  
  @js.native
  sealed trait LINK_WITH_ERROR_CREDENTIAL
    extends StObject
       with RedirectFunction
  /* "redirect.linkWithErrorCredential" */ val LINK_WITH_ERROR_CREDENTIAL: typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.LINK_WITH_ERROR_CREDENTIAL & String = js.native
  
  @js.native
  sealed trait REDIRECT_RESULT
    extends StObject
       with RedirectFunction
  /* "redirect.redirectResult" */ val REDIRECT_RESULT: typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.REDIRECT_RESULT & String = js.native
  
  @js.native
  sealed trait SIGN_IN_WITH_REDIRECT_CREDENTIAL
    extends StObject
       with RedirectFunction
  /* "redirect.signInWithRedirectCredential" */ val SIGN_IN_WITH_REDIRECT_CREDENTIAL: typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.SIGN_IN_WITH_REDIRECT_CREDENTIAL & String = js.native
  
  @js.native
  sealed trait TRY_TO_SIGN_IN_UNVERIFIED
    extends StObject
       with RedirectFunction
  /* "redirect.tryToSignInUnverified" */ val TRY_TO_SIGN_IN_UNVERIFIED: typingsJapgolly.firebaseAuth.distNodeTestIntegrationWebdriverUtilFunctionsMod.RedirectFunction.TRY_TO_SIGN_IN_UNVERIFIED & String = js.native
}
