package typingsJapgolly.sudokus.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var onProgress: js.UndefOr[ProgressFn] = js.undefined
}

object Options {
  @scala.inline
  def apply(onProgress: /* state */ js.Array[js.Array[Cell]] => Callback = null): Options = {
    val __obj = js.Dynamic.literal()
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* state */ js.Array[js.Array[typingsJapgolly.sudokus.mod.Cell]]) => onProgress(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

