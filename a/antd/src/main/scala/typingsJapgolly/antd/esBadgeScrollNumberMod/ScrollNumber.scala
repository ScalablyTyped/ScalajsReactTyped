package typingsJapgolly.antd.esBadgeScrollNumberMod

import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentElement
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollNumber
  extends Component[ScrollNumberProps, ScrollNumberState, js.Any] {
  var lastCount: js.UndefOr[String | Double | Null] = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MScrollNumber(`_`: js.Any, prevState: ScrollNumberState): Unit = js.native
  def getPositionByNum(num: Double, i: Double): Double = js.native
  def onAnimated(): Unit = js.native
  def renderCurrentNumber(prefixCls: String, num: String, i: Double): Element = js.native
  def renderCurrentNumber(prefixCls: String, num: Double, i: Double): Element = js.native
  def renderNumberElement(prefixCls: String): js.UndefOr[String | Double | js.Array[Element] | Null] = js.native
  def renderScrollNumber(hasGetPrefixCls: ConfigConsumerProps): (ComponentElement[_, japgolly.scalajs.react.raw.React.Component[js.Object, js.Object]]) | japgolly.scalajs.react.raw.React.Element = js.native
}

