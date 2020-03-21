package typingsJapgolly.agGrid.floatingFilterWrapperMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloatingFilterWrapper[M] extends js.Object {
  def onParentModelChanged(parentModel: M): Unit
}

object IFloatingFilterWrapper {
  @scala.inline
  def apply[M](onParentModelChanged: M => Callback): IFloatingFilterWrapper[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onParentModelChanged")(js.Any.fromFunction1((t0: M) => onParentModelChanged(t0).runNow()))
    __obj.asInstanceOf[IFloatingFilterWrapper[M]]
  }
}

