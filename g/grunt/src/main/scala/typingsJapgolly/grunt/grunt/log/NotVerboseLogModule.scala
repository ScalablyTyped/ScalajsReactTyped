package typingsJapgolly.grunt.grunt.log

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @note all methods available under grunt.verbose work exactly like grunt.log methods,
  *       but only log if the --verbose command-line option was not specified.
  */
trait NotVerboseLogModule extends CommonLogging[NotVerboseLogModule] {
  var or: VerboseLogModule
}

object NotVerboseLogModule {
  @scala.inline
  def apply(
    error: String => CallbackTo[NotVerboseLogModule],
    errorlns: String => CallbackTo[NotVerboseLogModule],
    ok: String => CallbackTo[NotVerboseLogModule],
    oklns: String => CallbackTo[NotVerboseLogModule],
    or: VerboseLogModule,
    subhead: String => CallbackTo[NotVerboseLogModule],
    warn: String => CallbackTo[NotVerboseLogModule],
    write: String => CallbackTo[NotVerboseLogModule],
    writeflags: js.Any => CallbackTo[NotVerboseLogModule],
    writeln: String => CallbackTo[NotVerboseLogModule]
  ): NotVerboseLogModule = {
    val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("errorlns")(js.Any.fromFunction1((t0: java.lang.String) => errorlns(t0).runNow()))
    __obj.updateDynamic("ok")(js.Any.fromFunction1((t0: java.lang.String) => ok(t0).runNow()))
    __obj.updateDynamic("oklns")(js.Any.fromFunction1((t0: java.lang.String) => oklns(t0).runNow()))
    __obj.updateDynamic("subhead")(js.Any.fromFunction1((t0: java.lang.String) => subhead(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.updateDynamic("writeflags")(js.Any.fromFunction1((t0: js.Any) => writeflags(t0).runNow()))
    __obj.updateDynamic("writeln")(js.Any.fromFunction1((t0: java.lang.String) => writeln(t0).runNow()))
    __obj.asInstanceOf[NotVerboseLogModule]
  }
}

