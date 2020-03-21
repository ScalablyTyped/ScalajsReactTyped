package typingsJapgolly.rcTreeSelect

import typingsJapgolly.rcTreeSelect.treeNodeMod.TreeNodeProps
import typingsJapgolly.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default[ValueType] ()
    extends typingsJapgolly.rcTreeSelect.treeSelectMod.default[ValueType]
  
  val SHOW_ALL: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.SHOW_ALL = js.native
  val SHOW_CHILD: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.SHOW_CHILD = js.native
  val SHOW_PARENT: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.SHOW_PARENT = js.native
  /** This is a placeholder, not real render in dom */
  val TreeNode: FC[TreeNodeProps] = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var SHOW_ALL: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.SHOW_ALL = js.native
    var SHOW_CHILD: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.SHOW_CHILD = js.native
    var SHOW_PARENT: typingsJapgolly.rcTreeSelect.rcTreeSelectStrings.SHOW_PARENT = js.native
    var TreeNode: FC[TreeNodeProps] = js.native
  }
  
}

