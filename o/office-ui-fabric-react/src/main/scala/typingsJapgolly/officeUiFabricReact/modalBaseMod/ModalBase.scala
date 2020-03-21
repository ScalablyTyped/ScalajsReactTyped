package typingsJapgolly.officeUiFabricReact.modalBaseMod

import typingsJapgolly.officeUiFabricReact.modalTypesMod.IModal
import typingsJapgolly.officeUiFabricReact.modalTypesMod.IModalProps
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Modal/Modal.base", "ModalBase")
@js.native
class ModalBase protected ()
  extends BaseComponent[IModalProps, IDialogState]
     with IModal {
  def this(props: IModalProps) = this()
  var _allowScrollOnModal: js.Any = js.native
  var _allowTouchBodyScroll: js.Any = js.native
  var _focusTrapZone: js.Any = js.native
  var _getMoveDelta: js.Any = js.native
  var _hasRegisteredKeyUp: js.Any = js.native
  var _lastSetX: js.Any = js.native
  var _lastSetY: js.Any = js.native
  var _onDrag: js.Any = js.native
  var _onDragStart: js.Any = js.native
  var _onDragStop: js.Any = js.native
  var _onEnterKeyboardMoveMode: js.Any = js.native
  var _onExitKeyboardMoveMode: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onKeyUp: js.Any = js.native
  var _onModalClose: js.Any = js.native
  var _onModalCloseTimer: js.Any = js.native
  var _onModalContextMenuClose: js.Any = js.native
  var _registerForKeyUp: js.Any = js.native
  var _scrollableContent: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MModalBase(newProps: IModalProps): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MModalBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MModalBase(prevProps: IModalProps, prevState: IDialogState): Unit = js.native
  /**
    * Sets focus on the first focusable, or configured, child in focus trap zone
    */
  /* CompleteClass */
  override def focus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Modal/Modal.base", "ModalBase")
@js.native
object ModalBase extends js.Object {
  var defaultProps: IModalProps = js.native
}

