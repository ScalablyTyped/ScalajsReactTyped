package typingsJapgolly.reactNavigationDrawer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerProps_
import typingsJapgolly.reactNavigationDrawer.anon.DrawerPostion
import typingsJapgolly.reactNavigationDrawer.anon.Progress
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcViewsDrawerMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", JSImport.Default)
  @js.native
  open class default () extends Drawer
  /* static members */
  object default {
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", "default.defaultProps")
    @js.native
    def defaultProps: DrawerPostion = js.native
    inline def defaultProps_=(x: DrawerPostion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Drawer
    extends PureComponent[Props, js.Object, Any] {
    
    /* private */ var clock: Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDrawer(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDrawer(): Unit = js.native
    
    /* private */ var containerWidth: Any = js.native
    
    /* private */ var currentOpenValue: Any = js.native
    
    /* private */ var dragX: Any = js.native
    
    /* private */ var drawerOpacity: Any = js.native
    
    /* private */ var drawerPosition: Any = js.native
    
    /* private */ var drawerWidth: Any = js.native
    
    /* private */ var gestureState: Any = js.native
    
    /* private */ var gestureX: Any = js.native
    
    /* private */ var handleContainerLayout: Any = js.native
    
    /* private */ var handleDrawerLayout: Any = js.native
    
    /* private */ var handleGestureEvent: Any = js.native
    
    /* private */ var handleGestureStateChange: Any = js.native
    
    /* private */ var handleTapStateChange: Any = js.native
    
    /* private */ var isDrawerTypeFront: Any = js.native
    
    /* private */ var isOpen: Any = js.native
    
    /* private */ var isStatusBarHidden: Any = js.native
    
    /* private */ var isSwiping: Any = js.native
    
    /* private */ var manuallyTriggerSpring: Any = js.native
    
    /* private */ var nextIsOpen: Any = js.native
    
    /* private */ var offsetX: Any = js.native
    
    /* private */ var pendingOpenValue: Any = js.native
    
    /* private */ var position: Any = js.native
    
    /* private */ var progress: Any = js.native
    
    /* private */ var swipeDistanceThreshold: Any = js.native
    
    /* private */ var swipeVelocityThreshold: Any = js.native
    
    /* private */ var toggleDrawer: Any = js.native
    
    /* private */ var toggleStatusBar: Any = js.native
    
    /* private */ var touchDistanceFromDrawer: Any = js.native
    
    /* private */ var touchX: Any = js.native
    
    /* private */ var transitionTo: Any = js.native
    
    /* private */ var translateX: Any = js.native
    
    /* private */ var velocityX: Any = js.native
  }
  
  trait Props extends StObject {
    
    var drawerPosition: left | right
    
    var drawerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var drawerType: front | back | slide
    
    var gestureEnabled: Boolean
    
    var gestureHandlerProps: js.UndefOr[ComponentProps[ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]]]] = js.undefined
    
    var hideStatusBar: Boolean
    
    var keyboardDismissMode: none | `on-drag`
    
    def onClose(): Unit
    
    var onGestureRef: js.UndefOr[js.Function1[/* ref */ PanGestureHandler | Null, Unit]] = js.undefined
    
    def onOpen(): Unit
    
    var open: Boolean
    
    var overlayStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var renderDrawerContent: Renderer
    
    var renderSceneContent: Renderer
    
    var sceneContainerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var statusBarAnimation: slide | none | fade
    
    var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
    
    var swipeEdgeWidth: Double
    
    var swipeVelocityThreshold: Double
  }
  object Props {
    
    inline def apply(
      drawerPosition: left | right,
      drawerType: front | back | slide,
      gestureEnabled: Boolean,
      hideStatusBar: Boolean,
      keyboardDismissMode: none | `on-drag`,
      onClose: Callback,
      onOpen: Callback,
      open: Boolean,
      renderDrawerContent: /* props */ Progress => Node,
      renderSceneContent: /* props */ Progress => Node,
      statusBarAnimation: slide | none | fade,
      swipeEdgeWidth: Double,
      swipeVelocityThreshold: Double
    ): Props = {
      val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], onClose = onClose.toJsFn, onOpen = onOpen.toJsFn, open = open.asInstanceOf[js.Any], renderDrawerContent = js.Any.fromFunction1(renderDrawerContent), renderSceneContent = js.Any.fromFunction1(renderSceneContent), statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      inline def setDrawerStyle(value: ViewStyle): Self = StObject.set(x, "drawerStyle", value.asInstanceOf[js.Any])
      
      inline def setDrawerStyleUndefined: Self = StObject.set(x, "drawerStyle", js.undefined)
      
      inline def setDrawerType(value: front | back | slide): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
      
      inline def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
      
      inline def setGestureHandlerProps(value: ComponentProps[ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]]]): Self = StObject.set(x, "gestureHandlerProps", value.asInstanceOf[js.Any])
      
      inline def setGestureHandlerPropsUndefined: Self = StObject.set(x, "gestureHandlerProps", js.undefined)
      
      inline def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnGestureRef(value: /* ref */ PanGestureHandler | Null => Callback): Self = StObject.set(x, "onGestureRef", js.Any.fromFunction1((t0: /* ref */ PanGestureHandler | Null) => value(t0).runNow()))
      
      inline def setOnGestureRefUndefined: Self = StObject.set(x, "onGestureRef", js.undefined)
      
      inline def setOnOpen(value: Callback): Self = StObject.set(x, "onOpen", value.toJsFn)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyle(value: ViewStyle): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setRenderDrawerContent(value: /* props */ Progress => Node): Self = StObject.set(x, "renderDrawerContent", js.Any.fromFunction1(value))
      
      inline def setRenderSceneContent(value: /* props */ Progress => Node): Self = StObject.set(x, "renderSceneContent", js.Any.fromFunction1(value))
      
      inline def setSceneContainerStyle(value: ViewStyle): Self = StObject.set(x, "sceneContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setSceneContainerStyleUndefined: Self = StObject.set(x, "sceneContainerStyle", js.undefined)
      
      inline def setStatusBarAnimation(value: slide | none | fade): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
      
      inline def setSwipeDistanceThreshold(value: Double): Self = StObject.set(x, "swipeDistanceThreshold", value.asInstanceOf[js.Any])
      
      inline def setSwipeDistanceThresholdUndefined: Self = StObject.set(x, "swipeDistanceThreshold", js.undefined)
      
      inline def setSwipeEdgeWidth(value: Double): Self = StObject.set(x, "swipeEdgeWidth", value.asInstanceOf[js.Any])
      
      inline def setSwipeVelocityThreshold(value: Double): Self = StObject.set(x, "swipeVelocityThreshold", value.asInstanceOf[js.Any])
    }
  }
  
  type Renderer = js.Function1[/* props */ Progress, Node]
}
