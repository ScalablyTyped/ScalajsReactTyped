package typingsJapgolly.reactSvg

import japgolly.scalajs.react.Callback
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterInjection extends StObject {
    
    def afterInjection(): Unit
    
    def beforeInjection(): Unit
    
    var evalScripts: String
    
    var fallback: Null
    
    var httpRequestWithCredentials: Boolean
    
    var loading: Null
    
    var renumerateIRIElements: Boolean
    
    var useRequestCache: Boolean
    
    var wrapper: String
  }
  object AfterInjection {
    
    inline def apply(
      afterInjection: Callback,
      beforeInjection: Callback,
      evalScripts: String,
      fallback: Null,
      httpRequestWithCredentials: Boolean,
      loading: Null,
      renumerateIRIElements: Boolean,
      useRequestCache: Boolean,
      wrapper: String
    ): AfterInjection = {
      val __obj = js.Dynamic.literal(afterInjection = afterInjection.toJsFn, beforeInjection = beforeInjection.toJsFn, evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], httpRequestWithCredentials = httpRequestWithCredentials.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], useRequestCache = useRequestCache.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterInjection]
    }
    
    extension [Self <: AfterInjection](x: Self) {
      
      inline def setAfterInjection(value: Callback): Self = StObject.set(x, "afterInjection", value.toJsFn)
      
      inline def setBeforeInjection(value: Callback): Self = StObject.set(x, "beforeInjection", value.toJsFn)
      
      inline def setEvalScripts(value: String): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: Null): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestWithCredentials(value: Boolean): Self = StObject.set(x, "httpRequestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Null): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setUseRequestCache(value: Boolean): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeInjection extends StObject {
    
    var afterInjection: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var beforeInjection: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var evalScripts: Requireable[String]
    
    var fallback: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]]
    
    var httpRequestWithCredentials: Requireable[Boolean]
    
    var loading: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]]
    
    var renumerateIRIElements: Requireable[Boolean]
    
    var src: Validator[String]
    
    var useRequestCache: Requireable[Boolean]
    
    var wrapper: Requireable[String]
  }
  object BeforeInjection {
    
    inline def apply(
      afterInjection: Requireable[js.Function1[/* repeated */ Any, Any]],
      beforeInjection: Requireable[js.Function1[/* repeated */ Any, Any]],
      evalScripts: Requireable[String],
      fallback: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]],
      httpRequestWithCredentials: Requireable[Boolean],
      loading: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]],
      renumerateIRIElements: Requireable[Boolean],
      src: Validator[String],
      useRequestCache: Requireable[Boolean],
      wrapper: Requireable[String]
    ): BeforeInjection = {
      val __obj = js.Dynamic.literal(afterInjection = afterInjection.asInstanceOf[js.Any], beforeInjection = beforeInjection.asInstanceOf[js.Any], evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], httpRequestWithCredentials = httpRequestWithCredentials.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], useRequestCache = useRequestCache.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeInjection]
    }
    
    extension [Self <: BeforeInjection](x: Self) {
      
      inline def setAfterInjection(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "afterInjection", value.asInstanceOf[js.Any])
      
      inline def setBeforeInjection(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "beforeInjection", value.asInstanceOf[js.Any])
      
      inline def setEvalScripts(value: Requireable[String]): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestWithCredentials(value: Requireable[Boolean]): Self = StObject.set(x, "httpRequestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Requireable[NonNullable[js.UndefOr[String | js.Object | Null]]]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElements(value: Requireable[Boolean]): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: Validator[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setUseRequestCache(value: Requireable[Boolean]): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: Requireable[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasError extends StObject {
    
    var hasError: Boolean
    
    var isLoading: Boolean
  }
  object HasError {
    
    inline def apply(hasError: Boolean, isLoading: Boolean): HasError = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasError]
    }
    
    extension [Self <: HasError](x: Self) {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
}
