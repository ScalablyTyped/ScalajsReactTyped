package typingsJapgolly.reactNativeGestureHandler.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.DrawerSlideEvent
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Dragging
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Idle
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.Settling
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`box-none`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`box-only`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-closed`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`locked-open`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.`on-drag`
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.assertive
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.auto
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.left
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.no
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.polite
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.right
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.unlocked
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.yes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native.react-native.DrawerLayoutAndroidProps & {  children :react.react.ReactNode | undefined} & react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/NativeViewGestureHandler.NativeViewGestureHandlerProps & react.react.RefAttributes<react.react.ComponentType<any>> */
trait DrawerLayoutAndroidPropsc extends StObject {
  
  /**
    * Provides an array of custom actions available for accessibility.
    */
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  /**
    * A Boolean value indicating whether the accessibility elements contained within this accessibility element
    * are hidden to the screen reader.
    * @platform ios
    */
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An accessibility hint helps users understand what will happen when they perform an action on the accessibility element when that result is not obvious from the accessibility label.
    */
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  /**
    * https://reactnative.dev/docs/accessibility#accessibilityignoresinvertcolorsios
    * @platform ios
    */
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overrides the text that's read by the screen reader when the user interacts with the element. By default, the
    * label is constructed by traversing all the children and accumulating all the Text nodes separated by space.
    */
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the nativeID of the associated label text. When the assistive technology focuses on the component with this props, the text is read aloud.
    * @platform android
    */
  var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Indicates to the accessibility services that the UI component is in
    * a specific language. The provided string should be formatted following
    * the BCP 47 specification (https://www.rfc-editor.org/info/bcp47).
    * @platform ios
    */
  var accessibilityLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates to accessibility services whether the user should be notified when this view changes.
    * Works for Android API >= 19 only.
    * See http://developer.android.com/reference/android/view/View.html#attr_android:accessibilityLiveRegion for references.
    * @platform android
    */
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  
  /**
    * Accessibility Role tells a person using either VoiceOver on iOS or TalkBack on Android the type of element that is focused on.
    */
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  /**
    * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
    */
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  /**
    * Represents the current value of a component. It can be a textual description of a component's value, or for range-based components, such as sliders and progress bars,
    * it contains range information (minimum, current, and maximum).
    */
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  /**
    * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
    * @platform ios
    */
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, indicates that the view is an accessibility element.
    * By default, all the touchable elements are accessible.
    */
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var cancelsTouchesInView: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * Views that are only used to layout their children or otherwise don't draw anything
    * may be automatically removed from the native hierarchy as an optimization.
    * Set this property to false to disable this optimization and ensure that this View exists in the native view hierarchy.
    */
  var collapsable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, cancels all other gesture handlers when this
    * `NativeViewGestureHandler` receives an `ACTIVE` state event.
    */
  var disallowInterruption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the background color of the drawer. The default value
    * is white. If you want to set the opacity of the drawer, use rgba.
    * Example:
    * return (
    *   <DrawerLayoutAndroid drawerBackgroundColor="rgba(0,0,0,0.5)">
    *   </DrawerLayoutAndroid>
    *);
    */
  var drawerBackgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Specifies the lock mode of the drawer. The drawer can be locked
    * in 3 states:
    *
    * - unlocked (default), meaning that the drawer will respond
    *   (open/close) to touch gestures.
    *
    * - locked-closed, meaning that the drawer will stay closed and not
    *   respond to gestures.
    *
    * - locked-open, meaning that the drawer will stay opened and
    *   not respond to gestures. The drawer may still be opened and
    *   closed programmatically (openDrawer/closeDrawer).
    */
  var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.undefined
  
  /**
    * Specifies the side of the screen from which the drawer will slide in.
    * - 'left' (the default)
    * - 'right'
    */
  var drawerPosition: js.UndefOr[left | right] = js.undefined
  
  /**
    * Specifies the width of the drawer, more precisely the width of the
    * view that be pulled in from the edge of the window.
    */
  var drawerWidth: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this `View` should be focusable with a non-touch input device, eg. receive focus with a hardware keyboard.
    */
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *(Apple TV only)* May be set to true to force the Apple TV focus engine to move focus to this view.
    *
    * @platform ios
    */
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This defines how far a touch event can start away from the view.
    * Typical interface guidelines recommend touch targets that are at least
    * 30 - 40 points/density-independent pixels. If a Touchable view has
    * a height of 20 the touchable height can be extended to 40 with
    * hitSlop={{top: 10, bottom: 10, left: 0, right: 0}}
    * NOTE The touch area never extends past the parent view bounds and
    * the Z-index of sibling views always takes precedence if a touch
    * hits two overlapping views.
    */
  var hitSlop: js.UndefOr[Insets] & js.UndefOr[HitSlop]
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Controls how view is important for accessibility which is if it fires accessibility events
    * and if it is reported to accessibility services that query the screen.
    * Works for Android only. See http://developer.android.com/reference/android/R.attr.html#importantForAccessibility for references.
    *
    * Possible values:
    *      'auto' - The system determines whether the view is important for accessibility - default (recommended).
    *      'yes' - The view is important for accessibility.
    *      'no' - The view is not important for accessibility.
    *      'no-hide-descendants' - The view is not important for accessibility, nor are any of its descendant views.
    */
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  /**
    * *(Apple TV only)* When set to true, this view will be focusable
    * and navigable using the Apple TV remote.
    *
    * @platform ios
    */
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    * - 'none' (the default), drags do not dismiss the keyboard.
    * - 'on-drag', the keyboard is dismissed when a drag begins.
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.undefined
  
  /**
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this view needs to rendered offscreen and composited with an alpha in order to preserve 100% correct colors and blending behavior.
    * The default (false) falls back to drawing the component and its children
    * with an alpha applied to the paint used to draw each element instead of rendering the full component offscreen and compositing it back with an alpha value.
    * This default may be noticeable and undesired in the case where the View you are setting an opacity on
    * has multiple overlapping elements (e.g. multiple overlapping Views, or text and a background).
    *
    * Rendering offscreen to preserve correct alpha behavior is extremely expensive
    * and hard to debug for non-native developers, which is why it is not turned on by default.
    * If you do need to enable this property for an animation,
    * consider combining it with renderToHardwareTextureAndroid if the view contents are static (i.e. it doesn't need to be redrawn each frame).
    * If that property is enabled, this View will be rendered off-screen once,
    * saved in a hardware texture, and then composited onto the screen with an alpha each frame without having to switch rendering targets on the GPU.
    */
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `accessible` is true, the system will try to invoke this function when the user performs an accessibility custom action.
    */
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  /**
    * When accessibile is true, the system will invoke this function when the user performs the escape gesture (scrub with two fingers).
    * @platform ios
    */
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
    * @platform ios
    */
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onActivated: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  var onBegan: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  var onCancelled: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  /**
    * Function called whenever the navigation view has been closed.
    */
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Function called whenever the navigation view has been opened.
    */
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Function called whenever there is an interaction with the navigation view.
    */
  var onDrawerSlide: js.UndefOr[js.Function1[/* event */ DrawerSlideEvent, Unit]] = js.undefined
  
  /**
    * Function called when the drawer state has changed.
    * The drawer can be in 3 states:
    * - idle, meaning there is no interaction with the navigation
    *   view happening at the time
    * - dragging, meaning there is currently an interaction with the
    *   navigation view
    * - settling, meaning that there was an interaction with the
    *   navigation view, and the navigation view is now finishing
    *   it's closing or opening animation
    */
  var onDrawerStateChanged: js.UndefOr[js.Function1[/* event */ Idle | Dragging | Settling, Unit]] = js.undefined
  
  var onEnded: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  var onFailed: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ GestureEvent[NativeViewGestureHandlerPayload], Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[
    js.Function1[/* event */ HandlerStateChangeEvent[NativeViewGestureHandlerPayload], Unit]
  ] = js.undefined
  
  /**
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height}}}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  /**
    * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
    * @platform ios
    */
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called for every touch move on the View when it is not the responder: does this view want to "claim" touch responsiveness?
    */
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  /**
    * onStartShouldSetResponder and onMoveShouldSetResponder are called with a bubbling pattern,
    * where the deepest node is called first.
    * That means that the deepest component will become responder when multiple Views return true for *ShouldSetResponder handlers.
    * This is desirable in most cases, because it makes sure all controls and buttons are usable.
    *
    * However, sometimes a parent will want to make sure that it becomes responder.
    * This can be handled by using the capture phase.
    * Before the responder system bubbles up from the deepest component,
    * it will do a capture phase, firing on*ShouldSetResponderCapture.
    * So if a parent View wants to prevent the child from becoming responder on a touch start,
    * it should have a onStartShouldSetResponderCapture handler which returns true.
    */
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  /**
    * If the View returns true and attempts to become the responder, one of the following will happen:
    */
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * The View is now responding for touch events.
    * This is the time to highlight and show the user what is happening
    */
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * If the view is responding, the following handlers can be called:
    */
  /**
    * The user is moving their finger
    */
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * Something else is the responder right now and will not release it
    */
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * Fired at the end of the touch, ie "touchUp"
    */
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * The responder has been taken from the View.
    * Might be taken by other views after a call to onResponderTerminationRequest,
    * or might be taken by the OS without asking (happens with control center/ notification center on iOS)
    */
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    *  Something else wants to become responder.
    *  Should this view release the responder? Returning true allows release
    */
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  /**
    * A view can become the touch responder by implementing the correct negotiation methods.
    * There are two methods to ask the view if it wants to become responder:
    */
  /**
    * Does this view want to become responder on the start of a touch?
    */
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  /**
    * onStartShouldSetResponder and onMoveShouldSetResponder are called with a bubbling pattern,
    * where the deepest node is called first.
    * That means that the deepest component will become responder when multiple Views return true for *ShouldSetResponder handlers.
    * This is desirable in most cases, because it makes sure all controls and buttons are usable.
    *
    * However, sometimes a parent will want to make sure that it becomes responder.
    * This can be handled by using the capture phase.
    * Before the responder system bubbles up from the deepest component,
    * it will do a capture phase, firing on*ShouldSetResponderCapture.
    * So if a parent View wants to prevent the child from becoming responder on a touch start,
    * it should have a onStartShouldSetResponderCapture handler which returns true.
    */
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    *
    * In the absence of auto property, none is much like CSS's none value. box-none is as if you had applied the CSS class:
    *
    * .box-none {
    *   pointer-events: none;
    * }
    * .box-none * {
    *   pointer-events: all;
    * }
    *
    * box-only is the equivalent of
    *
    * .box-only {
    *   pointer-events: all;
    * }
    * .box-only * {
    *   pointer-events: none;
    * }
    *
    * But since pointerEvents does not affect layout/appearance, and we are already deviating from the spec by adding additional modes,
    * we opt to not include pointerEvents on style. On some platforms, we would need to implement it as a className anyways. Using style or not is an implementation detail of the platform.
    */
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  var ref: js.UndefOr[Ref[ComponentType[Any]]] = js.undefined
  
  /**
    *
    * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
    * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
    * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
    */
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The navigation view that will be rendered to the side of the
    * screen and can be pulled in.
    */
  def renderNavigationView(): Element
  
  /**
    * Whether this view should render itself (and all of its children) into a single hardware texture on the GPU.
    *
    * On Android, this is useful for animations and interactions that only modify opacity, rotation, translation, and/or scale:
    * in those cases, the view doesn't have to be redrawn and display lists don't need to be re-executed. The texture can just be
    * re-used and re-composited with different parameters. The downside is that this can use up limited video memory, so this prop should be set back to false at the end of the interaction/animation.
    */
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Android only.
    *
    * Determines whether the handler should check for an existing touch event on
    * instantiation.
    */
  var shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined
  
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this view should be rendered as a bitmap before compositing.
    *
    * On iOS, this is useful for animations and interactions that do not modify this component's dimensions nor its children;
    * for example, when translating the position of a static view, rasterization allows the renderer to reuse a cached bitmap of a static view
    * and quickly composite it during each frame.
    *
    * Rasterization incurs an off-screen drawing pass and the bitmap consumes memory.
    * Test and measure when using this property.
    */
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  
  var simultaneousHandlers: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
  
  /**
    * Make the drawer take the entire screen and draw the background of
    * the status bar to allow it to open over the status bar. It will
    * only have an effect on API 21+.
    */
  var statusBarBackgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 1.0.
    *
    * @platform ios
    */
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  
  /**
    * *(Apple TV only)* Object with properties to control Apple TV parallax effects.
    *
    * @platform ios
    */
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
    *
    * @platform ios
    */
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
    *
    * @platform ios
    */
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  
  /**
    * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 0.05.
    *
    * @platform ios
    */
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  
  var waitFor: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
}
object DrawerLayoutAndroidPropsc {
  
  inline def apply(hitSlop: js.UndefOr[Insets] & js.UndefOr[HitSlop], renderNavigationView: CallbackTo[Element]): DrawerLayoutAndroidPropsc = {
    val __obj = js.Dynamic.literal(hitSlop = hitSlop.asInstanceOf[js.Any], renderNavigationView = renderNavigationView.toJsFn)
    __obj.asInstanceOf[DrawerLayoutAndroidPropsc]
  }
  
  extension [Self <: DrawerLayoutAndroidPropsc](x: Self) {
    
    inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setCancelsTouchesInView(value: Boolean): Self = StObject.set(x, "cancelsTouchesInView", value.asInstanceOf[js.Any])
    
    inline def setCancelsTouchesInViewUndefined: Self = StObject.set(x, "cancelsTouchesInView", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setDisallowInterruption(value: Boolean): Self = StObject.set(x, "disallowInterruption", value.asInstanceOf[js.Any])
    
    inline def setDisallowInterruptionUndefined: Self = StObject.set(x, "disallowInterruption", js.undefined)
    
    inline def setDrawerBackgroundColor(value: ColorValue): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
    
    inline def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
    
    inline def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
    
    inline def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
    
    inline def setDrawerPositionUndefined: Self = StObject.set(x, "drawerPosition", js.undefined)
    
    inline def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
    
    inline def setDrawerWidthUndefined: Self = StObject.set(x, "drawerWidth", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: js.UndefOr[Insets] & js.UndefOr[HitSlop]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: Callback): Self = StObject.set(x, "onAccessibilityEscape", value.toJsFn)
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: Callback): Self = StObject.set(x, "onAccessibilityTap", value.toJsFn)
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnActivated(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onActivated", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def setOnActivatedUndefined: Self = StObject.set(x, "onActivated", js.undefined)
    
    inline def setOnBegan(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onBegan", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def setOnBeganUndefined: Self = StObject.set(x, "onBegan", js.undefined)
    
    inline def setOnCancelled(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onCancelled", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def setOnCancelledUndefined: Self = StObject.set(x, "onCancelled", js.undefined)
    
    inline def setOnDrawerClose(value: Callback): Self = StObject.set(x, "onDrawerClose", value.toJsFn)
    
    inline def setOnDrawerCloseUndefined: Self = StObject.set(x, "onDrawerClose", js.undefined)
    
    inline def setOnDrawerOpen(value: Callback): Self = StObject.set(x, "onDrawerOpen", value.toJsFn)
    
    inline def setOnDrawerOpenUndefined: Self = StObject.set(x, "onDrawerOpen", js.undefined)
    
    inline def setOnDrawerSlide(value: /* event */ DrawerSlideEvent => Callback): Self = StObject.set(x, "onDrawerSlide", js.Any.fromFunction1((t0: /* event */ DrawerSlideEvent) => value(t0).runNow()))
    
    inline def setOnDrawerSlideUndefined: Self = StObject.set(x, "onDrawerSlide", js.undefined)
    
    inline def setOnDrawerStateChanged(value: /* event */ Idle | Dragging | Settling => Callback): Self = StObject.set(x, "onDrawerStateChanged", js.Any.fromFunction1((t0: /* event */ Idle | Dragging | Settling) => value(t0).runNow()))
    
    inline def setOnDrawerStateChangedUndefined: Self = StObject.set(x, "onDrawerStateChanged", js.undefined)
    
    inline def setOnEnded(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnFailed(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): Self = StObject.set(x, "onFailed", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def setOnFailedUndefined: Self = StObject.set(x, "onFailed", js.undefined)
    
    inline def setOnGestureEvent(value: /* event */ GestureEvent[NativeViewGestureHandlerPayload] => Callback): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1((t0: /* event */ GestureEvent[NativeViewGestureHandlerPayload]) => value(t0).runNow()))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ HandlerStateChangeEvent[NativeViewGestureHandlerPayload] => Callback): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[NativeViewGestureHandlerPayload]) => value(t0).runNow()))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMagicTap(value: Callback): Self = StObject.set(x, "onMagicTap", value.toJsFn)
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnPointerCancel(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerUp(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setRef(value: Ref[ComponentType[Any]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: ComponentType[Any] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: ComponentType[Any] | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderNavigationView(value: CallbackTo[Element]): Self = StObject.set(x, "renderNavigationView", value.toJsFn)
    
    inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setShouldActivateOnStart(value: Boolean): Self = StObject.set(x, "shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    inline def setShouldActivateOnStartUndefined: Self = StObject.set(x, "shouldActivateOnStart", js.undefined)
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setSimultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersFunction1(value: Any | Null => Callback): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
    
    inline def setStatusBarBackgroundColor(value: ColorValue): Self = StObject.set(x, "statusBarBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setStatusBarBackgroundColorUndefined: Self = StObject.set(x, "statusBarBackgroundColor", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    inline def setWaitFor(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForFunction1(value: Any | Null => Callback): Self = StObject.set(x, "waitFor", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: Ref[Any]*): Self = StObject.set(x, "waitFor", js.Array(value*))
  }
}
