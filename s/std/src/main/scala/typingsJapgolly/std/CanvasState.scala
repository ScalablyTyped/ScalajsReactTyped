package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasState extends js.Object {
  def restore(): Unit
  def save(): Unit
}

object CanvasState {
  @scala.inline
  def apply(restore: Callback, save: Callback): CanvasState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restore")(restore.toJsFn)
    __obj.updateDynamic("save")(save.toJsFn)
    __obj.asInstanceOf[CanvasState]
  }
}

