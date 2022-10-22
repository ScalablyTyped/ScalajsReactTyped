package typingsJapgolly.hostValidation

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.hostValidation.hostValidationStrings.both
import typingsJapgolly.hostValidation.hostValidationStrings.either
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: config): js.Function3[
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
  ] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
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
  ]]
  
  @JSImport("host-validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait config extends StObject {
    
    var fail: js.UndefOr[
        js.Function3[
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
      ] = js.undefined
    
    var hosts: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var mode: js.UndefOr[both | either] = js.undefined
    
    var referers: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  }
  object config {
    
    inline def apply(): config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[config]
    }
    
    extension [Self <: config](x: Self) {
      
      inline def setFail(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]], /* next */ NextFunction) => Callback
      ): Self = StObject.set(x, "fail", js.Any.fromFunction3((t0: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: /* res */ Response_[Any, Record[String, Any]], t2: /* next */ NextFunction) => (value(t0, t1, t2)).runNow()))
      
      inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      inline def setHosts(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setHostsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "hosts", js.Array(value*))
      
      inline def setMode(value: both | either): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setReferers(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "referers", value.asInstanceOf[js.Any])
      
      inline def setReferersUndefined: Self = StObject.set(x, "referers", js.undefined)
      
      inline def setReferersVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "referers", js.Array(value*))
    }
  }
}
