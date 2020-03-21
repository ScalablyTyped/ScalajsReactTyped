package typingsJapgolly.antd.collapseCollapseMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collapse
  extends Component[CollapseProps, js.Any, js.Any] {
  def renderCollapse(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderExpandIcon(panelProps: js.UndefOr[scala.Nothing], prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def renderExpandIcon(panelProps: PanelProps, prefixCls: String): js.UndefOr[js.Object | Null] = js.native
}

