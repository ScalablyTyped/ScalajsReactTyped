package typingsJapgolly.tlfLog.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewLevelAfter extends NewLevel {
  var after: String
}

object NewLevelAfter {
  @scala.inline
  def apply(after: String, afterLog: js.UndefOr[Callback] = js.undefined): NewLevelAfter = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    afterLog.foreach(p => __obj.updateDynamic("afterLog")(p.toJsFn))
    __obj.asInstanceOf[NewLevelAfter]
  }
}

