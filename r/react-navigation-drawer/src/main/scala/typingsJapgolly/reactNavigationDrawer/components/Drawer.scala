package typingsJapgolly.reactNavigationDrawer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.mod.PanGestureHandler
import typingsJapgolly.reactNavigationDrawer.AnonProgress
import typingsJapgolly.reactNavigationDrawer.drawerMod.Props
import typingsJapgolly.reactNavigationDrawer.drawerMod.default
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer {
  def apply(
    drawerPosition: left | right,
    drawerType: front | back | slide,
    gestureEnabled: Boolean,
    hideStatusBar: Boolean,
    keyboardDismissMode: none | `on-drag`,
    open: Boolean,
    statusBarAnimation: slide | none | fade,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double,
    onClose: Callback,
    onOpen: Callback,
    renderDrawerContent: /* props */ AnonProgress => CallbackTo[Node],
    renderSceneContent: /* props */ AnonProgress => CallbackTo[Node],
    drawerStyle: ViewStyle = null,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = null,
    onGestureRef: /* ref */ PanGestureHandler | Null => Callback = null,
    overlayStyle: ViewStyle = null,
    sceneContainerStyle: ViewStyle = null,
    swipeDistanceThreshold: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onOpen")(onOpen.toJsFn)
    __obj.updateDynamic("renderDrawerContent")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationDrawer.AnonProgress) => renderDrawerContent(t0).runNow()))
    __obj.updateDynamic("renderSceneContent")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationDrawer.AnonProgress) => renderSceneContent(t0).runNow()))
    if (drawerStyle != null) __obj.updateDynamic("drawerStyle")(drawerStyle.asInstanceOf[js.Any])
    if (gestureHandlerProps != null) __obj.updateDynamic("gestureHandlerProps")(gestureHandlerProps.asInstanceOf[js.Any])
    if (onGestureRef != null) __obj.updateDynamic("onGestureRef")(js.Any.fromFunction1((t0: /* ref */ typingsJapgolly.reactNativeGestureHandler.mod.PanGestureHandler | scala.Null) => onGestureRef(t0).runNow()))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (swipeDistanceThreshold != null) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationDrawer.drawerMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationDrawer.drawerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationDrawer.drawerMod.Props])(children: _*)
  }
  @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

