package typingsJapgolly.reduxLogger.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reduxLogger.reduxLoggerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduxLoggerOptions extends js.Object {
  var actionTransformer: js.UndefOr[js.Function1[/* action */ js.Any, _]] = js.undefined
  var collapsed: js.UndefOr[Boolean | LoggerPredicate] = js.undefined
  var colors: js.UndefOr[ColorsObject | `false`] = js.undefined
  var diff: js.UndefOr[Boolean] = js.undefined
  var diffPredicate: js.UndefOr[LoggerPredicate] = js.undefined
  var duration: js.UndefOr[Boolean] = js.undefined
  var errorTransformer: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var level: js.UndefOr[String | ActionToString | LevelObject] = js.undefined
  var logErrors: js.UndefOr[Boolean] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var predicate: js.UndefOr[LoggerPredicate] = js.undefined
  var stateTransformer: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var timestamp: js.UndefOr[Boolean] = js.undefined
  var titleFormatter: js.UndefOr[
    js.Function3[/* formattedAction */ js.Any, /* formattedTime */ String, /* took */ Double, String]
  ] = js.undefined
}

object ReduxLoggerOptions {
  @scala.inline
  def apply(
    actionTransformer: /* action */ js.Any => CallbackTo[js.Any] = null,
    collapsed: Boolean | LoggerPredicate = null,
    colors: ColorsObject | `false` = null,
    diff: js.UndefOr[Boolean] = js.undefined,
    diffPredicate: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => CallbackTo[Boolean] = null,
    duration: js.UndefOr[Boolean] = js.undefined,
    errorTransformer: /* error */ js.Any => CallbackTo[js.Any] = null,
    level: String | ActionToString | LevelObject = null,
    logErrors: js.UndefOr[Boolean] = js.undefined,
    logger: js.Any = null,
    predicate: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => CallbackTo[Boolean] = null,
    stateTransformer: /* state */ js.Any => CallbackTo[js.Any] = null,
    timestamp: js.UndefOr[Boolean] = js.undefined,
    titleFormatter: (/* formattedAction */ js.Any, /* formattedTime */ String, /* took */ Double) => CallbackTo[String] = null
  ): ReduxLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (actionTransformer != null) __obj.updateDynamic("actionTransformer")(js.Any.fromFunction1((t0: /* action */ js.Any) => actionTransformer(t0).runNow()))
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(diff)) __obj.updateDynamic("diff")(diff.asInstanceOf[js.Any])
    if (diffPredicate != null) __obj.updateDynamic("diffPredicate")(js.Any.fromFunction3((t0: /* getState */ js.Function0[js.Any], t1: /* action */ js.Any, t2: /* logEntry */ js.UndefOr[typingsJapgolly.reduxLogger.mod.LogEntryObject]) => diffPredicate(t0, t1, t2).runNow()))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (errorTransformer != null) __obj.updateDynamic("errorTransformer")(js.Any.fromFunction1((t0: /* error */ js.Any) => errorTransformer(t0).runNow()))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(logErrors)) __obj.updateDynamic("logErrors")(logErrors.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction3((t0: /* getState */ js.Function0[js.Any], t1: /* action */ js.Any, t2: /* logEntry */ js.UndefOr[typingsJapgolly.reduxLogger.mod.LogEntryObject]) => predicate(t0, t1, t2).runNow()))
    if (stateTransformer != null) __obj.updateDynamic("stateTransformer")(js.Any.fromFunction1((t0: /* state */ js.Any) => stateTransformer(t0).runNow()))
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (titleFormatter != null) __obj.updateDynamic("titleFormatter")(js.Any.fromFunction3((t0: /* formattedAction */ js.Any, t1: /* formattedTime */ java.lang.String, t2: /* took */ scala.Double) => titleFormatter(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ReduxLoggerOptions]
  }
}

