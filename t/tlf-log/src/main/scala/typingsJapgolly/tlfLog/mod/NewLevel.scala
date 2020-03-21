package typingsJapgolly.tlfLog.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewLevel extends js.Object {
  var afterLog: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object NewLevel {
  @scala.inline
  def apply(afterLog: js.UndefOr[Callback] = js.undefined): NewLevel = {
    val __obj = js.Dynamic.literal()
    afterLog.foreach(p => __obj.updateDynamic("afterLog")(p.toJsFn))
    __obj.asInstanceOf[NewLevel]
  }
}

