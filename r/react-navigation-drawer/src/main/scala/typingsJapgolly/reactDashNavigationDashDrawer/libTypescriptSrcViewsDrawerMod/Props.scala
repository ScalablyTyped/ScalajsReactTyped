package typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.reactMod.ComponentProps
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
import typingsJapgolly.reactDashNavigationDashDrawer.Anon_Progress
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`on-drag`
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.back
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.fade
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.front
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.left
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.none
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.right
import typingsJapgolly.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var drawerPosition: left | right
  var drawerStyle: js.UndefOr[ViewStyle] = js.undefined
  var drawerType: front | back | slide
  var gestureHandlerProps: js.UndefOr[ComponentProps[Instantiable0[PanGestureHandler]]] = js.undefined
  var hideStatusBar: Boolean
  var keyboardDismissMode: none | `on-drag`
  var locked: Boolean
  var onGestureRef: js.UndefOr[js.Function1[/* ref */ PanGestureHandler | Null, Unit]] = js.undefined
  var open: Boolean
  var overlayStyle: js.UndefOr[ViewStyle] = js.undefined
  var renderDrawerContent: Renderer
  var renderSceneContent: Renderer
  var sceneContainerStyle: js.UndefOr[ViewStyle] = js.undefined
  var statusBarAnimation: slide | none | fade
  var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
  var swipeEdgeWidth: Double
  var swipeVelocityThreshold: Double
  def onClose(): Unit
  def onOpen(): Unit
}

object Props {
  @scala.inline
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    hideStatusBar: Boolean,
    keyboardDismissMode: none | `on-drag`,
    locked: Boolean,
    onClose: Callback,
    onOpen: Callback,
    open: Boolean,
    renderDrawerContent: /* props */ Anon_Progress => CallbackTo[Node],
    renderSceneContent: /* props */ Anon_Progress => CallbackTo[Node],
    statusBarAnimation: slide | none | fade,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double,
    drawerStyle: ViewStyle = null,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = null,
    onGestureRef: /* ref */ PanGestureHandler | Null => Callback = null,
    overlayStyle: ViewStyle = null,
    sceneContainerStyle: ViewStyle = null,
    swipeDistanceThreshold: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onOpen")(onOpen.toJsFn)
    __obj.updateDynamic("renderDrawerContent")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashDrawer.Anon_Progress) => renderDrawerContent(t0).runNow()))
    __obj.updateDynamic("renderSceneContent")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashDrawer.Anon_Progress) => renderSceneContent(t0).runNow()))
    if (drawerStyle != null) __obj.updateDynamic("drawerStyle")(drawerStyle.asInstanceOf[js.Any])
    if (gestureHandlerProps != null) __obj.updateDynamic("gestureHandlerProps")(gestureHandlerProps.asInstanceOf[js.Any])
    if (onGestureRef != null) __obj.updateDynamic("onGestureRef")(js.Any.fromFunction1((t0: /* ref */ typingsJapgolly.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler | scala.Null) => onGestureRef(t0).runNow()))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (swipeDistanceThreshold != null) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

