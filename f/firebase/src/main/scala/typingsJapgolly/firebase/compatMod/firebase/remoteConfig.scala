package typingsJapgolly.firebase.compatMod.firebase

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebase.compatMod.firebase.app.App
import typingsJapgolly.firebase.firebaseStrings.error_
import typingsJapgolly.firebase.firebaseStrings.success_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object remoteConfig {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebase.firebaseStrings.`no-fetch-yet`
    - typingsJapgolly.firebase.firebaseStrings.success_
    - typingsJapgolly.firebase.firebaseStrings.failure
    - typingsJapgolly.firebase.firebaseStrings.throttle
  */
  trait FetchStatus extends StObject
  object FetchStatus {
    
    inline def failure: typingsJapgolly.firebase.firebaseStrings.failure = "failure".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.failure]
    
    inline def `no-fetch-yet`: typingsJapgolly.firebase.firebaseStrings.`no-fetch-yet` = "no-fetch-yet".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.`no-fetch-yet`]
    
    inline def success: success_ = "success".asInstanceOf[success_]
    
    inline def throttle: typingsJapgolly.firebase.firebaseStrings.throttle = "throttle".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.throttle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebase.firebaseStrings.debug
    - typingsJapgolly.firebase.firebaseStrings.error_
    - typingsJapgolly.firebase.firebaseStrings.silent
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typingsJapgolly.firebase.firebaseStrings.debug = "debug".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.debug]
    
    inline def error: error_ = "error".asInstanceOf[error_]
    
    inline def silent: typingsJapgolly.firebase.firebaseStrings.silent = "silent".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.silent]
  }
  
  trait RemoteConfig extends StObject {
    
    /**
      * Makes the last fetched config available to the getters.
      * Returns a promise which resolves to true if the current call activated the fetched configs.
      * If the fetched configs were already activated, the promise will resolve to false.
      */
    def activate(): js.Promise[Boolean]
    
    /**
      * The {@link firebase.app.App app} associated with the `Performance` service
      * instance.
      *
      * @example
      * ```javascript
      * var app = analytics.app;
      * ```
      */
    var app: App
    
    /**
      * Object containing default values for configs.
      */
    var defaultConfig: StringDictionary[String | Double | Boolean]
    
    /**
      * Ensures the last activated config are available to the getters.
      */
    def ensureInitialized(): js.Promise[Unit]
    
    /**
      * Fetches and caches configuration from the Remote Config service.
      */
    def fetch(): js.Promise[Unit]
    
    /**
      * Performs fetch and activate operations, as a convenience.
      * Returns a promise which resolves to true if the current call activated the fetched configs.
      * If the fetched configs were already activated, the promise will resolve to false.
      */
    def fetchAndActivate(): js.Promise[Boolean]
    
    /**
      * The Unix timestamp in milliseconds of the last <i>successful</i> fetch, or negative one if
      * the {@link RemoteConfig} instance either hasn't fetched or initialization
      * is incomplete.
      */
    var fetchTimeMillis: Double
    
    /**
      * Gets all config.
      */
    def getAll(): StringDictionary[Value]
    
    /**
      * Gets the value for the given key as a boolean.
      *
      * Convenience method for calling <code>remoteConfig.getValue(key).asBoolean()</code>.
      */
    def getBoolean(key: String): Boolean
    
    /**
      * Gets the value for the given key as a number.
      *
      * Convenience method for calling <code>remoteConfig.getValue(key).asNumber()</code>.
      */
    def getNumber(key: String): Double
    
    /**
      * Gets the value for the given key as a String.
      *
      * Convenience method for calling <code>remoteConfig.getValue(key).asString()</code>.
      */
    def getString(key: String): String
    
    /**
      * Gets the {@link Value} for the given key.
      */
    def getValue(key: String): Value
    
    /**
      * The status of the last fetch <i>attempt</i>.
      */
    var lastFetchStatus: FetchStatus
    
    /**
      * Defines the log level to use.
      */
    def setLogLevel(logLevel: typingsJapgolly.firebase.compatMod.firebase.remoteConfig.LogLevel): Unit
    
    /**
      * Defines configuration for the Remote Config SDK.
      */
    var settings: Settings
  }
  object RemoteConfig {
    
    inline def apply(
      activate: CallbackTo[js.Promise[Boolean]],
      app: App,
      defaultConfig: StringDictionary[String | Double | Boolean],
      ensureInitialized: CallbackTo[js.Promise[Unit]],
      fetch: CallbackTo[js.Promise[Unit]],
      fetchAndActivate: CallbackTo[js.Promise[Boolean]],
      fetchTimeMillis: Double,
      getAll: CallbackTo[StringDictionary[Value]],
      getBoolean: String => Boolean,
      getNumber: String => Double,
      getString: String => String,
      getValue: String => Value,
      lastFetchStatus: FetchStatus,
      setLogLevel: typingsJapgolly.firebase.compatMod.firebase.remoteConfig.LogLevel => Callback,
      settings: Settings
    ): RemoteConfig = {
      val __obj = js.Dynamic.literal(activate = activate.toJsFn, app = app.asInstanceOf[js.Any], defaultConfig = defaultConfig.asInstanceOf[js.Any], ensureInitialized = ensureInitialized.toJsFn, fetch = fetch.toJsFn, fetchAndActivate = fetchAndActivate.toJsFn, fetchTimeMillis = fetchTimeMillis.asInstanceOf[js.Any], getAll = getAll.toJsFn, getBoolean = js.Any.fromFunction1(getBoolean), getNumber = js.Any.fromFunction1(getNumber), getString = js.Any.fromFunction1(getString), getValue = js.Any.fromFunction1(getValue), lastFetchStatus = lastFetchStatus.asInstanceOf[js.Any], setLogLevel = js.Any.fromFunction1((t0: typingsJapgolly.firebase.compatMod.firebase.remoteConfig.LogLevel) => setLogLevel(t0).runNow()), settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteConfig]
    }
    
    extension [Self <: RemoteConfig](x: Self) {
      
      inline def setActivate(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "activate", value.toJsFn)
      
      inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setDefaultConfig(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
      
      inline def setEnsureInitialized(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "ensureInitialized", value.toJsFn)
      
      inline def setFetch(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "fetch", value.toJsFn)
      
      inline def setFetchAndActivate(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "fetchAndActivate", value.toJsFn)
      
      inline def setFetchTimeMillis(value: Double): Self = StObject.set(x, "fetchTimeMillis", value.asInstanceOf[js.Any])
      
      inline def setGetAll(value: CallbackTo[StringDictionary[Value]]): Self = StObject.set(x, "getAll", value.toJsFn)
      
      inline def setGetBoolean(value: String => Boolean): Self = StObject.set(x, "getBoolean", js.Any.fromFunction1(value))
      
      inline def setGetNumber(value: String => Double): Self = StObject.set(x, "getNumber", js.Any.fromFunction1(value))
      
      inline def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: String => Value): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setLastFetchStatus(value: FetchStatus): Self = StObject.set(x, "lastFetchStatus", value.asInstanceOf[js.Any])
      
      inline def setSetLogLevel(value: typingsJapgolly.firebase.compatMod.firebase.remoteConfig.LogLevel => Callback): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1((t0: typingsJapgolly.firebase.compatMod.firebase.remoteConfig.LogLevel) => value(t0).runNow()))
      
      inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait Settings extends StObject {
    
    /**
      * Defines the maximum amount of milliseconds to wait for a response when fetching
      * configuration from the Remote Config server. Defaults to 60000 (One minute).
      */
    var fetchTimeoutMillis: Double
    
    /**
      * Defines the maximum age in milliseconds of an entry in the config cache before
      * it is considered stale. Defaults to 43200000 (Twelve hours).
      */
    var minimumFetchIntervalMillis: Double
  }
  object Settings {
    
    inline def apply(fetchTimeoutMillis: Double, minimumFetchIntervalMillis: Double): Settings = {
      val __obj = js.Dynamic.literal(fetchTimeoutMillis = fetchTimeoutMillis.asInstanceOf[js.Any], minimumFetchIntervalMillis = minimumFetchIntervalMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setFetchTimeoutMillis(value: Double): Self = StObject.set(x, "fetchTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setMinimumFetchIntervalMillis(value: Double): Self = StObject.set(x, "minimumFetchIntervalMillis", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    /**
      * Gets the value as a boolean.
      *
      * The following values (case insensitive) are interpreted as true:
      * "1", "true", "t", "yes", "y", "on". Other values are interpreted as false.
      */
    def asBoolean(): Boolean
    
    /**
      * Gets the value as a number. Comparable to calling <code>Number(value) || 0</code>.
      */
    def asNumber(): Double
    
    /**
      * Gets the value as a string.
      */
    def asString(): String
    
    /**
      * Gets the {@link ValueSource} for the given key.
      */
    def getSource(): ValueSource
  }
  object Value {
    
    inline def apply(
      asBoolean: CallbackTo[Boolean],
      asNumber: CallbackTo[Double],
      asString: CallbackTo[String],
      getSource: CallbackTo[ValueSource]
    ): Value = {
      val __obj = js.Dynamic.literal(asBoolean = asBoolean.toJsFn, asNumber = asNumber.toJsFn, asString = asString.toJsFn, getSource = getSource.toJsFn)
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setAsBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "asBoolean", value.toJsFn)
      
      inline def setAsNumber(value: CallbackTo[Double]): Self = StObject.set(x, "asNumber", value.toJsFn)
      
      inline def setAsString(value: CallbackTo[String]): Self = StObject.set(x, "asString", value.toJsFn)
      
      inline def setGetSource(value: CallbackTo[ValueSource]): Self = StObject.set(x, "getSource", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebase.firebaseStrings.static
    - typingsJapgolly.firebase.firebaseStrings.default
    - typingsJapgolly.firebase.firebaseStrings.remote
  */
  trait ValueSource extends StObject
  object ValueSource {
    
    inline def default: typingsJapgolly.firebase.firebaseStrings.default = "default".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.default]
    
    inline def remote: typingsJapgolly.firebase.firebaseStrings.remote = "remote".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.remote]
    
    inline def static: typingsJapgolly.firebase.firebaseStrings.static = "static".asInstanceOf[typingsJapgolly.firebase.firebaseStrings.static]
  }
}
