package typingsJapgolly.matrixAppserviceBridge.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.DELETE
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.GET
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.POST
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.PUT
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authenticate extends StObject {
  
  var authenticate: js.UndefOr[Boolean] = js.undefined
  
  def handler(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    respose: Response_[Any, Record[String, Any]],
    next: NextFunction
  ): Unit
  
  var method: GET | PUT | POST | DELETE
  
  var path: String
}
object Authenticate {
  
  inline def apply(
    handler: (Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], Response_[Any, Record[String, Any]], NextFunction) => Callback,
    method: GET | PUT | POST | DELETE,
    path: String
  ): Authenticate = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction3((t0: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], t1: Response_[Any, Record[String, Any]], t2: NextFunction) => (handler(t0, t1, t2)).runNow()), method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticate]
  }
  
  extension [Self <: Authenticate](x: Self) {
    
    inline def setAuthenticate(value: Boolean): Self = StObject.set(x, "authenticate", value.asInstanceOf[js.Any])
    
    inline def setAuthenticateUndefined: Self = StObject.set(x, "authenticate", js.undefined)
    
    inline def setHandler(
      value: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], Response_[Any, Record[String, Any]], NextFunction) => Callback
    ): Self = StObject.set(x, "handler", js.Any.fromFunction3((t0: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], t1: Response_[Any, Record[String, Any]], t2: NextFunction) => (value(t0, t1, t2)).runNow()))
    
    inline def setMethod(value: GET | PUT | POST | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
