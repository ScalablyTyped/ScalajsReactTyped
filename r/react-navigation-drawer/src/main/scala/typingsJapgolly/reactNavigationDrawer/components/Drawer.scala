package typingsJapgolly.reactNavigationDrawer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerProps_
import typingsJapgolly.reactNavigationDrawer.anon.Progress
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsDrawerMod.Props
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcViewsDrawerMod.default
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

object Drawer {
  
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
  ): Builder = {
    val __props = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], onClose = onClose.toJsFn, onOpen = onOpen.toJsFn, open = open.asInstanceOf[js.Any], renderDrawerContent = js.Any.fromFunction1(renderDrawerContent), renderSceneContent = js.Any.fromFunction1(renderSceneContent), statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-drawer/lib/typescript/src/views/Drawer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def drawerStyle(value: ViewStyle): this.type = set("drawerStyle", value.asInstanceOf[js.Any])
    
    inline def gestureHandlerProps(value: ComponentProps[ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]]]): this.type = set("gestureHandlerProps", value.asInstanceOf[js.Any])
    
    inline def onGestureRef(value: /* ref */ PanGestureHandler | Null => Callback): this.type = set("onGestureRef", js.Any.fromFunction1((t0: /* ref */ PanGestureHandler | Null) => value(t0).runNow()))
    
    inline def overlayStyle(value: ViewStyle): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def sceneContainerStyle(value: ViewStyle): this.type = set("sceneContainerStyle", value.asInstanceOf[js.Any])
    
    inline def swipeDistanceThreshold(value: Double): this.type = set("swipeDistanceThreshold", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
