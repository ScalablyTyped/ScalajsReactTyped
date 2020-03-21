package typingsJapgolly.grunt.grunt.log

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.log}
  */
trait LogModule extends CommonLogging[LogModule] {
  var notverbose: NotVerboseLogModule
  var verbose: VerboseLogModule
}

object LogModule {
  @scala.inline
  def apply(
    error: String => CallbackTo[LogModule],
    errorlns: String => CallbackTo[LogModule],
    notverbose: NotVerboseLogModule,
    ok: String => CallbackTo[LogModule],
    oklns: String => CallbackTo[LogModule],
    subhead: String => CallbackTo[LogModule],
    verbose: VerboseLogModule,
    warn: String => CallbackTo[LogModule],
    write: String => CallbackTo[LogModule],
    writeflags: js.Any => CallbackTo[LogModule],
    writeln: String => CallbackTo[LogModule]
  ): LogModule = {
    val __obj = js.Dynamic.literal(notverbose = notverbose.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("errorlns")(js.Any.fromFunction1((t0: java.lang.String) => errorlns(t0).runNow()))
    __obj.updateDynamic("ok")(js.Any.fromFunction1((t0: java.lang.String) => ok(t0).runNow()))
    __obj.updateDynamic("oklns")(js.Any.fromFunction1((t0: java.lang.String) => oklns(t0).runNow()))
    __obj.updateDynamic("subhead")(js.Any.fromFunction1((t0: java.lang.String) => subhead(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.updateDynamic("writeflags")(js.Any.fromFunction1((t0: js.Any) => writeflags(t0).runNow()))
    __obj.updateDynamic("writeln")(js.Any.fromFunction1((t0: java.lang.String) => writeln(t0).runNow()))
    __obj.asInstanceOf[LogModule]
  }
}

