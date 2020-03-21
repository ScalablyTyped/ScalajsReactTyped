package typingsJapgolly.officeUiFabricReact.popupPopupMod

import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.popupTypesMod.IPopupProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Popup/Popup", "Popup")
@js.native
class Popup protected ()
  extends Component[IPopupProps, IPopupState, js.Any] {
  def this(props: IPopupProps) = this()
  var _async: js.Any = js.native
  var _containsFocus: js.Any = js.native
  var _disposables: js.Any = js.native
  var _getScrollBar: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onFocus: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _originalFocusedElement: js.Any = js.native
  var _root: RefHandle[HTMLDivElement] = js.native
  var _updateScrollBarAsync: js.Any = js.native
  @JSName("UNSAFE_componentWillMount")
  def UNSAFE_componentWillMount_MPopup(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPopup(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPopup(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPopup(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Popup/Popup", "Popup")
@js.native
object Popup extends js.Object {
  var defaultProps: IPopupProps = js.native
}

