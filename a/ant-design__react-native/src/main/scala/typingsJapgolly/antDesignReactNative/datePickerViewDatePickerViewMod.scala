package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.datePickerViewPropsTypeMod.DatePickerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", JSImport.Namespace)
@js.native
object datePickerViewDatePickerViewMod extends js.Object {
  @js.native
  trait DatePickerView
    extends Component[DatePickerProps, js.Any, js.Any]
  
  @js.native
  class default () extends DatePickerView
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: AnonAntLocale = js.native
    var defaultProps: AnonMinuteStep = js.native
  }
  
}

