package typingsJapgolly.inboxsdk.mod.Compose

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInstance extends js.Object {
  def openNewComposeView(): js.Promise[ComposeView]
  def registerComposeViewHandler(handler: js.Function1[/* composeView */ ComposeView, Unit]): js.Function0[Unit]
}

object ComposeInstance {
  @scala.inline
  def apply(
    openNewComposeView: CallbackTo[js.Promise[ComposeView]],
    registerComposeViewHandler: js.Function1[/* composeView */ ComposeView, Unit] => CallbackTo[js.Function0[Unit]]
  ): ComposeInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openNewComposeView")(openNewComposeView.toJsFn)
    __obj.updateDynamic("registerComposeViewHandler")(js.Any.fromFunction1((t0: js.Function1[/* composeView */ typingsJapgolly.inboxsdk.mod.Compose.ComposeView, scala.Unit]) => registerComposeViewHandler(t0).runNow()))
    __obj.asInstanceOf[ComposeInstance]
  }
}

