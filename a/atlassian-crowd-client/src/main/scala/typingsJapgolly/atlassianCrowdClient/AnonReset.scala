package typingsJapgolly.atlassianCrowdClient

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReset extends js.Object {
  def reset(username: String): js.Promise[Unit]
  def set(username: String, password: String): js.Promise[Unit]
}

object AnonReset {
  @scala.inline
  def apply(
    reset: String => CallbackTo[js.Promise[Unit]],
    set: (String, String) => CallbackTo[js.Promise[Unit]]
  ): AnonReset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: java.lang.String) => reset(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set(t0, t1).runNow()))
    __obj.asInstanceOf[AnonReset]
  }
}

