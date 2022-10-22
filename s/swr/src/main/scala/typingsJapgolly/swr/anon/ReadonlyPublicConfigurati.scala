package typingsJapgolly.swr.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.swr.distTypesMod.BareFetcher
import typingsJapgolly.swr.distTypesMod.Middleware
import typingsJapgolly.swr.distTypesMod.PublicConfiguration
import typingsJapgolly.swr.distTypesMod.Revalidator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<swr.swr/dist/types.PublicConfiguration<any, any, swr.swr/dist/types.BareFetcher<unknown>>> */
trait ReadonlyPublicConfigurati extends StObject {
  
  val compare: js.Function2[/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any], Boolean]
  
  val dedupingInterval: Double
  
  val errorRetryCount: js.UndefOr[Double] = js.undefined
  
  val errorRetryInterval: Double
  
  val fallback: StringDictionary[Any]
  
  val fallbackData: js.UndefOr[Any] = js.undefined
  
  val fetcher: js.UndefOr[BareFetcher[Any]] = js.undefined
  
  val focusThrottleInterval: Double
  
  val isOnline: js.Function0[Boolean]
  
  val isPaused: js.Function0[Boolean]
  
  val isVisible: js.Function0[Boolean]
  
  val loadingTimeout: Double
  
  val onDiscarded: js.Function1[/* key */ String, Unit]
  
  val onError: js.Function3[
    /* err */ Any, 
    /* key */ String, 
    /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], 
    Unit
  ]
  
  val onErrorRetry: js.Function5[
    /* err */ Any, 
    /* key */ String, 
    /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], 
    /* revalidate */ Revalidator, 
    /* revalidateOpts */ RequiredRevalidatorOption, 
    Unit
  ]
  
  val onLoadingSlow: js.Function2[/* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], Unit]
  
  val onSuccess: js.Function3[
    /* data */ Any, 
    /* key */ String, 
    /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], 
    Unit
  ]
  
  val refreshInterval: js.UndefOr[Double | (js.Function1[/* latestData */ js.UndefOr[Any], Double])] = js.undefined
  
  val refreshWhenHidden: js.UndefOr[Boolean] = js.undefined
  
  val refreshWhenOffline: js.UndefOr[Boolean] = js.undefined
  
  val revalidateIfStale: Boolean
  
  val revalidateOnFocus: Boolean
  
  val revalidateOnMount: js.UndefOr[Boolean] = js.undefined
  
  val revalidateOnReconnect: Boolean
  
  val shouldRetryOnError: Boolean | (js.Function1[/* err */ Any, Boolean])
  
  val suspense: js.UndefOr[Boolean] = js.undefined
  
  val use: js.UndefOr[js.Array[Middleware]] = js.undefined
}
object ReadonlyPublicConfigurati {
  
