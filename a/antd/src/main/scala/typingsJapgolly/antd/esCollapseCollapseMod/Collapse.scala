package typingsJapgolly.antd.esCollapseCollapseMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collapse
  extends Component[CollapseProps, js.Any, js.Any] {
  def renderCollapse(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderExpandIcon(panelProps: js.UndefOr[scala.Nothing], prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def renderExpandIcon(panelProps: PanelProps, prefixCls: String): js.UndefOr[js.Object | Null] = js.native
}

