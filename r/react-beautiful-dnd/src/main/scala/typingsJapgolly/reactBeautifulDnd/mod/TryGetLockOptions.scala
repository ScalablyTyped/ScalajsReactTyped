package typingsJapgolly.reactBeautifulDnd.mod

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryGetLockOptions extends js.Object {
  var sourceEvent: js.UndefOr[Event_] = js.undefined
}

object TryGetLockOptions {
  @scala.inline
  def apply(sourceEvent: Event_ = null): TryGetLockOptions = {
    val __obj = js.Dynamic.literal()
    if (sourceEvent != null) __obj.updateDynamic("sourceEvent")(sourceEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryGetLockOptions]
  }
}

