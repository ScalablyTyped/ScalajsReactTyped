package typingsJapgolly.singleSpaReact.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycles extends js.Object {
  def bootstrap(props: js.Any): js.Promise[Unit]
  def mount(props: js.Any): js.Promise[Unit]
  def unmount(props: js.Any): js.Promise[Unit]
}

object Lifecycles {
  @scala.inline
  def apply(
    bootstrap: js.Any => CallbackTo[js.Promise[Unit]],
    mount: js.Any => CallbackTo[js.Promise[Unit]],
    unmount: js.Any => CallbackTo[js.Promise[Unit]]
  ): Lifecycles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bootstrap")(js.Any.fromFunction1((t0: js.Any) => bootstrap(t0).runNow()))
    __obj.updateDynamic("mount")(js.Any.fromFunction1((t0: js.Any) => mount(t0).runNow()))
    __obj.updateDynamic("unmount")(js.Any.fromFunction1((t0: js.Any) => unmount(t0).runNow()))
    __obj.asInstanceOf[Lifecycles]
  }
}

