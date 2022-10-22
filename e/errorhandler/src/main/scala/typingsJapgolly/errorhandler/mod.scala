package typingsJapgolly.errorhandler

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.ErrorRequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create new middleware to handle errors and respond with content negotiation.
    */
  inline def apply(): ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: Options): ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("errorhandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Template title, framework authors may override this value.
    */
  @JSImport("errorhandler", "title")
  @js.native
  val title: String = js.native
  
  type LoggingCallback = js.Function4[
    /* err */ js.Error, 
    /* str */ String, 
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    Unit
  ]
  
  trait Options extends StObject {
    
    /**
      * Provide a function to be called with the error and a string representation of the erro
      * Defaults to true.
      *
      * Possible values:
      *   true       : Log errors using console.error(str).
      *   false      : Only send the error back in the response.
      *   A function : pass the error to a function for handling.
      */
    var log: Boolean | LoggingCallback
  }
  object Options {
    
    inline def apply(log: Boolean | LoggingCallback): Options = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLog(value: Boolean | LoggingCallback): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogFunction4(
        value: (/* err */ js.Error, /* str */ String, /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]]) => Callback
      ): Self = StObject.set(x, "log", js.Any.fromFunction4((t0: /* err */ js.Error, t1: /* str */ String, t2: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t3: /* res */ Response_[Any, Record[String, Any]]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
}
