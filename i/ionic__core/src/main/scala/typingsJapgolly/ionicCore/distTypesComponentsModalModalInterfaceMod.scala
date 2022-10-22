package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonModalElement
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import typingsJapgolly.ionicCore.mod.Mode
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsModalModalInterfaceMod {
  
  trait ModalAnimationOptions extends StObject {
    
    var backdropBreakpoint: js.UndefOr[Double] = js.undefined
    
    var currentBreakpoint: js.UndefOr[Double] = js.undefined
    
    var presentingEl: js.UndefOr[HTMLElement] = js.undefined
  }
  object ModalAnimationOptions {
    
    inline def apply(): ModalAnimationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalAnimationOptions]
    }
    
    extension [Self <: ModalAnimationOptions](x: Self) {
      
      inline def setBackdropBreakpoint(value: Double): Self = StObject.set(x, "backdropBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setBackdropBreakpointUndefined: Self = StObject.set(x, "backdropBreakpoint", js.undefined)
      
      inline def setCurrentBreakpoint(value: Double): Self = StObject.set(x, "currentBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setCurrentBreakpointUndefined: Self = StObject.set(x, "currentBreakpoint", js.undefined)
      
      inline def setPresentingEl(value: HTMLElement): Self = StObject.set(x, "presentingEl", value.asInstanceOf[js.Any])
      
      inline def setPresentingElUndefined: Self = StObject.set(x, "presentingEl", js.undefined)
    }
  }
  
  type ModalAttributes = StringDictionary[Any]
  
  trait ModalBreakpointChangeEventDetail extends StObject {
    
    var breakpoint: Double
  }
  object ModalBreakpointChangeEventDetail {
    
    inline def apply(breakpoint: Double): ModalBreakpointChangeEventDetail = {
      val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalBreakpointChangeEventDetail]
    }
    
    extension [Self <: ModalBreakpointChangeEventDetail](x: Self) {
      
      inline def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModalCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("target")
    var target_ModalCustomEvent: HTMLIonModalElement = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.none
    - typingsJapgolly.ionicCore.ionicCoreStrings.cycle
  */
  trait ModalHandleBehavior extends StObject
  object ModalHandleBehavior {
    
    inline def cycle: typingsJapgolly.ionicCore.ionicCoreStrings.cycle = "cycle".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.cycle]
    
    inline def none: typingsJapgolly.ionicCore.ionicCoreStrings.none = "none".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.none]
  }
  
  trait ModalOptions[T /* <: ComponentRef */] extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var backdropBreakpoint: js.UndefOr[Double] = js.undefined
    
    var backdropDismiss: js.UndefOr[Boolean] = js.undefined
    
    var breakpoints: js.UndefOr[js.Array[Double]] = js.undefined
    
    var canDismiss: js.UndefOr[Boolean | js.Function0[js.Promise[Boolean]]] = js.undefined
    
    var component: T
    
    var componentProps: js.UndefOr[ComponentProps[T]] = js.undefined
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var handle: js.UndefOr[Boolean] = js.undefined
    
    var handleBehavior: js.UndefOr[ModalHandleBehavior] = js.undefined
    
    var htmlAttributes: js.UndefOr[ModalAttributes] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var initialBreakpoint: js.UndefOr[Double] = js.undefined
    
    var keyboardClose: js.UndefOr[Boolean] = js.undefined
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var presentingElement: js.UndefOr[HTMLElement] = js.undefined
    
    var showBackdrop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the modal can be swiped to dismiss. Only applies in iOS mode.
      * @deprecated - To prevent modals from dismissing, use canDismiss instead.
      */
    var swipeToClose: js.UndefOr[Boolean] = js.undefined
  }
  object ModalOptions {
    
    inline def apply[T /* <: ComponentRef */](component: T): ModalOptions[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalOptions[T]]
    }
    
    extension [Self <: ModalOptions[?], T /* <: ComponentRef */](x: Self & ModalOptions[T]) {
      
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
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentProps(value: ComponentProps[T]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
      
      inline def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
      
      inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
      
      inline def setDelegate(value: FrameworkDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setEnterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
      
      inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      inline def setHandle(value: Boolean): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleBehavior(value: ModalHandleBehavior): Self = StObject.set(x, "handleBehavior", value.asInstanceOf[js.Any])
      
      inline def setHandleBehaviorUndefined: Self = StObject.set(x, "handleBehavior", js.undefined)
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHtmlAttributes(value: ModalAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInitialBreakpoint(value: Double): Self = StObject.set(x, "initialBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setInitialBreakpointUndefined: Self = StObject.set(x, "initialBreakpoint", js.undefined)
      
      inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
      
      inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
      
      inline def setLeaveAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
      
      inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPresentingElement(value: HTMLElement): Self = StObject.set(x, "presentingElement", value.asInstanceOf[js.Any])
      
      inline def setPresentingElementUndefined: Self = StObject.set(x, "presentingElement", js.undefined)
      
      inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
      
      inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
      
      inline def setSwipeToClose(value: Boolean): Self = StObject.set(x, "swipeToClose", value.asInstanceOf[js.Any])
      
      inline def setSwipeToCloseUndefined: Self = StObject.set(x, "swipeToClose", js.undefined)
    }
  }
}
