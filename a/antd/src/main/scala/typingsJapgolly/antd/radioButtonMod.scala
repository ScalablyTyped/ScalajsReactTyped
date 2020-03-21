package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.checkboxCheckboxMod.AbstractCheckboxProps
import typingsJapgolly.antd.radioInterfaceMod.RadioChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radioButton", JSImport.Namespace)
@js.native
object radioButtonMod extends js.Object {
  def default(props: RadioButtonProps): Element = js.native
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
}

