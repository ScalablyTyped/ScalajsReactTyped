package typingsJapgolly.statsdClient

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.statsdClient.mod.ExpressMiddlewareOptions
import typingsJapgolly.statsdClient.mod.WrappedCallbackOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GetExpressMiddleware extends StObject {
    
    def getExpressMiddleware(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def getExpressMiddleware(prefix: String): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def getExpressMiddleware(prefix: String, options: ExpressMiddlewareOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def getExpressMiddleware(prefix: Unit, options: ExpressMiddlewareOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def wrapCallback(prefix: String, callback: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any] = js.native
    def wrapCallback(prefix: String, callback: js.Function1[/* repeated */ Any, Any], options: WrappedCallbackOptions): js.Function1[/* repeated */ Any, Any] = js.native
  }
}
