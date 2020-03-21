package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathWatcher extends DisposableLike {
  /**
    *  Return a Promise that will resolve when the underlying native watcher is
    *  ready to begin sending events.
    */
  def getStartPromise(): js.Promise[Unit]
  /** Invokes a function when any errors related to this watcher are reported. */
  def onDidError(callback: js.Function1[/* error */ js.Error, Unit]): Disposable
}

object PathWatcher {
  @scala.inline
  def apply(
    dispose: Callback,
    getStartPromise: CallbackTo[js.Promise[Unit]],
    onDidError: js.Function1[/* error */ js.Error, Unit] => CallbackTo[Disposable]
  ): PathWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("getStartPromise")(getStartPromise.toJsFn)
    __obj.updateDynamic("onDidError")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Error, scala.Unit]) => onDidError(t0).runNow()))
    __obj.asInstanceOf[PathWatcher]
  }
}

