package typingsJapgolly.amplitudeJs

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.DISABLE
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.ERROR
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.INFO
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.Lax
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.None
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.Strict
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.WARN
import typingsJapgolly.amplitudeJs.amplitudeJsStrings._empty
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.cookies
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.localStorage
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.none_
import typingsJapgolly.amplitudeJs.amplitudeJsStrings.sessionStorage
import typingsJapgolly.amplitudeJs.anon.Branch
import typingsJapgolly.amplitudeJs.anon.Carrier
import typingsJapgolly.amplitudeJs.anon.Name
import typingsJapgolly.amplitudeJs.anon.Reason
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amplitude-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("amplitude-js", "AmplitudeClient")
  @js.native
  open class AmplitudeClient () extends StObject {
    def this(instanceName: String) = this()
    
    var Identify: Instantiable0[Identify_] = js.native
    
    var Revenue: Instantiable0[typingsJapgolly.amplitudeJs.mod.Revenue] = js.native
    
    def clearStorage(): Boolean = js.native
    
    def clearUserProperties(): Unit = js.native
    
    var cookieStorage: CookieStorage = js.native
    
    def enableTracking(): Unit = js.native
    
    def getDeviceId(): String = js.native
    
    def getSessionId(): Double = js.native
    
    def getUserId(): String = js.native
    
    def groupIdentify(groupType: String, groupName: String, identify: Identify_): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: String,
      identify: Identify_,
      callback: Unit,
      errorCallback: Unit,
      outOfSession: Boolean
    ): Unit = js.native
    def groupIdentify(groupType: String, groupName: String, identify: Identify_, callback: Unit, errorCallback: Callback): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: String,
      identify: Identify_,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): Unit = js.native
    def groupIdentify(groupType: String, groupName: String, identify: Identify_, callback: Callback): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: String,
      identify: Identify_,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: String,
      identify: Identify_,
      callback: Callback,
      errorCallback: Callback
    ): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: String,
      identify: Identify_,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): Unit = js.native
    def groupIdentify(groupType: String, groupName: js.Array[String], identify: Identify_): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: js.Array[String],
      identify: Identify_,
      callback: Unit,
      errorCallback: Unit,
      outOfSession: Boolean
    ): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: js.Array[String],
      identify: Identify_,
      callback: Unit,
      errorCallback: Callback
    ): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: js.Array[String],
      identify: Identify_,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): Unit = js.native
    def groupIdentify(groupType: String, groupName: js.Array[String], identify: Identify_, callback: Callback): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: js.Array[String],
      identify: Identify_,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: js.Array[String],
      identify: Identify_,
      callback: Callback,
      errorCallback: Callback
    ): Unit = js.native
    def groupIdentify(
      groupType: String,
      groupName: js.Array[String],
      identify: Identify_,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): Unit = js.native
    
    def identify(identify: Identify_): Unit = js.native
    def identify(identify: Identify_, callback: Unit, errorCallback: Unit, outOfSession: Boolean): Unit = js.native
    def identify(identify: Identify_, callback: Unit, errorCallback: Callback): Unit = js.native
    def identify(identify: Identify_, callback: Unit, errorCallback: Callback, outOfSession: Boolean): Unit = js.native
    def identify(identify: Identify_, callback: Callback): Unit = js.native
    def identify(identify: Identify_, callback: Callback, errorCallback: Unit, outOfSession: Boolean): Unit = js.native
    def identify(identify: Identify_, callback: Callback, errorCallback: Callback): Unit = js.native
    def identify(identify: Identify_, callback: Callback, errorCallback: Callback, outOfSession: Boolean): Unit = js.native
    
    def init(apiKey: String): Unit = js.native
    def init(apiKey: String, userId: String): Unit = js.native
    def init(apiKey: String, userId: String, config: Unit, callback: js.Function1[/* client */ this.type, Unit]): Unit = js.native
    def init(apiKey: String, userId: String, config: Config): Unit = js.native
    def init(
      apiKey: String,
      userId: String,
      config: Config,
      callback: js.Function1[/* client */ this.type, Unit]
    ): Unit = js.native
    def init(apiKey: String, userId: Unit, config: Unit, callback: js.Function1[/* client */ this.type, Unit]): Unit = js.native
    def init(apiKey: String, userId: Unit, config: Config): Unit = js.native
    def init(apiKey: String, userId: Unit, config: Config, callback: js.Function1[/* client */ this.type, Unit]): Unit = js.native
    
    def isNewSession(): Boolean = js.native
    
    def logEvent(event: String): LogReturn = js.native
    def logEvent(event: String, data: Any): LogReturn = js.native
    def logEvent(event: String, data: Any, callback: Unit, errorCallback: Unit, outOfSession: Boolean): LogReturn = js.native
    def logEvent(event: String, data: Any, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEvent(event: String, data: Any, callback: Unit, errorCallback: Callback, outOfSession: Boolean): LogReturn = js.native
    def logEvent(event: String, data: Any, callback: Callback): LogReturn = js.native
    def logEvent(event: String, data: Any, callback: Callback, errorCallback: Unit, outOfSession: Boolean): LogReturn = js.native
    def logEvent(event: String, data: Any, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEvent(event: String, data: Any, callback: Callback, errorCallback: Callback, outOfSession: Boolean): LogReturn = js.native
    def logEvent(event: String, data: Unit, callback: Unit, errorCallback: Unit, outOfSession: Boolean): LogReturn = js.native
    def logEvent(event: String, data: Unit, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEvent(event: String, data: Unit, callback: Unit, errorCallback: Callback, outOfSession: Boolean): LogReturn = js.native
    def logEvent(event: String, data: Unit, callback: Callback): LogReturn = js.native
    def logEvent(event: String, data: Unit, callback: Callback, errorCallback: Unit, outOfSession: Boolean): LogReturn = js.native
    def logEvent(event: String, data: Unit, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEvent(event: String, data: Unit, callback: Callback, errorCallback: Callback, outOfSession: Boolean): LogReturn = js.native
    
    def logEventWithGroups(event: String): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any, groups: Any): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any, groups: Any, callback: Unit, errorCallback: Unit, outOfSession: Boolean): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any, groups: Any, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Any,
      groups: Any,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any, groups: Any, callback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Any,
      groups: Any,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any, groups: Any, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Any,
      groups: Any,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any, groups: Unit, callback: Unit, errorCallback: Unit, outOfSession: Boolean): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any, groups: Unit, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Any,
      groups: Unit,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any, groups: Unit, callback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Any,
      groups: Unit,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Any, groups: Unit, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Any,
      groups: Unit,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: Any): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: Any, callback: Unit, errorCallback: Unit, outOfSession: Boolean): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: Any, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Unit,
      groups: Any,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: Any, callback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Unit,
      groups: Any,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: Any, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Unit,
      groups: Any,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Unit,
      groups: Unit,
      callback: Unit,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: Unit, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Unit,
      groups: Unit,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: Unit, callback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Unit,
      groups: Unit,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: Unit, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: Unit,
      groups: Unit,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    
    def logEventWithTimestamp(event: String): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Any): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Any, timestamp: Double): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Any,
      timestamp: Double,
      callback: Unit,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Any, timestamp: Double, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Any,
      timestamp: Double,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Any, timestamp: Double, callback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Any,
      timestamp: Double,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Any, timestamp: Double, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Any,
      timestamp: Double,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Any,
      timestamp: Unit,
      callback: Unit,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Any, timestamp: Unit, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Any,
      timestamp: Unit,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Any, timestamp: Unit, callback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Any,
      timestamp: Unit,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Any, timestamp: Unit, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Any,
      timestamp: Unit,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Double): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Unit,
      timestamp: Double,
      callback: Unit,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Double, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Unit,
      timestamp: Double,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Double, callback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Unit,
      timestamp: Double,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Double, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Unit,
      timestamp: Double,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Unit,
      timestamp: Unit,
      callback: Unit,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Unit, callback: Unit, errorCallback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Unit,
      timestamp: Unit,
      callback: Unit,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Unit, callback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Unit,
      timestamp: Unit,
      callback: Callback,
      errorCallback: Unit,
      outOfSession: Boolean
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Unit, callback: Callback, errorCallback: Callback): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: Unit,
      timestamp: Unit,
      callback: Callback,
      errorCallback: Callback,
      outOfSession: Boolean
    ): LogReturn = js.native
    
    /**
      * @deprecated Use `logRevenueV2` instead
      */
    def logRevenue(price: Double, quantity: Double, product: String): LogReturn = js.native
    
    def logRevenueV2(revenue_obj: Revenue): LogReturn = js.native
    
    def onInit(callback: js.Function1[/* client */ this.type, Unit]): Unit = js.native
    
    def onNewSessionStart(callback: js.Function1[/* client */ this.type, Unit]): Unit = js.native
    
    var options: Config = js.native
    
    def regenerateDeviceId(): Unit = js.native
    
    def resetSessionId(): Unit = js.native
    
    def setDeviceId(id: String): Unit = js.native
    
    def setDomain(domain: String): Unit = js.native
    
    def setEventUploadThreshold(eventUploadThreshold: Double): Unit = js.native
    
    /**
      * @deprecated Use `setUserProperties` instead
      */
    def setGlobalUserProperties(properties: Any): Unit = js.native
    
    def setGroup(groupType: String, groupName: String): Unit = js.native
    def setGroup(groupType: String, groupName: js.Array[String]): Unit = js.native
    
    def setLibrary(): Unit = js.native
    def setLibrary(name: String): Unit = js.native
    def setLibrary(name: String, version: String): Unit = js.native
    def setLibrary(name: Unit, version: String): Unit = js.native
    
    def setMinTimeBetweenSessionsMillis(timeInMillis: Double): Unit = js.native
    
    def setOptOut(enable: Boolean): Unit = js.native
    
    def setServerUrl(serverUrl: String): Unit = js.native
    
    def setServerZone(serverZone: ServerZone): Unit = js.native
    def setServerZone(serverZone: ServerZone, serverZoneBasedApi: Boolean): Unit = js.native
    
    def setSessionId(sessionId: Double): Unit = js.native
    
    def setTransport(transport: Transport): Unit = js.native
    
    def setUseDynamicConfig(useDynamicConfig: Boolean): Unit = js.native
    
    def setUserId(): Unit = js.native
    def setUserId(userId: String): Unit = js.native
    def setUserId(userId: String, startNewSession: Boolean): Unit = js.native
    def setUserId(userId: Null, startNewSession: Boolean): Unit = js.native
    
    def setUserProperties(properties: Any): Unit = js.native
    
    def setVersionName(versionName: String): Unit = js.native
  }
  
  @JSImport("amplitude-js", "Identify")
  @js.native
  open class Identify_ () extends StObject {
    
    def add(key: String, value: String): Identify_ = js.native
    /** increment a user property by a given value (can also be negative to decrement). */
    def add(key: String, value: Double): Identify_ = js.native
    
    def append(key: String, value: String): Identify_ = js.native
    def append(key: String, value: js.Array[Any]): Identify_ = js.native
    def append(key: String, value: js.Object): Identify_ = js.native
    /** Append a value or values to a user property */
    def append(key: String, value: Double): Identify_ = js.native
    
    def preInsert(key: String, value: String): Identify_ = js.native
    def preInsert(key: String, value: js.Array[Any]): Identify_ = js.native
    def preInsert(key: String, value: js.Object): Identify_ = js.native
    /** Preinsert a value or values to a user property */
    def preInsert(key: String, value: Double): Identify_ = js.native
    
    def prepend(key: String, value: String): Identify_ = js.native
    def prepend(key: String, value: js.Array[Any]): Identify_ = js.native
    def prepend(key: String, value: js.Object): Identify_ = js.native
    /** Prepend a value or values to a user property */
    def prepend(key: String, value: Boolean): Identify_ = js.native
    def prepend(key: String, value: Double): Identify_ = js.native
    
    def set(key: String, value: String): Identify_ = js.native
    def set(key: String, value: js.Array[Any]): Identify_ = js.native
    def set(key: String, value: js.Object): Identify_ = js.native
    /** Sets the value of a given user property */
    def set(key: String, value: Boolean): Identify_ = js.native
    def set(key: String, value: Double): Identify_ = js.native
    
    def setOnce(key: String, value: String): Identify_ = js.native
    def setOnce(key: String, value: js.Array[Any]): Identify_ = js.native
    def setOnce(key: String, value: js.Object): Identify_ = js.native
    /** Sets the value of a given user property only once */
    def setOnce(key: String, value: Boolean): Identify_ = js.native
    def setOnce(key: String, value: Double): Identify_ = js.native
    
    /** Unset and remove a user property */
    def unset(key: String): Identify_ = js.native
  }
  
  @JSImport("amplitude-js", "Revenue")
  @js.native
  open class Revenue () extends StObject {
    
    def setEventProperties(eventProperties: Any): Revenue = js.native
    
    def setPrice(price: Double): Revenue = js.native
    
    def setProductId(productId: String): Revenue = js.native
    
    def setQuantity(quantity: Double): Revenue = js.native
    
    def setRevenueType(revenueType: String): Revenue = js.native
  }
  
  @JSImport("amplitude-js", "__VERSION__")
  @js.native
  val __VERSION__ : String = js.native
  
  inline def clearUserProperties(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearUserProperties")().asInstanceOf[Unit]
  
  inline def getInstance(): AmplitudeClient = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[AmplitudeClient]
  inline def getInstance(instanceName: String): AmplitudeClient = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(instanceName.asInstanceOf[js.Any]).asInstanceOf[AmplitudeClient]
  
  inline def getSessionId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionId")().asInstanceOf[Double]
  
  inline def identify(identify: Identify_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("identify")(identify.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def identify(identify: Identify_, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(identify.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def init(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def init(apiKey: String, userId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    apiKey: String,
    userId: String,
    options: Unit,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(apiKey: String, userId: String, options: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    apiKey: String,
    userId: String,
    options: Config,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    apiKey: String,
    userId: Unit,
    options: Unit,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(apiKey: String, userId: Unit, options: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    apiKey: String,
    userId: Unit,
    options: Config,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNewSession(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewSession")().asInstanceOf[Boolean]
  
  inline def logEvent(event: String): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
  inline def logEvent(event: String, data: Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEvent(event: String, data: Any, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEvent(event: String, data: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  
  inline def logEventWithGroups(event: String): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Any, groups: Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Any, groups: Any, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Any, groups: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Unit, groups: Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Unit, groups: Any, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Unit, groups: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  
  inline def logEventWithTimestamp(event: String): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Any, timestamp: Double): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Any, timestamp: Double, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Any, timestamp: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Unit, timestamp: Double): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Unit, timestamp: Double, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Unit, timestamp: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  
  inline def logRevenue(pric: Double, quantity: Double, product: String): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logRevenue")(pric.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], product.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  
  inline def logRevenueV2(revenue_obj: Revenue): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logRevenueV2")(revenue_obj.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
  
  @JSImport("amplitude-js", "options")
  @js.native
  val options: Config = js.native
  
  inline def regenerateDeviceId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regenerateDeviceId")().asInstanceOf[Unit]
  
  inline def setDeviceId(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDeviceId")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDomain(domain: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGlobalUserProperties(properties: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalUserProperties")(properties.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGroup(groupType: String, groupName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGroup")(groupType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setGroup(groupType: String, groupName: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGroup")(groupType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOptOut(optOut: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptOut")(optOut.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUserId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")().asInstanceOf[Unit]
  inline def setUserId(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUserProperties(properties: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(properties.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setVersionName(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersionName")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Callback = js.Function3[
    /* responseCode */ Double, 
    /* responseBody */ String, 
    /* details */ js.UndefOr[Reason], 
    Unit
  ]
  
  trait Config extends StObject {
    
    var apiEndpoint: js.UndefOr[String] = js.undefined
    
    var batchEvents: js.UndefOr[Boolean] = js.undefined
    
    var cookieExpiration: js.UndefOr[Double] = js.undefined
    
    var cookieForceUpgrade: js.UndefOr[Boolean] = js.undefined
    
    var cookieName: js.UndefOr[String] = js.undefined
    
    var deferInitialization: js.UndefOr[Boolean] = js.undefined
    
    var deviceId: js.UndefOr[String] = js.undefined
    
    var deviceIdFromUrlParam: js.UndefOr[Boolean] = js.undefined
    
    var disableCookies: js.UndefOr[Boolean] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var eventUploadPeriodMillis: js.UndefOr[Double] = js.undefined
    
    var eventUploadThreshold: js.UndefOr[Double] = js.undefined
    
    var forceHttps: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var includeFbclid: js.UndefOr[Boolean] = js.undefined
    
    var includeGclid: js.UndefOr[Boolean] = js.undefined
    
    var includeReferrer: js.UndefOr[Boolean] = js.undefined
    
    var includeUtm: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var library: js.UndefOr[Name] = js.undefined
    
    var logAttributionCapturedEvent: js.UndefOr[Boolean] = js.undefined
    
    var logLevel: js.UndefOr[DISABLE | ERROR | WARN | INFO] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExitPage: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var optOut: js.UndefOr[Boolean] = js.undefined
    
    var plan: js.UndefOr[Branch] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var sameSiteCookie: js.UndefOr[Lax | Strict | None] = js.undefined
    
    var saveEvents: js.UndefOr[Boolean] = js.undefined
    
    var saveParamsReferrerOncePerSession: js.UndefOr[Boolean] = js.undefined
    
    var savedMaxCount: js.UndefOr[Double] = js.undefined
    
    var secureCookie: js.UndefOr[Boolean] = js.undefined
    
    var serverZone: js.UndefOr[ServerZone] = js.undefined
    
    var serverZoneBasedApi: js.UndefOr[Boolean] = js.undefined
    
    var sessionId: js.UndefOr[Double | Null] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var storage: js.UndefOr[_empty | cookies | localStorage | sessionStorage | none_] = js.undefined
    
    var trackingOptions: js.UndefOr[Carrier] = js.undefined
    
    var transport: js.UndefOr[Transport] = js.undefined
    
    var unsentIdentifyKey: js.UndefOr[String] = js.undefined
    
    var unsentKey: js.UndefOr[String] = js.undefined
    
    var unsetParamsReferrerOnNewSession: js.UndefOr[Boolean] = js.undefined
    
    var uploadBatchSize: js.UndefOr[Double] = js.undefined
    
    var useDynamicConfig: js.UndefOr[Boolean] = js.undefined
    
    var useNativeDeviceInfo: js.UndefOr[Boolean] = js.undefined
    
    var userId: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      inline def setBatchEvents(value: Boolean): Self = StObject.set(x, "batchEvents", value.asInstanceOf[js.Any])
      
      inline def setBatchEventsUndefined: Self = StObject.set(x, "batchEvents", js.undefined)
      
      inline def setCookieExpiration(value: Double): Self = StObject.set(x, "cookieExpiration", value.asInstanceOf[js.Any])
      
      inline def setCookieExpirationUndefined: Self = StObject.set(x, "cookieExpiration", js.undefined)
      
      inline def setCookieForceUpgrade(value: Boolean): Self = StObject.set(x, "cookieForceUpgrade", value.asInstanceOf[js.Any])
      
      inline def setCookieForceUpgradeUndefined: Self = StObject.set(x, "cookieForceUpgrade", js.undefined)
      
      inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setDeferInitialization(value: Boolean): Self = StObject.set(x, "deferInitialization", value.asInstanceOf[js.Any])
      
      inline def setDeferInitializationUndefined: Self = StObject.set(x, "deferInitialization", js.undefined)
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdFromUrlParam(value: Boolean): Self = StObject.set(x, "deviceIdFromUrlParam", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdFromUrlParamUndefined: Self = StObject.set(x, "deviceIdFromUrlParam", js.undefined)
      
      inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      inline def setDisableCookies(value: Boolean): Self = StObject.set(x, "disableCookies", value.asInstanceOf[js.Any])
      
      inline def setDisableCookiesUndefined: Self = StObject.set(x, "disableCookies", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEventUploadPeriodMillis(value: Double): Self = StObject.set(x, "eventUploadPeriodMillis", value.asInstanceOf[js.Any])
      
      inline def setEventUploadPeriodMillisUndefined: Self = StObject.set(x, "eventUploadPeriodMillis", js.undefined)
      
      inline def setEventUploadThreshold(value: Double): Self = StObject.set(x, "eventUploadThreshold", value.asInstanceOf[js.Any])
      
      inline def setEventUploadThresholdUndefined: Self = StObject.set(x, "eventUploadThreshold", js.undefined)
      
      inline def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
      
      inline def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIncludeFbclid(value: Boolean): Self = StObject.set(x, "includeFbclid", value.asInstanceOf[js.Any])
      
      inline def setIncludeFbclidUndefined: Self = StObject.set(x, "includeFbclid", js.undefined)
      
      inline def setIncludeGclid(value: Boolean): Self = StObject.set(x, "includeGclid", value.asInstanceOf[js.Any])
      
      inline def setIncludeGclidUndefined: Self = StObject.set(x, "includeGclid", js.undefined)
      
      inline def setIncludeReferrer(value: Boolean): Self = StObject.set(x, "includeReferrer", value.asInstanceOf[js.Any])
      
      inline def setIncludeReferrerUndefined: Self = StObject.set(x, "includeReferrer", js.undefined)
      
      inline def setIncludeUtm(value: Boolean): Self = StObject.set(x, "includeUtm", value.asInstanceOf[js.Any])
      
      inline def setIncludeUtmUndefined: Self = StObject.set(x, "includeUtm", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLibrary(value: Name): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
      
      inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
      
      inline def setLogAttributionCapturedEvent(value: Boolean): Self = StObject.set(x, "logAttributionCapturedEvent", value.asInstanceOf[js.Any])
      
      inline def setLogAttributionCapturedEventUndefined: Self = StObject.set(x, "logAttributionCapturedEvent", js.undefined)
      
      inline def setLogLevel(value: DISABLE | ERROR | WARN | INFO): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setOnError(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "onError", value.toJsFn)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnExitPage(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "onExitPage", value.toJsFn)
      
      inline def setOnExitPageUndefined: Self = StObject.set(x, "onExitPage", js.undefined)
      
      inline def setOptOut(value: Boolean): Self = StObject.set(x, "optOut", value.asInstanceOf[js.Any])
      
      inline def setOptOutUndefined: Self = StObject.set(x, "optOut", js.undefined)
      
      inline def setPlan(value: Branch): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setSameSiteCookie(value: Lax | Strict | None): Self = StObject.set(x, "sameSiteCookie", value.asInstanceOf[js.Any])
      
      inline def setSameSiteCookieUndefined: Self = StObject.set(x, "sameSiteCookie", js.undefined)
      
      inline def setSaveEvents(value: Boolean): Self = StObject.set(x, "saveEvents", value.asInstanceOf[js.Any])
      
      inline def setSaveEventsUndefined: Self = StObject.set(x, "saveEvents", js.undefined)
      
      inline def setSaveParamsReferrerOncePerSession(value: Boolean): Self = StObject.set(x, "saveParamsReferrerOncePerSession", value.asInstanceOf[js.Any])
      
      inline def setSaveParamsReferrerOncePerSessionUndefined: Self = StObject.set(x, "saveParamsReferrerOncePerSession", js.undefined)
      
      inline def setSavedMaxCount(value: Double): Self = StObject.set(x, "savedMaxCount", value.asInstanceOf[js.Any])
      
      inline def setSavedMaxCountUndefined: Self = StObject.set(x, "savedMaxCount", js.undefined)
      
      inline def setSecureCookie(value: Boolean): Self = StObject.set(x, "secureCookie", value.asInstanceOf[js.Any])
      
      inline def setSecureCookieUndefined: Self = StObject.set(x, "secureCookie", js.undefined)
      
      inline def setServerZone(value: ServerZone): Self = StObject.set(x, "serverZone", value.asInstanceOf[js.Any])
      
      inline def setServerZoneBasedApi(value: Boolean): Self = StObject.set(x, "serverZoneBasedApi", value.asInstanceOf[js.Any])
      
      inline def setServerZoneBasedApiUndefined: Self = StObject.set(x, "serverZoneBasedApi", js.undefined)
      
      inline def setServerZoneUndefined: Self = StObject.set(x, "serverZone", js.undefined)
      
      inline def setSessionId(value: Double): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      inline def setStorage(value: _empty | cookies | localStorage | sessionStorage | none_): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      inline def setTrackingOptions(value: Carrier): Self = StObject.set(x, "trackingOptions", value.asInstanceOf[js.Any])
      
      inline def setTrackingOptionsUndefined: Self = StObject.set(x, "trackingOptions", js.undefined)
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setUnsentIdentifyKey(value: String): Self = StObject.set(x, "unsentIdentifyKey", value.asInstanceOf[js.Any])
      
      inline def setUnsentIdentifyKeyUndefined: Self = StObject.set(x, "unsentIdentifyKey", js.undefined)
      
      inline def setUnsentKey(value: String): Self = StObject.set(x, "unsentKey", value.asInstanceOf[js.Any])
      
      inline def setUnsentKeyUndefined: Self = StObject.set(x, "unsentKey", js.undefined)
      
      inline def setUnsetParamsReferrerOnNewSession(value: Boolean): Self = StObject.set(x, "unsetParamsReferrerOnNewSession", value.asInstanceOf[js.Any])
      
      inline def setUnsetParamsReferrerOnNewSessionUndefined: Self = StObject.set(x, "unsetParamsReferrerOnNewSession", js.undefined)
      
      inline def setUploadBatchSize(value: Double): Self = StObject.set(x, "uploadBatchSize", value.asInstanceOf[js.Any])
      
      inline def setUploadBatchSizeUndefined: Self = StObject.set(x, "uploadBatchSize", js.undefined)
      
      inline def setUseDynamicConfig(value: Boolean): Self = StObject.set(x, "useDynamicConfig", value.asInstanceOf[js.Any])
      
      inline def setUseDynamicConfigUndefined: Self = StObject.set(x, "useDynamicConfig", js.undefined)
      
      inline def setUseNativeDeviceInfo(value: Boolean): Self = StObject.set(x, "useNativeDeviceInfo", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDeviceInfoUndefined: Self = StObject.set(x, "useNativeDeviceInfo", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  @js.native
  trait CookieStorage extends StObject {
    
    def get(name: String): Any = js.native
    
    def options(): CookieStorageOptions = js.native
    def options(opts: CookieStorageOptions): Unit = js.native
    
    def remove(name: String): Boolean = js.native
    
    def reset(): Unit = js.native
    
    def set(name: String, value: Any): Boolean = js.native
  }
  
  trait CookieStorageOptions extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expirationDays: js.UndefOr[Double] = js.undefined
    
    var sameSite: js.UndefOr[Lax | Strict | None] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieStorageOptions {
    
    inline def apply(): CookieStorageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieStorageOptions]
    }
    
    extension [Self <: CookieStorageOptions](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpirationDays(value: Double): Self = StObject.set(x, "expirationDays", value.asInstanceOf[js.Any])
      
      inline def setExpirationDaysUndefined: Self = StObject.set(x, "expirationDays", js.undefined)
      
      inline def setSameSite(value: Lax | Strict | None): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  type LogReturn = js.UndefOr[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.amplitudeJs.amplitudeJsStrings.EU
    - typingsJapgolly.amplitudeJs.amplitudeJsStrings.US
  */
  trait ServerZone extends StObject
  object ServerZone {
    
    inline def EU: typingsJapgolly.amplitudeJs.amplitudeJsStrings.EU = "EU".asInstanceOf[typingsJapgolly.amplitudeJs.amplitudeJsStrings.EU]
    
    inline def US: typingsJapgolly.amplitudeJs.amplitudeJsStrings.US = "US".asInstanceOf[typingsJapgolly.amplitudeJs.amplitudeJsStrings.US]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.amplitudeJs.amplitudeJsStrings.http
    - typingsJapgolly.amplitudeJs.amplitudeJsStrings.beacon
  */
  trait Transport extends StObject
  object Transport {
    
    inline def beacon: typingsJapgolly.amplitudeJs.amplitudeJsStrings.beacon = "beacon".asInstanceOf[typingsJapgolly.amplitudeJs.amplitudeJsStrings.beacon]
    
    inline def http: typingsJapgolly.amplitudeJs.amplitudeJsStrings.http = "http".asInstanceOf[typingsJapgolly.amplitudeJs.amplitudeJsStrings.http]
  }
}
