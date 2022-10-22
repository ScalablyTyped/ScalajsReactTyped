package typingsJapgolly.expressRateLimit

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressRateLimit.mod.LegacyStore
import typingsJapgolly.expressRateLimit.mod.Options
import typingsJapgolly.expressRateLimit.mod.RateLimitExceededEventHandler
import typingsJapgolly.expressRateLimit.mod.RateLimitReachedEventHandler
import typingsJapgolly.expressRateLimit.mod.Store
import typingsJapgolly.expressRateLimit.mod.ValueDeterminingMiddleware
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<express-rate-limit.express-rate-limit.Options> */
  trait PartialOptions extends StObject {
    
    var draft_polli_ratelimit_headers: js.UndefOr[Boolean] = js.undefined
    
    var handler: js.UndefOr[RateLimitExceededEventHandler] = js.undefined
    
    var headers: js.UndefOr[Boolean] = js.undefined
    
    var keyGenerator: js.UndefOr[ValueDeterminingMiddleware[String]] = js.undefined
    
    var legacyHeaders: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double | ValueDeterminingMiddleware[Double]] = js.undefined
    
    var message: js.UndefOr[Any | ValueDeterminingMiddleware[Any]] = js.undefined
    
    var onLimitReached: js.UndefOr[RateLimitReachedEventHandler] = js.undefined
    
    var requestPropertyName: js.UndefOr[String] = js.undefined
    
    var requestWasSuccessful: js.UndefOr[ValueDeterminingMiddleware[Boolean]] = js.undefined
    
    var skip: js.UndefOr[ValueDeterminingMiddleware[Boolean]] = js.undefined
    
    var skipFailedRequests: js.UndefOr[Boolean] = js.undefined
    
    var skipSuccessfulRequests: js.UndefOr[Boolean] = js.undefined
    
    var standardHeaders: js.UndefOr[Boolean] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
    
    var store: js.UndefOr[Store | LegacyStore] = js.undefined
    
    var windowMs: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setDraft_polli_ratelimit_headers(value: Boolean): Self = StObject.set(x, "draft_polli_ratelimit_headers", value.asInstanceOf[js.Any])
      
      inline def setDraft_polli_ratelimit_headersUndefined: Self = StObject.set(x, "draft_polli_ratelimit_headers", js.undefined)
      
      inline def setHandler(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]], /* next */ NextFunction, /* optionsUsed */ Options) => Callback
      ): Self = StObject.set(x, "handler", js.Any.fromFunction4((t0: /* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: /* response */ Response_[Any, Record[String, Any]], t2: /* next */ NextFunction, t3: /* optionsUsed */ Options) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setHeaders(value: Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setKeyGenerator(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]]) => String | js.Promise[String]
      ): Self = StObject.set(x, "keyGenerator", js.Any.fromFunction2(value))
      
      inline def setKeyGeneratorUndefined: Self = StObject.set(x, "keyGenerator", js.undefined)
      
      inline def setLegacyHeaders(value: Boolean): Self = StObject.set(x, "legacyHeaders", value.asInstanceOf[js.Any])
      
      inline def setLegacyHeadersUndefined: Self = StObject.set(x, "legacyHeaders", js.undefined)
      
      inline def setMax(value: Double | ValueDeterminingMiddleware[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxFunction2(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]]) => Double | js.Promise[Double]
      ): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMessage(value: Any | ValueDeterminingMiddleware[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction2(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]]) => Any | js.Promise[Any]
      ): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnLimitReached(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]], /* optionsUsed */ Options) => Callback
      ): Self = StObject.set(x, "onLimitReached", js.Any.fromFunction3((t0: /* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: /* response */ Response_[Any, Record[String, Any]], t2: /* optionsUsed */ Options) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnLimitReachedUndefined: Self = StObject.set(x, "onLimitReached", js.undefined)
      
      inline def setRequestPropertyName(value: String): Self = StObject.set(x, "requestPropertyName", value.asInstanceOf[js.Any])
      
      inline def setRequestPropertyNameUndefined: Self = StObject.set(x, "requestPropertyName", js.undefined)
      
      inline def setRequestWasSuccessful(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]]) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "requestWasSuccessful", js.Any.fromFunction2(value))
      
      inline def setRequestWasSuccessfulUndefined: Self = StObject.set(x, "requestWasSuccessful", js.undefined)
      
      inline def setSkip(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* response */ Response_[Any, Record[String, Any]]) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
      
      inline def setSkipFailedRequests(value: Boolean): Self = StObject.set(x, "skipFailedRequests", value.asInstanceOf[js.Any])
      
      inline def setSkipFailedRequestsUndefined: Self = StObject.set(x, "skipFailedRequests", js.undefined)
      
      inline def setSkipSuccessfulRequests(value: Boolean): Self = StObject.set(x, "skipSuccessfulRequests", value.asInstanceOf[js.Any])
      
      inline def setSkipSuccessfulRequestsUndefined: Self = StObject.set(x, "skipSuccessfulRequests", js.undefined)
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setStandardHeaders(value: Boolean): Self = StObject.set(x, "standardHeaders", value.asInstanceOf[js.Any])
      
      inline def setStandardHeadersUndefined: Self = StObject.set(x, "standardHeaders", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setStore(value: Store | LegacyStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setWindowMs(value: Double): Self = StObject.set(x, "windowMs", value.asInstanceOf[js.Any])
      
      inline def setWindowMsUndefined: Self = StObject.set(x, "windowMs", js.undefined)
    }
  }
}
