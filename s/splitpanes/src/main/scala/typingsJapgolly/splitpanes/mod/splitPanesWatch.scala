package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesWatch extends js.Object {
  def defaultPercent(`val`: js.Any): Unit
}

object splitPanesWatch {
  @scala.inline
  def apply(defaultPercent: js.Any => Callback): splitPanesWatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultPercent")(js.Any.fromFunction1((t0: js.Any) => defaultPercent(t0).runNow()))
    __obj.asInstanceOf[splitPanesWatch]
  }
}

