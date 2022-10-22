package typingsJapgolly.reactNativeGoogleAnalyticsBridge

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNative.mod.EventSubscriptionVendor
import typingsJapgolly.reactNativeGoogleAnalyticsBridge.distModelsAnalyticsMod.HitPayload
import typingsJapgolly.reactNativeGoogleAnalyticsBridge.distModelsDataLayerEventMod.DataLayerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeBridgesMod {
  
  @JSImport("react-native-google-analytics-bridge/dist/NativeBridges", "AnalyticsBridge")
  @js.native
  val AnalyticsBridge: IGoogleAnalyticsBridge = js.native
  
  @JSImport("react-native-google-analytics-bridge/dist/NativeBridges", "AnalyticsSettings")
  @js.native
  val AnalyticsSettings: IGoogleAnalyticsSettings = js.native
  
  @JSImport("react-native-google-analytics-bridge/dist/NativeBridges", "TagManagerBridge")
  @js.native
  val TagManagerBridge: IGoogleTagManagerBridge = js.native
  
  trait IGoogleAnalyticsBridge extends StObject {
    
    def allowIDFA(trackerId: String, enabled: Boolean): Unit
    
    def dispatch(): js.Promise[Boolean]
    
    def getClientId(trackerId: String): js.Promise[String]
    
    def setAnonymizeIp(trackerId: String, enabled: Boolean): Unit
    
    def setAppName(trackerId: String, appName: String): Unit
    
    def setAppVersion(trackerId: String, appVersion: String): Unit
    
    def setClient(trackerId: String, clientId: String): Unit
    
    def setCurrency(trackerId: String, currencyCode: String): Unit
    
    def setSamplingRate(trackerId: String, sampleRate: Double): Unit
    
    def setTrackUncaughtExceptions(trackerId: String, enabled: Boolean): Unit
    
    def setUser(trackerId: String, userId: String): Unit
    
    def trackEvent(
      trackerId: String,
      category: String,
      action: String,
      label: String,
      value: String,
      payload: HitPayload
    ): Unit
    
    def trackException(trackerId: String, error: String, fatal: Boolean, payload: HitPayload): Unit
    
    def trackScreenView(trackerId: String, screenName: String, payload: HitPayload): Unit
    
    def trackSocialInteraction(trackerId: String, network: String, action: String, targetUrl: String, payload: HitPayload): Unit
    
    def trackTiming(
      trackerId: String,
      category: String,
      interval: Double,
      name: String,
      label: String,
      payload: HitPayload
    ): Unit
  }
  object IGoogleAnalyticsBridge {
    
    inline def apply(
      allowIDFA: (String, Boolean) => Callback,
      dispatch: CallbackTo[js.Promise[Boolean]],
      getClientId: String => js.Promise[String],
      setAnonymizeIp: (String, Boolean) => Callback,
      setAppName: (String, String) => Callback,
      setAppVersion: (String, String) => Callback,
      setClient: (String, String) => Callback,
      setCurrency: (String, String) => Callback,
      setSamplingRate: (String, Double) => Callback,
      setTrackUncaughtExceptions: (String, Boolean) => Callback,
      setUser: (String, String) => Callback,
      trackEvent: (String, String, String, String, String, HitPayload) => Callback,
      trackException: (String, String, Boolean, HitPayload) => Callback,
      trackScreenView: (String, String, HitPayload) => Callback,
      trackSocialInteraction: (String, String, String, String, HitPayload) => Callback,
      trackTiming: (String, String, Double, String, String, HitPayload) => Callback
    ): IGoogleAnalyticsBridge = {
      val __obj = js.Dynamic.literal(allowIDFA = js.Any.fromFunction2((t0: String, t1: Boolean) => (allowIDFA(t0, t1)).runNow()), dispatch = dispatch.toJsFn, getClientId = js.Any.fromFunction1(getClientId), setAnonymizeIp = js.Any.fromFunction2((t0: String, t1: Boolean) => (setAnonymizeIp(t0, t1)).runNow()), setAppName = js.Any.fromFunction2((t0: String, t1: String) => (setAppName(t0, t1)).runNow()), setAppVersion = js.Any.fromFunction2((t0: String, t1: String) => (setAppVersion(t0, t1)).runNow()), setClient = js.Any.fromFunction2((t0: String, t1: String) => (setClient(t0, t1)).runNow()), setCurrency = js.Any.fromFunction2((t0: String, t1: String) => (setCurrency(t0, t1)).runNow()), setSamplingRate = js.Any.fromFunction2((t0: String, t1: Double) => (setSamplingRate(t0, t1)).runNow()), setTrackUncaughtExceptions = js.Any.fromFunction2((t0: String, t1: Boolean) => (setTrackUncaughtExceptions(t0, t1)).runNow()), setUser = js.Any.fromFunction2((t0: String, t1: String) => (setUser(t0, t1)).runNow()), trackEvent = js.Any.fromFunction6((t0: String, t1: String, t2: String, t3: String, t4: String, t5: HitPayload) => (trackEvent(t0, t1, t2, t3, t4, t5)).runNow()), trackException = js.Any.fromFunction4((t0: String, t1: String, t2: Boolean, t3: HitPayload) => (trackException(t0, t1, t2, t3)).runNow()), trackScreenView = js.Any.fromFunction3((t0: String, t1: String, t2: HitPayload) => (trackScreenView(t0, t1, t2)).runNow()), trackSocialInteraction = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: HitPayload) => (trackSocialInteraction(t0, t1, t2, t3, t4)).runNow()), trackTiming = js.Any.fromFunction6((t0: String, t1: String, t2: Double, t3: String, t4: String, t5: HitPayload) => (trackTiming(t0, t1, t2, t3, t4, t5)).runNow()))
      __obj.asInstanceOf[IGoogleAnalyticsBridge]
    }
    
    extension [Self <: IGoogleAnalyticsBridge](x: Self) {
      
      inline def setAllowIDFA(value: (String, Boolean) => Callback): Self = StObject.set(x, "allowIDFA", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setDispatch(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "dispatch", value.toJsFn)
      
      inline def setGetClientId(value: String => js.Promise[String]): Self = StObject.set(x, "getClientId", js.Any.fromFunction1(value))
      
      inline def setSetAnonymizeIp(value: (String, Boolean) => Callback): Self = StObject.set(x, "setAnonymizeIp", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setSetAppName(value: (String, String) => Callback): Self = StObject.set(x, "setAppName", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetAppVersion(value: (String, String) => Callback): Self = StObject.set(x, "setAppVersion", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetClient(value: (String, String) => Callback): Self = StObject.set(x, "setClient", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetCurrency(value: (String, String) => Callback): Self = StObject.set(x, "setCurrency", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetSamplingRate(value: (String, Double) => Callback): Self = StObject.set(x, "setSamplingRate", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setSetTrackUncaughtExceptions(value: (String, Boolean) => Callback): Self = StObject.set(x, "setTrackUncaughtExceptions", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setSetUser(value: (String, String) => Callback): Self = StObject.set(x, "setUser", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setTrackEvent(value: (String, String, String, String, String, HitPayload) => Callback): Self = StObject.set(x, "trackEvent", js.Any.fromFunction6((t0: String, t1: String, t2: String, t3: String, t4: String, t5: HitPayload) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setTrackException(value: (String, String, Boolean, HitPayload) => Callback): Self = StObject.set(x, "trackException", js.Any.fromFunction4((t0: String, t1: String, t2: Boolean, t3: HitPayload) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setTrackScreenView(value: (String, String, HitPayload) => Callback): Self = StObject.set(x, "trackScreenView", js.Any.fromFunction3((t0: String, t1: String, t2: HitPayload) => (value(t0, t1, t2)).runNow()))
      
      inline def setTrackSocialInteraction(value: (String, String, String, String, HitPayload) => Callback): Self = StObject.set(x, "trackSocialInteraction", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: HitPayload) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setTrackTiming(value: (String, String, Double, String, String, HitPayload) => Callback): Self = StObject.set(x, "trackTiming", js.Any.fromFunction6((t0: String, t1: String, t2: Double, t3: String, t4: String, t5: HitPayload) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    }
  }
  
  trait IGoogleAnalyticsSettings extends StObject {
    
    def setDispatchInterval(intervalInSeconds: Any): Unit
    
    def setDryRun(enabled: Any): Unit
    
    def setOptOut(enabled: Any): Unit
  }
  object IGoogleAnalyticsSettings {
    
    inline def apply(setDispatchInterval: Any => Callback, setDryRun: Any => Callback, setOptOut: Any => Callback): IGoogleAnalyticsSettings = {
      val __obj = js.Dynamic.literal(setDispatchInterval = js.Any.fromFunction1((t0: Any) => setDispatchInterval(t0).runNow()), setDryRun = js.Any.fromFunction1((t0: Any) => setDryRun(t0).runNow()), setOptOut = js.Any.fromFunction1((t0: Any) => setOptOut(t0).runNow()))
      __obj.asInstanceOf[IGoogleAnalyticsSettings]
    }
    
    extension [Self <: IGoogleAnalyticsSettings](x: Self) {
      
      inline def setSetDispatchInterval(value: Any => Callback): Self = StObject.set(x, "setDispatchInterval", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetDryRun(value: Any => Callback): Self = StObject.set(x, "setDryRun", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetOptOut(value: Any => Callback): Self = StObject.set(x, "setOptOut", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait IGoogleTagManagerBridge
    extends StObject
       with EventSubscriptionVendor {
    
    def booleanForKey(key: String): js.Promise[Boolean] = js.native
    
    def doubleForKey(key: Any): js.Promise[Double] = js.native
    
    def openContainerWithId(containerId: String): js.Promise[Boolean] = js.native
    
    def pushDataLayerEvent(event: DataLayerEvent): js.Promise[Boolean] = js.native
    
    def refreshContainer(): js.Promise[Boolean] = js.native
    
    def registerFunctionCallTagHandler(functionName: String): js.Promise[Boolean] = js.native
    
    def setVerboseLoggingEnabled(enabled: Boolean): js.Promise[Boolean] = js.native
    
    def stringForKey(key: String): js.Promise[String] = js.native
  }
}
