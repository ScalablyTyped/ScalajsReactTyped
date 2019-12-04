package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.atMaterialDashUiCore.PartialClassNameMapCollapseClassKey
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.auto
import typingsJapgolly.atMaterialDashUiCore.collapseCollapseMod.CollapseProps
import typingsJapgolly.atMaterialDashUiCore.collapseMod.default
import typingsJapgolly.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.ReactType
import typingsJapgolly.reactDashTransitionDashGroup.Anon_Appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  def apply(
    addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Callback = null,
    appear: js.UndefOr[Boolean] = js.undefined,
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
    unmountOnExit: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CollapseProps, default, Unit, CollapseProps] = {
    val __obj = js.Dynamic.literal()
  
      if (addEndListener != null) __obj.updateDynamic("addEndListener")(js.Any.fromFunction2((t0: /* node */ org.scalajs.dom.raw.HTMLElement, t1: /* done */ js.Function0[scala.Unit]) => addEndListener(t0, t1).runNow()))
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.collapseCollapseMod.CollapseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.collapseMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.collapseCollapseMod.CollapseProps])(children: _*)
  }
  @JSImport("@material-ui/core/Collapse", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

