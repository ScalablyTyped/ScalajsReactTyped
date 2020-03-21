package typingsJapgolly.reactNative.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "Picker")
@js.native
class Picker ()
  extends Component[PickerProps, js.Object, js.Any]

/* static members */
@JSImport("react-native", "Picker")
@js.native
object Picker extends js.Object {
  var Item: ComponentType[PickerItemProps] = js.native
  /**
    * On Android, display the options in a dialog.
    */
  var MODE_DIALOG: String = js.native
  /**
    * On Android, display the options in a dropdown (this is the default).
    */
  var MODE_DROPDOWN: String = js.native
}

