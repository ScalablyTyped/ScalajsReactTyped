package typingsJapgolly.koaGenericSession.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionIdStore extends js.Object {
  def get(): js.Any
  def reset(): Unit
  def set(sid: String, session: Session): Unit
}

object SessionIdStore {
  @scala.inline
  def apply(get: CallbackTo[js.Any], reset: Callback, set: (String, Session) => Callback): SessionIdStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.koaGenericSession.mod.Session) => set(t0, t1).runNow()))
    __obj.asInstanceOf[SessionIdStore]
  }
}

