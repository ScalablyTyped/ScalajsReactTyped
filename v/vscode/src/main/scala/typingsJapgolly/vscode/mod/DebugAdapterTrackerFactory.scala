package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugAdapterTrackerFactory extends js.Object {
  /**
  		 * The method 'createDebugAdapterTracker' is called at the start of a debug session in order
  		 * to return a "tracker" object that provides read-access to the communication between VS Code and a debug adapter.
  		 *
  		 * @param session The [debug session](#DebugSession) for which the debug adapter tracker will be used.
  		 * @return A [debug adapter tracker](#DebugAdapterTracker) or undefined.
  		 */
  def createDebugAdapterTracker(session: DebugSession): ProviderResult[DebugAdapterTracker]
}

object DebugAdapterTrackerFactory {
  @scala.inline
  def apply(createDebugAdapterTracker: DebugSession => CallbackTo[ProviderResult[DebugAdapterTracker]]): DebugAdapterTrackerFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createDebugAdapterTracker")(js.Any.fromFunction1((t0: typingsJapgolly.vscode.mod.DebugSession) => createDebugAdapterTracker(t0).runNow()))
    __obj.asInstanceOf[DebugAdapterTrackerFactory]
  }
}

