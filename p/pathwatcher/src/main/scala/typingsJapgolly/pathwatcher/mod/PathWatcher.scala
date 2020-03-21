package typingsJapgolly.pathwatcher.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.eventKit.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathWatcher extends js.Object {
  def close(): Unit
  def onDidChange(callback: js.Function1[/* change */ WatchedFilePathChangedEvent, Unit]): Disposable
}

object PathWatcher {
  @scala.inline
  def apply(
    close: Callback,
    onDidChange: js.Function1[/* change */ WatchedFilePathChangedEvent, Unit] => CallbackTo[Disposable]
  ): PathWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("onDidChange")(js.Any.fromFunction1((t0: js.Function1[
  /* change */ typingsJapgolly.pathwatcher.mod.WatchedFilePathChangedEvent, 
  scala.Unit]) => onDidChange(t0).runNow()))
    __obj.asInstanceOf[PathWatcher]
  }
}

