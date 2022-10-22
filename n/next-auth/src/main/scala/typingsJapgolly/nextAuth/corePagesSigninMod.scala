package typingsJapgolly.nextAuth

import typingsJapgolly.nextAuth.coreTypesMod.Theme
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePagesSigninMod {
  
  @JSImport("next-auth/core/pages/signin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SignInServerPageParams): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nextAuth.nextAuthStrings.Signin
    - typingsJapgolly.nextAuth.nextAuthStrings.OAuthSignin
    - typingsJapgolly.nextAuth.nextAuthStrings.OAuthCallback
    - typingsJapgolly.nextAuth.nextAuthStrings.OAuthCreateAccount
    - typingsJapgolly.nextAuth.nextAuthStrings.EmailCreateAccount
    - typingsJapgolly.nextAuth.nextAuthStrings.Callback
    - typingsJapgolly.nextAuth.nextAuthStrings.OAuthAccountNotLinked
    - typingsJapgolly.nextAuth.nextAuthStrings.EmailSignin
    - typingsJapgolly.nextAuth.nextAuthStrings.CredentialsSignin
    - typingsJapgolly.nextAuth.nextAuthStrings.SessionRequired
    - typingsJapgolly.nextAuth.nextAuthStrings.default
  */
  trait SignInErrorTypes extends StObject
  object SignInErrorTypes {
    
    inline def default: typingsJapgolly.nextAuth.nextAuthStrings.default = "default".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.default]
    
    inline def Callback: typingsJapgolly.nextAuth.nextAuthStrings.Callback = "Callback".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.Callback]
    
    inline def CredentialsSignin: typingsJapgolly.nextAuth.nextAuthStrings.CredentialsSignin = "CredentialsSignin".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.CredentialsSignin]
    
    inline def EmailCreateAccount: typingsJapgolly.nextAuth.nextAuthStrings.EmailCreateAccount = "EmailCreateAccount".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.EmailCreateAccount]
    
    inline def EmailSignin: typingsJapgolly.nextAuth.nextAuthStrings.EmailSignin = "EmailSignin".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.EmailSignin]
    
    inline def OAuthAccountNotLinked: typingsJapgolly.nextAuth.nextAuthStrings.OAuthAccountNotLinked = "OAuthAccountNotLinked".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.OAuthAccountNotLinked]
    
    inline def OAuthCallback: typingsJapgolly.nextAuth.nextAuthStrings.OAuthCallback = "OAuthCallback".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.OAuthCallback]
    
    inline def OAuthCreateAccount: typingsJapgolly.nextAuth.nextAuthStrings.OAuthCreateAccount = "OAuthCreateAccount".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.OAuthCreateAccount]
    
    inline def OAuthSignin: typingsJapgolly.nextAuth.nextAuthStrings.OAuthSignin = "OAuthSignin".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.OAuthSignin]
    
    inline def SessionRequired: typingsJapgolly.nextAuth.nextAuthStrings.SessionRequired = "SessionRequired".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.SessionRequired]
    
    inline def Signin: typingsJapgolly.nextAuth.nextAuthStrings.Signin = "Signin".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.Signin]
  }
  
  trait SignInServerPageParams extends StObject {
    
    var callbackUrl: String
    
    var csrfToken: String
    
    var email: String
    
    var error: SignInErrorTypes
    
    var providers: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
      ]
    
    var theme: Theme
  }
  object SignInServerPageParams {
    
    inline def apply(
      callbackUrl: String,
      csrfToken: String,
      email: String,
      error: SignInErrorTypes,
      providers: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
        ],
      theme: Theme
    ): SignInServerPageParams = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], csrfToken = csrfToken.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInServerPageParams]
    }
    
    extension [Self <: SignInServerPageParams](x: Self) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCsrfToken(value: String): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setError(value: SignInErrorTypes): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setProviders(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
            ]
      ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any)*
      ): Self = StObject.set(x, "providers", js.Array(value*))
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
