package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.antd.radioButtonMod.RadioButtonProps
import typingsJapgolly.antd.radioInterfaceMod.RadioChangeEvent
import typingsJapgolly.antd.radioInterfaceMod.RadioGroupContextProps
import typingsJapgolly.antd.radioInterfaceMod.RadioProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radio", JSImport.Namespace)
@js.native
object radioRadioMod extends js.Object {
  @js.native
  trait Radio
    extends Component[RadioProps, js.Object, js.Any] {
    var rcCheckbox: js.Any = js.native
    def blur(): Unit = js.native
    def focus(): Unit = js.native
    def onChange(e: RadioChangeEvent): Unit = js.native
    def renderRadio(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
    def saveCheckbox(node: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Radio
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: js.Function1[/* props */ RadioButtonProps, Element] = js.native
    var Group: TypeofRadioGroup = js.native
    var contextType: Context[RadioGroupContextProps | Null] = js.native
    var defaultProps: AnonType = js.native
  }
  
}

