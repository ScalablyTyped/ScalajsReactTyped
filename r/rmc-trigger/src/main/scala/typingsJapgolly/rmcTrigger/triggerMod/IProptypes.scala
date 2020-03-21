package typingsJapgolly.rmcTrigger.triggerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProptypes extends js.Object {
  var visible: Boolean
  def onClose(): Unit
  def onTargetClick(): Unit
}

object IProptypes {
  @scala.inline
  def apply(onClose: Callback, onTargetClick: Callback, visible: Boolean): IProptypes = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onTargetClick")(onTargetClick.toJsFn)
    __obj.asInstanceOf[IProptypes]
  }
}

