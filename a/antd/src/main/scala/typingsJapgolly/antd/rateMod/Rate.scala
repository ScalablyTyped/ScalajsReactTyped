package typingsJapgolly.antd.rateMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
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
  def renderRate(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def saveRate(node: js.Any): Unit = js.native
}

