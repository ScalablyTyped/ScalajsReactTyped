package typingsJapgolly.dragster.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dragster extends js.Object {
  def removeListeners(): Unit
  def reset(): Unit
}

object Dragster {
  @scala.inline
  def apply(removeListeners: Callback, reset: Callback): Dragster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeListeners")(removeListeners.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[Dragster]
  }
}

