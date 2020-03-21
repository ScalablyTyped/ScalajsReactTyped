package typingsJapgolly.antd.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.AnonType
import typingsJapgolly.antd.TypeofRadioGroup
import typingsJapgolly.antd.radioButtonMod.RadioButtonProps
import typingsJapgolly.antd.radioInterfaceMod.RadioGroupContextProps
import typingsJapgolly.antd.radioMod.default
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Radio")
@js.native
class Radio () extends default

/* static members */
@JSImport("antd", "Radio")
@js.native
object Radio extends js.Object {
  var Button: js.Function1[/* props */ RadioButtonProps, Element] = js.native
  var Group: TypeofRadioGroup = js.native
  var contextType: Context[RadioGroupContextProps | Null] = js.native
  var defaultProps: AnonType = js.native
}

