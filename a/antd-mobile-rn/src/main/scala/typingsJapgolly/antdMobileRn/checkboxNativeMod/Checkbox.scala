package typingsJapgolly.antdMobileRn.checkboxNativeMod

import typingsJapgolly.antdMobileRn.checkboxPropsTypeMod.CheckboxPropsType
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox
  extends Component[ICheckboxNativeProps, js.Any, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCheckbox(nextProps: CheckboxPropsType): Unit = js.native
  def handleClick(): Unit = js.native
}

