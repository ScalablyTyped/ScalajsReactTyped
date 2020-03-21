package typingsJapgolly.detectPassiveEvents.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectPassiveEvents extends js.Object {
  var hasSupport: Boolean
  def update(): Unit
}

object detectPassiveEvents {
  @scala.inline
  def apply(hasSupport: Boolean, update: Callback): detectPassiveEvents = {
    val __obj = js.Dynamic.literal(hasSupport = hasSupport.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[detectPassiveEvents]
  }
}

