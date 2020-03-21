package typingsJapgolly.pinoMultiStream.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pino.AnonAsObject
import typingsJapgolly.pino.mod.LevelWithSilent
import typingsJapgolly.pino.mod.PrettyOptions
import typingsJapgolly.pino.mod.SerializerFn
import typingsJapgolly.pino.mod.TimeFn
import typingsJapgolly.pino.mod.redactOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions
  extends typingsJapgolly.pino.mod.LoggerOptions {
  var streams: js.UndefOr[Streams] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    base: StringDictionary[js.Any] = null,
    browser: AnonAsObject = null,
    changeLevelName: String = null,
    customLevels: StringDictionary[Double] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    level: LevelWithSilent | String = null,
    levelVal: Int | Double = null,
    messageKey: String = null,
    mixin: js.UndefOr[CallbackTo[js.Object]] = js.undefined,
    name: String = null,
    nestedKey: String = null,
    onTerminated: (/* eventName */ String, /* err */ js.Any) => Callback = null,
    prettyPrint: Boolean | PrettyOptions = null,
    redact: js.Array[String] | redactOptions = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    serializers: StringDictionary[SerializerFn] = null,
    streams: Streams = null,
    timestamp: TimeFn | Boolean = null,
    useLevelLabels: js.UndefOr[Boolean] = js.undefined,
    useOnlyCustomLevels: js.UndefOr[Boolean] = js.undefined
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (changeLevelName != null) __obj.updateDynamic("changeLevelName")(changeLevelName.asInstanceOf[js.Any])
    if (customLevels != null) __obj.updateDynamic("customLevels")(customLevels.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelVal != null) __obj.updateDynamic("levelVal")(levelVal.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    mixin.foreach(p => __obj.updateDynamic("mixin")(p.toJsFn))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nestedKey != null) __obj.updateDynamic("nestedKey")(nestedKey.asInstanceOf[js.Any])
    if (onTerminated != null) __obj.updateDynamic("onTerminated")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* err */ js.Any) => onTerminated(t0, t1).runNow()))
    if (prettyPrint != null) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (redact != null) __obj.updateDynamic("redact")(redact.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(useLevelLabels)) __obj.updateDynamic("useLevelLabels")(useLevelLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(useOnlyCustomLevels)) __obj.updateDynamic("useOnlyCustomLevels")(useOnlyCustomLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

