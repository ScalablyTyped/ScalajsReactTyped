package typingsJapgolly.expressSession.mod._Global_.Express

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends SessionData {
  @JSName("cookie")
  var cookie_Session: SessionCookie
  var id: String
  def destroy(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  def regenerate(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  def reload(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  def save(callback: js.Function1[/* err */ js.Any, Unit]): Unit
  def touch(): Unit
}

object Session {
  @scala.inline
  def apply(
    cookie: SessionCookie,
    destroy: js.Function1[/* err */ js.Any, Unit] => Callback,
    id: String,
    regenerate: js.Function1[/* err */ js.Any, Unit] => Callback,
    reload: js.Function1[/* err */ js.Any, Unit] => Callback,
    save: js.Function1[/* err */ js.Any, Unit] => Callback,
    touch: Callback
  ): Session = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Any, scala.Unit]) => destroy(t0).runNow()))
    __obj.updateDynamic("regenerate")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Any, scala.Unit]) => regenerate(t0).runNow()))
    __obj.updateDynamic("reload")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Any, scala.Unit]) => reload(t0).runNow()))
    __obj.updateDynamic("save")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Any, scala.Unit]) => save(t0).runNow()))
    __obj.updateDynamic("touch")(touch.toJsFn)
    __obj.asInstanceOf[Session]
  }
}

