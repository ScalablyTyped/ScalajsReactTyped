package typingsJapgolly.antdMobileRn.imageRollNativeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollProps extends js.Object {
  def onCancel(): Unit
  def onSelected(imgObj: js.Object): Unit
}

object ImageRollProps {
  @scala.inline
  def apply(onCancel: Callback, onSelected: js.Object => Callback): ImageRollProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onSelected")(js.Any.fromFunction1((t0: js.Object) => onSelected(t0).runNow()))
    __obj.asInstanceOf[ImageRollProps]
  }
}

