package typingsJapgolly.reactNativeGoogleAnalyticsBridge.nativeBridgesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGoogleAnalyticsBridge extends js.Object {
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
  @scala.inline
  def apply(
    allowIDFA: (String, Boolean) => Callback,
    dispatch: CallbackTo[js.Promise[Boolean]],
    getClientId: String => CallbackTo[js.Promise[String]],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowIDFA")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => allowIDFA(t0, t1).runNow()))
    __obj.updateDynamic("dispatch")(dispatch.toJsFn)
    __obj.updateDynamic("getClientId")(js.Any.fromFunction1((t0: java.lang.String) => getClientId(t0).runNow()))
    __obj.updateDynamic("setAnonymizeIp")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => setAnonymizeIp(t0, t1).runNow()))
    __obj.updateDynamic("setAppName")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAppName(t0, t1).runNow()))
    __obj.updateDynamic("setAppVersion")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAppVersion(t0, t1).runNow()))
    __obj.updateDynamic("setClient")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setClient(t0, t1).runNow()))
    __obj.updateDynamic("setCurrency")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setCurrency(t0, t1).runNow()))
    __obj.updateDynamic("setSamplingRate")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => setSamplingRate(t0, t1).runNow()))
    __obj.updateDynamic("setTrackUncaughtExceptions")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => setTrackUncaughtExceptions(t0, t1).runNow()))
    __obj.updateDynamic("setUser")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setUser(t0, t1).runNow()))
    __obj.updateDynamic("trackEvent")(js.Any.fromFunction6((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String, t5: typingsJapgolly.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload) => trackEvent(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("trackException")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: scala.Boolean, t3: typingsJapgolly.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload) => trackException(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("trackScreenView")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload) => trackScreenView(t0, t1, t2).runNow()))
    __obj.updateDynamic("trackSocialInteraction")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: typingsJapgolly.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload) => trackSocialInteraction(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("trackTiming")(js.Any.fromFunction6((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: java.lang.String, t4: java.lang.String, t5: typingsJapgolly.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload) => trackTiming(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[IGoogleAnalyticsBridge]
  }
}

