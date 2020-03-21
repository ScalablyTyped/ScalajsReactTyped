package typingsJapgolly.antd.countdownMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.statisticUtilsMod.FormatConfig
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Countdown
  extends Component[CountdownProps, js.Object, js.Any] {
  var countdownId: js.UndefOr[Double] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCountdown(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCountdown(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCountdown(): Unit = js.native
  def formatCountdown(value: ReactText, config: FormatConfig): String = js.native
  def startTimer(): Unit = js.native
  def stopTimer(): Unit = js.native
  def syncTimer(): Unit = js.native
  def valueRender(node: Element): Element = js.native
}

