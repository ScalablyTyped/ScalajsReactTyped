package typingsJapgolly.reactNativeModals.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModals.mod.DragEvent
import typingsJapgolly.reactNativeModals.mod.FadeAnimation
import typingsJapgolly.reactNativeModals.mod.ModalProps
import typingsJapgolly.reactNativeModals.mod.OverlayPointerEventTypes
import typingsJapgolly.reactNativeModals.mod.ScaleAnimation
import typingsJapgolly.reactNativeModals.mod.SlideAnimation
import typingsJapgolly.reactNativeModals.mod.SwipeDirection
import typingsJapgolly.reactNativeModals.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeModals {
  
  inline def apply(visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ModalProps]))
  }
  
  @JSImport("react-native-modals", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def hasOverlay(value: Boolean): this.type = set("hasOverlay", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def modalAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): this.type = set("modalAnimation", value.asInstanceOf[js.Any])
    
    inline def modalStyle(value: StyleProp[ViewStyle]): this.type = set("modalStyle", value.asInstanceOf[js.Any])
    
    inline def modalStyleNull: this.type = set("modalStyle", null)
    
    inline def modalTitle(value: VdomNode): this.type = set("modalTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def modalTitleNull: this.type = set("modalTitle", null)
    
    inline def modalTitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("modalTitle", js.Array(value*))
    
    inline def modalTitleVdomElement(value: VdomElement): this.type = set("modalTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def onHardwareBackPress(value: CallbackTo[Boolean]): this.type = set("onHardwareBackPress", value.toJsFn)
    
    inline def onMove(value: /* event */ DragEvent => Callback): this.type = set("onMove", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def onSwipeOut(value: /* event */ DragEvent => Callback): this.type = set("onSwipeOut", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onSwipeRelease(value: /* event */ DragEvent => Callback): this.type = set("onSwipeRelease", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onSwiping(value: /* event */ DragEvent => Callback): this.type = set("onSwiping", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onSwipingOut(value: /* event */ DragEvent => Callback): this.type = set("onSwipingOut", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onTouchOutside(value: Callback): this.type = set("onTouchOutside", value.toJsFn)
    
    inline def overlayBackgroundColor(value: String): this.type = set("overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def overlayOpacity(value: Double): this.type = set("overlayOpacity", value.asInstanceOf[js.Any])
    
    inline def overlayPointerEvents(value: OverlayPointerEventTypes): this.type = set("overlayPointerEvents", value.asInstanceOf[js.Any])
    
    inline def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def swipeDirection(value: SwipeDirection | js.Array[SwipeDirection]): this.type = set("swipeDirection", value.asInstanceOf[js.Any])
    
    inline def swipeDirectionVarargs(value: SwipeDirection*): this.type = set("swipeDirection", js.Array(value*))
    
    inline def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
    
    inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
