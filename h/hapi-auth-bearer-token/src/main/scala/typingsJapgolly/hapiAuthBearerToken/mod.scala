package typingsJapgolly.hapiAuthBearerToken

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.hapiAuthBearerToken.hapiAuthBearerTokenStrings.`bearer-access-token`
import typingsJapgolly.hapiHapi.mod.AuthCredentials
import typingsJapgolly.hapiHapi.mod.AuthenticationData
import typingsJapgolly.hapiHapi.mod.Plugin
import typingsJapgolly.hapiHapi.mod.Request
import typingsJapgolly.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hapi-auth-bearer-token", JSImport.Namespace)
  @js.native
  val ^ : Plugin[js.Object] = js.native
  
  trait SchemaOptions extends StObject {
    
    var accessTokenName: js.UndefOr[String] = js.undefined
    
    var allowChaining: js.UndefOr[Boolean] = js.undefined
    
    var allowCookieToken: js.UndefOr[Boolean] = js.undefined
    
    var allowMultipleHeaders: js.UndefOr[Boolean] = js.undefined
    
    var allowQueryToken: js.UndefOr[Boolean] = js.undefined
    
    var tokenType: js.UndefOr[String] = js.undefined
    
    var unauthorized: js.UndefOr[js.Function2[/* message */ String | Null, /* scheme */ String, Any]] = js.undefined
    
    def validate(request: Request, token: String, h: ResponseToolkit): js.Promise[ValidateReturn] | ValidateReturn
    @JSName("validate")
    var validate_Original: Validate
  }
  object SchemaOptions {
    
    inline def apply(
      validate: (/* request */ Request, /* token */ String, /* h */ ResponseToolkit) => js.Promise[ValidateReturn] | ValidateReturn
    ): SchemaOptions = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
      __obj.asInstanceOf[SchemaOptions]
    }
    
    extension [Self <: SchemaOptions](x: Self) {
      
      inline def setAccessTokenName(value: String): Self = StObject.set(x, "accessTokenName", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenNameUndefined: Self = StObject.set(x, "accessTokenName", js.undefined)
      
      inline def setAllowChaining(value: Boolean): Self = StObject.set(x, "allowChaining", value.asInstanceOf[js.Any])
      
      inline def setAllowChainingUndefined: Self = StObject.set(x, "allowChaining", js.undefined)
      
      inline def setAllowCookieToken(value: Boolean): Self = StObject.set(x, "allowCookieToken", value.asInstanceOf[js.Any])
      
      inline def setAllowCookieTokenUndefined: Self = StObject.set(x, "allowCookieToken", js.undefined)
      
      inline def setAllowMultipleHeaders(value: Boolean): Self = StObject.set(x, "allowMultipleHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleHeadersUndefined: Self = StObject.set(x, "allowMultipleHeaders", js.undefined)
      
      inline def setAllowQueryToken(value: Boolean): Self = StObject.set(x, "allowQueryToken", value.asInstanceOf[js.Any])
      
      inline def setAllowQueryTokenUndefined: Self = StObject.set(x, "allowQueryToken", js.undefined)
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      inline def setUnauthorized(value: (/* message */ String | Null, /* scheme */ String) => Any): Self = StObject.set(x, "unauthorized", js.Any.fromFunction2(value))
      
      inline def setUnauthorizedUndefined: Self = StObject.set(x, "unauthorized", js.undefined)
      
      inline def setValidate(
        value: (/* request */ Request, /* token */ String, /* h */ ResponseToolkit) => js.Promise[ValidateReturn] | ValidateReturn
      ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    }
  }
  
  type Validate = js.Function3[
    /* request */ Request, 
    /* token */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateReturn] | ValidateReturn
  ]
  
  trait ValidateReturn
    extends StObject
       with AuthenticationData {
    
    var isValid: Boolean
  }
  object ValidateReturn {
    
    inline def apply(credentials: AuthCredentials, isValid: Boolean): ValidateReturn = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateReturn]
    }
    
    extension [Self <: ValidateReturn](x: Self) {
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Object] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait ServerAuth extends StObject {
      
      @JSName("strategy")
      def strategy_beareraccesstoken(name: String, scheme: `bearer-access-token`, options: SchemaOptions): Unit
    }
    object ServerAuth {
      
      inline def apply(strategy: (String, `bearer-access-token`, SchemaOptions) => Callback): ServerAuth = {
        val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction3((t0: String, t1: `bearer-access-token`, t2: SchemaOptions) => (strategy(t0, t1, t2)).runNow()))
        __obj.asInstanceOf[ServerAuth]
      }
      
      extension [Self <: ServerAuth](x: Self) {
        
        inline def setStrategy(value: (String, `bearer-access-token`, SchemaOptions) => Callback): Self = StObject.set(x, "strategy", js.Any.fromFunction3((t0: String, t1: `bearer-access-token`, t2: SchemaOptions) => (value(t0, t1, t2)).runNow()))
      }
    }
  }
}
