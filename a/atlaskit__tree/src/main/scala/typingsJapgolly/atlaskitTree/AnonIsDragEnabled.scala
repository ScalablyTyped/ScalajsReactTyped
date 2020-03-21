package typingsJapgolly.atlaskitTree

import japgolly.scalajs.react.Callback
import typingsJapgolly.atlaskitTree.atlaskitTreeBooleans.`false`
import typingsJapgolly.atlaskitTree.atlaskitTreeNumbers.`35`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsDragEnabled extends js.Object {
  var isDragEnabled: `false`
  var isNestingEnabled: `false`
  var offsetPerLevel: `35`
  var tree: AnonChildren
  def onCollapse(): Unit
  def onDragEnd(): Unit
  def onDragStart(): Unit
  def onExpand(): Unit
  def renderItem(): Unit
}

object AnonIsDragEnabled {
  @scala.inline
  def apply(
    isDragEnabled: `false`,
    isNestingEnabled: `false`,
    offsetPerLevel: `35`,
    onCollapse: Callback,
    onDragEnd: Callback,
    onDragStart: Callback,
    onExpand: Callback,
    renderItem: Callback,
    tree: AnonChildren
  ): AnonIsDragEnabled = {
    val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.updateDynamic("onCollapse")(onCollapse.toJsFn)
    __obj.updateDynamic("onDragEnd")(onDragEnd.toJsFn)
    __obj.updateDynamic("onDragStart")(onDragStart.toJsFn)
    __obj.updateDynamic("onExpand")(onExpand.toJsFn)
    __obj.updateDynamic("renderItem")(renderItem.toJsFn)
    __obj.asInstanceOf[AnonIsDragEnabled]
  }
}

