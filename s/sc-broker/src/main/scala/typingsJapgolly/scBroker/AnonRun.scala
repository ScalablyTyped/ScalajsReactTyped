package typingsJapgolly.scBroker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRun extends js.Object {
  var run: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonRun {
  @scala.inline
  def apply(run: js.UndefOr[Callback] = js.undefined): AnonRun = {
    val __obj = js.Dynamic.literal()
    run.foreach(p => __obj.updateDynamic("run")(p.toJsFn))
    __obj.asInstanceOf[AnonRun]
  }
}

