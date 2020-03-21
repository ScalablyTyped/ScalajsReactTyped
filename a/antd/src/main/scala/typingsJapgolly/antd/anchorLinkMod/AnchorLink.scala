package typingsJapgolly.antd.anchorLinkMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.AnonAntAnchorAntAnchor
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorLink
  extends Component[AnchorLinkProps, js.Any, js.Any] {
  @JSName("context")
  var context_AnchorLink: AnonAntAnchorAntAnchor = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAnchorLink(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchorLink(hasHref: AnchorLinkProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchorLink(): Unit = js.native
  def handleClick(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def renderAnchorLink(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

