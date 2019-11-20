package typingsJapgolly.antd.libAutoDashCompleteMod

import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoComplete
  extends Component[AutoCompleteProps, js.Object, js.Any] {
  var select: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getInputElement(): Element = js.native
  def renderAutoComplete(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveSelect(node: js.Any): Unit = js.native
}

