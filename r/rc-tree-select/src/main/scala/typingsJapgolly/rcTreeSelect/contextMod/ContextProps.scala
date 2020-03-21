package typingsJapgolly.rcTreeSelect.contextMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcTreeSelect.interfaceMod.Key
import typingsJapgolly.rcTreeSelect.interfaceMod.LegacyDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextProps extends js.Object {
  var checkable: Boolean | Node
  var checkedKeys: js.Array[Key]
  var halfCheckedKeys: js.Array[Key]
  var showTreeIcon: Boolean
  var switcherIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  var treeDefaultExpandAll: Boolean
  var treeDefaultExpandedKeys: js.Array[Key]
  var treeExpandedKeys: js.Array[Key]
  var treeIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  var treeLine: Boolean
  var treeLoadedKeys: js.Array[Key]
  var treeMotion: js.Any
  var treeNodeFilterProp: String
  def loadData(treeNode: LegacyDataNode): js.Promise[_]
  def onTreeExpand(keys: js.Array[Key]): Unit
  def onTreeLoad(loadedKeys: js.Array[Key]): Unit
}

object ContextProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[Key],
    halfCheckedKeys: js.Array[Key],
    loadData: LegacyDataNode => CallbackTo[js.Promise[js.Any]],
    onTreeExpand: js.Array[Key] => Callback,
    onTreeLoad: js.Array[Key] => Callback,
    showTreeIcon: Boolean,
    switcherIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any,
    treeDefaultExpandAll: Boolean,
    treeDefaultExpandedKeys: js.Array[Key],
    treeExpandedKeys: js.Array[Key],
    treeIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any,
    treeLine: Boolean,
    treeLoadedKeys: js.Array[Key],
    treeMotion: js.Any,
    treeNodeFilterProp: String,
    checkable: Boolean | Node = null
  ): ContextProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], showTreeIcon = showTreeIcon.asInstanceOf[js.Any], switcherIcon = switcherIcon.asInstanceOf[js.Any], treeDefaultExpandAll = treeDefaultExpandAll.asInstanceOf[js.Any], treeDefaultExpandedKeys = treeDefaultExpandedKeys.asInstanceOf[js.Any], treeExpandedKeys = treeExpandedKeys.asInstanceOf[js.Any], treeIcon = treeIcon.asInstanceOf[js.Any], treeLine = treeLine.asInstanceOf[js.Any], treeLoadedKeys = treeLoadedKeys.asInstanceOf[js.Any], treeMotion = treeMotion.asInstanceOf[js.Any], treeNodeFilterProp = treeNodeFilterProp.asInstanceOf[js.Any])
    __obj.updateDynamic("loadData")(js.Any.fromFunction1((t0: typingsJapgolly.rcTreeSelect.interfaceMod.LegacyDataNode) => loadData(t0).runNow()))
    __obj.updateDynamic("onTreeExpand")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.rcTreeSelect.interfaceMod.Key]) => onTreeExpand(t0).runNow()))
    __obj.updateDynamic("onTreeLoad")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.rcTreeSelect.interfaceMod.Key]) => onTreeLoad(t0).runNow()))
    if (checkable != null) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextProps]
  }
}

