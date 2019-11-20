package typingsJapgolly.antd.esCheckboxGroupMod

import typingsJapgolly.antd.Anon_CheckboxGroupAnonCancelValue
import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxGroup
  extends Component[CheckboxGroupProps, CheckboxGroupState, js.Any] {
  def cancelValue(value: String): Unit = js.native
  def getChildContext(): Anon_CheckboxGroupAnonCancelValue = js.native
  def getOptions(): js.Array[CheckboxOptionType] = js.native
  def registerValue(value: String): Unit = js.native
  def renderGroup(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCheckboxGroup(nextProps: CheckboxGroupProps, nextState: CheckboxGroupState): Boolean = js.native
  def toggleOption(option: CheckboxOptionType): Unit = js.native
}

