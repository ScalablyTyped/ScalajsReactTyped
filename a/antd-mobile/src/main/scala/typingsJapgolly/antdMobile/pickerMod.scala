package typingsJapgolly.antdMobile

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antdMobile.abstractPickerMod.AbstractPicker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/picker", JSImport.Namespace)
@js.native
object pickerMod extends js.Object {
  @js.native
  trait Picker extends AbstractPicker {
    var popupProps: AnonMaskTransitionName = js.native
  }
  
  @js.native
  class default () extends Picker
  
  val nonsense: Element = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: AnonAntLocale = js.native
    var defaultProps: AnonCascade = js.native
  }
  
}

