package typingsJapgolly.reactDashTransitionDashGroup.cSSTransitionMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactDashTransitionDashGroup.Anon_Appear
import typingsJapgolly.reactDashTransitionDashGroup.transitionMod.TransitionChildren
import typingsJapgolly.reactDashTransitionDashGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSTransitionProps extends TransitionProps {
  /**
    * The animation `classNames` applied to the component as it enters or exits.
    * A single name can be provided and it will be suffixed for each stage: e.g.
    *
    * `classNames="fade"` applies `fade-enter`, `fade-enter-active`,
    * `fade-exit`, `fade-exit-active`, `fade-appear`, and `fade-appear-active`.
    *
    * Each individual classNames can also be specified independently like:
    *
    * ```js
    * classNames={{
    *   appear: 'my-appear',
    *   appearActive: 'my-appear-active',
    *   appearDone: 'my-appear-done',
    *   enter: 'my-enter',
    *   enterActive: 'my-enter-active',
    *   enterDone: 'my-enter-done',
    *   exit: 'my-exit',
    *   exitActive: 'my-exit-active',
    *   exitDone: 'my-exit-done'
    * }}
    * ```
    */
  var classNames: js.UndefOr[String | CSSTransitionClassNames] = js.undefined
}

object CSSTransitionProps {
  @scala.inline
  def apply(
    timeout: Double | Anon_Appear,
    addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Callback = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    children: TransitionChildren = null,
    classNames: String | CSSTransitionClassNames = null,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onEnter: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Callback = null,
    onEntered: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Callback = null,
    onEntering: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Callback = null,
    onExit: /* node */ HTMLElement => Callback = null,
    onExited: /* node */ HTMLElement => Callback = null,
    onExiting: /* node */ HTMLElement => Callback = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): CSSTransitionProps = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* done */ js.Function0[scala.Unit]) => addEndListener(t0, t1).runNow()))
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* isAppearing */ scala.Boolean) => onEnter(t0, t1).runNow()))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* isAppearing */ scala.Boolean) => onEntered(t0, t1).runNow()))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* isAppearing */ scala.Boolean) => onEntering(t0, t1).runNow()))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExit(t0).runNow()))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExited(t0).runNow()))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExiting(t0).runNow()))
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionProps]
  }
}

