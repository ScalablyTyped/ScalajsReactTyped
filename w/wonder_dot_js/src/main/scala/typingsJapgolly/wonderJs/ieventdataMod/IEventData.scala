package typingsJapgolly.wonderJs.ieventdataMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventData extends js.Object {
  var returnValue: Boolean
  def preventDefault(): Unit
}

object IEventData {
  @scala.inline
  def apply(preventDefault: Callback, returnValue: Boolean): IEventData = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.asInstanceOf[IEventData]
  }
}

