package typingsJapgolly.authmosphere

import japgolly.scalajs.react.Callback
import typingsJapgolly.authmosphere.libSrcTypesLoggerMod.Logger
import typingsJapgolly.authmosphere.libSrcTypesPrecedenceMod.PrecedenceOptions
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesScopeMiddlewareOptionsMod {
  
  trait ScopeMiddlewareOptions extends StObject {
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var onAuthorizationFailedHandler: js.UndefOr[
        typingsJapgolly.authmosphere.libSrcTypesScopeMiddlewareOptionsMod.onAuthorizationFailedHandler
      ] = js.undefined
    
    var precedenceOptions: js.UndefOr[PrecedenceOptions] = js.undefined
  }
  object ScopeMiddlewareOptions {
    
    inline def apply(): ScopeMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScopeMiddlewareOptions]
    }
    
    extension [Self <: ScopeMiddlewareOptions](x: Self) {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setOnAuthorizationFailedHandler(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* resonse */ Response_[Any, Record[String, Any]], /* next */ NextFunction, /* scopes */ js.Array[String], /* logger */ Logger) => Callback
      ): Self = StObject.set(x, "onAuthorizationFailedHandler", js.Any.fromFunction5((t0: /* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: /* resonse */ Response_[Any, Record[String, Any]], t2: /* next */ NextFunction, t3: /* scopes */ js.Array[String], t4: /* logger */ Logger) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setOnAuthorizationFailedHandlerUndefined: Self = StObject.set(x, "onAuthorizationFailedHandler", js.undefined)
      
      inline def setPrecedenceOptions(value: PrecedenceOptions): Self = StObject.set(x, "precedenceOptions", value.asInstanceOf[js.Any])
      
      inline def setPrecedenceOptionsUndefined: Self = StObject.set(x, "precedenceOptions", js.undefined)
    }
  }
  
  type onAuthorizationFailedHandler = js.Function5[
    /* request */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* resonse */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    /* scopes */ js.Array[String], 
    /* logger */ Logger, 
    Unit
  ]
}
