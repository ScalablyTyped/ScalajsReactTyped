package typingsJapgolly.logProcessErrors.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.logProcessErrors.PartialRecordExceptionTyp
import typingsJapgolly.logProcessErrors.logProcessErrorsStrings.`node-tap`
import typingsJapgolly.logProcessErrors.logProcessErrorsStrings.ava
import typingsJapgolly.logProcessErrors.logProcessErrorsStrings.jasmine
import typingsJapgolly.logProcessErrors.logProcessErrorsStrings.mocha
import typingsJapgolly.logProcessErrors.logProcessErrorsStrings.tape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * log-process-errors constructor options.
  */
trait Options extends js.Object {
  /**
    * Whether or not to colorize messages.
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#colors
    */
  var colors: js.UndefOr[Boolean] = js.undefined
  /**
    * Which process should trigger `process.exit(1)`
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#exiton
    */
  var exitOn: js.UndefOr[js.Array[ExceptionType]] = js.undefined
  /**
    * Which log level to use for different exceptions.
    *
    * https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
    */
  var level: js.UndefOr[PartialRecordExceptionTyp] = js.undefined
  /**
    * Override logger
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
    */
  var log: js.UndefOr[
    js.Function2[/* error */ js.Error, /* level */ LogLevel, js.Promise[Unit] | Unit]
  ] = js.undefined
  /**
    * When running tests, makes them fail if there are any process errors.
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#testing
    */
  var testing: js.UndefOr[ava | mocha | jasmine | tape | `node-tap`] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    colors: js.UndefOr[Boolean] = js.undefined,
    exitOn: js.Array[ExceptionType] = null,
    level: PartialRecordExceptionTyp = null,
    log: (/* error */ js.Error, /* level */ LogLevel) => CallbackTo[js.Promise[Unit] | Unit] = null,
    testing: ava | mocha | jasmine | tape | `node-tap` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (exitOn != null) __obj.updateDynamic("exitOn")(exitOn.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* level */ typingsJapgolly.logProcessErrors.mod.LogLevel) => log(t0, t1).runNow()))
    if (testing != null) __obj.updateDynamic("testing")(testing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

