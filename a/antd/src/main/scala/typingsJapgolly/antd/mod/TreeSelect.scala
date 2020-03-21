package typingsJapgolly.antd.mod

import typingsJapgolly.antd.AnonChoiceTransitionName
import typingsJapgolly.antd.treeSelectMod.TreeSelectProps
import typingsJapgolly.antd.treeSelectMod.default
import typingsJapgolly.rcTreeSelect.treeNodeMod.TreeNodeProps
import typingsJapgolly.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "TreeSelect")
@js.native
class TreeSelect[T] protected () extends default[T] {
  def this(props: TreeSelectProps[T]) = this()
}

/* static members */
@JSImport("antd", "TreeSelect")
@js.native
object TreeSelect extends js.Object {
  var SHOW_ALL: String = js.native
  var SHOW_CHILD: String = js.native
  var SHOW_PARENT: String = js.native
  var TreeNode: FC[TreeNodeProps] = js.native
  var defaultProps: AnonChoiceTransitionName = js.native
}

