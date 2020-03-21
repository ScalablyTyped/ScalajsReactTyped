package typingsJapgolly.pinoHttp.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.pino.AnonAsObject
import typingsJapgolly.pino.mod.DestinationStream
import typingsJapgolly.pino.mod.Level
import typingsJapgolly.pino.mod.LevelWithSilent
import typingsJapgolly.pino.mod.Logger
import typingsJapgolly.pino.mod.LoggerOptions
import typingsJapgolly.pino.mod.PrettyOptions
import typingsJapgolly.pino.mod.SerializerFn
import typingsJapgolly.pino.mod.TimeFn
import typingsJapgolly.pino.mod.redactOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for pino-http
  *
  * See https://github.com/pinojs/pino-http#pinohttpopts-stream
  */
trait Options extends LoggerOptions {
  var autoLogging: js.UndefOr[Boolean] = js.undefined
  var customLogLevel: js.UndefOr[js.Function2[/* res */ ServerResponse, /* error */ js.Error, Level]] = js.undefined
  var genReqId: js.UndefOr[GenReqId] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var stream: js.UndefOr[DestinationStream] = js.undefined
  var useLevel: js.UndefOr[Level] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoLogging: js.UndefOr[Boolean] = js.undefined,
    base: StringDictionary[js.Any] = null,
    browser: AnonAsObject = null,
    changeLevelName: String = null,
    customLevels: StringDictionary[Double] = null,
    customLogLevel: (/* res */ ServerResponse, /* error */ js.Error) => CallbackTo[Level] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    genReqId: /* req */ IncomingMessage => CallbackTo[ReqId] = null,
    level: LevelWithSilent | String = null,
    levelVal: Int | Double = null,
    logger: Logger = null,
    messageKey: String = null,
    mixin: js.UndefOr[CallbackTo[js.Object]] = js.undefined,
    name: String = null,
    nestedKey: String = null,
    onTerminated: (/* eventName */ String, /* err */ js.Any) => Callback = null,
    prettyPrint: Boolean | PrettyOptions = null,
    redact: js.Array[String] | redactOptions = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    serializers: StringDictionary[SerializerFn] = null,
    stream: DestinationStream = null,
    timestamp: TimeFn | Boolean = null,
    useLevel: Level = null,
    useLevelLabels: js.UndefOr[Boolean] = js.undefined,
    useOnlyCustomLevels: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLogging)) __obj.updateDynamic("autoLogging")(autoLogging.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (changeLevelName != null) __obj.updateDynamic("changeLevelName")(changeLevelName.asInstanceOf[js.Any])
    if (customLevels != null) __obj.updateDynamic("customLevels")(customLevels.asInstanceOf[js.Any])
    if (customLogLevel != null) __obj.updateDynamic("customLogLevel")(js.Any.fromFunction2((t0: /* res */ typingsJapgolly.node.httpMod.ServerResponse, t1: /* error */ js.Error) => customLogLevel(t0, t1).runNow()))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (genReqId != null) __obj.updateDynamic("genReqId")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.node.httpMod.IncomingMessage) => genReqId(t0).runNow()))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelVal != null) __obj.updateDynamic("levelVal")(levelVal.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    mixin.foreach(p => __obj.updateDynamic("mixin")(p.toJsFn))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nestedKey != null) __obj.updateDynamic("nestedKey")(nestedKey.asInstanceOf[js.Any])
    if (onTerminated != null) __obj.updateDynamic("onTerminated")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* err */ js.Any) => onTerminated(t0, t1).runNow()))
    if (prettyPrint != null) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (redact != null) __obj.updateDynamic("redact")(redact.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (useLevel != null) __obj.updateDynamic("useLevel")(useLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(useLevelLabels)) __obj.updateDynamic("useLevelLabels")(useLevelLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(useOnlyCustomLevels)) __obj.updateDynamic("useOnlyCustomLevels")(useOnlyCustomLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

