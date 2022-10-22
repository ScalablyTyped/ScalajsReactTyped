package typingsJapgolly.reactNativeDrawer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeDrawer {
  
  @JSImport("react-native-drawer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def acceptDoubleTap(value: Boolean): this.type = set("acceptDoubleTap", value.asInstanceOf[js.Any])
    
    inline def acceptPan(value: Boolean): this.type = set("acceptPan", value.asInstanceOf[js.Any])
    
    inline def acceptPanOnDrawer(value: Boolean): this.type = set("acceptPanOnDrawer", value.asInstanceOf[js.Any])
    
    inline def acceptTap(value: Boolean): this.type = set("acceptTap", value.asInstanceOf[js.Any])
    
    inline def captureGestures(value: Boolean | open | closed): this.type = set("captureGestures", value.asInstanceOf[js.Any])
    
    inline def closedDrawerOffset(value: js.Function0[Double] | Double): this.type = set("closedDrawerOffset", value.asInstanceOf[js.Any])
    
    inline def closedDrawerOffsetCallbackTo(value: CallbackTo[Double]): this.type = set("closedDrawerOffset", value.toJsFn)
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def elevation(value: Double): this.type = set("elevation", value.asInstanceOf[js.Any])
    
    inline def initializeOpen(value: Double): this.type = set("initializeOpen", value.asInstanceOf[js.Any])
    
    inline def negotiatePan(value: Boolean): this.type = set("negotiatePan", value.asInstanceOf[js.Any])
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onCloseStart(value: Callback): this.type = set("onCloseStart", value.toJsFn)
    
    inline def onDragStart(value: Callback): this.type = set("onDragStart", value.toJsFn)
    
    inline def onOpen(value: Callback): this.type = set("onOpen", value.toJsFn)
    
    inline def onOpenStart(value: Callback): this.type = set("onOpenStart", value.toJsFn)
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def openDrawerOffset(value: (js.Function1[/* viewport */ ScaledSize, Double]) | Double): this.type = set("openDrawerOffset", value.asInstanceOf[js.Any])
    
    inline def openDrawerOffsetFunction1(value: /* viewport */ ScaledSize => Double): this.type = set("openDrawerOffset", js.Any.fromFunction1(value))
    
    inline def panCloseMask(value: Double): this.type = set("panCloseMask", value.asInstanceOf[js.Any])
    
    inline def panOpenMask(value: Double): this.type = set("panOpenMask", value.asInstanceOf[js.Any])
    
    inline def panThreshold(value: Double): this.type = set("panThreshold", value.asInstanceOf[js.Any])
    
    inline def side(value: left | right | top | bottom): this.type = set("side", value.asInstanceOf[js.Any])
    
    inline def styles(value: DrawerStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def tapToClose(value: Boolean): this.type = set("tapToClose", value.asInstanceOf[js.Any])
    
    inline def tweenDuration(value: Double): this.type = set("tweenDuration", value.asInstanceOf[js.Any])
    
    inline def tweenEasing(value: TweenFunctions): this.type = set("tweenEasing", value.asInstanceOf[js.Any])
    
    inline def tweenHandler(value: /* ratio */ Double => NestedViewStyles): this.type = set("tweenHandler", js.Any.fromFunction1(value))
    
    inline def `type`(value: displace | overlay | static): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def useInteractionManager(value: Boolean): this.type = set("useInteractionManager", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeDrawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DrawerProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
