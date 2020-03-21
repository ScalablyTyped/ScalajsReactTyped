package typingsJapgolly.reactNativeDraggableFlatlist.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItemInfo[ItemR] extends js.Object {
  var index: Double
  var isActive: Boolean
  var item: ItemR
  def move(): Unit
  def moveEnd(): Unit
}

object RenderItemInfo {
  @scala.inline
  def apply[ItemR](index: Double, isActive: Boolean, item: ItemR, move: Callback, moveEnd: Callback): RenderItemInfo[ItemR] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("move")(move.toJsFn)
    __obj.updateDynamic("moveEnd")(moveEnd.toJsFn)
    __obj.asInstanceOf[RenderItemInfo[ItemR]]
  }
}

