package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugAdapterTracker extends js.Object {
  /**
  		 * The debug adapter has sent a Debug Adapter Protocol message to VS Code.
  		 */
  var onDidSendMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.undefined
  /**
  		 * An error with the debug adapter has occurred.
  		 */
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
  		 * The debug adapter has exited with the given exit code or signal.
  		 */
  var onExit: js.UndefOr[
    js.Function2[/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String], Unit]
  ] = js.undefined
  /**
  		 * The debug adapter is about to receive a Debug Adapter Protocol message from VS Code.
  		 */
  var onWillReceiveMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.undefined
  /**
  		 * A session with the debug adapter is about to be started.
  		 */
  var onWillStartSession: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * The debug adapter session is about to be stopped.
  		 */
  var onWillStopSession: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object DebugAdapterTracker {
  @scala.inline
  def apply(
    onDidSendMessage: /* message */ js.Any => Callback = null,
    onError: /* error */ js.Error => Callback = null,
    onExit: (/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String]) => Callback = null,
    onWillReceiveMessage: /* message */ js.Any => Callback = null,
    onWillStartSession: js.UndefOr[Callback] = js.undefined,
    onWillStopSession: js.UndefOr[Callback] = js.undefined
  ): DebugAdapterTracker = {
    val __obj = js.Dynamic.literal()
    if (onDidSendMessage != null) __obj.updateDynamic("onDidSendMessage")(js.Any.fromFunction1((t0: /* message */ js.Any) => onDidSendMessage(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction2((t0: /* code */ js.UndefOr[scala.Double], t1: /* signal */ js.UndefOr[java.lang.String]) => onExit(t0, t1).runNow()))
    if (onWillReceiveMessage != null) __obj.updateDynamic("onWillReceiveMessage")(js.Any.fromFunction1((t0: /* message */ js.Any) => onWillReceiveMessage(t0).runNow()))
    onWillStartSession.foreach(p => __obj.updateDynamic("onWillStartSession")(p.toJsFn))
    onWillStopSession.foreach(p => __obj.updateDynamic("onWillStopSession")(p.toJsFn))
    __obj.asInstanceOf[DebugAdapterTracker]
  }
}

