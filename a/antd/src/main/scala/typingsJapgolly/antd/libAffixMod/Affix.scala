package typingsJapgolly.antd.libAffixMod

import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Affix
  extends Component[AffixProps, AffixState, js.Any] {
  var fixedNode: HTMLDivElement = js.native
  var placeholderNode: HTMLDivElement = js.native
  var timeout: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAffix(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAffix(prevProps: AffixProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAffix(): Unit = js.native
  def getOffsetBottom(): js.UndefOr[Double] = js.native
  def getOffsetTop(): js.UndefOr[Double] = js.native
  def lazyUpdatePosition(): Unit = js.native
  def measure(): Unit = js.native
  def prepareMeasure(): Unit = js.native
  def renderAffix(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveFixedNode(node: HTMLDivElement): Unit = js.native
  def savePlaceholderNode(node: HTMLDivElement): Unit = js.native
  def updatePosition(): Unit = js.native
}

