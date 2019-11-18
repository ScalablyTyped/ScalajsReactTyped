package typingsJapgolly.antd.libSpinMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spin
  extends Component[SpinProps, SpinState, js.Any] {
  def cancelExistingSpin(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSpin(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSpin(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSpin(): Unit = js.native
  def debouncifyUpdateSpinning(): Unit = js.native
  def debouncifyUpdateSpinning(props: SpinProps): Unit = js.native
  def isNestedPattern(): Boolean = js.native
  def originalUpdateSpinning(): Unit = js.native
  def renderSpin(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def updateSpinning(): Unit = js.native
}

