package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData
import typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityOnPassed
import typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityProps
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.events
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.repaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Visibility {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    context: js.Object = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    offset: Double | String | (js.Array[Double | String]) = null,
    onBottomPassed: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onBottomPassedReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onBottomVisible: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onBottomVisibleReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onOffScreen: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onOnScreen: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onPassed: VisibilityOnPassed = null,
    onPassing: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onPassingReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onTopPassed: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onTopPassedReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onTopVisible: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onTopVisibleReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onUpdate: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    once: js.UndefOr[Boolean] = js.undefined,
    updateOn: events | repaint = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[VisibilityProps, default, Unit, VisibilityProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottomPassed != null) __obj.updateDynamic("onBottomPassed")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onBottomPassed(t0, t1).runNow()))
    if (onBottomPassedReverse != null) __obj.updateDynamic("onBottomPassedReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onBottomPassedReverse(t0, t1).runNow()))
    if (onBottomVisible != null) __obj.updateDynamic("onBottomVisible")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onBottomVisible(t0, t1).runNow()))
    if (onBottomVisibleReverse != null) __obj.updateDynamic("onBottomVisibleReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onBottomVisibleReverse(t0, t1).runNow()))
    if (onOffScreen != null) __obj.updateDynamic("onOffScreen")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onOffScreen(t0, t1).runNow()))
    if (onOnScreen != null) __obj.updateDynamic("onOnScreen")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onOnScreen(t0, t1).runNow()))
    if (onPassed != null) __obj.updateDynamic("onPassed")(onPassed.asInstanceOf[js.Any])
    if (onPassing != null) __obj.updateDynamic("onPassing")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onPassing(t0, t1).runNow()))
    if (onPassingReverse != null) __obj.updateDynamic("onPassingReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onPassingReverse(t0, t1).runNow()))
    if (onTopPassed != null) __obj.updateDynamic("onTopPassed")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onTopPassed(t0, t1).runNow()))
    if (onTopPassedReverse != null) __obj.updateDynamic("onTopPassedReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onTopPassedReverse(t0, t1).runNow()))
    if (onTopVisible != null) __obj.updateDynamic("onTopVisible")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onTopVisible(t0, t1).runNow()))
    if (onTopVisibleReverse != null) __obj.updateDynamic("onTopVisibleReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onTopVisibleReverse(t0, t1).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityEventData) => onUpdate(t0, t1).runNow()))
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityMod.default](js.constructorOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod.VisibilityProps])(children: _*)
  }
}

