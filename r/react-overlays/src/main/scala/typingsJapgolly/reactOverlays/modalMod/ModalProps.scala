package typingsJapgolly.reactOverlays.modalMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactOverlays.mod.TransitionCallbacks
import typingsJapgolly.reactOverlays.portalMod.PortalProps
import typingsJapgolly.reactOverlays.reactOverlaysStrings.static
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps
  extends TransitionCallbacks
     with PortalProps {
  /**
    * When `true` The modal will automatically shift focus to itself when it opens, and
    * replace it to the last focused element when it closes. This also
    * works correctly with any Modal children that have the `autoFocus` prop.
    *
    * Generally this should never be set to `false` as it makes the Modal less
    * accessible to assistive technologies, like screen readers.
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Include a backdrop component.
    */
  var backdrop: js.UndefOr[Boolean | static] = js.undefined
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component used
    * to control animations for the backdrop components.
    */
  var backdropTransition: js.UndefOr[ComponentType[TransitionProps]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /**
    * A css class or set of classes applied to the modal container when the modal is open,
    * and removed when it is closed.
    */
  var containerClassName: js.UndefOr[String] = js.undefined
  /**
    * When `true` The modal will prevent focus from leaving the Modal while open.
    *
    * Generally this should never be set to `false` as it makes the Modal less
    * accessible to assistive technologies, like screen readers.
    */
  var enforceFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Close the modal when escape key is pressed
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * A ModalManager instance used to track and manage the state of open
    * Modals. Useful when customizing how modals interact within a container
    */
  var manager: js.UndefOr[typingsJapgolly.reactOverlays.modalManagerMod.^] = js.undefined
  /**
    * A callback fired when the backdrop, if specified, is clicked.
    */
  var onBackdropClick: js.UndefOr[js.Function] = js.undefined
  /**
    * A callback fired when the escape key, if specified in `keyboard`, is pressed.
    */
  var onEscapeKeyDown: js.UndefOr[js.Function] = js.undefined
  /**
    * A callback fired when either the backdrop is clicked, or the escape key is pressed.
    *
    * The `onHide` callback only signals intent from the Modal,
    * you must actually set the `show` prop to `false` for the Modal to close.
    */
  var onHide: js.UndefOr[js.Function] = js.undefined
  /**
    * A callback fired when the Modal is opening.
    */
  var onShow: js.UndefOr[js.Function] = js.undefined
  /**
    * A function that returns a backdrop component. Useful for custom
    * backdrop rendering.
    *
    * ```js
    *  renderBackdrop={props => <MyBackdrop {...props} />}
    * ```
    */
  var renderBackdrop: js.UndefOr[js.Function1[/* props */ js.Any, Node]] = js.undefined
  /**
    * A function that returns the dialog component. Useful for custom
    * rendering. **Note:** the component should make sure to apply the provided ref.
    *
    * ```js
    *  renderDialog={props => <MyDialog {...props} />}
    * ```
    */
  var renderDialog: js.UndefOr[js.Function1[/* props */ js.Any, Node]] = js.undefined
  /**
    * When `true` The modal will restore focus to previously focused element once
    * modal is hidden
    */
  var restoreFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the visibility of the Modal
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component used
    * to control animations for the dialog component.
    */
  var transition: js.UndefOr[ComponentType[TransitionProps]] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backdrop: Boolean | static = null,
    backdropTransition: ComponentType[TransitionProps] = null,
    className: String = null,
    container: Node | js.Function = null,
    containerClassName: String = null,
    enforceFocus: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    manager: typingsJapgolly.reactOverlays.modalManagerMod.^ = null,
    onBackdropClick: js.Function = null,
    onEnter: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntered: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEntering: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onEscapeKeyDown: js.Function = null,
    onExit: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExited: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onExiting: /* node */ HTMLElement => CallbackTo[js.Any] = null,
    onHide: js.Function = null,
    onRendered: js.Function = null,
    onShow: js.Function = null,
    renderBackdrop: /* props */ js.Any => CallbackTo[Node] = null,
    renderDialog: /* props */ js.Any => CallbackTo[Node] = null,
    restoreFocus: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    transition: ComponentType[TransitionProps] = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (backdropTransition != null) __obj.updateDynamic("backdropTransition")(backdropTransition.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (manager != null) __obj.updateDynamic("manager")(manager.asInstanceOf[js.Any])
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(onBackdropClick.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEnter(t0).runNow()))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntered(t0).runNow()))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onEntering(t0).runNow()))
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(onEscapeKeyDown.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExit(t0).runNow()))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExited(t0).runNow()))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExiting(t0).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (renderBackdrop != null) __obj.updateDynamic("renderBackdrop")(js.Any.fromFunction1((t0: /* props */ js.Any) => renderBackdrop(t0).runNow()))
    if (renderDialog != null) __obj.updateDynamic("renderDialog")(js.Any.fromFunction1((t0: /* props */ js.Any) => renderDialog(t0).runNow()))
    if (!js.isUndefined(restoreFocus)) __obj.updateDynamic("restoreFocus")(restoreFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

