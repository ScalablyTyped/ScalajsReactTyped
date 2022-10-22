package typingsJapgolly.redisRateLimiter

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.redisRateLimiter.redisRateLimiterStrings.ip
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-rate-limiter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RedisRateLimiter
  @JSImport("redis-rate-limiter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(options: Options): js.Function2[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* callback */ js.Function2[/* err */ js.Error, /* res */ Response, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* callback */ js.Function2[/* err */ js.Error, /* res */ Response, Unit], 
    Unit
  ]]
  
  /* static member */
  inline def middleware(options: Options): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  trait Options extends StObject {
    
    var deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.undefined
    
    var key: ip | (js.Function1[
        /* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], 
        String
      ])
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var onPossibleRaceCondition: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
    
    var rate: js.UndefOr[String] = js.undefined
    
    var redis: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any
    
    var window: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(
      key: ip | (js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          String
        ]),
      redis: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any
    ): Options = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDeleteImmediatelyIfRaceCondition(value: Boolean): Self = StObject.set(x, "deleteImmediatelyIfRaceCondition", value.asInstanceOf[js.Any])
      
      inline def setDeleteImmediatelyIfRaceConditionUndefined: Self = StObject.set(x, "deleteImmediatelyIfRaceCondition", js.undefined)
      
      inline def setKey(
        value: ip | (js.Function1[
              /* req */ Request_[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ], 
              String
            ])
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyFunction1(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => String
      ): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOnPossibleRaceCondition(value: /* key */ String => Callback): Self = StObject.set(x, "onPossibleRaceCondition", js.Any.fromFunction1((t0: /* key */ String) => value(t0).runNow()))
      
      inline def setOnPossibleRaceConditionUndefined: Self = StObject.set(x, "onPossibleRaceCondition", js.undefined)
      
      inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setRedis(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any
      ): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait RedisRateLimiter extends StObject
  
  trait Response extends StObject {
    
    var current: Double
    
    var key: String
    
    var limit: Double
    
    var over: Boolean
    
    var window: Double
  }
  object Response {
    
    inline def apply(current: Double, key: String, limit: Double, over: Boolean, window: Double): Response = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setOver(value: Boolean): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
}
