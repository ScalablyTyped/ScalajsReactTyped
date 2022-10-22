package typingsJapgolly.reactNativeModals.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalProps extends StObject {
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var footer: js.UndefOr[Node] = js.undefined
  
  var hasOverlay: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var modalAnimation: js.UndefOr[FadeAnimation | ScaleAnimation | SlideAnimation] = js.undefined
  
  var modalStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var modalTitle: js.UndefOr[Node] = js.undefined
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onHardwareBackPress: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var onMove: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipeOut: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onSwipeRelease: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onSwiping: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onSwipingOut: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  
  var onTouchOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var overlayBackgroundColor: js.UndefOr[String] = js.undefined
  
  var overlayOpacity: js.UndefOr[Double] = js.undefined
  
  var overlayPointerEvents: js.UndefOr[OverlayPointerEventTypes] = js.undefined
  
  var rounded: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var swipeDirection: js.UndefOr[SwipeDirection | js.Array[SwipeDirection]] = js.undefined
  
  var swipeThreshold: js.UndefOr[Double] = js.undefined
  
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  
  var visible: Boolean
  
  var width: js.UndefOr[Double] = js.undefined
}
object ModalProps {
  
  inline def apply(visible: Boolean): ModalProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
  
  extension [Self <: ModalProps](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHasOverlay(value: Boolean): Self = StObject.set(x, "hasOverlay", value.asInstanceOf[js.Any])
    
    inline def setHasOverlayUndefined: Self = StObject.set(x, "hasOverlay", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setModalAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): Self = StObject.set(x, "modalAnimation", value.asInstanceOf[js.Any])
    
    inline def setModalAnimationUndefined: Self = StObject.set(x, "modalAnimation", js.undefined)
    
    inline def setModalStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "modalStyle", value.asInstanceOf[js.Any])
    
    inline def setModalStyleNull: Self = StObject.set(x, "modalStyle", null)
    
    inline def setModalStyleUndefined: Self = StObject.set(x, "modalStyle", js.undefined)
    
    inline def setModalTitle(value: VdomNode): Self = StObject.set(x, "modalTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def setModalTitleNull: Self = StObject.set(x, "modalTitle", null)
    
    inline def setModalTitleUndefined: Self = StObject.set(x, "modalTitle", js.undefined)
    
    inline def setModalTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "modalTitle", js.Array(value*))
    
    inline def setModalTitleVdomElement(value: VdomElement): Self = StObject.set(x, "modalTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOnHardwareBackPress(value: CallbackTo[Boolean]): Self = StObject.set(x, "onHardwareBackPress", value.toJsFn)
    
    inline def setOnHardwareBackPressUndefined: Self = StObject.set(x, "onHardwareBackPress", js.undefined)
    
    inline def setOnMove(value: /* event */ DragEvent => Callback): Self = StObject.set(x, "onMove", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
    
    inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnSwipeOut(value: /* event */ DragEvent => Callback): Self = StObject.set(x, "onSwipeOut", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def setOnSwipeOutUndefined: Self = StObject.set(x, "onSwipeOut", js.undefined)
    
    inline def setOnSwipeRelease(value: /* event */ DragEvent => Callback): Self = StObject.set(x, "onSwipeRelease", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def setOnSwipeReleaseUndefined: Self = StObject.set(x, "onSwipeRelease", js.undefined)
    
    inline def setOnSwiping(value: /* event */ DragEvent => Callback): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def setOnSwipingOut(value: /* event */ DragEvent => Callback): Self = StObject.set(x, "onSwipingOut", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def setOnSwipingOutUndefined: Self = StObject.set(x, "onSwipingOut", js.undefined)
    
    inline def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
    
    inline def setOnTouchOutside(value: Callback): Self = StObject.set(x, "onTouchOutside", value.toJsFn)
    
    inline def setOnTouchOutsideUndefined: Self = StObject.set(x, "onTouchOutside", js.undefined)
    
    inline def setOverlayBackgroundColor(value: String): Self = StObject.set(x, "overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setOverlayBackgroundColorUndefined: Self = StObject.set(x, "overlayBackgroundColor", js.undefined)
    
    inline def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
    
    inline def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
    
    inline def setOverlayPointerEvents(value: OverlayPointerEventTypes): Self = StObject.set(x, "overlayPointerEvents", value.asInstanceOf[js.Any])
    
    inline def setOverlayPointerEventsUndefined: Self = StObject.set(x, "overlayPointerEvents", js.undefined)
    
    inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwipeDirection(value: SwipeDirection | js.Array[SwipeDirection]): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
    
    inline def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
    
    inline def setSwipeDirectionVarargs(value: SwipeDirection*): Self = StObject.set(x, "swipeDirection", js.Array(value*))
    
    inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
    
    inline def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
    
    inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
