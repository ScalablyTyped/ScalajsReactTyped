package typingsJapgolly.egg.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.egg.AnonCallback
import typingsJapgolly.egg.AnonCookieField
import typingsJapgolly.egg.AnonCsp
import typingsJapgolly.egg.AnonEnable
import typingsJapgolly.egg.AnonFastReady
import typingsJapgolly.egg.AnonIgnore
import typingsJapgolly.eggLogger.mod.EggLoggerOptions
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggAppConfig
  extends /* prop */ StringDictionary[js.Any] {
  /**
    * The current HOME directory
    */
  var HOME: String
  var baseDir: String
  /**
    * The option of `bodyParser` middleware
    *
    * @member Config#bodyParser
    * @property {Boolean} enable - enable bodyParser or not, default to true
    * @property {String | RegExp | Function | Array} ignore - won't parse request body when url path hit ignore pattern, can not set `ignore` when `match` presented
    * @property {String | RegExp | Function | Array} match - will parse request body only when url path hit match pattern
    * @property {String} encoding - body encoding config, default utf8
    * @property {String} formLimit - form body size limit, default 100kb
    * @property {String} jsonLimit - json body size limit, default 100kb
    * @property {Boolean} strict - json body strict mode, if set strict value true, then only receive object and array json body
    * @property {Number} queryString.arrayLimit - from item array length limit, default 100
    * @property {Number} queryString.depth - json value deep lenght, default 5
    * @property {Number} queryString.parameterLimit - paramter number limit ,default 1000
    * @property {string[]} enableTypes - parser will only parse when request type hits enableTypes, default is ['json', 'form']
    * @property {any} extendTypes - support extend types
    */
  var bodyParser: AnonEnable
  /**
    * customLoader config
    */
  var customLoader: StringDictionary[CustomLoaderConfig]
  /** custom logger of egg */
  var customLogger: StringDictionary[EggLoggerOptions]
  var development: AnonFastReady
  /**
    * It will ignore special keys when dumpConfig
    */
  var dump: AnonIgnore
  /**
    * The environment of egg
    */
  var env: EggEnvType
  var hostHeaders: String
  /** Configuration of httpclient in egg. */
  var httpclient: HttpClientConfig
  /**
    * I18n options
    */
  var i18n: AnonCookieField
  /**
    * Detect request' ip from specified headers, not case-sensitive. Only worked when config.proxy set to true.
    */
  var ipHeaders: String
  /**
    * jsonp options
    * @member Config#jsonp
    * @property {String} callback - jsonp callback method key, default to `_callback`
    * @property {Number} limit - callback method name's max length, default to `50`
    * @property {Boolean} csrf - enable csrf check or not. default to false
    * @property {String|RegExp|Array} whiteList - referrer white list
    */
  var jsonp: AnonCallback
  /**
    * The key that signing cookies. It can contain multiple keys seperated by .
    */
  var keys: String
  /**
    * logger options
    * @member Config#logger
    * @property {String} dir - directory of log files
    * @property {String} encoding - log file encloding, defaults to utf8
    * @property {String} level - default log level, could be: DEBUG, INFO, WARN, ERROR or NONE, defaults to INFO in production
    * @property {String} consoleLevel - log level of stdout, defaults to INFO in local serverEnv, defaults to WARN in unittest, defaults to NONE elsewise
    * @property {Boolean} disableConsoleAfterReady - disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`.
    * @property {Boolean} outputJSON - log as JSON or not, defaults to false
    * @property {Boolean} buffer - if enabled, flush logs to disk at a certain frequency to improve performance, defaults to true
    * @property {String} errorLogName - file name of errorLogger
    * @property {String} coreLogName - file name of coreLogger
    * @property {String} agentLogName - file name of agent worker log
    * @property {Object} coreLogger - custom config of coreLogger
    * @property {Boolean} allowDebugAtProd - allow debug log at prod, defaults to true
    */
  var logger: EggLoggerConfig
  var middleware: js.Array[String]
  /**
    * The name of the application
    */
  var name: String
  /**
    * package.json
    */
  var pkg: js.Any
  var rundir: String
  var security: AnonCsp
  /**
    * server timeout in milliseconds, default to 2 minutes.
    *
    * for special request, just use `ctx.req.setTimeout(ms)`
    *
    * @see https://nodejs.org/api/http.html#http_server_timeout
    */
  var serverTimeout: Double | Null
  var siteFile: PlainObject[String | Buffer]
  var watcher: PlainObject[_]
  var workerStartTimeout: Double
  def onClientError(err: js.Error, socket: Socket, app: EggApplication): ClientErrorResponse | js.Promise[ClientErrorResponse]
}

object EggAppConfig {
  @scala.inline
  def apply(
    HOME: String,
    baseDir: String,
    bodyParser: AnonEnable,
    customLoader: StringDictionary[CustomLoaderConfig],
    customLogger: StringDictionary[EggLoggerOptions],
    development: AnonFastReady,
    dump: AnonIgnore,
    env: EggEnvType,
    hostHeaders: String,
    httpclient: HttpClientConfig,
    i18n: AnonCookieField,
    ipHeaders: String,
    jsonp: AnonCallback,
    keys: String,
    logger: EggLoggerConfig,
    middleware: js.Array[String],
    name: String,
    onClientError: (js.Error, Socket, EggApplication) => CallbackTo[ClientErrorResponse | js.Promise[ClientErrorResponse]],
    pkg: js.Any,
    rundir: String,
    security: AnonCsp,
    siteFile: PlainObject[String | Buffer],
    watcher: PlainObject[_],
    workerStartTimeout: Double,
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    serverTimeout: Int | Double = null
  ): EggAppConfig = {
    val __obj = js.Dynamic.literal(HOME = HOME.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], bodyParser = bodyParser.asInstanceOf[js.Any], customLoader = customLoader.asInstanceOf[js.Any], customLogger = customLogger.asInstanceOf[js.Any], development = development.asInstanceOf[js.Any], dump = dump.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], hostHeaders = hostHeaders.asInstanceOf[js.Any], httpclient = httpclient.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], ipHeaders = ipHeaders.asInstanceOf[js.Any], jsonp = jsonp.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], rundir = rundir.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], siteFile = siteFile.asInstanceOf[js.Any], watcher = watcher.asInstanceOf[js.Any], workerStartTimeout = workerStartTimeout.asInstanceOf[js.Any])
    __obj.updateDynamic("onClientError")(js.Any.fromFunction3((t0: js.Error, t1: typingsJapgolly.node.netMod.Socket, t2: typingsJapgolly.egg.mod.EggApplication) => onClientError(t0, t1, t2).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (serverTimeout != null) __obj.updateDynamic("serverTimeout")(serverTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggAppConfig]
  }
}

