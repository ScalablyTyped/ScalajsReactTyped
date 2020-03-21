package typingsJapgolly.rcTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnScroll extends js.Object {
  var ref: Ref
  var scrollbarSize: Double
  def onScroll(info: AnonCurrentTarget): Unit
}

object AnonOnScroll {
  @scala.inline
  def apply(onScroll: AnonCurrentTarget => Callback, scrollbarSize: Double, ref: Ref = null): AnonOnScroll = {
    val __obj = js.Dynamic.literal(scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
    __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: typingsJapgolly.rcTable.AnonCurrentTarget) => onScroll(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnScroll]
  }
}

