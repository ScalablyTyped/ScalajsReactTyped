package typingsJapgolly.antd

import typingsJapgolly.antd.libCheckboxCheckboxMod.AbstractCheckboxProps
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.antd.libRadioInterfaceMod.RadioChangeEvent
import typingsJapgolly.antd.libRadioRadioButtonMod.RadioButton
import typingsJapgolly.antd.libRadioRadioButtonMod.RadioButtonProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radioButton", JSImport.Namespace)
@js.native
object libRadioRadioButtonMod extends js.Object {
  @js.native
  trait RadioButton
    extends Component[RadioButtonProps, js.Any, js.Any] {
    def renderRadioButton(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends RadioButton
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: Anon_RadioGroup = js.native
  }
  
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
}