  inline def apply(
    compare: (/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any]) => Boolean,
    dedupingInterval: Double,
    errorRetryInterval: Double,
    fallback: StringDictionary[Any],
    focusThrottleInterval: Double,
    isOnline: CallbackTo[Boolean],
    isPaused: CallbackTo[Boolean],
    isVisible: CallbackTo[Boolean],
    loadingTimeout: Double,
    onDiscarded: /* key */ String => Callback,
    onError: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Callback,
    onErrorRetry: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], /* revalidate */ Revalidator, /* revalidateOpts */ RequiredRevalidatorOption) => Callback,
    onLoadingSlow: (/* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Callback,
    onSuccess: (/* data */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Callback,
    revalidateIfStale: Boolean,
    revalidateOnFocus: Boolean,
    revalidateOnReconnect: Boolean,
    shouldRetryOnError: Boolean | (js.Function1[/* err */ Any, Boolean])
  ): ReadonlyPublicConfigurati = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), dedupingInterval = dedupingInterval.asInstanceOf[js.Any], errorRetryInterval = errorRetryInterval.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], focusThrottleInterval = focusThrottleInterval.asInstanceOf[js.Any], isOnline = isOnline.toJsFn, isPaused = isPaused.toJsFn, isVisible = isVisible.toJsFn, loadingTimeout = loadingTimeout.asInstanceOf[js.Any], onDiscarded = js.Any.fromFunction1((t0: /* key */ String) => onDiscarded(t0).runNow()), onError = js.Any.fromFunction3((t0: /* err */ Any, t1: /* key */ String, t2: /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => (onError(t0, t1, t2)).runNow()), onErrorRetry = js.Any.fromFunction5((t0: /* err */ Any, t1: /* key */ String, t2: /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], t3: /* revalidate */ Revalidator, t4: /* revalidateOpts */ RequiredRevalidatorOption) => (onErrorRetry(t0, t1, t2, t3, t4)).runNow()), onLoadingSlow = js.Any.fromFunction2((t0: /* key */ String, t1: /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => (onLoadingSlow(t0, t1)).runNow()), onSuccess = js.Any.fromFunction3((t0: /* data */ Any, t1: /* key */ String, t2: /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => (onSuccess(t0, t1, t2)).runNow()), revalidateIfStale = revalidateIfStale.asInstanceOf[js.Any], revalidateOnFocus = revalidateOnFocus.asInstanceOf[js.Any], revalidateOnReconnect = revalidateOnReconnect.asInstanceOf[js.Any], shouldRetryOnError = shouldRetryOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPublicConfigurati]
  }
  
  extension [Self <: ReadonlyPublicConfigurati](x: Self) {
    
    inline def setCompare(value: (/* a */ js.UndefOr[Any], /* b */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setDedupingInterval(value: Double): Self = StObject.set(x, "dedupingInterval", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryCount(value: Double): Self = StObject.set(x, "errorRetryCount", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryCountUndefined: Self = StObject.set(x, "errorRetryCount", js.undefined)
    
    inline def setErrorRetryInterval(value: Double): Self = StObject.set(x, "errorRetryInterval", value.asInstanceOf[js.Any])
    
    inline def setFallback(value: StringDictionary[Any]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackData(value: Any): Self = StObject.set(x, "fallbackData", value.asInstanceOf[js.Any])
    
    inline def setFallbackDataUndefined: Self = StObject.set(x, "fallbackData", js.undefined)
    
    inline def setFetcher(value: BareFetcher[Any]): Self = StObject.set(x, "fetcher", value.asInstanceOf[js.Any])
    
    inline def setFetcherUndefined: Self = StObject.set(x, "fetcher", js.undefined)
    
    inline def setFocusThrottleInterval(value: Double): Self = StObject.set(x, "focusThrottleInterval", value.asInstanceOf[js.Any])
    
    inline def setIsOnline(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOnline", value.toJsFn)
    
    inline def setIsPaused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPaused", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setLoadingTimeout(value: Double): Self = StObject.set(x, "loadingTimeout", value.asInstanceOf[js.Any])
    
    inline def setOnDiscarded(value: /* key */ String => Callback): Self = StObject.set(x, "onDiscarded", js.Any.fromFunction1((t0: /* key */ String) => value(t0).runNow()))
    
    inline def setOnError(
      value: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Callback
    ): Self = StObject.set(x, "onError", js.Any.fromFunction3((t0: /* err */ Any, t1: /* key */ String, t2: /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnErrorRetry(
      value: (/* err */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], /* revalidate */ Revalidator, /* revalidateOpts */ RequiredRevalidatorOption) => Callback
    ): Self = StObject.set(x, "onErrorRetry", js.Any.fromFunction5((t0: /* err */ Any, t1: /* key */ String, t2: /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]], t3: /* revalidate */ Revalidator, t4: /* revalidateOpts */ RequiredRevalidatorOption) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setOnLoadingSlow(
      value: (/* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Callback
    ): Self = StObject.set(x, "onLoadingSlow", js.Any.fromFunction2((t0: /* key */ String, t1: /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => (value(t0, t1)).runNow()))
    
    inline def setOnSuccess(
      value: (/* data */ Any, /* key */ String, /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => Callback
    ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3((t0: /* data */ Any, t1: /* key */ String, t2: /* config */ PublicConfiguration[Any, Any, BareFetcher[Any]]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRefreshInterval(value: Double | (js.Function1[/* latestData */ js.UndefOr[Any], Double])): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalFunction1(value: /* latestData */ js.UndefOr[Any] => Double): Self = StObject.set(x, "refreshInterval", js.Any.fromFunction1(value))
    
    inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    inline def setRefreshWhenHidden(value: Boolean): Self = StObject.set(x, "refreshWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setRefreshWhenHiddenUndefined: Self = StObject.set(x, "refreshWhenHidden", js.undefined)
    
    inline def setRefreshWhenOffline(value: Boolean): Self = StObject.set(x, "refreshWhenOffline", value.asInstanceOf[js.Any])
    
    inline def setRefreshWhenOfflineUndefined: Self = StObject.set(x, "refreshWhenOffline", js.undefined)
    
    inline def setRevalidateIfStale(value: Boolean): Self = StObject.set(x, "revalidateIfStale", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnFocus(value: Boolean): Self = StObject.set(x, "revalidateOnFocus", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnMount(value: Boolean): Self = StObject.set(x, "revalidateOnMount", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnMountUndefined: Self = StObject.set(x, "revalidateOnMount", js.undefined)
    
    inline def setRevalidateOnReconnect(value: Boolean): Self = StObject.set(x, "revalidateOnReconnect", value.asInstanceOf[js.Any])
    
    inline def setShouldRetryOnError(value: Boolean | (js.Function1[/* err */ Any, Boolean])): Self = StObject.set(x, "shouldRetryOnError", value.asInstanceOf[js.Any])
    
    inline def setShouldRetryOnErrorFunction1(value: /* err */ Any => Boolean): Self = StObject.set(x, "shouldRetryOnError", js.Any.fromFunction1(value))
    
    inline def setSuspense(value: Boolean): Self = StObject.set(x, "suspense", value.asInstanceOf[js.Any])
    
    inline def setSuspenseUndefined: Self = StObject.set(x, "suspense", js.undefined)
    
    inline def setUse(value: js.Array[Middleware]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: Middleware*): Self = StObject.set(x, "use", js.Array(value*))
  }
}
