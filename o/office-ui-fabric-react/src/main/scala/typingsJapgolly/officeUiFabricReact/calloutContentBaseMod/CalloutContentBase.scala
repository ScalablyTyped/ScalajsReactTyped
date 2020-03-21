package typingsJapgolly.officeUiFabricReact.calloutContentBaseMod

import typingsJapgolly.officeUiFabricReact.AnonDirectionalHint
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.KeyboardEvent
import typingsJapgolly.std.Event_
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase")
@js.native
class CalloutContentBase protected ()
  extends Component[ICalloutProps, ICalloutState, js.Any] {
  def this(props: ICalloutProps) = this()
  var _addListeners: js.Any = js.native
  var _arePositionsEqual: js.Any = js.native
  var _async: js.Any = js.native
  var _blockResetHeight: js.Any = js.native
  var _bounds: js.Any = js.native
  var _calloutElement: js.Any = js.native
  var _classNames: js.Any = js.native
  var _comparePositions: js.Any = js.native
  var _didPositionPropsChange: js.Any = js.native
  var _didSetInitialFocus: js.Any = js.native
  var _dismissOnClickOrScroll: js.Any = js.native
  var _disposables: js.Any = js.native
  var _getBeakPosition: js.Any = js.native
  var _getBounds: js.Any = js.native
  var _getMaxHeight: js.Any = js.native
  var _getTarget: js.Any = js.native
  var _hasListeners: js.Any = js.native
  var _hostElement: js.Any = js.native
  var _isMouseDownOnPopup: js.Any = js.native
  var _maxHeight: js.Any = js.native
  var _mouseDownOnPopup: js.Any = js.native
  var _mouseUpOnPopup: js.Any = js.native
  var _positionAttempts: js.Any = js.native
  var _removeListeners: js.Any = js.native
  var _setHeightOffsetEveryFrame: js.Any = js.native
  var _setHeightOffsetTimer: js.Any = js.native
  var _setTargetWindowAndElement: js.Any = js.native
  var _target: js.Any = js.native
  var _targetWindow: js.Any = js.native
  var _updateAsyncPosition: js.Any = js.native
  var _updatePosition: js.Any = js.native
  @JSName("UNSAFE_componentWillMount")
  def UNSAFE_componentWillMount_MCalloutContentBase(): Unit = js.native
  @JSName("UNSAFE_componentWillUpdate")
  def UNSAFE_componentWillUpdate_MCalloutContentBase(newProps: ICalloutProps): Unit = js.native
  /* protected */ def _dismissOnLostFocus(ev: Event_): Unit = js.native
  /* protected */ def _dismissOnResize(ev: Event_): Unit = js.native
  /* protected */ def _dismissOnScroll(ev: Event_): Unit = js.native
  /* protected */ def _onComponentDidMount(): Unit = js.native
  /* protected */ def _setInitialFocus(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCalloutContentBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCalloutContentBase(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCalloutContentBase(): Unit = js.native
  def dismiss(): Unit = js.native
  def dismiss(ev: KeyboardEvent[HTMLElement]): Unit = js.native
  def dismiss(ev: typingsJapgolly.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def dismiss(ev: Event_): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCalloutContentBase(newProps: ICalloutProps, newState: ICalloutState): Boolean = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase")
@js.native
object CalloutContentBase extends js.Object {
  var defaultProps: AnonDirectionalHint = js.native
}

