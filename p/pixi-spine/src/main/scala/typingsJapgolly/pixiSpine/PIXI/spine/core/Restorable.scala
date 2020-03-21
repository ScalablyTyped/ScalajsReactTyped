package typingsJapgolly.pixiSpine.PIXI.spine.core

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restorable extends js.Object {
  def restore(): Unit
}

object Restorable {
  @scala.inline
  def apply(restore: Callback): Restorable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restore")(restore.toJsFn)
    __obj.asInstanceOf[Restorable]
  }
}

