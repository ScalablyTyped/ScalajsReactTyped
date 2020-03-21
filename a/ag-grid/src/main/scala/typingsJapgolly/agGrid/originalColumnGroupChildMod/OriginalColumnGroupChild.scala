package typingsJapgolly.agGrid.originalColumnGroupChildMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalColumnGroupChild extends js.Object {
  def getColumnGroupShow(): String
  def getId(): String
  def isVisible(): Boolean
}

object OriginalColumnGroupChild {
  @scala.inline
  def apply(getColumnGroupShow: CallbackTo[String], getId: CallbackTo[String], isVisible: CallbackTo[Boolean]): OriginalColumnGroupChild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumnGroupShow")(getColumnGroupShow.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("isVisible")(isVisible.toJsFn)
    __obj.asInstanceOf[OriginalColumnGroupChild]
  }
}

