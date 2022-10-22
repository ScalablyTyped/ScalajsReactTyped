package typingsJapgolly.moize

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.moize.anon.FnCall
import typingsJapgolly.moize.anon.IsDeepEqual
import typingsJapgolly.moize.anon.IsPromise
import typingsJapgolly.moize.anon.IsReact
import typingsJapgolly.moize.anon.IsSerialized
import typingsJapgolly.moize.anon.IsSerializedSerializer
import typingsJapgolly.moize.anon.IsShallowEqual
import typingsJapgolly.moize.anon.MatchesArg
import typingsJapgolly.moize.anon.MatchesKey
import typingsJapgolly.moize.anon.MaxAgeMaxAge
import typingsJapgolly.moize.anon.MaxAgeOnExpire
import typingsJapgolly.moize.anon.MaxAgeOnExpireUpdateExpire
import typingsJapgolly.moize.anon.MaxAgeUpdateExpire
import typingsJapgolly.moize.anon.MaxArgsMaxArgs
import typingsJapgolly.moize.anon.MaxSizeMaxSize
import typingsJapgolly.moize.anon.OnExpireExpireHandler
import typingsJapgolly.moize.anon.OnExpireUpdateExpire
import typingsJapgolly.moize.anon.ProfileNameProfileName
import typingsJapgolly.moize.anon.TransformArgs
import typingsJapgolly.moize.anon.UpdateExpireUpdateExpire
import typingsJapgolly.moize.moizeBooleans.`true`
import typingsJapgolly.moize.moizeStrings.isPromise
import typingsJapgolly.moize.moizeStrings.maxSize
import typingsJapgolly.moize.moizeStrings.onCacheAdd
import typingsJapgolly.moize.moizeStrings.onCacheChange
import typingsJapgolly.moize.moizeStrings.onCacheHit
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("moize", JSImport.Default)
  @js.native
  val default: Moize[Options] = js.native
  
  type Cache = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MicroMemoize.Cache */ Any
  
  @js.native
  trait CurriedMoize[OriginalOptions] extends StObject {
    
    def apply[CurriedFn /* <: Moizeable */, CurriedOptions /* <: Options */](curriedFn: CurriedFn | CurriedOptions): (Moized[CurriedFn, OriginalOptions & CurriedOptions]) | (CurriedMoize[OriginalOptions & CurriedOptions]) = js.native
    def apply[CurriedFn /* <: Moizeable */, CurriedOptions /* <: Options */](curriedFn: CurriedFn | CurriedOptions, curriedOptions: CurriedOptions): (Moized[CurriedFn, OriginalOptions & CurriedOptions]) | (CurriedMoize[OriginalOptions & CurriedOptions]) = js.native
  }
  
  trait Expiration extends StObject {
    
    def expirationMethod(): Unit
    
    var key: Key[Any]
    
    var timeoutId: ReturnType[FnCall]
  }
  object Expiration {
    
    inline def apply(expirationMethod: Callback, key: Key[Any], timeoutId: ReturnType[FnCall]): Expiration = {
      val __obj = js.Dynamic.literal(expirationMethod = expirationMethod.toJsFn, key = key.asInstanceOf[js.Any], timeoutId = timeoutId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expiration]
    }
    
    extension [Self <: Expiration](x: Self) {
      
      inline def setExpirationMethod(value: Callback): Self = StObject.set(x, "expirationMethod", value.toJsFn)
      
      inline def setKey(value: Key[Any]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyVarargs(value: Any*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setTimeoutId(value: ReturnType[FnCall]): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fn[Arg /* <: Any */, Result /* <: Any */] extends StObject {
    
    def apply(args: Arg*): Result = js.native
  }
  
  @js.native
  trait FunctionalComponent[Props /* <: js.Object */]
    extends StObject
       with Fn[Props, Any] {
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  trait GlobalStatsObject
    extends StObject
       with StatsObject {
    
    var profiles: js.UndefOr[Record[String, StatsProfile]] = js.undefined
  }
  object GlobalStatsObject {
    
    inline def apply(calls: Double, hits: Double, usage: String): GlobalStatsObject = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalStatsObject]
    }
    
    extension [Self <: GlobalStatsObject](x: Self) {
      
      inline def setProfiles(value: Record[String, StatsProfile]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
      
      inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    }
  }
  
  type IsEqual = js.Function2[/* cacheKeyArg */ Any, /* keyArg */ Any, Boolean]
  
  type IsMatchingKey = js.Function2[/* cacheKey */ Key[Any], /* key */ Key[Any], Boolean]
  
  type Key[Arg /* <: Any */] = js.Array[Arg]
  
  @js.native
  trait MaxAge extends StObject {
    
    def apply[MaxAge /* <: Double */](maxAge: MaxAge): Moizer[MaxAgeMaxAge[MaxAge]] = js.native
    def apply[MaxAge /* <: Double */, UpdateExpire /* <: Boolean */](maxAge: MaxAge, expireOptions: UpdateExpire): Moizer[MaxAgeUpdateExpire[MaxAge, UpdateExpire]] = js.native
  }
  
  type Memoized[OriginalFn /* <: Moizeable */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MicroMemoize.Memoized<OriginalFn> */ Any
  
  type MicroMemoizeOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MicroMemoize.Options */ Any
  
  @js.native
  trait Moize[DefaultOptions /* <: Options */]
    extends StObject
       with Moizer[DefaultOptions] {
    
    def clearStats(): Unit = js.native
    def clearStats(profileName: String): Unit = js.native
    
    def collectStats(): Unit = js.native
    def collectStats(isCollectingStats: Boolean): Unit = js.native
    
    def compose(moizers: (Moize[Options] | Moizer[Options])*): Moizer[Options] = js.native
    
    def deep[Fn /* <: Moizeable */](fn: Fn): Moized[Fn, Options & IsDeepEqual] = js.native
    def deep[Fn /* <: Moizeable */, PassedOptions /* <: Options */](fn: Fn, options: PassedOptions): Moized[Fn, Options & IsDeepEqual & PassedOptions] = js.native
    @JSName("deep")
    var deep_Original: Moizer[IsDeepEqual] = js.native
    @JSName("deep")
    def deep_PassedOptions_Moizer[PassedOptions /* <: Options */](options: PassedOptions): Moizer[PassedOptions] = js.native
    
    def getStats(): StatsObject = js.native
    def getStats(profileName: String): StatsObject = js.native
    
    def infinite[Fn /* <: Moizeable */](fn: Fn): Moized[Fn, Options] = js.native
    def infinite[Fn /* <: Moizeable */, PassedOptions /* <: Options */](fn: Fn, options: PassedOptions): Moized[Fn, Options & PassedOptions] = js.native
    @JSName("infinite")
    var infinite_Original: Moizer[Options] = js.native
    @JSName("infinite")
    def infinite_PassedOptions_Moizer[PassedOptions /* <: Options */](options: PassedOptions): Moizer[PassedOptions] = js.native
    
    def isCollectingStats(): Boolean = js.native
    
    def isMoized(value: Any): /* is moize.moize.Moized<moize.moize.Moizeable, moize.moize.Options> */ Boolean = js.native
    
    def matchesArg[Matcher /* <: IsEqual */](argMatcher: Matcher): Moizer[MatchesArg[Matcher]] = js.native
    
    def matchesKey[Matcher /* <: IsMatchingKey */](keyMatcher: Matcher): Moizer[MatchesKey[Matcher]] = js.native
    
    def maxAge[MaxAge /* <: Double */](maxAge: MaxAge): Moizer[MaxAgeMaxAge[MaxAge]] = js.native
    def maxAge[MaxAge /* <: Double */, UpdateExpire /* <: Boolean */](maxAge: MaxAge, expireOptions: UpdateExpire): Moizer[MaxAgeUpdateExpire[MaxAge, UpdateExpire]] = js.native
    @JSName("maxAge")
    def maxAge_MaxAgeExpireHandler[MaxAge /* <: Double */, ExpireHandler /* <: OnExpire */](maxAge: MaxAge, expireOptions: ExpireHandler): Moizer[typingsJapgolly.moize.anon.OnExpire[MaxAge, ExpireHandler]] = js.native
    @JSName("maxAge")
    def maxAge_MaxAgeExpireHandlerExpireOptions[MaxAge /* <: Double */, ExpireHandler /* <: OnExpire */, ExpireOptions /* <: OnExpireExpireHandler[ExpireHandler] */](maxAge: MaxAge, expireOptions: ExpireOptions): Moizer[MaxAgeOnExpire[MaxAge, ExpireOptions, ExpireHandler]] = js.native
    @JSName("maxAge")
    def maxAge_MaxAgeExpireHandlerUpdateExpireExpireOptions[MaxAge /* <: Double */, ExpireHandler /* <: OnExpire */, UpdateExpire /* <: Boolean */, ExpireOptions /* <: OnExpireUpdateExpire[ExpireHandler, UpdateExpire] */](maxAge: MaxAge, expireOptions: ExpireOptions): Moizer[MaxAgeOnExpireUpdateExpire[MaxAge, ExpireHandler, UpdateExpire]] = js.native
    @JSName("maxAge")
    def maxAge_MaxAgeUpdateExpireExpireOptions[MaxAge /* <: Double */, UpdateExpire /* <: Boolean */, ExpireOptions /* <: UpdateExpireUpdateExpire[UpdateExpire] */](maxAge: MaxAge, expireOptions: ExpireOptions): Moizer[MaxAgeUpdateExpire[MaxAge, UpdateExpire]] = js.native
    @JSName("maxAge")
    var maxAge_Original: MaxAge = js.native
    
    def maxArgs[MaxArgs /* <: Double */](args: MaxArgs): Moizer[MaxArgsMaxArgs[MaxArgs]] = js.native
    
    def maxSize[MaxSize /* <: Double */](size: MaxSize): Moizer[MaxSizeMaxSize[MaxSize]] = js.native
    
    def profile[ProfileName /* <: String */](profileName: ProfileName): Moizer[ProfileNameProfileName[ProfileName]] = js.native
    
    def promise[Fn /* <: Moizeable */](fn: Fn): Moized[Fn, Options & IsPromise] = js.native
    def promise[Fn /* <: Moizeable */, PassedOptions /* <: Options */](fn: Fn, options: PassedOptions): Moized[Fn, Options & IsPromise & PassedOptions] = js.native
    @JSName("promise")
    var promise_Original: Moizer[IsPromise] = js.native
    @JSName("promise")
    def promise_PassedOptions_Moizer[PassedOptions /* <: Options */](options: PassedOptions): Moizer[PassedOptions] = js.native
    
    def react[Fn /* <: Moizeable */](fn: Fn): Moized[Fn, Options & IsReact] = js.native
    def react[Fn /* <: Moizeable */, PassedOptions /* <: Options */](fn: Fn, options: PassedOptions): Moized[Fn, Options & IsReact & PassedOptions] = js.native
    @JSName("react")
    var react_Original: Moizer[IsReact] = js.native
    @JSName("react")
    def react_PassedOptions_Moizer[PassedOptions /* <: Options */](options: PassedOptions): Moizer[PassedOptions] = js.native
    
    def serialize[Fn /* <: Moizeable */](fn: Fn): Moized[Fn, Options & IsSerialized] = js.native
    def serialize[Fn /* <: Moizeable */, PassedOptions /* <: Options */](fn: Fn, options: PassedOptions): Moized[Fn, Options & IsSerialized & PassedOptions] = js.native
    
    def serializeWith[Serializer /* <: Serialize */](serializer: Serializer): Moizer[IsSerializedSerializer[Serializer]] = js.native
    
    @JSName("serialize")
    var serialize_Original: Moizer[IsSerialized] = js.native
    @JSName("serialize")
    def serialize_PassedOptions_Moizer[PassedOptions /* <: Options */](options: PassedOptions): Moizer[PassedOptions] = js.native
    
    def shallow[Fn /* <: Moizeable */](fn: Fn): Moized[Fn, Options & IsShallowEqual] = js.native
    def shallow[Fn /* <: Moizeable */, PassedOptions /* <: Options */](fn: Fn, options: PassedOptions): Moized[Fn, Options & IsShallowEqual & PassedOptions] = js.native
    @JSName("shallow")
    var shallow_Original: Moizer[IsShallowEqual] = js.native
    @JSName("shallow")
    def shallow_PassedOptions_Moizer[PassedOptions /* <: Options */](options: PassedOptions): Moizer[PassedOptions] = js.native
    
    def transformArgs[Transformer /* <: TransformKey */](transformer: Transformer): Moizer[TransformArgs[Transformer]] = js.native
    
    def updateCacheForKey[UpdateWhen /* <: UpdateCacheForKey */](updateCacheForKey: UpdateWhen): Moizer[typingsJapgolly.moize.anon.UpdateCacheForKey[UpdateWhen]] = js.native
  }
  
  trait MoizeConfiguration[OriginalFn /* <: Moizeable */] extends StObject {
    
    var expirations: js.Array[Expiration]
    
    var options: Options
    
    var originalFunction: OriginalFn
  }
  object MoizeConfiguration {
    
    inline def apply[OriginalFn /* <: Moizeable */](expirations: js.Array[Expiration], options: Options, originalFunction: OriginalFn): MoizeConfiguration[OriginalFn] = {
      val __obj = js.Dynamic.literal(expirations = expirations.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalFunction = originalFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoizeConfiguration[OriginalFn]]
    }
    
    extension [Self <: MoizeConfiguration[?], OriginalFn /* <: Moizeable */](x: Self & MoizeConfiguration[OriginalFn]) {
      
      inline def setExpirations(value: js.Array[Expiration]): Self = StObject.set(x, "expirations", value.asInstanceOf[js.Any])
      
      inline def setExpirationsVarargs(value: Expiration*): Self = StObject.set(x, "expirations", js.Array(value*))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOriginalFunction(value: OriginalFn): Self = StObject.set(x, "originalFunction", value.asInstanceOf[js.Any])
    }
  }
  
  type Moizeable = (Fn[Any, Any]) & (Record[String, Any])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MicroMemoize.Memoized<OriginalFn> * / any */ trait Moized[OriginalFn /* <: Moizeable */, CombinedOptions /* <: Options */] extends StObject {
    
    // values
    var _microMemoizeOptions: (Pick[CombinedOptions, isPromise | maxSize | onCacheAdd | onCacheChange | onCacheHit]) & typingsJapgolly.moize.anon.IsEqual[CombinedOptions]
    
    var cache: Cache
    
    var cacheSnapshot: Cache
    
    // methods
    def clear(): Unit
    
    def clearStats(): Unit
    
    // react-specific values
    var contextTypes: js.UndefOr[Record[String, js.Function]] = js.undefined
    
    var defaultProps: js.UndefOr[Record[String, Any]] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var expirations: js.Array[Expiration]
    
    var expirationsSnapshot: js.Array[Expiration]
    
    def get(key: Key[Any]): Any
    
    def getStats(): StatsProfile
    
    def has(key: Key[Any]): Boolean
    
    def isCollectingStats(): Boolean
    
    def isMoized(): `true`
    
    def keys(): /* import warning: importer.ImportType#apply Failed type conversion: moize.moize.Cache['keys'] */ js.Any
    
    var options: CombinedOptions
    
    var originalFunction: OriginalFn
    
    var propTypes: Record[String, js.Function]
    
    def remove(key: Key[Any]): Unit
    
    def set(key: Key[Any], value: Any): Unit
    
    def values(): /* import warning: importer.ImportType#apply Failed type conversion: moize.moize.Cache['values'] */ js.Any
  }
  object Moized {
    
    inline def apply[OriginalFn /* <: Moizeable */, CombinedOptions /* <: Options */](
      _microMemoizeOptions: (Pick[CombinedOptions, isPromise | maxSize | onCacheAdd | onCacheChange | onCacheHit]) & typingsJapgolly.moize.anon.IsEqual[CombinedOptions],
      cache: Cache,
      cacheSnapshot: Cache,
      clear: Callback,
      clearStats: Callback,
      expirations: js.Array[Expiration],
      expirationsSnapshot: js.Array[Expiration],
      get: Key[Any] => Any,
      getStats: CallbackTo[StatsProfile],
      has: Key[Any] => Boolean,
      isCollectingStats: CallbackTo[Boolean],
      isMoized: CallbackTo[`true`],
      keys: CallbackTo[
          /* import warning: importer.ImportType#apply Failed type conversion: moize.moize.Cache['keys'] */ js.Any
        ],
      options: CombinedOptions,
      originalFunction: OriginalFn,
      propTypes: Record[String, js.Function],
      remove: Key[Any] => Callback,
      set: (Key[Any], Any) => Callback,
      values: CallbackTo[
          /* import warning: importer.ImportType#apply Failed type conversion: moize.moize.Cache['values'] */ js.Any
        ]
    ): Moized[OriginalFn, CombinedOptions] = {
      val __obj = js.Dynamic.literal(_microMemoizeOptions = _microMemoizeOptions.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheSnapshot = cacheSnapshot.asInstanceOf[js.Any], clear = clear.toJsFn, clearStats = clearStats.toJsFn, expirations = expirations.asInstanceOf[js.Any], expirationsSnapshot = expirationsSnapshot.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getStats = getStats.toJsFn, has = js.Any.fromFunction1(has), isCollectingStats = isCollectingStats.toJsFn, isMoized = isMoized.toJsFn, keys = keys.toJsFn, options = options.asInstanceOf[js.Any], originalFunction = originalFunction.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: Key[Any]) => remove(t0).runNow()), set = js.Any.fromFunction2((t0: Key[Any], t1: Any) => (set(t0, t1)).runNow()), values = values.toJsFn)
      __obj.asInstanceOf[Moized[OriginalFn, CombinedOptions]]
    }
    
    extension [Self <: Moized[?, ?], OriginalFn /* <: Moizeable */, CombinedOptions /* <: Options */](x: Self & (Moized[OriginalFn, CombinedOptions])) {
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheSnapshot(value: Cache): Self = StObject.set(x, "cacheSnapshot", value.asInstanceOf[js.Any])
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setClearStats(value: Callback): Self = StObject.set(x, "clearStats", value.toJsFn)
      
      inline def setContextTypes(value: Record[String, js.Function]): Self = StObject.set(x, "contextTypes", value.asInstanceOf[js.Any])
      
      inline def setContextTypesUndefined: Self = StObject.set(x, "contextTypes", js.undefined)
      
      inline def setDefaultProps(value: Record[String, Any]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setExpirations(value: js.Array[Expiration]): Self = StObject.set(x, "expirations", value.asInstanceOf[js.Any])
      
      inline def setExpirationsSnapshot(value: js.Array[Expiration]): Self = StObject.set(x, "expirationsSnapshot", value.asInstanceOf[js.Any])
      
      inline def setExpirationsSnapshotVarargs(value: Expiration*): Self = StObject.set(x, "expirationsSnapshot", js.Array(value*))
      
      inline def setExpirationsVarargs(value: Expiration*): Self = StObject.set(x, "expirations", js.Array(value*))
      
      inline def setGet(value: Key[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetStats(value: CallbackTo[StatsProfile]): Self = StObject.set(x, "getStats", value.toJsFn)
      
      inline def setHas(value: Key[Any] => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setIsCollectingStats(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCollectingStats", value.toJsFn)
      
      inline def setIsMoized(value: CallbackTo[`true`]): Self = StObject.set(x, "isMoized", value.toJsFn)
      
      inline def setKeys(
        value: CallbackTo[
              /* import warning: importer.ImportType#apply Failed type conversion: moize.moize.Cache['keys'] */ js.Any
            ]
      ): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setOptions(value: CombinedOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOriginalFunction(value: OriginalFn): Self = StObject.set(x, "originalFunction", value.asInstanceOf[js.Any])
      
      inline def setPropTypes(value: Record[String, js.Function]): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Key[Any] => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Key[Any]) => value(t0).runNow()))
      
      inline def setSet(value: (Key[Any], Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: Key[Any], t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setValues(
        value: CallbackTo[
              /* import warning: importer.ImportType#apply Failed type conversion: moize.moize.Cache['values'] */ js.Any
            ]
      ): Self = StObject.set(x, "values", value.toJsFn)
      
      inline def set_microMemoizeOptions(
        value: (Pick[CombinedOptions, isPromise | maxSize | onCacheAdd | onCacheChange | onCacheHit]) & typingsJapgolly.moize.anon.IsEqual[CombinedOptions]
      ): Self = StObject.set(x, "_microMemoizeOptions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Moizer[DefaultOptions /* <: Options */] extends StObject {
    
    def apply[Fn /* <: Moizeable */](fn: Fn): Moized[Fn, Options & DefaultOptions] = js.native
    def apply[Fn /* <: Moizeable */, PassedOptions /* <: Options */](fn: Fn, options: PassedOptions): Moized[Fn, Options & DefaultOptions & PassedOptions] = js.native
  }
  
  type OnCacheOperation = js.Function3[
    /* cache */ Cache, 
    /* options */ Options, 
    /* moized */ js.Function1[/* repeated */ Any, Any], 
    Unit
  ]
  
  type OnExpire = js.Function1[/* key */ Key[Any], Any]
  
  /* Inlined std.Partial<{  isDeepEqual :boolean,   isPromise :boolean,   isReact :boolean,   isSerialized :boolean,   isShallowEqual :boolean,   matchesArg :moize.moize.IsEqual,   matchesKey :moize.moize.IsMatchingKey,   maxAge :number,   maxArgs :number,   maxSize :number,   onCacheAdd :moize.moize.OnCacheOperation,   onCacheChange :moize.moize.OnCacheOperation,   onCacheHit :moize.moize.OnCacheOperation,   onExpire :moize.moize.OnExpire,   profileName :string,   serializer :moize.moize.Serialize,   transformArgs :moize.moize.TransformKey,   updateCacheForKey :moize.moize.UpdateCacheForKey,   updateExpire :boolean}> */
  trait Options extends StObject {
    
    var isDeepEqual: js.UndefOr[Boolean] = js.undefined
    
    var isPromise: js.UndefOr[Boolean] = js.undefined
    
    var isReact: js.UndefOr[Boolean] = js.undefined
    
    var isSerialized: js.UndefOr[Boolean] = js.undefined
    
    var isShallowEqual: js.UndefOr[Boolean] = js.undefined
    
    var matchesArg: js.UndefOr[IsEqual] = js.undefined
    
    var matchesKey: js.UndefOr[IsMatchingKey] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var maxArgs: js.UndefOr[Double] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var onCacheAdd: js.UndefOr[OnCacheOperation] = js.undefined
    
    var onCacheChange: js.UndefOr[OnCacheOperation] = js.undefined
    
    var onCacheHit: js.UndefOr[OnCacheOperation] = js.undefined
    
    var onExpire: js.UndefOr[OnExpire] = js.undefined
    
    var profileName: js.UndefOr[String] = js.undefined
    
    var serializer: js.UndefOr[Serialize] = js.undefined
    
    var transformArgs: js.UndefOr[TransformKey] = js.undefined
    
    var updateCacheForKey: js.UndefOr[UpdateCacheForKey] = js.undefined
    
    var updateExpire: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIsDeepEqual(value: Boolean): Self = StObject.set(x, "isDeepEqual", value.asInstanceOf[js.Any])
      
      inline def setIsDeepEqualUndefined: Self = StObject.set(x, "isDeepEqual", js.undefined)
      
      inline def setIsPromise(value: Boolean): Self = StObject.set(x, "isPromise", value.asInstanceOf[js.Any])
      
      inline def setIsPromiseUndefined: Self = StObject.set(x, "isPromise", js.undefined)
      
      inline def setIsReact(value: Boolean): Self = StObject.set(x, "isReact", value.asInstanceOf[js.Any])
      
      inline def setIsReactUndefined: Self = StObject.set(x, "isReact", js.undefined)
      
      inline def setIsSerialized(value: Boolean): Self = StObject.set(x, "isSerialized", value.asInstanceOf[js.Any])
      
      inline def setIsSerializedUndefined: Self = StObject.set(x, "isSerialized", js.undefined)
      
      inline def setIsShallowEqual(value: Boolean): Self = StObject.set(x, "isShallowEqual", value.asInstanceOf[js.Any])
      
      inline def setIsShallowEqualUndefined: Self = StObject.set(x, "isShallowEqual", js.undefined)
      
      inline def setMatchesArg(value: (/* cacheKeyArg */ Any, /* keyArg */ Any) => Boolean): Self = StObject.set(x, "matchesArg", js.Any.fromFunction2(value))
      
      inline def setMatchesArgUndefined: Self = StObject.set(x, "matchesArg", js.undefined)
      
      inline def setMatchesKey(value: (/* cacheKey */ Key[Any], /* key */ Key[Any]) => Boolean): Self = StObject.set(x, "matchesKey", js.Any.fromFunction2(value))
      
      inline def setMatchesKeyUndefined: Self = StObject.set(x, "matchesKey", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setMaxArgs(value: Double): Self = StObject.set(x, "maxArgs", value.asInstanceOf[js.Any])
      
      inline def setMaxArgsUndefined: Self = StObject.set(x, "maxArgs", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setOnCacheAdd(
        value: (/* cache */ Cache, /* options */ Options, /* moized */ js.Function1[/* repeated */ Any, Any]) => Callback
      ): Self = StObject.set(x, "onCacheAdd", js.Any.fromFunction3((t0: /* cache */ Cache, t1: /* options */ Options, t2: /* moized */ js.Function1[/* repeated */ Any, Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCacheAddUndefined: Self = StObject.set(x, "onCacheAdd", js.undefined)
      
      inline def setOnCacheChange(
        value: (/* cache */ Cache, /* options */ Options, /* moized */ js.Function1[/* repeated */ Any, Any]) => Callback
      ): Self = StObject.set(x, "onCacheChange", js.Any.fromFunction3((t0: /* cache */ Cache, t1: /* options */ Options, t2: /* moized */ js.Function1[/* repeated */ Any, Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCacheChangeUndefined: Self = StObject.set(x, "onCacheChange", js.undefined)
      
      inline def setOnCacheHit(
        value: (/* cache */ Cache, /* options */ Options, /* moized */ js.Function1[/* repeated */ Any, Any]) => Callback
      ): Self = StObject.set(x, "onCacheHit", js.Any.fromFunction3((t0: /* cache */ Cache, t1: /* options */ Options, t2: /* moized */ js.Function1[/* repeated */ Any, Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCacheHitUndefined: Self = StObject.set(x, "onCacheHit", js.undefined)
      
      inline def setOnExpire(value: /* key */ Key[Any] => Any): Self = StObject.set(x, "onExpire", js.Any.fromFunction1(value))
      
      inline def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      inline def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
      
      inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
      
      inline def setSerializer(value: /* key */ Key[Any] => js.Array[String]): Self = StObject.set(x, "serializer", js.Any.fromFunction1(value))
      
      inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
      
      inline def setTransformArgs(value: /* key */ Key[Any] => Key[Any]): Self = StObject.set(x, "transformArgs", js.Any.fromFunction1(value))
      
      inline def setTransformArgsUndefined: Self = StObject.set(x, "transformArgs", js.undefined)
      
      inline def setUpdateCacheForKey(value: /* key */ Key[Any] => Boolean): Self = StObject.set(x, "updateCacheForKey", js.Any.fromFunction1(value))
      
      inline def setUpdateCacheForKeyUndefined: Self = StObject.set(x, "updateCacheForKey", js.undefined)
      
      inline def setUpdateExpire(value: Boolean): Self = StObject.set(x, "updateExpire", value.asInstanceOf[js.Any])
      
      inline def setUpdateExpireUndefined: Self = StObject.set(x, "updateExpire", js.undefined)
    }
  }
  
  type Serialize = js.Function1[/* key */ Key[Any], js.Array[String]]
  
  trait StatsCache extends StObject {
    
    var anonymousProfileNameCounter: Double
    
    var isCollectingStats: Boolean
    
    var profiles: Record[String, StatsProfile]
  }
  object StatsCache {
    
    inline def apply(
      anonymousProfileNameCounter: Double,
      isCollectingStats: Boolean,
      profiles: Record[String, StatsProfile]
    ): StatsCache = {
      val __obj = js.Dynamic.literal(anonymousProfileNameCounter = anonymousProfileNameCounter.asInstanceOf[js.Any], isCollectingStats = isCollectingStats.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsCache]
    }
    
    extension [Self <: StatsCache](x: Self) {
      
      inline def setAnonymousProfileNameCounter(value: Double): Self = StObject.set(x, "anonymousProfileNameCounter", value.asInstanceOf[js.Any])
      
      inline def setIsCollectingStats(value: Boolean): Self = StObject.set(x, "isCollectingStats", value.asInstanceOf[js.Any])
      
      inline def setProfiles(value: Record[String, StatsProfile]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatsObject extends StObject {
    
    var calls: Double
    
    var hits: Double
    
    var usage: String
  }
  object StatsObject {
    
    inline def apply(calls: Double, hits: Double, usage: String): StatsObject = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsObject]
    }
    
    extension [Self <: StatsObject](x: Self) {
      
      inline def setCalls(value: Double): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatsProfile extends StObject {
    
    var calls: Double
    
    var hits: Double
  }
  object StatsProfile {
    
    inline def apply(calls: Double, hits: Double): StatsProfile = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsProfile]
    }
    
    extension [Self <: StatsProfile](x: Self) {
      
      inline def setCalls(value: Double): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformKey = js.Function1[/* key */ Key[Any], Key[Any]]
  
  type UpdateCacheForKey = js.Function1[/* key */ Key[Any], Boolean]
  
  type Value = Any
  
  type _To = Moize[Options]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Moize[Options] = default
}
