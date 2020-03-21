package typingsJapgolly.freedom.freedom.Console

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends js.Object {
  def debug(source: String, message: String): js.Promise[Unit]
  def error(source: String, message: String): js.Promise[Unit]
  def info(source: String, message: String): js.Promise[Unit]
  def log(source: String, message: String): js.Promise[Unit]
  def warn(source: String, message: String): js.Promise[Unit]
}

object Console {
  @scala.inline
  def apply(
    debug: (String, String) => CallbackTo[js.Promise[Unit]],
    error: (String, String) => CallbackTo[js.Promise[Unit]],
    info: (String, String) => CallbackTo[js.Promise[Unit]],
    log: (String, String) => CallbackTo[js.Promise[Unit]],
    warn: (String, String) => CallbackTo[js.Promise[Unit]]
  ): Console = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => debug(t0, t1).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => error(t0, t1).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => info(t0, t1).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => log(t0, t1).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => warn(t0, t1).runNow()))
    __obj.asInstanceOf[Console]
  }
}

