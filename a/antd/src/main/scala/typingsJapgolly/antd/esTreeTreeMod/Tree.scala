package typingsJapgolly.antd.esTreeTreeMod

import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ReactElement
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tree
  extends Component[TreeProps, js.Any, js.Any] {
  var tree: js.Any = js.native
  def renderSwitcherIcon(
    prefixCls: String,
    switcherIcon: js.UndefOr[scala.Nothing],
    hasIsLeafExpandedLoading: AntTreeNodeProps
  ): Element | Null = js.native
  def renderSwitcherIcon(prefixCls: String, switcherIcon: ReactElement, hasIsLeafExpandedLoading: AntTreeNodeProps): Element | Null = js.native
  def renderTree(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def setTreeRef(node: js.Any): Unit = js.native
}

