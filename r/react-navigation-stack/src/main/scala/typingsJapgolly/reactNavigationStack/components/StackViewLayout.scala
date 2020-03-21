package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigationStack.PickPropsmodeheaderModehe
import typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.card
import typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.modal
import typingsJapgolly.reactNavigationStack.stackViewLayoutMod.default
import typingsJapgolly.reactNavigationStack.typesMod.HeaderBackgroundTransitionPreset
import typingsJapgolly.reactNavigationStack.typesMod.HeaderLayoutPreset
import typingsJapgolly.reactNavigationStack.typesMod.HeaderMode
import typingsJapgolly.reactNavigationStack.typesMod.HeaderTransitionConfig
import typingsJapgolly.reactNavigationStack.typesMod.HeaderTransitionPreset
import typingsJapgolly.reactNavigationStack.typesMod.TransitionConfig
import typingsJapgolly.reactNavigationStack.typesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackViewLayout {
  def apply(
    transitionProps: TransitionProps,
    cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined,
    cardShadowEnabled: js.UndefOr[Boolean] = js.undefined,
    cardStyle: StyleProp[ViewStyle] = null,
    disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined,
    headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined,
    headerBackgroundTransitionPreset: HeaderBackgroundTransitionPreset = null,
    headerLayoutPreset: HeaderLayoutPreset = null,
    headerMode: HeaderMode = null,
    headerTransitionPreset: HeaderTransitionPreset = null,
    lastTransitionProps: TransitionProps = null,
    mode: card | modal = null,
    onGestureBegin: js.UndefOr[Callback] = js.undefined,
    onGestureCanceled: js.UndefOr[Callback] = js.undefined,
    onGestureEnd: js.UndefOr[Callback] = js.undefined,
    onTransitionEnd: js.UndefOr[Callback] = js.undefined,
    onTransitionStart: js.UndefOr[Callback] = js.undefined,
    screenProps: js.Any = null,
    transitionConfig: (/* transitionProps */ TransitionProps, /* prevTransitionProps */ js.UndefOr[TransitionProps], /* isModal */ js.UndefOr[Boolean]) => CallbackTo[TransitionConfig with HeaderTransitionConfig] = null,
    transparentCard: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PickPropsmodeheaderModehe, default, Unit, PickPropsmodeheaderModehe] = {
    val __obj = js.Dynamic.literal(transitionProps = transitionProps.asInstanceOf[js.Any])
  
      if (!js.isUndefined(cardOverlayEnabled)) __obj.updateDynamic("cardOverlayEnabled")(cardOverlayEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cardShadowEnabled)) __obj.updateDynamic("cardShadowEnabled")(cardShadowEnabled.asInstanceOf[js.Any])
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardHandling)) __obj.updateDynamic("disableKeyboardHandling")(disableKeyboardHandling.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleVisible)) __obj.updateDynamic("headerBackTitleVisible")(headerBackTitleVisible.asInstanceOf[js.Any])
    if (headerBackgroundTransitionPreset != null) __obj.updateDynamic("headerBackgroundTransitionPreset")(headerBackgroundTransitionPreset.asInstanceOf[js.Any])
    if (headerLayoutPreset != null) __obj.updateDynamic("headerLayoutPreset")(headerLayoutPreset.asInstanceOf[js.Any])
    if (headerMode != null) __obj.updateDynamic("headerMode")(headerMode.asInstanceOf[js.Any])
    if (headerTransitionPreset != null) __obj.updateDynamic("headerTransitionPreset")(headerTransitionPreset.asInstanceOf[js.Any])
    if (lastTransitionProps != null) __obj.updateDynamic("lastTransitionProps")(lastTransitionProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    onGestureBegin.foreach(p => __obj.updateDynamic("onGestureBegin")(p.toJsFn))
    onGestureCanceled.foreach(p => __obj.updateDynamic("onGestureCanceled")(p.toJsFn))
    onGestureEnd.foreach(p => __obj.updateDynamic("onGestureEnd")(p.toJsFn))
    onTransitionEnd.foreach(p => __obj.updateDynamic("onTransitionEnd")(p.toJsFn))
    onTransitionStart.foreach(p => __obj.updateDynamic("onTransitionStart")(p.toJsFn))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (transitionConfig != null) __obj.updateDynamic("transitionConfig")(js.Any.fromFunction3((t0: /* transitionProps */ typingsJapgolly.reactNavigationStack.typesMod.TransitionProps, t1: /* prevTransitionProps */ js.UndefOr[typingsJapgolly.reactNavigationStack.typesMod.TransitionProps], t2: /* isModal */ js.UndefOr[scala.Boolean]) => transitionConfig(t0, t1, t2).runNow()))
    if (!js.isUndefined(transparentCard)) __obj.updateDynamic("transparentCard")(transparentCard.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationStack.PickPropsmodeheaderModehe, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationStack.stackViewLayoutMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationStack.PickPropsmodeheaderModehe])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewLayout", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

