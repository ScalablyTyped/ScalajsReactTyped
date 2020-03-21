package typingsJapgolly.azdata.mod.nb

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionManager extends js.Object {
  /**
  			 * Indicates whether the manager is ready.
  			 */
  val isReady: Boolean
  /**
  			 * A Thenable that is fulfilled when the manager is ready.
  			 */
  val ready: Thenable[Unit]
  val specs: js.UndefOr[IAllKernels] = js.undefined
  def shutdown(id: String): Thenable[Unit]
  def startNew(options: ISessionOptions): Thenable[ISession]
}

object SessionManager {
  @scala.inline
  def apply(
    isReady: Boolean,
    ready: Thenable[Unit],
    shutdown: String => CallbackTo[Thenable[Unit]],
    startNew: ISessionOptions => CallbackTo[Thenable[ISession]],
    specs: IAllKernels = null
  ): SessionManager = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any])
    __obj.updateDynamic("shutdown")(js.Any.fromFunction1((t0: java.lang.String) => shutdown(t0).runNow()))
    __obj.updateDynamic("startNew")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.nb.ISessionOptions) => startNew(t0).runNow()))
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionManager]
  }
}

