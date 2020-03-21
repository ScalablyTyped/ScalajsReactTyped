package typingsJapgolly.reactNativeDrawer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ScaledSize
import typingsJapgolly.reactNativeDrawer.mod.DrawerProperties
import typingsJapgolly.reactNativeDrawer.mod.DrawerStyles
import typingsJapgolly.reactNativeDrawer.mod.NestedViewStyles
import typingsJapgolly.reactNativeDrawer.mod.TweenFunctions
import typingsJapgolly.reactNativeDrawer.mod.default
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.bottom
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.closed
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.displace
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.left
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.open
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.overlay
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.right
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.static
import typingsJapgolly.reactNativeDrawer.reactNativeDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeDrawer {
  def apply(
    acceptDoubleTap: js.UndefOr[Boolean] = js.undefined,
    acceptPan: js.UndefOr[Boolean] = js.undefined,
    acceptPanOnDrawer: js.UndefOr[Boolean] = js.undefined,
    acceptTap: js.UndefOr[Boolean] = js.undefined,
    captureGestures: Boolean | open | closed = null,
    closedDrawerOffset: js.Function0[Double] | Double = null,
    content: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elevation: Int | Double = null,
    initializeOpen: Int | Double = null,
    negotiatePan: js.UndefOr[Boolean] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    onCloseStart: js.UndefOr[Callback] = js.undefined,
    onDragStart: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    onOpenStart: js.UndefOr[Callback] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    openDrawerOffset: (js.Function1[/* viewport */ ScaledSize, Double]) | Double = null,
    panCloseMask: Int | Double = null,
    panOpenMask: Int | Double = null,
    panThreshold: Int | Double = null,
    side: left | right | top | bottom = null,
    styles: DrawerStyles = null,
    tapToClose: js.UndefOr[Boolean] = js.undefined,
    tweenDuration: Int | Double = null,
    tweenEasing: TweenFunctions = null,
    tweenHandler: /* ratio */ Double => CallbackTo[NestedViewStyles] = null,
    `type`: displace | overlay | static = null,
    useInteractionManager: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DrawerProperties, default, Unit, DrawerProperties] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(acceptDoubleTap)) __obj.updateDynamic("acceptDoubleTap")(acceptDoubleTap.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptPan)) __obj.updateDynamic("acceptPan")(acceptPan.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptPanOnDrawer)) __obj.updateDynamic("acceptPanOnDrawer")(acceptPanOnDrawer.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptTap)) __obj.updateDynamic("acceptTap")(acceptTap.asInstanceOf[js.Any])
    if (captureGestures != null) __obj.updateDynamic("captureGestures")(captureGestures.asInstanceOf[js.Any])
    if (closedDrawerOffset != null) __obj.updateDynamic("closedDrawerOffset")(closedDrawerOffset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (initializeOpen != null) __obj.updateDynamic("initializeOpen")(initializeOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiatePan)) __obj.updateDynamic("negotiatePan")(negotiatePan.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onCloseStart.foreach(p => __obj.updateDynamic("onCloseStart")(p.toJsFn))
    onDragStart.foreach(p => __obj.updateDynamic("onDragStart")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    onOpenStart.foreach(p => __obj.updateDynamic("onOpenStart")(p.toJsFn))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (openDrawerOffset != null) __obj.updateDynamic("openDrawerOffset")(openDrawerOffset.asInstanceOf[js.Any])
    if (panCloseMask != null) __obj.updateDynamic("panCloseMask")(panCloseMask.asInstanceOf[js.Any])
    if (panOpenMask != null) __obj.updateDynamic("panOpenMask")(panOpenMask.asInstanceOf[js.Any])
    if (panThreshold != null) __obj.updateDynamic("panThreshold")(panThreshold.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToClose)) __obj.updateDynamic("tapToClose")(tapToClose.asInstanceOf[js.Any])
    if (tweenDuration != null) __obj.updateDynamic("tweenDuration")(tweenDuration.asInstanceOf[js.Any])
    if (tweenEasing != null) __obj.updateDynamic("tweenEasing")(tweenEasing.asInstanceOf[js.Any])
    if (tweenHandler != null) __obj.updateDynamic("tweenHandler")(js.Any.fromFunction1((t0: /* ratio */ scala.Double) => tweenHandler(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useInteractionManager)) __obj.updateDynamic("useInteractionManager")(useInteractionManager.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeDrawer.mod.DrawerProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeDrawer.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeDrawer.mod.DrawerProperties])(children: _*)
  }
  @JSImport("react-native-drawer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

