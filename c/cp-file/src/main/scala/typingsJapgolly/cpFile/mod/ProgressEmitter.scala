package typingsJapgolly.cpFile.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cpFile.cpFileStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEmitter extends js.Object {
  /**
  		For empty files, the `progress` event is emitted only once.
  		*/
  @JSName("on")
  def on_progress(event: progress, handler: js.Function1[/* data */ ProgressData, Unit]): js.Promise[Unit]
}

object ProgressEmitter {
  @scala.inline
  def apply(on: (progress, js.Function1[/* data */ ProgressData, Unit]) => CallbackTo[js.Promise[Unit]]): ProgressEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.cpFile.cpFileStrings.progress, t1: js.Function1[/* data */ typingsJapgolly.cpFile.mod.ProgressData, scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[ProgressEmitter]
  }
}

