package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.radioButtonMod.RadioButtonProps
import typingsJapgolly.antd.radioInterfaceMod.RadioGroupContextProps
import typingsJapgolly.antd.radioInterfaceMod.RadioGroupProps
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio", JSImport.Namespace)
@js.native
object radioMod extends js.Object {
  @js.native
  class Group protected ()
    extends typingsJapgolly.antd.radioGroupMod.default {
    def this(props: RadioGroupProps) = this()
  }
  
  @js.native
  class default ()
    extends typingsJapgolly.antd.radioRadioMod.default
  
  def Button(props: RadioButtonProps): Element = js.native
  /* static members */
  @js.native
  object Group extends js.Object {
    var defaultProps: AnonButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps): AnonValueAny | Null = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: js.Function1[/* props */ RadioButtonProps, Element] = js.native
    var Group: TypeofRadioGroup = js.native
    var contextType: Context[RadioGroupContextProps | Null] = js.native
    var defaultProps: AnonType = js.native
  }
  
}

