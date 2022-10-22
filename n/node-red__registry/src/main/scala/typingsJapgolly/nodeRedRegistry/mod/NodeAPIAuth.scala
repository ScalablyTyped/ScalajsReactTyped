package typingsJapgolly.nodeRedRegistry.mod

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAPIAuth extends StObject {
  
  /**
    * Returns an Express middleware function that ensures the user making a request has the necessary permission.
    */
  def needsPermission(permission: String): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]
}
object NodeAPIAuth {
  
  inline def apply(
    needsPermission: String => js.Function3[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      /* res */ Response_[Any, Record[String, Any]], 
      /* next */ NextFunction, 
      Unit
    ]
  ): NodeAPIAuth = {
    val __obj = js.Dynamic.literal(needsPermission = js.Any.fromFunction1(needsPermission))
    __obj.asInstanceOf[NodeAPIAuth]
  }
  
  extension [Self <: NodeAPIAuth](x: Self) {
    
    inline def setNeedsPermission(
      value: String => js.Function3[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          /* next */ NextFunction, 
          Unit
        ]
    ): Self = StObject.set(x, "needsPermission", js.Any.fromFunction1(value))
  }
}
