package typingsJapgolly.officeUiFabricReact.coachmarkBaseMod

import typingsJapgolly.officeUiFabricReact.PartialICoachmarkProps
import typingsJapgolly.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typingsJapgolly.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import typingsJapgolly.react.mod.KeyboardEvent
import typingsJapgolly.std.Event_
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
@js.native
class CoachmarkBase protected ()
  extends BaseComponent[ICoachmarkProps, ICoachmarkState]
     with ICoachmark {
  def this(props: ICoachmarkProps) = this()
  var _addListeners: js.Any = js.native
  var _addProximityHandler: js.Any = js.native
  var _ariaAlertContainer: js.Any = js.native
  val _beakDirection: js.Any = js.native
  var _childrenContainer: js.Any = js.native
  var _dismissOnLostFocus: js.Any = js.native
  /**
    * The cached HTMLElement reference to the Entity Inner Host
    * element.
    */
  var _entityHost: js.Any = js.native
  var _entityInnerHostElement: js.Any = js.native
  var _getBounds: js.Any = js.native
  var _isInsideElement: js.Any = js.native
  var _onFocusHandler: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onPositioned: js.Any = js.native
  var _openCoachmark: js.Any = js.native
  var _positioningContainer: js.Any = js.native
  var _setBeakPosition: js.Any = js.native
  var _setTargetElementRect: js.Any = js.native
  /**
    * The target element the mouse would be in
    * proximity to
    */
  var _targetElementRect: js.Any = js.native
  var _translateAnimationContainer: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MCoachmarkBase(newProps: ICoachmarkProps): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCoachmarkBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCoachmarkBase(prevProps: ICoachmarkProps, prevState: ICoachmarkState): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: KeyboardEvent[HTMLElement]): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: typingsJapgolly.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: Event_): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCoachmarkBase(newProps: ICoachmarkProps, newState: ICoachmarkState): Boolean = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
@js.native
object CoachmarkBase extends js.Object {
  var defaultProps: PartialICoachmarkProps = js.native
}

