package typingsJapgolly.hapiCatbox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.hapiCatbox.hapiCatboxBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/catbox", "Client")
  @js.native
  open class Client[T] protected ()
    extends StObject
       with ClientApi[T] {
    def this(engine: EnginePrototypeOrObject) = this()
    def this(engine: EnginePrototypeOrObject, options: ClientOptions) = this()
    
    /**
      * drop(key) - remove an item from cache where:
      *  * key - a cache key object (see [ICacheKey]).
      */
    /* CompleteClass */
    override def drop(key: CacheKey): js.Promise[Unit] = js.native
    
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
  
  @JSImport("@hapi/catbox", "Policy")
  @js.native
  open class Policy[T, O /* <: PolicyOptionVariants[T] */] protected () extends StObject {
    def this(options: O, cache: Client[T], segment: String) = this()
    
    /**
      * remove the item from cache where:
      * @param id the unique item identifier (within the policy segment).
      */
    def drop(id: Id): js.Promise[Unit] = js.native
    
    /**
      *  retrieve an item from the cache. If the item is not
      * found and the generateFunc method was provided,
      * a new value is generated, stored in the cache, and returned.
      * Multiple concurrent requests are queued and processed once. The method arguments are:
      * @param id the unique item identifier (within the policy segment).
      * Can be a string or an object with the required 'id' key.
      */
    def get(id: Id): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: O extends @hapi/catbox.@hapi/catbox.DecoratedPolicyOptions<T> ? @hapi/catbox.@hapi/catbox.DecoratedResult<T> : T | null */ js.Any
      ] = js.native
    
    /**
      * returns true if cache engine determines itself as ready, false if it is not ready or if
      * here is no cache engine set.
      */
    def isReady(): Boolean = js.native
    
    /** changes the policy rules after construction (note that items already stored will not be affected) */
    def rules(options: PolicyOptions[T]): Unit = js.native
    
    /**
      * store an item in the cache where:
      * @param id - the unique item identifier (within the policy segment).
      * @param value - the string or object value to be stored.
      * @param ttl - a time-to-live override value in milliseconds after which the item is automatically
      * removed from the cache (or is marked invalid).
      *    This should be set to 0 in order to use the caching rules configured when creating the Policy object.
      */
    def set(id: Id, value: T): js.Promise[Unit] = js.native
    def set(id: Id, value: T, ttl: Double): js.Promise[Unit] = js.native
    
    /** an object with cache statistics */
    def stats(): CacheStatisticsObject = js.native
    
    /**
      * given a created timestamp in milliseconds, returns the time-to-live left
      * based on the configured rules.
      */
    def ttl(created: Double): Double = js.native
  }
  
  trait CacheKey extends StObject {
    
    /** id - a unique item identifier string (per segment). Can be an empty string. */
    var id: String
    
    /** segment - a caching segment name string. Enables using a single cache server for storing different sets of items with overlapping ids. */
    var segment: String
  }
  object CacheKey {
    
    inline def apply(id: String, segment: String): CacheKey = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheKey]
    }
    
    extension [Self <: CacheKey](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    }
  }
  
  trait CacheStatisticsObject extends StObject {
    
    /** errors - cache operations errors. TODO check this */
    var errors: Double
    
    /** generates - number of calls to the generate function. */
    var generates: Double
    
    /** gets - number of cache get() requests. */
    var gets: Double
    
    /** hits - number of cache get() requests in which the requested id was found in the cache (can be stale). */
    var hits: Double
    
    /** sets - number of cache writes. */
    var sets: Double
    
    /** stales - number of cache reads with stale requests (only counts the first request in a queued get() operation). */
    var stales: Double
  }
  object CacheStatisticsObject {
    
    inline def apply(errors: Double, generates: Double, gets: Double, hits: Double, sets: Double, stales: Double): CacheStatisticsObject = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], generates = generates.asInstanceOf[js.Any], gets = gets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any], stales = stales.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheStatisticsObject]
    }
    
    extension [Self <: CacheStatisticsObject](x: Self) {
      
      inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setGenerates(value: Double): Self = StObject.set(x, "generates", value.asInstanceOf[js.Any])
      
      inline def setGets(value: Double): Self = StObject.set(x, "gets", value.asInstanceOf[js.Any])
      
      inline def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
      
      inline def setSets(value: Double): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
      
      inline def setStales(value: Double): Self = StObject.set(x, "stales", value.asInstanceOf[js.Any])
    }
  }
  
  trait CachedObject[T] extends StObject {
    
    /** item - the value stored in the cache using set(). */
    var item: T
    
    /** stored - the timestamp when the item was stored in the cache (in milliseconds). */
    var stored: Double
    
    /** ttl - the remaining time-to-live (not the original value used when storing the object). */
    var ttl: Double
  }
  object CachedObject {
    
    inline def apply[T](item: T, stored: Double, ttl: Double): CachedObject[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedObject[T]]
    }
    
    extension [Self <: CachedObject[?], T](x: Self & CachedObject[T]) {
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setStored(value: Double): Self = StObject.set(x, "stored", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientApi[T] extends StObject {
    
    /**
      * drop(key) - remove an item from cache where:
      *  * key - a cache key object (see [ICacheKey]).
      */
    def drop(key: CacheKey): js.Promise[Unit]
    
    /**
      * get(key, callback) - retrieve an item from the cache engine if found where:
      *  * key - a cache key object (see [ICacheKey]).
      */
    def get(key: CacheKey): js.Promise[Null | CachedObject[T]]
    
    /** isReady() - returns true if cache engine determines itself as ready, false if it is not ready. */
    def isReady(): Boolean
    
    /**
      * set(key, value, ttl) - store an item in the cache for a specified length of time, where:
      *  * key - a cache key object (see [ICacheKey]).
      *  * value - the string or object value to be stored.
      *  * ttl - a time-to-live value in milliseconds after which the item is automatically removed from the cache (or is marked invalid).
      */
    def set(key: CacheKey, value: T, ttl: Double): js.Promise[Unit]
    
    /** start() - creates a connection to the cache server. Must be called before any other method is available. */
    def start(): js.Promise[Unit]
    
    /** stop() - terminates the connection to the cache server. */
    def stop(): Unit
    
    /** validateSegmentName(segment) - returns null if the segment name is valid (see below), otherwise should return an instance of Error with an appropriate message. */
    def validateSegmentName(segment: String): Null | js.Error
  }
  object ClientApi {
    
    inline def apply[T](
      drop: CacheKey => js.Promise[Unit],
      get: CacheKey => js.Promise[Null | CachedObject[T]],
      isReady: CallbackTo[Boolean],
      set: (CacheKey, T, Double) => js.Promise[Unit],
      start: CallbackTo[js.Promise[Unit]],
      stop: Callback,
      validateSegmentName: String => Null | js.Error
    ): ClientApi[T] = {
      val __obj = js.Dynamic.literal(drop = js.Any.fromFunction1(drop), get = js.Any.fromFunction1(get), isReady = isReady.toJsFn, set = js.Any.fromFunction3(set), start = start.toJsFn, stop = stop.toJsFn, validateSegmentName = js.Any.fromFunction1(validateSegmentName))
      __obj.asInstanceOf[ClientApi[T]]
    }
    
    extension [Self <: ClientApi[?], T](x: Self & ClientApi[T]) {
      
      inline def setDrop(value: CacheKey => js.Promise[Unit]): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      inline def setGet(value: CacheKey => js.Promise[Null | CachedObject[T]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setIsReady(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReady", value.toJsFn)
      
      inline def setSet(value: (CacheKey, T, Double) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      inline def setStart(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setValidateSegmentName(value: String => Null | js.Error): Self = StObject.set(x, "validateSegmentName", js.Any.fromFunction1(value))
    }
  }
  
  trait ClientOptions extends StObject {
    
    /**
      * this will store items under keys that start with this value.
      */
    var partition: js.UndefOr[String] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.hapiCatbox.mod.PolicyOptionVariants because Already inherited */ trait DecoratedPolicyOptions[T]
    extends StObject
       with PolicyOptions[T] {
    
    /**
      * @default false
      */
    var getDecoratedValue: js.UndefOr[Boolean] = js.undefined
  }
  object DecoratedPolicyOptions {
    
    inline def apply[T](): DecoratedPolicyOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoratedPolicyOptions[T]]
    }
    
    extension [Self <: DecoratedPolicyOptions[?], T](x: Self & DecoratedPolicyOptions[T]) {
      
      inline def setGetDecoratedValue(value: Boolean): Self = StObject.set(x, "getDecoratedValue", value.asInstanceOf[js.Any])
      
      inline def setGetDecoratedValueUndefined: Self = StObject.set(x, "getDecoratedValue", js.undefined)
    }
  }
  
  trait DecoratedResult[T] extends StObject {
    
    var cached: PolicyGetCachedOptions[T]
    
    var report: PolicyGetReportLog
    
    var value: T
  }
  object DecoratedResult {
    
    inline def apply[T](cached: PolicyGetCachedOptions[T], report: PolicyGetReportLog, value: T): DecoratedResult[T] = {
      val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecoratedResult[T]]
    }
    
    extension [Self <: DecoratedResult[?], T](x: Self & DecoratedResult[T]) {
      
      inline def setCached(value: PolicyGetCachedOptions[T]): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
      
      inline def setReport(value: PolicyGetReportLog): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnginePrototype[T]
    extends StObject
       with Instantiable1[/* settings */ ClientOptions, ClientApi[T]]
  
  type EnginePrototypeOrObject = EnginePrototype[Any] | ClientApi[Any]
  
  type GenerateFunc[T] = js.Function2[/* id */ Id, /* flags */ GenerateFuncFlags, js.Promise[T]]
  
  trait GenerateFuncFlags extends StObject {
    
    var ttl: Double
  }
  object GenerateFuncFlags {
    
    inline def apply(ttl: Double): GenerateFuncFlags = {
      val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateFuncFlags]
    }
    
    extension [Self <: GenerateFuncFlags](x: Self) {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  type Id = String | typingsJapgolly.hapiCatbox.anon.Id
  
  trait PolicyGetCachedOptions[T] extends StObject {
    
    /** isStale - true if the item is stale. */
    var isStale: Boolean
    
    /** item - the cached value. */
    var item: T
    
    /** stored - the timestamp when the item was stored in the cache. */
    var stored: Double
    
    /** ttl - the cache ttl value for the record. */
    var ttl: Double
  }
  object PolicyGetCachedOptions {
    
    inline def apply[T](isStale: Boolean, item: T, stored: Double, ttl: Double): PolicyGetCachedOptions[T] = {
      val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyGetCachedOptions[T]]
    }
    
    extension [Self <: PolicyGetCachedOptions[?], T](x: Self & PolicyGetCachedOptions[T]) {
      
      inline def setIsStale(value: Boolean): Self = StObject.set(x, "isStale", value.asInstanceOf[js.Any])
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setStored(value: Double): Self = StObject.set(x, "stored", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyGetReportLog extends StObject {
    
    /** error - lookup error. */
    var error: js.UndefOr[js.Error] = js.undefined
    
    /** isStale - true if the item is stale. */
    var isStale: Boolean
    
    /** msec - the cache lookup time in milliseconds. */
    var msec: Double
    
    /** stored - the timestamp when the item was stored in the cache. */
    var stored: Double
    
    /** ttl - the cache ttl value for the record. */
    var ttl: Double
  }
  object PolicyGetReportLog {
    
    inline def apply(isStale: Boolean, msec: Double, stored: Double, ttl: Double): PolicyGetReportLog = {
      val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], msec = msec.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyGetReportLog]
    }
    
    extension [Self <: PolicyGetReportLog](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIsStale(value: Boolean): Self = StObject.set(x, "isStale", value.asInstanceOf[js.Any])
      
      inline def setMsec(value: Double): Self = StObject.set(x, "msec", value.asInstanceOf[js.Any])
      
      inline def setStored(value: Double): Self = StObject.set(x, "stored", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hapiCatbox.mod.PolicyOptions[T]
    - typingsJapgolly.hapiCatbox.mod.DecoratedPolicyOptions[T]
  */
  trait PolicyOptionVariants[T] extends StObject
  object PolicyOptionVariants {
    
    inline def DecoratedPolicyOptions[T](): typingsJapgolly.hapiCatbox.mod.DecoratedPolicyOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.hapiCatbox.mod.DecoratedPolicyOptions[T]]
    }
    
    inline def PolicyOptions[T](): typingsJapgolly.hapiCatbox.mod.PolicyOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.hapiCatbox.mod.PolicyOptions[T]]
    }
  }
  
  trait PolicyOptions[T]
    extends StObject
       with PolicyOptionVariants[T] {
    
    /** dropOnError - if true, an error or timeout in the generateFunc causes the stale value to be evicted from the cache. Defaults to true. */
    var dropOnError: js.UndefOr[Boolean] = js.undefined
    
    /** expiresAt - time of day expressed in 24h notation using the 'HH:MM' format, at which point all cache records for the route expire. Uses local time. Cannot be used together with expiresIn. */
    var expiresAt: js.UndefOr[String] = js.undefined
    
    /** expiresIn - relative expiration expressed in the number of milliseconds since the item was saved in the cache. Cannot be used together with expiresAt. */
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    /** generateFunc - a function used to generate a new cache item if one is not found in the cache when calling get(). The method's signature is function(id, next) where: */
    var generateFunc: js.UndefOr[GenerateFunc[T]] = js.undefined
    
    /** generateIgnoreWriteError - if false, an upstream cache write error will be passed back with the generated value when calling the get() method. Defaults to true. */
    var generateIgnoreWriteError: js.UndefOr[Boolean] = js.undefined
    
    /** generateOnReadError - if false, an upstream cache read error will stop the get() method from calling the generate function and will instead pass back the cache error. Defaults to true. */
    var generateOnReadError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * generateTimeout - number of milliseconds to wait before returning a timeout error when the generateFunc function takes too long to return a value.
      * When the value is eventually returned, it is stored in the cache for future requests. Required if generateFunc is present.
      * Set to false to disable timeouts which may cause all get() requests to get stuck forever.
      */
    var generateTimeout: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * pendingGenerateTimeout - number of milliseconds while generateFunc call is in progress for a given id, before a subsequent generateFunc call is allowed.
      * @default 0, no blocking of concurrent generateFunc calls beyond staleTimeout.
      */
    var pendingGenerateTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * staleIn - number of milliseconds to mark an item stored in cache as stale and attempt to regenerate it when generateFunc is provided.
      * Must be less than expiresIn. Alternatively function that returns staleIn value in milliseconds. The function signature is function(stored, ttl) where:
      *  * stored - the timestamp when the item was stored in the cache (in milliseconds).
      *  * ttl - the remaining time-to-live (not the original value used when storing the object).
      */
    var staleIn: js.UndefOr[Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double])] = js.undefined
    
    /** staleTimeout - number of milliseconds to wait before returning a stale value while generateFunc is generating a fresh value. */
    var staleTimeout: js.UndefOr[Double] = js.undefined
  }
  object PolicyOptions {
    
    inline def apply[T](): PolicyOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyOptions[T]]
    }
    
    extension [Self <: PolicyOptions[?], T](x: Self & PolicyOptions[T]) {
      
      inline def setDropOnError(value: Boolean): Self = StObject.set(x, "dropOnError", value.asInstanceOf[js.Any])
      
      inline def setDropOnErrorUndefined: Self = StObject.set(x, "dropOnError", js.undefined)
      
      inline def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setGenerateFunc(value: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[T]): Self = StObject.set(x, "generateFunc", js.Any.fromFunction2(value))
      
      inline def setGenerateFuncUndefined: Self = StObject.set(x, "generateFunc", js.undefined)
      
      inline def setGenerateIgnoreWriteError(value: Boolean): Self = StObject.set(x, "generateIgnoreWriteError", value.asInstanceOf[js.Any])
      
      inline def setGenerateIgnoreWriteErrorUndefined: Self = StObject.set(x, "generateIgnoreWriteError", js.undefined)
      
      inline def setGenerateOnReadError(value: Boolean): Self = StObject.set(x, "generateOnReadError", value.asInstanceOf[js.Any])
      
      inline def setGenerateOnReadErrorUndefined: Self = StObject.set(x, "generateOnReadError", js.undefined)
      
      inline def setGenerateTimeout(value: Double | `false`): Self = StObject.set(x, "generateTimeout", value.asInstanceOf[js.Any])
      
      inline def setGenerateTimeoutUndefined: Self = StObject.set(x, "generateTimeout", js.undefined)
      
      inline def setPendingGenerateTimeout(value: Double): Self = StObject.set(x, "pendingGenerateTimeout", value.asInstanceOf[js.Any])
      
      inline def setPendingGenerateTimeoutUndefined: Self = StObject.set(x, "pendingGenerateTimeout", js.undefined)
      
      inline def setStaleIn(value: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double])): Self = StObject.set(x, "staleIn", value.asInstanceOf[js.Any])
      
      inline def setStaleInFunction2(value: (/* stored */ Double, /* ttl */ Double) => Double): Self = StObject.set(x, "staleIn", js.Any.fromFunction2(value))
      
      inline def setStaleInUndefined: Self = StObject.set(x, "staleIn", js.undefined)
      
      inline def setStaleTimeout(value: Double): Self = StObject.set(x, "staleTimeout", value.asInstanceOf[js.Any])
      
      inline def setStaleTimeoutUndefined: Self = StObject.set(x, "staleTimeout", js.undefined)
    }
  }
}
