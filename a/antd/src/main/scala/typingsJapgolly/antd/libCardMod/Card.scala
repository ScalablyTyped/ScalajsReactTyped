package typingsJapgolly.antd.libCardMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card
  extends Component[CardProps, js.Object, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MCard(): Unit = js.native
  def getCompatibleHoverable(): js.UndefOr[Boolean] = js.native
  def isContainGrid(): js.UndefOr[scala.Nothing] = js.native
  def onTabChange(key: String): Unit = js.native
  def renderCard(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

