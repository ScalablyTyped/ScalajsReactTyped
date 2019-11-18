package typingsJapgolly.antd.esTreeDirectoryTreeMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeExpandedEvent
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeProps
import typingsJapgolly.antd.esTreeTreeMod.AntTreeNodeSelectedEvent
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTree
  extends Component[DirectoryTreeProps, DirectoryTreeState, js.Any] {
  var cachedSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  var lastSelectedKey: js.UndefOr[String] = js.native
  var tree: typingsJapgolly.antd.esTreeTreeMod.default = js.native
  def expandFolderNode(
    event: ReactMouseEventFrom[HTMLElement],
    node: japgolly.scalajs.react.raw.React.Component[AntTreeNodeProps with js.Object, js.Object]
  ): Unit = js.native
  def onClick(
    event: ReactMouseEventFrom[HTMLElement],
    node: japgolly.scalajs.react.raw.React.Component[AntTreeNodeProps with js.Object, js.Object]
  ): Unit = js.native
  def onDebounceExpand(
    event: ReactMouseEventFrom[HTMLElement],
    node: japgolly.scalajs.react.raw.React.Component[AntTreeNodeProps with js.Object, js.Object]
  ): Unit = js.native
  def onDoubleClick(
    event: ReactMouseEventFrom[HTMLElement],
    node: japgolly.scalajs.react.raw.React.Component[AntTreeNodeProps with js.Object, js.Object]
  ): Unit = js.native
  def onExpand(expandedKeys: js.Array[String], info: AntTreeNodeExpandedEvent): Unit | js.Thenable[Unit] = js.native
  def onSelect(keys: js.Array[String], event: AntTreeNodeSelectedEvent): Unit = js.native
  def renderDirectoryTree(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def setTreeRef(node: typingsJapgolly.antd.esTreeTreeMod.default): Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): Unit = js.native
}

