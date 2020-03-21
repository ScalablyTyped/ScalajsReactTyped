package typingsJapgolly.tlfLog.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewLevelBefore extends NewLevel {
  var before: String
}

object NewLevelBefore {
  @scala.inline
  def apply(before: String, afterLog: js.UndefOr[Callback] = js.undefined): NewLevelBefore = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    afterLog.foreach(p => __obj.updateDynamic("afterLog")(p.toJsFn))
    __obj.asInstanceOf[NewLevelBefore]
  }
}

