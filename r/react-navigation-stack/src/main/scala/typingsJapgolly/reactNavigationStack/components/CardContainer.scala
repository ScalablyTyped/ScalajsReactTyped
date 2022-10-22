package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigationStack.anon.Close
import typingsJapgolly.reactNavigationStack.anon.Height
import typingsJapgolly.reactNavigationStack.anon.Horizontal
import typingsJapgolly.reactNavigationStack.anon.StyleWithAnimatedValue
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.GestureDirection
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Layout
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Scene
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardInterpolatedStyle
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardInterpolationProps
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardMode
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolatedStyle
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolationProps
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderMode
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderContainerMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardContainer {
  
  inline def apply(
    active: Boolean,
    cardStyleInterpolator: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle,
    closing: Boolean,
    focused: Boolean,
    gesture: Value,
    gestureDirection: GestureDirection,
    getFocusedRoute: CallbackTo[Route[String]],
    getPreviousScene: typingsJapgolly.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]],
    hasAbsoluteHeader: Boolean,
    headerHeight: Double,
    headerMode: StackHeaderMode,
    headerShown: Boolean,
    headerStyleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
    index: Double,
    isParentHeaderShown: Boolean,
    layout: Layout,
    mode: StackCardMode,
    onCloseRoute: typingsJapgolly.reactNavigationStack.anon.Route => Callback,
    onHeaderHeightChange: Height => Callback,
    onOpenRoute: typingsJapgolly.reactNavigationStack.anon.Route => Callback,
    renderHeader: Props => Node,
    renderScene: typingsJapgolly.reactNavigationStack.anon.Route => Node,
    safeAreaInsetBottom: Double,
    safeAreaInsetLeft: Double,
    safeAreaInsetRight: Double,
    safeAreaInsetTop: Double,
    scene: Scene[Route[String]],
    transitionSpec: Close
  ): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cardStyleInterpolator = js.Any.fromFunction1(cardStyleInterpolator), closing = closing.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = getFocusedRoute.toJsFn, getPreviousScene = js.Any.fromFunction1(getPreviousScene), hasAbsoluteHeader = hasAbsoluteHeader.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerMode = headerMode.asInstanceOf[js.Any], headerShown = headerShown.asInstanceOf[js.Any], headerStyleInterpolator = js.Any.fromFunction1(headerStyleInterpolator), index = index.asInstanceOf[js.Any], isParentHeaderShown = isParentHeaderShown.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationStack.anon.Route) => onCloseRoute(t0).runNow()), onHeaderHeightChange = js.Any.fromFunction1((t0: Height) => onHeaderHeightChange(t0).runNow()), onOpenRoute = js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationStack.anon.Route) => onOpenRoute(t0).runNow()), renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), safeAreaInsetBottom = safeAreaInsetBottom.asInstanceOf[js.Any], safeAreaInsetLeft = safeAreaInsetLeft.asInstanceOf[js.Any], safeAreaInsetRight = safeAreaInsetRight.asInstanceOf[js.Any], safeAreaInsetTop = safeAreaInsetTop.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], transitionSpec = transitionSpec.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousSceneGetFocusedRouteModeHeaderModeHeaderShownHeaderStyleInterpolatorHasAbsoluteHeaderHeaderHeightOnHeaderHeightChangeIsParentHeaderShownIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnGestureCancelOnGestureEndOnGestureStartOnTransitionEndOnTransitionStartRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsStackCardContainerMod.Props]))
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def cardOverlay(value: /* props */ StyleWithAnimatedValue => Node): this.type = set("cardOverlay", js.Any.fromFunction1(value))
    
    inline def cardOverlayEnabled(value: Boolean): this.type = set("cardOverlayEnabled", value.asInstanceOf[js.Any])
    
    inline def cardShadowEnabled(value: Boolean): this.type = set("cardShadowEnabled", value.asInstanceOf[js.Any])
    
    inline def cardStyle(value: StyleProp[ViewStyle]): this.type = set("cardStyle", value.asInstanceOf[js.Any])
    
    inline def cardStyleNull: this.type = set("cardStyle", null)
    
    inline def gestureEnabled(value: Boolean): this.type = set("gestureEnabled", value.asInstanceOf[js.Any])
    
    inline def gestureResponseDistance(value: Horizontal): this.type = set("gestureResponseDistance", value.asInstanceOf[js.Any])
    
    inline def gestureVelocityImpact(value: Double): this.type = set("gestureVelocityImpact", value.asInstanceOf[js.Any])
    
    inline def onGestureCancel(value: /* props */ typingsJapgolly.reactNavigationStack.anon.Route => Callback): this.type = set("onGestureCancel", js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.anon.Route) => value(t0).runNow()))
    
    inline def onGestureEnd(value: /* props */ typingsJapgolly.reactNavigationStack.anon.Route => Callback): this.type = set("onGestureEnd", js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.anon.Route) => value(t0).runNow()))
    
    inline def onGestureStart(value: /* props */ typingsJapgolly.reactNavigationStack.anon.Route => Callback): this.type = set("onGestureStart", js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.anon.Route) => value(t0).runNow()))
    
    inline def onPageChangeCancel(value: Callback): this.type = set("onPageChangeCancel", value.toJsFn)
    
    inline def onPageChangeConfirm(value: /* force */ Boolean => Callback): this.type = set("onPageChangeConfirm", js.Any.fromFunction1((t0: /* force */ Boolean) => value(t0).runNow()))
    
    inline def onPageChangeStart(value: Callback): this.type = set("onPageChangeStart", value.toJsFn)
    
    inline def onTransitionEnd(
      value: (/* props */ typingsJapgolly.reactNavigationStack.anon.Route, /* closing */ Boolean) => Callback
    ): this.type = set("onTransitionEnd", js.Any.fromFunction2((t0: /* props */ typingsJapgolly.reactNavigationStack.anon.Route, t1: /* closing */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def onTransitionStart(
      value: (/* props */ typingsJapgolly.reactNavigationStack.anon.Route, /* closing */ Boolean) => Callback
    ): this.type = set("onTransitionStart", js.Any.fromFunction2((t0: /* props */ typingsJapgolly.reactNavigationStack.anon.Route, t1: /* closing */ Boolean) => (value(t0, t1)).runNow()))
  }
  
  def withProps(
    p: /* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousSceneGetFocusedRouteModeHeaderModeHeaderShownHeaderStyleInterpolatorHasAbsoluteHeaderHeaderHeightOnHeaderHeightChangeIsParentHeaderShownIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnGestureCancelOnGestureEndOnGestureStartOnTransitionEndOnTransitionStartRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsStackCardContainerMod.Props
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
