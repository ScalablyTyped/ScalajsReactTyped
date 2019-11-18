package typingsJapgolly.antd.libRateMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rate
  extends Component[RateProps, js.Any, js.Any] {
  var rcRate: js.Any = js.native
  def blur(): Unit = js.native
  def characterRender(node: Node, hasIndex: RateNodeProps): js.UndefOr[js.Object | Null] = js.native
  def focus(): Unit = js.native
  def renderRate(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveRate(node: js.Any): Unit = js.native
}

