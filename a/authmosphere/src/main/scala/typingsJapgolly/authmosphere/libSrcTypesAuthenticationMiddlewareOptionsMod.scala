package typingsJapgolly.authmosphere

import japgolly.scalajs.react.Callback
import typingsJapgolly.authmosphere.libSrcTypesGetTokenInfoMod.GetTokenInfo
import typingsJapgolly.authmosphere.libSrcTypesLoggerMod.Logger
import typingsJapgolly.authmosphere.libSrcTypesTokenMod.Token
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesAuthenticationMiddlewareOptionsMod {
  
  trait AuthenticationMiddlewareOptions extends StObject {
    
    var getTokenInfo: js.UndefOr[GetTokenInfo[Record[String | Double | js.Symbol, Any]]] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var onNotAuthenticatedHandler: js.UndefOr[
        typingsJapgolly.authmosphere.libSrcTypesAuthenticationMiddlewareOptionsMod.onNotAuthenticatedHandler
      ] = js.undefined
    
    var publicEndpoints: js.UndefOr[js.Array[String]] = js.undefined
    
    var tokenInfoEndpoint: String
  }
  object AuthenticationMiddlewareOptions {
    
    inline def apply(tokenInfoEndpoint: String): AuthenticationMiddlewareOptions = {
      val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationMiddlewareOptions]
    }
    
    extension [Self <: AuthenticationMiddlewareOptions](x: Self) {
      
      inline def setGetTokenInfo(
        value: (/* tokenInfoUrl */ String, /* accessToken */ String, /* logger */ js.UndefOr[Logger]) => js.Promise[Token[Record[String | Double | js.Symbol, Any]]]
      ): Self = StObject.set(x, "getTokenInfo", js.Any.fromFunction3(value))
      
      inline def setGetTokenInfoUndefined: Self = StObject.set(x, "getTokenInfo", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setOnNotAuthenticatedHandler(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* resonse */ Response_[Any, Record[String, Any]], /* next */ NextFunction, /* logger */ Logger) => Callback
      ): Self = StObject.set(x, "onNotAuthenticatedHandler", js.Any.fromFunction4((t0: /* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: /* resonse */ Response_[Any, Record[String, Any]], t2: /* next */ NextFunction, t3: /* logger */ Logger) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnNotAuthenticatedHandlerUndefined: Self = StObject.set(x, "onNotAuthenticatedHandler", js.undefined)
      
      inline def setPublicEndpoints(value: js.Array[String]): Self = StObject.set(x, "publicEndpoints", value.asInstanceOf[js.Any])
      
      inline def setPublicEndpointsUndefined: Self = StObject.set(x, "publicEndpoints", js.undefined)
      
      inline def setPublicEndpointsVarargs(value: String*): Self = StObject.set(x, "publicEndpoints", js.Array(value*))
      
      inline def setTokenInfoEndpoint(value: String): Self = StObject.set(x, "tokenInfoEndpoint", value.asInstanceOf[js.Any])
    }
  }
  
  type onNotAuthenticatedHandler = js.Function4[
    /* request */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resonse */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    /* logger */ Logger, 
    Unit
  ]
}
