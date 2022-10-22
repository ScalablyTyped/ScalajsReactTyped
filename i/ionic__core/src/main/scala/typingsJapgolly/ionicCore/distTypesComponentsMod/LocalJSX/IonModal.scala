package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonModalCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsModalModalInterfaceMod.ModalAttributes
import typingsJapgolly.ionicCore.distTypesComponentsModalModalInterfaceMod.ModalBreakpointChangeEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsModalModalInterfaceMod.ModalHandleBehavior
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonModal extends StObject {
  
  /**
    * If `true`, the modal will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A decimal value between 0 and 1 that indicates the point after which the backdrop will begin to fade in when using a sheet modal. Prior to this point, the backdrop will be hidden and the content underneath the sheet can be interacted with. This value is exclusive meaning the backdrop will become active after the value specified.
    */
  var backdropBreakpoint: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, the modal will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The breakpoints to use when creating a sheet modal. Each value in the array must be a decimal between 0 and 1 where 0 indicates the modal is fully closed and 1 indicates the modal is fully open. Values are relative to the height of the modal, not the height of the screen. One of the values in this array must be the value of the `initialBreakpoint` property. For example: [0, .25, .5, 1]
    */
  var breakpoints: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Determines whether or not a modal can dismiss when calling the `dismiss` method.  If the value is `true` or the value's function returns `true`, the modal will close when trying to dismiss. If the value is `false` or the value's function returns `false`, the modal will not close when trying to dismiss.
    */
  var canDismiss: js.UndefOr[Boolean | js.Function0[js.Promise[Boolean]]] = js.undefined
  
  /**
    * Animation to use when the modal is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The horizontal line that displays at the top of a sheet modal. It is `true` by default when setting the `breakpoints` and `initialBreakpoint` properties.
    */
  var handle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The interaction behavior for the sheet modal when the handle is pressed.  Defaults to `"none"`, which  means the modal will not change size or position when the handle is pressed. Set to `"cycle"` to let the modal cycle between available breakpoints when pressed.  Handle behavior is unavailable when the `handle` property is set to `false` or when the `breakpoints` property is not set (using a fullscreen or card modal).
    */
  var handleBehavior: js.UndefOr[ModalHandleBehavior] = js.undefined
  
  /**
    * Additional attributes to pass to the modal.
    */
  var htmlAttributes: js.UndefOr[ModalAttributes] = js.undefined
  
  /**
    * A decimal value between 0 and 1 that indicates the initial point the modal will open at when creating a sheet modal. This value must also be listed in the `breakpoints` array.
    */
  var initialBreakpoint: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, the modal will open. If `false`, the modal will close. Use this if you need finer grained control over presentation, otherwise just use the modalController or the `trigger` property. Note: `isOpen` will not automatically be set back to `false` when the modal dismisses. You will need to do that in your code.
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component passed into `ion-modal` will automatically be mounted when the modal is created. The component will remain mounted even when the modal is dismissed. However, the component will be destroyed when the modal is destroyed. This property is not reactive and should only be used when initially creating a modal.  Note: This feature only applies to inline modals in JavaScript frameworks such as Angular, React, and Vue.
    */
  var keepContentsMounted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the modal is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the modal has dismissed. Shorthand for ionModalDidDismiss.
    */
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ IonModalCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the modal has presented. Shorthand for ionModalWillDismiss.
    */
  var onDidPresent: js.UndefOr[js.Function1[/* event */ IonModalCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted after the modal breakpoint has changed.
    */
  var onIonBreakpointDidChange: js.UndefOr[
    js.Function1[/* event */ IonModalCustomEvent[ModalBreakpointChangeEventDetail], Unit]
  ] = js.undefined
  
  /**
    * Emitted after the modal has dismissed.
    */
  var onIonModalDidDismiss: js.UndefOr[js.Function1[/* event */ IonModalCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the modal has presented.
    */
  var onIonModalDidPresent: js.UndefOr[js.Function1[/* event */ IonModalCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the modal has dismissed.
    */
  var onIonModalWillDismiss: js.UndefOr[js.Function1[/* event */ IonModalCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the modal has presented.
    */
  var onIonModalWillPresent: js.UndefOr[js.Function1[/* event */ IonModalCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the modal has dismissed. Shorthand for ionModalWillDismiss.
    */
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ IonModalCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the modal has presented. Shorthand for ionModalWillPresent.
    */
  var onWillPresent: js.UndefOr[js.Function1[/* event */ IonModalCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * The element that presented the modal. This is used for card presentation effects and for stacking multiple modals on top of each other. Only applies in iOS mode.
    */
  var presentingElement: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * If `true`, a backdrop will be displayed behind the modal. This property controls whether or not the backdrop darkens the screen when the modal is presented. It does not control whether or not the backdrop is active or present in the DOM.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the modal can be swiped to dismiss. Only applies in iOS mode.
    * @deprecated - To prevent modals from dismissing, use canDismiss instead.
    */
  var swipeToClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An ID corresponding to the trigger element that causes the modal to open when clicked.
    */
  var trigger: js.UndefOr[String] = js.undefined
}
object IonModal {
  
  inline def apply(): IonModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonModal]
  }
  
  extension [Self <: IonModal](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBackdropBreakpoint(value: Double): Self = StObject.set(x, "backdropBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setBackdropBreakpointUndefined: Self = StObject.set(x, "backdropBreakpoint", js.undefined)
    
    inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    inline def setBreakpoints(value: js.Array[Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setBreakpointsVarargs(value: Double*): Self = StObject.set(x, "breakpoints", js.Array(value*))
    
    inline def setCanDismiss(value: Boolean | js.Function0[js.Promise[Boolean]]): Self = StObject.set(x, "canDismiss", value.asInstanceOf[js.Any])
    
    inline def setCanDismissCallbackTo(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "canDismiss", value.toJsFn)
    
    inline def setCanDismissUndefined: Self = StObject.set(x, "canDismiss", js.undefined)
    
    inline def setEnterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setHandle(value: Boolean): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleBehavior(value: ModalHandleBehavior): Self = StObject.set(x, "handleBehavior", value.asInstanceOf[js.Any])
    
    inline def setHandleBehaviorUndefined: Self = StObject.set(x, "handleBehavior", js.undefined)
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setHtmlAttributes(value: ModalAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
    
    inline def setInitialBreakpoint(value: Double): Self = StObject.set(x, "initialBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setInitialBreakpointUndefined: Self = StObject.set(x, "initialBreakpoint", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setKeepContentsMounted(value: Boolean): Self = StObject.set(x, "keepContentsMounted", value.asInstanceOf[js.Any])
    
    inline def setKeepContentsMountedUndefined: Self = StObject.set(x, "keepContentsMounted", js.undefined)
    
    inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
    
    inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
    
    inline def setLeaveAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
    
    inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnDidDismiss(value: /* event */ IonModalCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onDidDismiss", js.Any.fromFunction1((t0: /* event */ IonModalCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnDidDismissUndefined: Self = StObject.set(x, "onDidDismiss", js.undefined)
    
    inline def setOnDidPresent(value: /* event */ IonModalCustomEvent[Unit] => Callback): Self = StObject.set(x, "onDidPresent", js.Any.fromFunction1((t0: /* event */ IonModalCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnDidPresentUndefined: Self = StObject.set(x, "onDidPresent", js.undefined)
    
    inline def setOnIonBreakpointDidChange(value: /* event */ IonModalCustomEvent[ModalBreakpointChangeEventDetail] => Callback): Self = StObject.set(x, "onIonBreakpointDidChange", js.Any.fromFunction1((t0: /* event */ IonModalCustomEvent[ModalBreakpointChangeEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonBreakpointDidChangeUndefined: Self = StObject.set(x, "onIonBreakpointDidChange", js.undefined)
    
    inline def setOnIonModalDidDismiss(value: /* event */ IonModalCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonModalDidDismiss", js.Any.fromFunction1((t0: /* event */ IonModalCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonModalDidDismissUndefined: Self = StObject.set(x, "onIonModalDidDismiss", js.undefined)
    
    inline def setOnIonModalDidPresent(value: /* event */ IonModalCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonModalDidPresent", js.Any.fromFunction1((t0: /* event */ IonModalCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonModalDidPresentUndefined: Self = StObject.set(x, "onIonModalDidPresent", js.undefined)
    
    inline def setOnIonModalWillDismiss(value: /* event */ IonModalCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonModalWillDismiss", js.Any.fromFunction1((t0: /* event */ IonModalCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonModalWillDismissUndefined: Self = StObject.set(x, "onIonModalWillDismiss", js.undefined)
    
    inline def setOnIonModalWillPresent(value: /* event */ IonModalCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonModalWillPresent", js.Any.fromFunction1((t0: /* event */ IonModalCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonModalWillPresentUndefined: Self = StObject.set(x, "onIonModalWillPresent", js.undefined)
    
    inline def setOnWillDismiss(value: /* event */ IonModalCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onWillDismiss", js.Any.fromFunction1((t0: /* event */ IonModalCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnWillDismissUndefined: Self = StObject.set(x, "onWillDismiss", js.undefined)
    
    inline def setOnWillPresent(value: /* event */ IonModalCustomEvent[Unit] => Callback): Self = StObject.set(x, "onWillPresent", js.Any.fromFunction1((t0: /* event */ IonModalCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnWillPresentUndefined: Self = StObject.set(x, "onWillPresent", js.undefined)
    
    inline def setPresentingElement(value: HTMLElement): Self = StObject.set(x, "presentingElement", value.asInstanceOf[js.Any])
    
    inline def setPresentingElementUndefined: Self = StObject.set(x, "presentingElement", js.undefined)
    
    inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
    
    inline def setSwipeToClose(value: Boolean): Self = StObject.set(x, "swipeToClose", value.asInstanceOf[js.Any])
    
    inline def setSwipeToCloseUndefined: Self = StObject.set(x, "swipeToClose", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
