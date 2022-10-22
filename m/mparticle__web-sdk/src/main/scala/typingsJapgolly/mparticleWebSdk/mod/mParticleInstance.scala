package typingsJapgolly.mparticleWebSdk.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.mparticleWebSdk.anon.AddToCart
import typingsJapgolly.mparticleWebSdk.anon.CustomerId
import typingsJapgolly.mparticleWebSdk.anon.ProductAddToCart
import typingsJapgolly.mparticleWebSdk.anon.PromotionClick
import typingsJapgolly.mparticleWebSdk.mparticleWebSdkStrings.none
import typingsJapgolly.mparticleWebSdk.mparticleWebSdkStrings.verbose
import typingsJapgolly.mparticleWebSdk.mparticleWebSdkStrings.warning
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait mParticleInstance extends StObject {
  
  var CommerceEventType: ProductAddToCart
  
  // Future optional changes once we migrate all core SDK files to TS. These are used internally only and should not be used by consumers of mParticle
  // export function addForwarder
  // export function configurePixel
  // export function generateHash
  // export function _setIntegrationDelay
  // export function _getIntegrationDelay
  var Consent: typingsJapgolly.mparticleWebSdk.anon.CreateCCPAConsent
  
  var EventType: typingsJapgolly.mparticleWebSdk.anon.Location
  
  var Identity: typingsJapgolly.mparticleWebSdk.anon.AliasUsers
  
  var IdentityType: CustomerId
  
  var ProductActionType: AddToCart
  
  var PromotionType: PromotionClick
  
  var eCommerce: typingsJapgolly.mparticleWebSdk.anon.Cart
  
  def endSession(): Unit
  @JSName("endSession")
  var endSession_Original: EndSession_
  
  def getAppName(): String
  @JSName("getAppName")
  var getAppName_Original: GetAppName_
  
  def getAppVersion(): String
  @JSName("getAppVersion")
  var getAppVersion_Original: GetAppVersion_
  
  def getDeviceId(): String
  @JSName("getDeviceId")
  var getDeviceId_Original: GetDeviceId_
  
  def getIntegrationAttributes(integrationId: Double): Record[String, Any]
  @JSName("getIntegrationAttributes")
  var getIntegrationAttributes_Original: GetIntegrationAttributes_
  
  def getVersion(): String
  @JSName("getVersion")
  var getVersion_Original: GetVersion_
  
  def init(apiKey: String, config: MPConfiguration): Unit
  def init(apiKey: String, config: MPConfiguration, instanceName: String): Unit
  @JSName("init")
  var init_Original: Init_
  
  def isInitialized(): Boolean
  @JSName("isInitialized")
  var isInitialized_Original: IsInitialized_
  
  def logBaseEvent(event: BaseEvent): Unit
  def logBaseEvent(event: BaseEvent, eventOptions: SDKEventOptions): Unit
  @JSName("logBaseEvent")
  var logBaseEvent_Original: LogBaseEvent_
  
  def logError(error: String): Unit
  def logError(error: String, attrs: SDKEventAttrs): Unit
  def logError(error: errorObject): Unit
  def logError(error: errorObject, attrs: SDKEventAttrs): Unit
  @JSName("logError")
  var logError_Original: LogError_
  
  def logEvent(eventName: String): Unit
  def logEvent(
    eventName: String,
    eventType: Unit,
    eventInfo: Unit,
    customFlags: Unit,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: Unit, eventInfo: Unit, customFlags: SDKEventCustomFlags): Unit
  def logEvent(
    eventName: String,
    eventType: Unit,
    eventInfo: Unit,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logEvent(
    eventName: String,
    eventType: Unit,
    eventInfo: SDKEventAttrs,
    customFlags: Unit,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: Unit, eventInfo: SDKEventAttrs, customFlags: SDKEventCustomFlags): Unit
  def logEvent(
    eventName: String,
    eventType: Unit,
    eventInfo: SDKEventAttrs,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: EventType): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: Unit,
    customFlags: Unit,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: EventType, eventInfo: Unit, customFlags: SDKEventCustomFlags): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: Unit,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: SDKEventAttrs,
    customFlags: Unit,
    eventOptions: SDKEventOptions
  ): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: SDKEventAttrs,
    customFlags: SDKEventCustomFlags
  ): Unit
  def logEvent(
    eventName: String,
    eventType: EventType,
    eventInfo: SDKEventAttrs,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  @JSName("logEvent")
  var logEvent_Original: LogEvent_
  
  def logForm(selector: String, eventName: String): Unit
  def logForm(selector: String, eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logForm(selector: String, eventName: String, eventType: EventType): Unit
  def logForm(selector: String, eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  def logForm(selector: HTMLElement, eventName: String): Unit
  def logForm(selector: HTMLElement, eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logForm(selector: HTMLElement, eventName: String, eventType: EventType): Unit
  def logForm(selector: HTMLElement, eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  @JSName("logForm")
  var logForm_Original: LogForm_
  
  def logLink(selector: String, eventName: String): Unit
  def logLink(selector: String, eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logLink(selector: String, eventName: String, eventType: EventType): Unit
  def logLink(selector: String, eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  def logLink(selector: HTMLElement, eventName: String): Unit
  def logLink(selector: HTMLElement, eventName: String, eventType: Unit, eventInfo: SDKEventAttrs): Unit
  def logLink(selector: HTMLElement, eventName: String, eventType: EventType): Unit
  def logLink(selector: HTMLElement, eventName: String, eventType: EventType, eventInfo: SDKEventAttrs): Unit
  @JSName("logLink")
  var logLink_Original: LogLink_
  
  def logPageView(): Unit
  def logPageView(eventName: String): Unit
  def logPageView(eventName: String, attrs: Unit, customFlags: Unit, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: String, attrs: Unit, customFlags: SDKEventCustomFlags): Unit
  def logPageView(eventName: String, attrs: Unit, customFlags: SDKEventCustomFlags, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: String, attrs: SDKEventAttrs): Unit
  def logPageView(eventName: String, attrs: SDKEventAttrs, customFlags: Unit, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: String, attrs: SDKEventAttrs, customFlags: SDKEventCustomFlags): Unit
  def logPageView(
    eventName: String,
    attrs: SDKEventAttrs,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  def logPageView(eventName: Unit, attrs: Unit, customFlags: Unit, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: Unit, attrs: Unit, customFlags: SDKEventCustomFlags): Unit
  def logPageView(eventName: Unit, attrs: Unit, customFlags: SDKEventCustomFlags, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: Unit, attrs: SDKEventAttrs): Unit
  def logPageView(eventName: Unit, attrs: SDKEventAttrs, customFlags: Unit, eventOptions: SDKEventOptions): Unit
  def logPageView(eventName: Unit, attrs: SDKEventAttrs, customFlags: SDKEventCustomFlags): Unit
  def logPageView(
    eventName: Unit,
    attrs: SDKEventAttrs,
    customFlags: SDKEventCustomFlags,
    eventOptions: SDKEventOptions
  ): Unit
  @JSName("logPageView")
  var logPageView_Original: LogPageView_
  
  def ready(callback: js.Function0[Unit]): Unit
  @JSName("ready")
  var ready_Original: Ready_
  
  /**
    * @warning Calling mParticle.reset may have unintended consequences. This function is primarily used for tests. You should only use mParticle.reset if you absolutely know what you are doing.
    */
  def reset(): Unit
  /**
    * @warning Calling mParticle.reset may have unintended consequences. This function is primarily used for tests. You should only use mParticle.reset if you absolutely know what you are doing.
    */
  @JSName("reset")
  var reset_Original: Reset_
  
  var sessionManager: typingsJapgolly.mparticleWebSdk.anon.GetSession
  
  def setAppName(name: String): Unit
  @JSName("setAppName")
  var setAppName_Original: SetAppName_
  
  def setAppVersion(version: String): Unit
  @JSName("setAppVersion")
  var setAppVersion_Original: SetAppVersion_
  
  def setDeviceId(uuid: String): Unit
  @JSName("setDeviceId")
  var setDeviceId_Original: SetDeviceId_
  
  def setIntegrationAttribute(integrationId: Double, attrs: Record[String, Any]): Unit
  @JSName("setIntegrationAttribute")
  var setIntegrationAttribute_Original: SetIntegrationAttribute_
  
  def setLogLevel(newLogLevel: verbose | warning | none): Unit
  @JSName("setLogLevel")
  var setLogLevel_Original: SetLogLevel_
  
  def setOptOut(isOptingOut: Boolean): Unit
  @JSName("setOptOut")
  var setOptOut_Original: SetOptOut_
  
  def setPosition(lat: Double, lng: Double): Unit
  @JSName("setPosition")
  var setPosition_Original: SetPosition_
  
  def setSessionAttribute(key: String): Unit
  def setSessionAttribute(key: String, value: String): Unit
  def setSessionAttribute(key: String, value: Boolean): Unit
  def setSessionAttribute(key: String, value: Double): Unit
  @JSName("setSessionAttribute")
  var setSessionAttribute_Original: SetSessionAttribute_
  
  def startNewSession(): Unit
  @JSName("startNewSession")
  var startNewSession_Original: StartNewSession_
  
  def startTrackingLocation(): Unit
  def startTrackingLocation(callback: TrackLocationCallback): Unit
  @JSName("startTrackingLocation")
  var startTrackingLocation_Original: StartTrackingLocation_
  
  def stopTrackingLocation(): Unit
  @JSName("stopTrackingLocation")
  var stopTrackingLocation_Original: StopTrackingLocation_
  
  def upload(): Unit
  @JSName("upload")
  var upload_Original: Upload_
}
object mParticleInstance {
  
  inline def apply(
    CommerceEventType: ProductAddToCart,
    Consent: typingsJapgolly.mparticleWebSdk.anon.CreateCCPAConsent,
    EventType: typingsJapgolly.mparticleWebSdk.anon.Location,
    Identity: typingsJapgolly.mparticleWebSdk.anon.AliasUsers,
    IdentityType: CustomerId,
    ProductActionType: AddToCart,
    PromotionType: PromotionClick,
    eCommerce: typingsJapgolly.mparticleWebSdk.anon.Cart,
    endSession: japgolly.scalajs.react.Callback,
    getAppName: CallbackTo[String],
    getAppVersion: CallbackTo[String],
    getDeviceId: CallbackTo[String],
    getIntegrationAttributes: /* integrationId */ Double => Record[String, Any],
    getVersion: CallbackTo[String],
    init: (/* apiKey */ String, /* config */ MPConfiguration, /* instanceName */ js.UndefOr[String]) => japgolly.scalajs.react.Callback,
    isInitialized: CallbackTo[Boolean],
    logBaseEvent: (/* event */ BaseEvent, /* eventOptions */ js.UndefOr[SDKEventOptions]) => japgolly.scalajs.react.Callback,
    logError: (/* error */ String | errorObject, /* attrs */ js.UndefOr[SDKEventAttrs]) => japgolly.scalajs.react.Callback,
    logEvent: (/* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => japgolly.scalajs.react.Callback,
    logForm: (/* selector */ String | HTMLElement, /* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs]) => japgolly.scalajs.react.Callback,
    logLink: (/* selector */ String | HTMLElement, /* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs]) => japgolly.scalajs.react.Callback,
    logPageView: (/* eventName */ js.UndefOr[String], /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => japgolly.scalajs.react.Callback,
    ready: /* callback */ js.Function0[Unit] => japgolly.scalajs.react.Callback,
    reset: japgolly.scalajs.react.Callback,
    sessionManager: typingsJapgolly.mparticleWebSdk.anon.GetSession,
    setAppName: /* name */ String => japgolly.scalajs.react.Callback,
    setAppVersion: /* version */ String => japgolly.scalajs.react.Callback,
    setDeviceId: /* uuid */ String => japgolly.scalajs.react.Callback,
    setIntegrationAttribute: (/* integrationId */ Double, /* attrs */ Record[String, Any]) => japgolly.scalajs.react.Callback,
    setLogLevel: /* newLogLevel */ verbose | warning | none => japgolly.scalajs.react.Callback,
    setOptOut: /* isOptingOut */ Boolean => japgolly.scalajs.react.Callback,
    setPosition: (/* lat */ Double, /* lng */ Double) => japgolly.scalajs.react.Callback,
    setSessionAttribute: (/* key */ String, /* value */ String | Double | Boolean | Null) => japgolly.scalajs.react.Callback,
    startNewSession: japgolly.scalajs.react.Callback,
    startTrackingLocation: /* callback */ js.UndefOr[TrackLocationCallback] => japgolly.scalajs.react.Callback,
    stopTrackingLocation: japgolly.scalajs.react.Callback,
    upload: japgolly.scalajs.react.Callback
  ): mParticleInstance = {
    val __obj = js.Dynamic.literal(CommerceEventType = CommerceEventType.asInstanceOf[js.Any], Consent = Consent.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any], IdentityType = IdentityType.asInstanceOf[js.Any], ProductActionType = ProductActionType.asInstanceOf[js.Any], PromotionType = PromotionType.asInstanceOf[js.Any], eCommerce = eCommerce.asInstanceOf[js.Any], endSession = endSession.toJsFn, getAppName = getAppName.toJsFn, getAppVersion = getAppVersion.toJsFn, getDeviceId = getDeviceId.toJsFn, getIntegrationAttributes = js.Any.fromFunction1(getIntegrationAttributes), getVersion = getVersion.toJsFn, init = js.Any.fromFunction3((t0: /* apiKey */ String, t1: /* config */ MPConfiguration, t2: /* instanceName */ js.UndefOr[String]) => (init(t0, t1, t2)).runNow()), isInitialized = isInitialized.toJsFn, logBaseEvent = js.Any.fromFunction2((t0: /* event */ BaseEvent, t1: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (logBaseEvent(t0, t1)).runNow()), logError = js.Any.fromFunction2((t0: /* error */ String | errorObject, t1: /* attrs */ js.UndefOr[SDKEventAttrs]) => (logError(t0, t1)).runNow()), logEvent = js.Any.fromFunction5((t0: /* eventName */ String, t1: /* eventType */ js.UndefOr[EventType], t2: /* eventInfo */ js.UndefOr[SDKEventAttrs], t3: /* customFlags */ js.UndefOr[SDKEventCustomFlags], t4: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (logEvent(t0, t1, t2, t3, t4)).runNow()), logForm = js.Any.fromFunction4((t0: /* selector */ String | HTMLElement, t1: /* eventName */ String, t2: /* eventType */ js.UndefOr[EventType], t3: /* eventInfo */ js.UndefOr[SDKEventAttrs]) => (logForm(t0, t1, t2, t3)).runNow()), logLink = js.Any.fromFunction4((t0: /* selector */ String | HTMLElement, t1: /* eventName */ String, t2: /* eventType */ js.UndefOr[EventType], t3: /* eventInfo */ js.UndefOr[SDKEventAttrs]) => (logLink(t0, t1, t2, t3)).runNow()), logPageView = js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[String], t1: /* attrs */ js.UndefOr[SDKEventAttrs], t2: /* customFlags */ js.UndefOr[SDKEventCustomFlags], t3: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (logPageView(t0, t1, t2, t3)).runNow()), ready = js.Any.fromFunction1((t0: /* callback */ js.Function0[Unit]) => ready(t0).runNow()), reset = reset.toJsFn, sessionManager = sessionManager.asInstanceOf[js.Any], setAppName = js.Any.fromFunction1((t0: /* name */ String) => setAppName(t0).runNow()), setAppVersion = js.Any.fromFunction1((t0: /* version */ String) => setAppVersion(t0).runNow()), setDeviceId = js.Any.fromFunction1((t0: /* uuid */ String) => setDeviceId(t0).runNow()), setIntegrationAttribute = js.Any.fromFunction2((t0: /* integrationId */ Double, t1: /* attrs */ Record[String, Any]) => (setIntegrationAttribute(t0, t1)).runNow()), setLogLevel = js.Any.fromFunction1((t0: /* newLogLevel */ verbose | warning | none) => setLogLevel(t0).runNow()), setOptOut = js.Any.fromFunction1((t0: /* isOptingOut */ Boolean) => setOptOut(t0).runNow()), setPosition = js.Any.fromFunction2((t0: /* lat */ Double, t1: /* lng */ Double) => (setPosition(t0, t1)).runNow()), setSessionAttribute = js.Any.fromFunction2((t0: /* key */ String, t1: /* value */ String | Double | Boolean | Null) => (setSessionAttribute(t0, t1)).runNow()), startNewSession = startNewSession.toJsFn, startTrackingLocation = js.Any.fromFunction1((t0: /* callback */ js.UndefOr[TrackLocationCallback]) => startTrackingLocation(t0).runNow()), stopTrackingLocation = stopTrackingLocation.toJsFn, upload = upload.toJsFn)
    __obj.asInstanceOf[mParticleInstance]
  }
  
  extension [Self <: mParticleInstance](x: Self) {
    
    inline def setCommerceEventType(value: ProductAddToCart): Self = StObject.set(x, "CommerceEventType", value.asInstanceOf[js.Any])
    
    inline def setConsent(value: typingsJapgolly.mparticleWebSdk.anon.CreateCCPAConsent): Self = StObject.set(x, "Consent", value.asInstanceOf[js.Any])
    
    inline def setECommerce(value: typingsJapgolly.mparticleWebSdk.anon.Cart): Self = StObject.set(x, "eCommerce", value.asInstanceOf[js.Any])
    
    inline def setEndSession(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "endSession", value.toJsFn)
    
    inline def setEventType(value: typingsJapgolly.mparticleWebSdk.anon.Location): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setGetAppName(value: CallbackTo[String]): Self = StObject.set(x, "getAppName", value.toJsFn)
    
    inline def setGetAppVersion(value: CallbackTo[String]): Self = StObject.set(x, "getAppVersion", value.toJsFn)
    
    inline def setGetDeviceId(value: CallbackTo[String]): Self = StObject.set(x, "getDeviceId", value.toJsFn)
    
    inline def setGetIntegrationAttributes(value: /* integrationId */ Double => Record[String, Any]): Self = StObject.set(x, "getIntegrationAttributes", js.Any.fromFunction1(value))
    
    inline def setGetVersion(value: CallbackTo[String]): Self = StObject.set(x, "getVersion", value.toJsFn)
    
    inline def setIdentity(value: typingsJapgolly.mparticleWebSdk.anon.AliasUsers): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityType(value: CustomerId): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setInit(
      value: (/* apiKey */ String, /* config */ MPConfiguration, /* instanceName */ js.UndefOr[String]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "init", js.Any.fromFunction3((t0: /* apiKey */ String, t1: /* config */ MPConfiguration, t2: /* instanceName */ js.UndefOr[String]) => (value(t0, t1, t2)).runNow()))
    
    inline def setIsInitialized(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInitialized", value.toJsFn)
    
    inline def setLogBaseEvent(
      value: (/* event */ BaseEvent, /* eventOptions */ js.UndefOr[SDKEventOptions]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "logBaseEvent", js.Any.fromFunction2((t0: /* event */ BaseEvent, t1: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (value(t0, t1)).runNow()))
    
    inline def setLogError(
      value: (/* error */ String | errorObject, /* attrs */ js.UndefOr[SDKEventAttrs]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "logError", js.Any.fromFunction2((t0: /* error */ String | errorObject, t1: /* attrs */ js.UndefOr[SDKEventAttrs]) => (value(t0, t1)).runNow()))
    
    inline def setLogEvent(
      value: (/* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "logEvent", js.Any.fromFunction5((t0: /* eventName */ String, t1: /* eventType */ js.UndefOr[EventType], t2: /* eventInfo */ js.UndefOr[SDKEventAttrs], t3: /* customFlags */ js.UndefOr[SDKEventCustomFlags], t4: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setLogForm(
      value: (/* selector */ String | HTMLElement, /* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "logForm", js.Any.fromFunction4((t0: /* selector */ String | HTMLElement, t1: /* eventName */ String, t2: /* eventType */ js.UndefOr[EventType], t3: /* eventInfo */ js.UndefOr[SDKEventAttrs]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setLogLink(
      value: (/* selector */ String | HTMLElement, /* eventName */ String, /* eventType */ js.UndefOr[EventType], /* eventInfo */ js.UndefOr[SDKEventAttrs]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "logLink", js.Any.fromFunction4((t0: /* selector */ String | HTMLElement, t1: /* eventName */ String, t2: /* eventType */ js.UndefOr[EventType], t3: /* eventInfo */ js.UndefOr[SDKEventAttrs]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setLogPageView(
      value: (/* eventName */ js.UndefOr[String], /* attrs */ js.UndefOr[SDKEventAttrs], /* customFlags */ js.UndefOr[SDKEventCustomFlags], /* eventOptions */ js.UndefOr[SDKEventOptions]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "logPageView", js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[String], t1: /* attrs */ js.UndefOr[SDKEventAttrs], t2: /* customFlags */ js.UndefOr[SDKEventCustomFlags], t3: /* eventOptions */ js.UndefOr[SDKEventOptions]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setProductActionType(value: AddToCart): Self = StObject.set(x, "ProductActionType", value.asInstanceOf[js.Any])
    
    inline def setPromotionType(value: PromotionClick): Self = StObject.set(x, "PromotionType", value.asInstanceOf[js.Any])
    
    inline def setReady(value: /* callback */ js.Function0[Unit] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "ready", js.Any.fromFunction1((t0: /* callback */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setReset(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSessionManager(value: typingsJapgolly.mparticleWebSdk.anon.GetSession): Self = StObject.set(x, "sessionManager", value.asInstanceOf[js.Any])
    
    inline def setSetAppName(value: /* name */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setAppName", js.Any.fromFunction1((t0: /* name */ String) => value(t0).runNow()))
    
    inline def setSetAppVersion(value: /* version */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setAppVersion", js.Any.fromFunction1((t0: /* version */ String) => value(t0).runNow()))
    
    inline def setSetDeviceId(value: /* uuid */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setDeviceId", js.Any.fromFunction1((t0: /* uuid */ String) => value(t0).runNow()))
    
    inline def setSetIntegrationAttribute(
      value: (/* integrationId */ Double, /* attrs */ Record[String, Any]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "setIntegrationAttribute", js.Any.fromFunction2((t0: /* integrationId */ Double, t1: /* attrs */ Record[String, Any]) => (value(t0, t1)).runNow()))
    
    inline def setSetLogLevel(value: /* newLogLevel */ verbose | warning | none => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1((t0: /* newLogLevel */ verbose | warning | none) => value(t0).runNow()))
    
    inline def setSetOptOut(value: /* isOptingOut */ Boolean => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setOptOut", js.Any.fromFunction1((t0: /* isOptingOut */ Boolean) => value(t0).runNow()))
    
    inline def setSetPosition(value: (/* lat */ Double, /* lng */ Double) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction2((t0: /* lat */ Double, t1: /* lng */ Double) => (value(t0, t1)).runNow()))
    
    inline def setSetSessionAttribute(
      value: (/* key */ String, /* value */ String | Double | Boolean | Null) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "setSessionAttribute", js.Any.fromFunction2((t0: /* key */ String, t1: /* value */ String | Double | Boolean | Null) => (value(t0, t1)).runNow()))
    
    inline def setStartNewSession(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "startNewSession", value.toJsFn)
    
    inline def setStartTrackingLocation(value: /* callback */ js.UndefOr[TrackLocationCallback] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "startTrackingLocation", js.Any.fromFunction1((t0: /* callback */ js.UndefOr[TrackLocationCallback]) => value(t0).runNow()))
    
    inline def setStopTrackingLocation(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "stopTrackingLocation", value.toJsFn)
    
    inline def setUpload(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "upload", value.toJsFn)
  }
}
