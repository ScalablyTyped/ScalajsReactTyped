package typingsJapgolly.expressOauthServer

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.oauth2Server.mod.AuthenticateOptions
import typingsJapgolly.oauth2Server.mod.AuthorizationCode
import typingsJapgolly.oauth2Server.mod.AuthorizationCodeModel
import typingsJapgolly.oauth2Server.mod.AuthorizeOptions
import typingsJapgolly.oauth2Server.mod.ClientCredentialsModel
import typingsJapgolly.oauth2Server.mod.ExtensionModel
import typingsJapgolly.oauth2Server.mod.PasswordModel
import typingsJapgolly.oauth2Server.mod.RefreshTokenModel
import typingsJapgolly.oauth2Server.mod.ServerOptions
import typingsJapgolly.oauth2Server.mod.Token
import typingsJapgolly.oauth2Server.mod.TokenOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-oauth-server", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ExpressOAuthServer {
    def this(options: Options) = this()
  }
  
  @js.native
  trait ExpressOAuthServer extends StObject {
    
    def authenticate(): js.Function3[
        /* request */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], 
        /* response */ Response_[Any, Record[String, Any]], 
        /* next */ NextFunction, 
        js.Promise[Token]
      ] = js.native
    def authenticate(options: AuthenticateOptions): js.Function3[
        /* request */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], 
        /* response */ Response_[Any, Record[String, Any]], 
        /* next */ NextFunction, 
        js.Promise[Token]
      ] = js.native
    
    def authorize(): js.Function3[
        /* request */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], 
        /* response */ Response_[Any, Record[String, Any]], 
        /* next */ NextFunction, 
        js.Promise[AuthorizationCode]
      ] = js.native
    def authorize(options: AuthorizeOptions): js.Function3[
        /* request */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], 
        /* response */ Response_[Any, Record[String, Any]], 
        /* next */ NextFunction, 
        js.Promise[AuthorizationCode]
      ] = js.native
    
    var server: typingsJapgolly.oauth2Server.mod.^ = js.native
    
    def token(): js.Function3[
        /* request */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], 
        /* response */ Response_[Any, Record[String, Any]], 
        /* next */ NextFunction, 
        js.Promise[Token]
      ] = js.native
    def token(options: TokenOptions): js.Function3[
        /* request */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], 
        /* response */ Response_[Any, Record[String, Any]], 
        /* next */ NextFunction, 
        js.Promise[Token]
      ] = js.native
  }
  
  trait Options
    extends StObject
       with ServerOptions {
    
    var continueMiddleware: js.UndefOr[Boolean] = js.undefined
    
    var useErrorHandler: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(
      model: AuthorizationCodeModel | ClientCredentialsModel | RefreshTokenModel | PasswordModel | ExtensionModel
    ): Options = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContinueMiddleware(value: Boolean): Self = StObject.set(x, "continueMiddleware", value.asInstanceOf[js.Any])
      
      inline def setContinueMiddlewareUndefined: Self = StObject.set(x, "continueMiddleware", js.undefined)
      
      inline def setUseErrorHandler(value: Boolean): Self = StObject.set(x, "useErrorHandler", value.asInstanceOf[js.Any])
      
      inline def setUseErrorHandlerUndefined: Self = StObject.set(x, "useErrorHandler", js.undefined)
    }
  }
}
