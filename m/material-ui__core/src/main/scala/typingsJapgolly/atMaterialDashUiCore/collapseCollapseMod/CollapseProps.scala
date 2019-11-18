package typingsJapgolly.atMaterialDashUiCore.collapseCollapseMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.atMaterialDashUiCore.PartialClassNameMapCollapseClassKey
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.auto
import typingsJapgolly.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.ReactType
import typingsJapgolly.reactDashTransitionDashGroup.Anon_Appear
import typingsJapgolly.reactDashTransitionDashGroup.transitionMod.EndHandler
import typingsJapgolly.reactDashTransitionDashGroup.transitionMod.EnterHandler
import typingsJapgolly.reactDashTransitionDashGroup.transitionMod.ExitHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/transitions/transition.TransitionProps, @material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey, 'timeout'> */
trait CollapseProps extends js.Object {
  var addEndListener: js.UndefOr[EndHandler] = js.undefined
  var appear: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[PartialClassNameMapCollapseClassKey] = js.undefined
  var collapsedHeight: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[ReactType[CollapseProps]] = js.undefined
  var enter: js.UndefOr[Boolean] = js.undefined
  var exit: js.UndefOr[Boolean] = js.undefined
  var in: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref | RefHandle[_]] = js.undefined
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  var onEnter: js.UndefOr[EnterHandler] = js.undefined
  var onEntered: js.UndefOr[EnterHandler] = js.undefined
  var onEntering: js.UndefOr[EnterHandler] = js.undefined
  var onExit: js.UndefOr[ExitHandler] = js.undefined
  var onExited: js.UndefOr[ExitHandler] = js.undefined
  var onExiting: js.UndefOr[ExitHandler] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var timeout: js.UndefOr[Double | Anon_Appear | auto] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Callback = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    classes: PartialClassNameMapCollapseClassKey = null,
    collapsedHeight: String = null,
    component: ReactType[CollapseProps] = null,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref | RefHandle[_] = null,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onEnter: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Callback = null,
    onEntered: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Callback = null,
    onEntering: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Callback = null,
    onExit: /* node */ HTMLElement => Callback = null,
    onExited: /* node */ HTMLElement => Callback = null,
    onExiting: /* node */ HTMLElement => Callback = null,
    style: CSSProperties = null,
    theme: Theme = null,
    timeout: Double | Anon_Appear | auto = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* done */ js.Function0[scala.Unit]) => addEndListener(t0, t1).runNow()))
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (collapsedHeight != null) __obj.updateDynamic("collapsedHeight")(collapsedHeight.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* isAppearing */ scala.Boolean) => onEnter(t0, t1).runNow()))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* isAppearing */ scala.Boolean) => onEntered(t0, t1).runNow()))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* isAppearing */ scala.Boolean) => onEntering(t0, t1).runNow()))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExit(t0).runNow()))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExited(t0).runNow()))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onExiting(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
}

