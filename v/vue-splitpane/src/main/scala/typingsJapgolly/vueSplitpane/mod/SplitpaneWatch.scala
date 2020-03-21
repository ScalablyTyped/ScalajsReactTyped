package typingsJapgolly.vueSplitpane.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneWatch extends js.Object {
  def defaultPercent(`val`: js.Any): Unit
}

object SplitpaneWatch {
  @scala.inline
  def apply(defaultPercent: js.Any => Callback): SplitpaneWatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultPercent")(js.Any.fromFunction1((t0: js.Any) => defaultPercent(t0).runNow()))
    __obj.asInstanceOf[SplitpaneWatch]
  }
}

