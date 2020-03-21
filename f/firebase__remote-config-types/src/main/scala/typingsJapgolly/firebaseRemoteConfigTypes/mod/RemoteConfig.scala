package typingsJapgolly.firebaseRemoteConfigTypes.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfig extends js.Object {
  /**
    * Object containing default values for conigs.
    */
  var defaultConfig: StringDictionary[String | Double | Boolean]
  /**
    * The Unix timestamp in milliseconds of the last <i>successful</i> fetch, or negative one if
    * the {@link RemoteConfig} instance either hasn't fetched or initialization
    * is incomplete.
    */
  var fetchTimeMillis: Double
  /**
    * The status of the last fetch <i>attempt</i>.
    */
  var lastFetchStatus: FetchStatus
  /**
    * Defines configuration for the Remote Config SDK.
    */
  var settings: Settings
  /**
    * Makes the last fetched config available to the getters.
    * Returns a promise which resolves to true if the current call activated the fetched configs.
    * If the fetched configs were already activated, the promise will resolve to false.
    */
  def activate(): js.Promise[Boolean]
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
    * Defines the log level to use.
    */
  def setLogLevel(logLevel: LogLevel): Unit
}

object RemoteConfig {
  @scala.inline
  def apply(
    activate: CallbackTo[js.Promise[Boolean]],
    defaultConfig: StringDictionary[String | Double | Boolean],
    ensureInitialized: CallbackTo[js.Promise[Unit]],
    fetch: CallbackTo[js.Promise[Unit]],
    fetchAndActivate: CallbackTo[js.Promise[Boolean]],
    fetchTimeMillis: Double,
    getAll: CallbackTo[StringDictionary[Value]],
    getBoolean: String => CallbackTo[Boolean],
    getNumber: String => CallbackTo[Double],
    getString: String => CallbackTo[String],
    getValue: String => CallbackTo[Value],
    lastFetchStatus: FetchStatus,
    setLogLevel: LogLevel => Callback,
    settings: Settings
  ): RemoteConfig = {
    val __obj = js.Dynamic.literal(defaultConfig = defaultConfig.asInstanceOf[js.Any], fetchTimeMillis = fetchTimeMillis.asInstanceOf[js.Any], lastFetchStatus = lastFetchStatus.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("activate")(activate.toJsFn)
    __obj.updateDynamic("ensureInitialized")(ensureInitialized.toJsFn)
    __obj.updateDynamic("fetch")(fetch.toJsFn)
    __obj.updateDynamic("fetchAndActivate")(fetchAndActivate.toJsFn)
    __obj.updateDynamic("getAll")(getAll.toJsFn)
    __obj.updateDynamic("getBoolean")(js.Any.fromFunction1((t0: java.lang.String) => getBoolean(t0).runNow()))
    __obj.updateDynamic("getNumber")(js.Any.fromFunction1((t0: java.lang.String) => getNumber(t0).runNow()))
    __obj.updateDynamic("getString")(js.Any.fromFunction1((t0: java.lang.String) => getString(t0).runNow()))
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: java.lang.String) => getValue(t0).runNow()))
    __obj.updateDynamic("setLogLevel")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseRemoteConfigTypes.mod.LogLevel) => setLogLevel(t0).runNow()))
    __obj.asInstanceOf[RemoteConfig]
  }
}

