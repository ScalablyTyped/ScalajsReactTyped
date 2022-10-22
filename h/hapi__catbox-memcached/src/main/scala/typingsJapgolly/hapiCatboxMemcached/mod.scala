package typingsJapgolly.hapiCatboxMemcached

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapiCatbox.mod.CacheKey
import typingsJapgolly.hapiCatbox.mod.CachedObject
import typingsJapgolly.hapiCatbox.mod.ClientApi
import typingsJapgolly.hapiCatbox.mod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/catbox-memcached", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with CatboxMemcached[T] {
    def this(options: Options) = this()
    
    /**
      * drop(key) - remove an item from cache where:
      *  * key - a cache key object (see [ICacheKey]).
      */
    /* CompleteClass */
    override def drop(key: CacheKey): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def generateKey(key: CacheKey): String = js.native
    
    /**
      * get(key, callback) - retrieve an item from the cache engine if found where:
      *  * key - a cache key object (see [ICacheKey]).
      */
    /* CompleteClass */
    override def get(key: CacheKey): js.Promise[Null | CachedObject[T]] = js.native
    
    /** isReady() - returns true if cache engine determines itself as ready, false if it is not ready. */
    /* CompleteClass */
    override def isReady(): Boolean = js.native
    
    /**
      * set(key, value, ttl) - store an item in the cache for a specified length of time, where:
      *  * key - a cache key object (see [ICacheKey]).
      *  * value - the string or object value to be stored.
      *  * ttl - a time-to-live value in milliseconds after which the item is automatically removed from the cache (or is marked invalid).
      */
    /* CompleteClass */
    override def set(key: CacheKey, value: T, ttl: Double): js.Promise[Unit] = js.native
    
    /** start() - creates a connection to the cache server. Must be called before any other method is available. */
    /* CompleteClass */
    override def start(): js.Promise[Unit] = js.native
    
    /** stop() - terminates the connection to the cache server. */
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /** validateSegmentName(segment) - returns null if the segment name is valid (see below), otherwise should return an instance of Error with an appropriate message. */
    /* CompleteClass */
    override def validateSegmentName(segment: String): Null | js.Error = js.native
  }
  
  trait CatboxMemcached[T]
    extends StObject
       with ClientApi[T] {
    
    def generateKey(key: CacheKey): String
  }
  object CatboxMemcached {
    
    inline def apply[T](
      drop: CacheKey => js.Promise[Unit],
      generateKey: CacheKey => String,
      get: CacheKey => js.Promise[Null | CachedObject[T]],
      isReady: CallbackTo[Boolean],
      set: (CacheKey, T, Double) => js.Promise[Unit],
      start: CallbackTo[js.Promise[Unit]],
      stop: Callback,
      validateSegmentName: String => Null | js.Error
    ): CatboxMemcached[T] = {
      val __obj = js.Dynamic.literal(drop = js.Any.fromFunction1(drop), generateKey = js.Any.fromFunction1(generateKey), get = js.Any.fromFunction1(get), isReady = isReady.toJsFn, set = js.Any.fromFunction3(set), start = start.toJsFn, stop = stop.toJsFn, validateSegmentName = js.Any.fromFunction1(validateSegmentName))
      __obj.asInstanceOf[CatboxMemcached[T]]
    }
    
    extension [Self <: CatboxMemcached[?], T](x: Self & CatboxMemcached[T]) {
      
      inline def setGenerateKey(value: CacheKey => String): Self = StObject.set(x, "generateKey", js.Any.fromFunction1(value))
    }
  }
  
  trait Options
    extends StObject
       with ClientOptions {
    
    var host: js.UndefOr[String] = js.undefined
    
    var idle: js.UndefOr[Double] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
