package typingsJapgolly.reactNativeModalPopover.popoverTouchableMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeModalPopover.AnonOnPopoverDisplayed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal-popover/lib/PopoverTouchable", "PopoverTouchable")
@js.native
class PopoverTouchable protected ()
  extends Component[Props, State, js.Any] {
  def this(props: Props) = this()
  var onClosePopover: js.Any = js.native
  var onOrientationChange: js.Any = js.native
  var onPress: js.Any = js.native
  var onTouchableMeasured: js.Any = js.native
  var setRef: js.Any = js.native
  var touchable: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPopoverTouchable(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPopoverTouchable(): Unit = js.native
}

/* static members */
@JSImport("react-native-modal-popover/lib/PopoverTouchable", "PopoverTouchable")
@js.native
object PopoverTouchable extends js.Object {
  var propTypes: AnonOnPopoverDisplayed = js.native
}

