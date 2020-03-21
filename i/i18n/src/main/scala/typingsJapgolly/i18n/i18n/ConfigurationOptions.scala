package typingsJapgolly.i18n.i18n

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOptions extends js.Object {
  /**
    * Hash to specify different aliases for i18n's internal methods to apply on the request/response objects (method -> alias).
    * Note that this will *not* overwrite existing properties with the same name.
    * @default undefined
    */
  var api: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Watch for changes in json files to reload locale on updates
    * @default false
    */
  var autoReload: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets a custom cookie name to parse locale settings from
    * @default null
    */
  var cookie: js.UndefOr[String] = js.undefined
  /**
    * Alter a site wide default locale
    * @default "en"
    */
  var defaultLocale: js.UndefOr[String] = js.undefined
  /**
    * Where to store json files, relative to modules directory
    * @default "./locales"
    */
  var directory: js.UndefOr[String] = js.undefined
  /**
    * Control mode on directory creation. Setting has no effect on win.
    * @default null
    */
  var directoryPermissions: js.UndefOr[String] = js.undefined
  /**
    * Setting extension of json files (you might want to set this to '.js' according to webtranslateit)
    * @default ".json"
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * Language fallback map
    * @default {}
    */
  var fallbacks: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * What to use as the indentation unit
    * @default "\t"
    */
  var indent: js.UndefOr[String] = js.undefined
  /**
    * Setup some locales - other locales default to en silently
    * @default []
    */
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Setting of log level DEBUG
    * @default require("debug")("i18n:debug")
    */
  var logDebugFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  /**
    * Setting of log level ERROR
    * @default require("debug")("i18n:error")
    */
  var logErrorFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  /**
    * Setting of log level WARN
    * @default require("debug")("i18n:warn")
    */
  var logWarnFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  /**
    * Enable object notation
    * @default false
    */
  var objectNotation: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting prefix of json files name (in case you use different locale files naming scheme (webapp-en.json), rather then just en.json)
    * @default ""
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Downcase locale when passed on queryParam; e.g. lang=en-US becomes en-us.
    * When set to false, the queryParam value will be used as passed; e.g. lang=en-US remains en-US.
    * @default true
    */
  var preserveLegacyCase: js.UndefOr[Boolean] = js.undefined
  /**
    * Query parameter to switch locale (ie. /home?lang=ch)
    * @default null
    */
  var queryParameter: js.UndefOr[String] = js.undefined
  /**
    * object or [obj1, obj2] to bind the i18n api and current locale to
    * @default null
    */
  var register: js.UndefOr[js.Any] = js.undefined
  /**
    * Sync locale information across all files
    * @default false
    */
  var syncFiles: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to write new locale information to disk
    * @default true
    */
  var updateFiles: js.UndefOr[Boolean] = js.undefined
}

object ConfigurationOptions {
  @scala.inline
  def apply(
    api: StringDictionary[String] = null,
    autoReload: js.UndefOr[Boolean] = js.undefined,
    cookie: String = null,
    defaultLocale: String = null,
    directory: String = null,
    directoryPermissions: String = null,
    extension: String = null,
    fallbacks: StringDictionary[String] = null,
    indent: String = null,
    locales: js.Array[String] = null,
    logDebugFn: /* msg */ String => Callback = null,
    logErrorFn: /* msg */ String => Callback = null,
    logWarnFn: /* msg */ String => Callback = null,
    objectNotation: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    preserveLegacyCase: js.UndefOr[Boolean] = js.undefined,
    queryParameter: String = null,
    register: js.Any = null,
    syncFiles: js.UndefOr[Boolean] = js.undefined,
    updateFiles: js.UndefOr[Boolean] = js.undefined
  ): ConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (!js.isUndefined(autoReload)) __obj.updateDynamic("autoReload")(autoReload.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (directoryPermissions != null) __obj.updateDynamic("directoryPermissions")(directoryPermissions.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fallbacks != null) __obj.updateDynamic("fallbacks")(fallbacks.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (logDebugFn != null) __obj.updateDynamic("logDebugFn")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => logDebugFn(t0).runNow()))
    if (logErrorFn != null) __obj.updateDynamic("logErrorFn")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => logErrorFn(t0).runNow()))
    if (logWarnFn != null) __obj.updateDynamic("logWarnFn")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => logWarnFn(t0).runNow()))
    if (!js.isUndefined(objectNotation)) __obj.updateDynamic("objectNotation")(objectNotation.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveLegacyCase)) __obj.updateDynamic("preserveLegacyCase")(preserveLegacyCase.asInstanceOf[js.Any])
    if (queryParameter != null) __obj.updateDynamic("queryParameter")(queryParameter.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(register.asInstanceOf[js.Any])
    if (!js.isUndefined(syncFiles)) __obj.updateDynamic("syncFiles")(syncFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(updateFiles)) __obj.updateDynamic("updateFiles")(updateFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptions]
  }
}

