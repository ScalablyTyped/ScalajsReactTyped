package typingsJapgolly.grunt.grunt.log

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @note all methods available under grunt.verbose work exactly like grunt.log methods,
  *       but only log if the --verbose command-line option was specified.
  */
trait VerboseLogModule extends CommonLogging[VerboseLogModule] {
  var or: NotVerboseLogModule
}

object VerboseLogModule {
  @scala.inline
  def apply(
    error: String => CallbackTo[VerboseLogModule],
    errorlns: String => CallbackTo[VerboseLogModule],
    ok: String => CallbackTo[VerboseLogModule],
    oklns: String => CallbackTo[VerboseLogModule],
    or: NotVerboseLogModule,
    subhead: String => CallbackTo[VerboseLogModule],
    warn: String => CallbackTo[VerboseLogModule],
    write: String => CallbackTo[VerboseLogModule],
    writeflags: js.Any => CallbackTo[VerboseLogModule],
    writeln: String => CallbackTo[VerboseLogModule]
  ): VerboseLogModule = {
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
    __obj.asInstanceOf[VerboseLogModule]
  }
}

