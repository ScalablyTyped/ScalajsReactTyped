package typingsJapgolly.antd.libGridRowMod

import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row
  extends Component[RowProps, RowState, js.Any] {
  var token: String = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRow(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MRow(): Unit = js.native
  def getGutter(): js.Tuple2[Double, Double] = js.native
  def renderRow(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

