package typingsJapgolly.jsonpPromise

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-next-line no-unnecessary-generics
  inline def apply[R](url: String): JsonpResult[R] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[JsonpResult[R]]
  inline def apply[R](url: String, options: JsonpOptions): JsonpResult[R] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JsonpResult[R]]
  
  @JSImport("jsonp-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JsonpOptions extends StObject {
    
    var param: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object JsonpOptions {
    
    inline def apply(): JsonpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonpOptions]
    }
    
    extension [Self <: JsonpOptions](x: Self) {
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait JsonpResult[R] extends StObject {
    
    def cancel(): Unit
    
    var promise: js.Promise[R]
  }
  object JsonpResult {
    
    inline def apply[R](cancel: Callback, promise: js.Promise[R]): JsonpResult[R] = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonpResult[R]]
    }
    
    extension [Self <: JsonpResult[?], R](x: Self & JsonpResult[R]) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setPromise(value: js.Promise[R]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
}
