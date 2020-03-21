package typingsJapgolly.antd.directoryTreeMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.AnonEvent
import typingsJapgolly.antd.AnonExpanded
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTree
  extends Component[DirectoryTreeProps, DirectoryTreeState, js.Any] {
  var cachedSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  var lastSelectedKey: js.UndefOr[String] = js.native
  var tree: typingsJapgolly.antd.treeTreeMod.default = js.native
  def expandFolderNode(event: ReactMouseEventFrom[HTMLElement], node: js.Any): Unit = js.native
  def onClick(
    event: ReactMouseEventFrom[HTMLElement],
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): Unit = js.native
  def onDebounceExpand(
    event: ReactMouseEventFrom[HTMLElement],
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): Unit = js.native
  def onDoubleClick(
    event: ReactMouseEventFrom[HTMLElement],
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): Unit = js.native
  def onExpand(expandedKeys: js.Array[String], info: AnonExpanded): Unit = js.native
  def onSelect(keys: js.Array[String], event: AnonEvent): Unit = js.native
  def renderDirectoryTree(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def setTreeRef(node: typingsJapgolly.antd.treeTreeMod.default): Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): Unit = js.native
}

