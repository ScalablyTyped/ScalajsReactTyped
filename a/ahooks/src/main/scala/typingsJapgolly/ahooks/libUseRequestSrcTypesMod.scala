package typingsJapgolly.ahooks

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ahooks.anon.FnCallHandlerTimeoutArguments
import typingsJapgolly.ahooks.anon.ReturnNow
import typingsJapgolly.ahooks.anon.ServicePromise
import typingsJapgolly.ahooks.libUseRequestSrcFetchMod.default
import typingsJapgolly.ahooks.libUseRequestSrcUtilsCacheMod.CachedData
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.std.Partial
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseRequestSrcTypesMod {
  
  trait FetchState[TData, TParams /* <: js.Array[Any] */] extends StObject {
    
    var data: js.UndefOr[TData] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var loading: Boolean
    
    var params: js.UndefOr[TParams] = js.undefined
  }
  object FetchState {
    
    inline def apply[TData, TParams /* <: js.Array[Any] */](loading: Boolean): FetchState[TData, TParams] = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchState[TData, TParams]]
    }
    
    extension [Self <: FetchState[?, ?], TData, TParams /* <: js.Array[Any] */](x: Self & (FetchState[TData, TParams])) {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setParams(value: TParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait Options[TData, TParams /* <: js.Array[Any] */] extends StObject {
    
    var cacheKey: js.UndefOr[String] = js.undefined
    
    var cacheTime: js.UndefOr[Double] = js.undefined
    
    var debounceLeading: js.UndefOr[Boolean] = js.undefined
    
    var debounceMaxWait: js.UndefOr[Double] = js.undefined
    
    var debounceTrailing: js.UndefOr[Boolean] = js.undefined
    
    var debounceWait: js.UndefOr[Double] = js.undefined
    
    var defaultParams: js.UndefOr[TParams] = js.undefined
    
    var focusTimespan: js.UndefOr[Double] = js.undefined
    
    var getCache: js.UndefOr[js.Function1[/* params */ TParams, js.UndefOr[CachedData[TData, TParams]]]] = js.undefined
    
    var loadingDelay: js.UndefOr[Double] = js.undefined
    
    var manual: js.UndefOr[Boolean] = js.undefined
    
    var onBefore: js.UndefOr[js.Function1[/* params */ TParams, Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* e */ js.Error, /* params */ TParams, Unit]] = js.undefined
    
    var onFinally: js.UndefOr[
        js.Function3[/* params */ TParams, /* data */ js.UndefOr[TData], /* e */ js.UndefOr[js.Error], Unit]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function2[/* data */ TData, /* params */ TParams, Unit]] = js.undefined
    
    var pollingErrorRetryCount: js.UndefOr[Double] = js.undefined
    
    var pollingInterval: js.UndefOr[Double] = js.undefined
    
    var pollingWhenHidden: js.UndefOr[Boolean] = js.undefined
    
    var ready: js.UndefOr[Boolean] = js.undefined
    
    var refreshDeps: js.UndefOr[DependencyList] = js.undefined
    
    var refreshDepsAction: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
    
    var retryCount: js.UndefOr[Double] = js.undefined
    
    var retryInterval: js.UndefOr[Double] = js.undefined
    
    var setCache: js.UndefOr[js.Function1[/* data */ CachedData[TData, TParams], Unit]] = js.undefined
    
    var staleTime: js.UndefOr[Double] = js.undefined
    
    var throttleLeading: js.UndefOr[Boolean] = js.undefined
    
    var throttleTrailing: js.UndefOr[Boolean] = js.undefined
    
    var throttleWait: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[TData, TParams /* <: js.Array[Any] */](): Options[TData, TParams] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TData, TParams]]
    }
    
    extension [Self <: Options[?, ?], TData, TParams /* <: js.Array[Any] */](x: Self & (Options[TData, TParams])) {
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setCacheTime(value: Double): Self = StObject.set(x, "cacheTime", value.asInstanceOf[js.Any])
      
      inline def setCacheTimeUndefined: Self = StObject.set(x, "cacheTime", js.undefined)
      
      inline def setDebounceLeading(value: Boolean): Self = StObject.set(x, "debounceLeading", value.asInstanceOf[js.Any])
      
      inline def setDebounceLeadingUndefined: Self = StObject.set(x, "debounceLeading", js.undefined)
      
      inline def setDebounceMaxWait(value: Double): Self = StObject.set(x, "debounceMaxWait", value.asInstanceOf[js.Any])
      
      inline def setDebounceMaxWaitUndefined: Self = StObject.set(x, "debounceMaxWait", js.undefined)
      
      inline def setDebounceTrailing(value: Boolean): Self = StObject.set(x, "debounceTrailing", value.asInstanceOf[js.Any])
      
      inline def setDebounceTrailingUndefined: Self = StObject.set(x, "debounceTrailing", js.undefined)
      
      inline def setDebounceWait(value: Double): Self = StObject.set(x, "debounceWait", value.asInstanceOf[js.Any])
      
      inline def setDebounceWaitUndefined: Self = StObject.set(x, "debounceWait", js.undefined)
      
      inline def setDefaultParams(value: TParams): Self = StObject.set(x, "defaultParams", value.asInstanceOf[js.Any])
      
      inline def setDefaultParamsUndefined: Self = StObject.set(x, "defaultParams", js.undefined)
      
      inline def setFocusTimespan(value: Double): Self = StObject.set(x, "focusTimespan", value.asInstanceOf[js.Any])
      
      inline def setFocusTimespanUndefined: Self = StObject.set(x, "focusTimespan", js.undefined)
      
      inline def setGetCache(value: /* params */ TParams => js.UndefOr[CachedData[TData, TParams]]): Self = StObject.set(x, "getCache", js.Any.fromFunction1(value))
      
      inline def setGetCacheUndefined: Self = StObject.set(x, "getCache", js.undefined)
      
      inline def setLoadingDelay(value: Double): Self = StObject.set(x, "loadingDelay", value.asInstanceOf[js.Any])
      
      inline def setLoadingDelayUndefined: Self = StObject.set(x, "loadingDelay", js.undefined)
      
      inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      inline def setOnBefore(value: /* params */ TParams => Callback): Self = StObject.set(x, "onBefore", js.Any.fromFunction1((t0: /* params */ TParams) => value(t0).runNow()))
      
      inline def setOnBeforeUndefined: Self = StObject.set(x, "onBefore", js.undefined)
      
      inline def setOnError(value: (/* e */ js.Error, /* params */ TParams) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* e */ js.Error, t1: /* params */ TParams) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFinally(
        value: (/* params */ TParams, /* data */ js.UndefOr[TData], /* e */ js.UndefOr[js.Error]) => Callback
      ): Self = StObject.set(x, "onFinally", js.Any.fromFunction3((t0: /* params */ TParams, t1: /* data */ js.UndefOr[TData], t2: /* e */ js.UndefOr[js.Error]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnFinallyUndefined: Self = StObject.set(x, "onFinally", js.undefined)
      
      inline def setOnSuccess(value: (/* data */ TData, /* params */ TParams) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: /* data */ TData, t1: /* params */ TParams) => (value(t0, t1)).runNow()))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setPollingErrorRetryCount(value: Double): Self = StObject.set(x, "pollingErrorRetryCount", value.asInstanceOf[js.Any])
      
      inline def setPollingErrorRetryCountUndefined: Self = StObject.set(x, "pollingErrorRetryCount", js.undefined)
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
      
      inline def setPollingWhenHidden(value: Boolean): Self = StObject.set(x, "pollingWhenHidden", value.asInstanceOf[js.Any])
      
      inline def setPollingWhenHiddenUndefined: Self = StObject.set(x, "pollingWhenHidden", js.undefined)
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setRefreshDeps(value: DependencyList): Self = StObject.set(x, "refreshDeps", value.asInstanceOf[js.Any])
      
      inline def setRefreshDepsAction(value: Callback): Self = StObject.set(x, "refreshDepsAction", value.toJsFn)
      
      inline def setRefreshDepsActionUndefined: Self = StObject.set(x, "refreshDepsAction", js.undefined)
      
      inline def setRefreshDepsUndefined: Self = StObject.set(x, "refreshDeps", js.undefined)
      
      inline def setRefreshDepsVarargs(value: Any*): Self = StObject.set(x, "refreshDeps", js.Array(value*))
      
      inline def setRefreshOnWindowFocus(value: Boolean): Self = StObject.set(x, "refreshOnWindowFocus", value.asInstanceOf[js.Any])
      
      inline def setRefreshOnWindowFocusUndefined: Self = StObject.set(x, "refreshOnWindowFocus", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
      
      inline def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
      
      inline def setRetryIntervalUndefined: Self = StObject.set(x, "retryInterval", js.undefined)
      
      inline def setSetCache(value: /* data */ CachedData[TData, TParams] => Callback): Self = StObject.set(x, "setCache", js.Any.fromFunction1((t0: /* data */ CachedData[TData, TParams]) => value(t0).runNow()))
      
      inline def setSetCacheUndefined: Self = StObject.set(x, "setCache", js.undefined)
      
      inline def setStaleTime(value: Double): Self = StObject.set(x, "staleTime", value.asInstanceOf[js.Any])
      
      inline def setStaleTimeUndefined: Self = StObject.set(x, "staleTime", js.undefined)
      
      inline def setThrottleLeading(value: Boolean): Self = StObject.set(x, "throttleLeading", value.asInstanceOf[js.Any])
      
      inline def setThrottleLeadingUndefined: Self = StObject.set(x, "throttleLeading", js.undefined)
      
      inline def setThrottleTrailing(value: Boolean): Self = StObject.set(x, "throttleTrailing", value.asInstanceOf[js.Any])
      
      inline def setThrottleTrailingUndefined: Self = StObject.set(x, "throttleTrailing", js.undefined)
      
      inline def setThrottleWait(value: Double): Self = StObject.set(x, "throttleWait", value.asInstanceOf[js.Any])
      
      inline def setThrottleWaitUndefined: Self = StObject.set(x, "throttleWait", js.undefined)
    }
  }
  
  @js.native
  trait Plugin[TData, TParams /* <: js.Array[Any] */] extends StObject {
    
    def apply(fetchInstance: default[TData, TParams], options: Options[TData, TParams]): PluginReturn[TData, TParams] = js.native
    
    var onInit: js.UndefOr[
        js.Function1[/* options */ Options[TData, TParams], Partial[FetchState[TData, TParams]]]
      ] = js.native
  }
  
  trait PluginReturn[TData, TParams /* <: js.Array[Any] */] extends StObject {
    
    var onBefore: js.UndefOr[
        js.Function1[/* params */ TParams, (ReturnNow & (Partial[FetchState[TData, TParams]])) | Unit]
      ] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* e */ js.Error, /* params */ TParams, Unit]] = js.undefined
    
    var onFinally: js.UndefOr[
        js.Function3[/* params */ TParams, /* data */ js.UndefOr[TData], /* e */ js.UndefOr[js.Error], Unit]
      ] = js.undefined
    
    var onMutate: js.UndefOr[js.Function1[/* data */ TData, Unit]] = js.undefined
    
    var onRequest: js.UndefOr[
        js.Function2[/* service */ Service[TData, TParams], /* params */ TParams, ServicePromise[TData]]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function2[/* data */ TData, /* params */ TParams, Unit]] = js.undefined
  }
  object PluginReturn {
    
    inline def apply[TData, TParams /* <: js.Array[Any] */](): PluginReturn[TData, TParams] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginReturn[TData, TParams]]
    }
    
    extension [Self <: PluginReturn[?, ?], TData, TParams /* <: js.Array[Any] */](x: Self & (PluginReturn[TData, TParams])) {
      
      inline def setOnBefore(value: /* params */ TParams => (ReturnNow & (Partial[FetchState[TData, TParams]])) | Unit): Self = StObject.set(x, "onBefore", js.Any.fromFunction1(value))
      
      inline def setOnBeforeUndefined: Self = StObject.set(x, "onBefore", js.undefined)
      
      inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnError(value: (/* e */ js.Error, /* params */ TParams) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* e */ js.Error, t1: /* params */ TParams) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFinally(
        value: (/* params */ TParams, /* data */ js.UndefOr[TData], /* e */ js.UndefOr[js.Error]) => Callback
      ): Self = StObject.set(x, "onFinally", js.Any.fromFunction3((t0: /* params */ TParams, t1: /* data */ js.UndefOr[TData], t2: /* e */ js.UndefOr[js.Error]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnFinallyUndefined: Self = StObject.set(x, "onFinally", js.undefined)
      
      inline def setOnMutate(value: /* data */ TData => Callback): Self = StObject.set(x, "onMutate", js.Any.fromFunction1((t0: /* data */ TData) => value(t0).runNow()))
      
      inline def setOnMutateUndefined: Self = StObject.set(x, "onMutate", js.undefined)
      
      inline def setOnRequest(value: (/* service */ Service[TData, TParams], /* params */ TParams) => ServicePromise[TData]): Self = StObject.set(x, "onRequest", js.Any.fromFunction2(value))
      
      inline def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
      
      inline def setOnSuccess(value: (/* data */ TData, /* params */ TParams) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: /* data */ TData, t1: /* params */ TParams) => (value(t0, t1)).runNow()))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    }
  }
  
  trait Result[TData, TParams /* <: js.Array[Any] */] extends StObject {
    
    var cancel: js.Function0[Unit]
    
    var data: js.UndefOr[TData] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var loading: Boolean
    
    var mutate: js.Function1[
        /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])], 
        Unit
      ]
    
    var params: TParams | js.Array[Any]
    
    var refresh: js.Function0[Unit]
    
    var refreshAsync: js.Function0[js.Promise[TData]]
    
    var run: js.Function1[/* params */ TParams, Unit]
    
    var runAsync: js.Function1[/* params */ TParams, js.Promise[TData]]
  }
  object Result {
    
    inline def apply[TData, TParams /* <: js.Array[Any] */](
      cancel: Callback,
      loading: Boolean,
      mutate: /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])] => Callback,
      params: TParams | js.Array[Any],
      refresh: Callback,
      refreshAsync: CallbackTo[js.Promise[TData]],
      run: /* params */ TParams => Callback,
      runAsync: /* params */ TParams => js.Promise[TData]
    ): Result[TData, TParams] = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, loading = loading.asInstanceOf[js.Any], mutate = js.Any.fromFunction1((t0: /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])]) => mutate(t0).runNow()), params = params.asInstanceOf[js.Any], refresh = refresh.toJsFn, refreshAsync = refreshAsync.toJsFn, run = js.Any.fromFunction1((t0: /* params */ TParams) => run(t0).runNow()), runAsync = js.Any.fromFunction1(runAsync))
      __obj.asInstanceOf[Result[TData, TParams]]
    }
    
    extension [Self <: Result[?, ?], TData, TParams /* <: js.Array[Any] */](x: Self & (Result[TData, TParams])) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setMutate(
        value: /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])] => Callback
      ): Self = StObject.set(x, "mutate", js.Any.fromFunction1((t0: /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])]) => value(t0).runNow()))
      
      inline def setParams(value: TParams | js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
      
      inline def setRefreshAsync(value: CallbackTo[js.Promise[TData]]): Self = StObject.set(x, "refreshAsync", value.toJsFn)
      
      inline def setRun(value: /* params */ TParams => Callback): Self = StObject.set(x, "run", js.Any.fromFunction1((t0: /* params */ TParams) => value(t0).runNow()))
      
      inline def setRunAsync(value: /* params */ TParams => js.Promise[TData]): Self = StObject.set(x, "runAsync", js.Any.fromFunction1(value))
    }
  }
  
  type Service[TData, TParams /* <: js.Array[Any] */] = js.Function1[/* args */ TParams, js.Promise[TData]]
  
  type Subscribe = js.Function0[Unit]
  
  type Timeout = ReturnType[FnCallHandlerTimeoutArguments]
}
