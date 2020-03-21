package typingsJapgolly.refreshFetch

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetch[T] extends js.Object {
  var fetch: T
  def refreshToken(): js.Promise[Unit]
  def shouldRefreshToken(error: js.Any): Boolean
}

object AnonFetch {
  @scala.inline
  def apply[T](
    fetch: T,
    refreshToken: CallbackTo[js.Promise[Unit]],
    shouldRefreshToken: js.Any => CallbackTo[Boolean]
  ): AnonFetch[T] = {
    val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any])
    __obj.updateDynamic("refreshToken")(refreshToken.toJsFn)
    __obj.updateDynamic("shouldRefreshToken")(js.Any.fromFunction1((t0: js.Any) => shouldRefreshToken(t0).runNow()))
    __obj.asInstanceOf[AnonFetch[T]]
  }
}

