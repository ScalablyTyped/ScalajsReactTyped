package typingsJapgolly.ratelimiter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ratelimiter.anon.Exec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ratelimiter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Limiter {
    def this(opts: LimiterOption) = this()
    
    /**
      * Get values and header / status code and invoke `fn(err, info)`.
      */
    /* CompleteClass */
    override def get(fn: js.Function2[/* err */ Any, /* info */ LimiterInfo, Unit]): Unit = js.native
    
    /**
      * Inspect implementation
      */
    /* CompleteClass */
    override def inspect(): String = js.native
  }
  
  trait Limiter extends StObject {
    
    /**
      * Get values and header / status code and invoke `fn(err, info)`.
      */
    def get(fn: js.Function2[/* err */ Any, /* info */ LimiterInfo, Unit]): Unit
    
    /**
      * Inspect implementation
      */
    def inspect(): String
  }
  object Limiter {
    
    inline def apply(
      get: js.Function2[/* err */ Any, /* info */ LimiterInfo, Unit] => Callback,
      inspect: CallbackTo[String]
    ): Limiter = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1((t0: js.Function2[/* err */ Any, /* info */ LimiterInfo, Unit]) => get(t0).runNow()), inspect = inspect.toJsFn)
      __obj.asInstanceOf[Limiter]
    }
    
    extension [Self <: Limiter](x: Self) {
      
      inline def setGet(value: js.Function2[/* err */ Any, /* info */ LimiterInfo, Unit] => Callback): Self = StObject.set(x, "get", js.Any.fromFunction1((t0: js.Function2[/* err */ Any, /* info */ LimiterInfo, Unit]) => value(t0).runNow()))
      
      inline def setInspect(value: CallbackTo[String]): Self = StObject.set(x, "inspect", value.toJsFn)
    }
  }
  
  /**
    * Result Object
    */
  trait LimiterInfo extends StObject {
    
    /**
      * number of calls left in current `duration` without decreasing current `get`
      */
    var remaining: Double
    
    /**
      * time since epoch in seconds at which the rate limiting period will end (or already ended)
      */
    var reset: Double
    
    /**
      * time since epoch in milliseconds at which the rate limiting period will end (or already ended)
      */
    var resetMs: Double
    
    /**
      * `max` value
      */
    var total: Double
  }
  object LimiterInfo {
    
    inline def apply(remaining: Double, reset: Double, resetMs: Double, total: Double): LimiterInfo = {
      val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resetMs = resetMs.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimiterInfo]
    }
    
    extension [Self <: LimiterInfo](x: Self) {
      
      inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Double): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetMs(value: Double): Self = StObject.set(x, "resetMs", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait LimiterOption extends StObject {
    
    /**
      * Redis connection instance
      */
    var db: RedisClient
    
    /**
      * Duration of limit in milliseconds
      * @default 3600000
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The identifier to limit against (typically a user id)
      */
    var id: String
    
    /**
      * Max requests within duration
      * @default 2500
      */
    var max: js.UndefOr[Double] = js.undefined
  }
  object LimiterOption {
    
    inline def apply(db: RedisClient, id: String): LimiterOption = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimiterOption]
    }
    
    extension [Self <: LimiterOption](x: Self) {
      
      inline def setDb(value: RedisClient): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    }
  }
  
  trait RedisClient extends StObject {
    
    def multi(operations: js.Array[js.Array[Any]]): Exec
  }
  object RedisClient {
    
    inline def apply(multi: js.Array[js.Array[Any]] => Exec): RedisClient = {
      val __obj = js.Dynamic.literal(multi = js.Any.fromFunction1(multi))
      __obj.asInstanceOf[RedisClient]
    }
    
    extension [Self <: RedisClient](x: Self) {
      
      inline def setMulti(value: js.Array[js.Array[Any]] => Exec): Self = StObject.set(x, "multi", js.Any.fromFunction1(value))
    }
  }
}
