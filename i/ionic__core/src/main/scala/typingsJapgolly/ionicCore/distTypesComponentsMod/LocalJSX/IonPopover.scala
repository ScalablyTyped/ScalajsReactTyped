package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonPopoverCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverAttributes
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverSize
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionAlign
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionReference
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionSide
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.TriggerAction
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.ComponentRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonPopover extends StObject {
  
  /**
    * Describes how to align the popover content with the `reference` point. Defaults to `'center'` for `ios` mode, and `'start'` for `md` mode.
    */
  var alignment: js.UndefOr[PositionAlign] = js.undefined
  
  /**
    * If `true`, the popover will animate.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the popover will display an arrow that points at the `reference` when running in `ios` mode. Does not apply in `md` mode.
    */
  var arrow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the popover will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The component to display inside of the popover. You only need to use this if you are not using a JavaScript framework. Otherwise, you can just slot your component inside of `ion-popover`.
    */
  var component: js.UndefOr[ComponentRef] = js.undefined
  
  /**
    * The data to pass to the popover component. You only need to use this if you are not using a JavaScript framework. Otherwise, you can just set the props directly on your component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.undefined
  
  /**
    * If `true`, the popover will be automatically dismissed when the content has been clicked.
    */
  var dismissOnSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the popover is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The event to pass to the popover animation.
    */
  var event: js.UndefOr[Any] = js.undefined
  
  /**
    * Additional attributes to pass to the popover.
    */
  var htmlAttributes: js.UndefOr[PopoverAttributes] = js.undefined
  
  /**
    * If `true`, the popover will open. If `false`, the popover will close. Use this if you need finer grained control over presentation, otherwise just use the popoverController or the `trigger` property. Note: `isOpen` will not automatically be set back to `false` when the popover dismisses. You will need to do that in your code.
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component passed into `ion-popover` will automatically be mounted when the popover is created. The component will remain mounted even when the popover is dismissed. However, the component will be destroyed when the popover is destroyed. This property is not reactive and should only be used when initially creating a popover.  Note: This feature only applies to inline popovers in JavaScript frameworks such as Angular, React, and Vue.
    */
  var keepContentsMounted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Animation to use when the popover is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the popover has dismissed. Shorthand for ionPopoverDidDismiss.
    */
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the popover has presented. Shorthand for ionPopoverWillDismiss.
    */
  var onDidPresent: js.UndefOr[js.Function1[/* event */ IonPopoverCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted after the popover has dismissed.
    */
  var onIonPopoverDidDismiss: js.UndefOr[js.Function1[/* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted after the popover has presented.
    */
  var onIonPopoverDidPresent: js.UndefOr[js.Function1[/* event */ IonPopoverCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the popover has dismissed.
    */
  var onIonPopoverWillDismiss: js.UndefOr[js.Function1[/* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the popover has presented.
    */
  var onIonPopoverWillPresent: js.UndefOr[js.Function1[/* event */ IonPopoverCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the popover has dismissed. Shorthand for ionPopoverWillDismiss.
    */
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]], Unit]] = js.undefined
  
  /**
    * Emitted before the popover has presented. Shorthand for ionPopoverWillPresent.
    */
  var onWillPresent: js.UndefOr[js.Function1[/* event */ IonPopoverCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Describes what to position the popover relative to. If `'trigger'`, the popover will be positioned relative to the trigger button. If passing in an event, this is determined via event.target. If `'event'`, the popover will be positioned relative to the x/y coordinates of the trigger action. If passing in an event, this is determined via event.clientX and event.clientY.
    */
  var reference: js.UndefOr[PositionReference] = js.undefined
  
  /**
    * If `true`, a backdrop will be displayed behind the popover. This property controls whether or not the backdrop darkens the screen when the popover is presented. It does not control whether or not the backdrop is active or present in the DOM.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes which side of the `reference` point to position the popover on. The `'start'` and `'end'` values are RTL-aware, and the `'left'` and `'right'` values are not.
    */
  var side: js.UndefOr[PositionSide] = js.undefined
  
  /**
    * Describes how to calculate the popover width. If `'cover'`, the popover width will match the width of the trigger. If `'auto'`, the popover width will be determined by the content in the popover.
    */
  var size: js.UndefOr[PopoverSize] = js.undefined
  
  /**
    * If `true`, the popover will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An ID corresponding to the trigger element that causes the popover to open. Use the `trigger-action` property to customize the interaction that results in the popover opening.
    */
  var trigger: js.UndefOr[String] = js.undefined
  
  /**
    * Describes what kind of interaction with the trigger that should cause the popover to open. Does not apply when the `trigger` property is `undefined`. If `'click'`, the popover will be presented when the trigger is left clicked. If `'hover'`, the popover will be presented when a pointer hovers over the trigger. If `'context-menu'`, the popover will be presented when the trigger is right clicked on desktop and long pressed on mobile. This will also prevent your device's normal context menu from appearing.
    */
  var triggerAction: js.UndefOr[TriggerAction] = js.undefined
}
object IonPopover {
  
  inline def apply(): IonPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonPopover]
  }
  
  extension [Self <: IonPopover](x: Self) {
    
    inline def setAlignment(value: PositionAlign): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
    
    inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
    
    inline def setComponent(value: ComponentRef): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setComponentProps(value: ComponentProps[Null]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    inline def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDismissOnSelect(value: Boolean): Self = StObject.set(x, "dismissOnSelect", value.asInstanceOf[js.Any])
    
    inline def setDismissOnSelectUndefined: Self = StObject.set(x, "dismissOnSelect", js.undefined)
    
    inline def setEnterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setHtmlAttributes(value: PopoverAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
    
    inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
    
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
    
    inline def setOnDidDismiss(value: /* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onDidDismiss", js.Any.fromFunction1((t0: /* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnDidDismissUndefined: Self = StObject.set(x, "onDidDismiss", js.undefined)
    
    inline def setOnDidPresent(value: /* event */ IonPopoverCustomEvent[Unit] => Callback): Self = StObject.set(x, "onDidPresent", js.Any.fromFunction1((t0: /* event */ IonPopoverCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnDidPresentUndefined: Self = StObject.set(x, "onDidPresent", js.undefined)
    
    inline def setOnIonPopoverDidDismiss(value: /* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonPopoverDidDismiss", js.Any.fromFunction1((t0: /* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonPopoverDidDismissUndefined: Self = StObject.set(x, "onIonPopoverDidDismiss", js.undefined)
    
    inline def setOnIonPopoverDidPresent(value: /* event */ IonPopoverCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonPopoverDidPresent", js.Any.fromFunction1((t0: /* event */ IonPopoverCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonPopoverDidPresentUndefined: Self = StObject.set(x, "onIonPopoverDidPresent", js.undefined)
    
    inline def setOnIonPopoverWillDismiss(value: /* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonPopoverWillDismiss", js.Any.fromFunction1((t0: /* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonPopoverWillDismissUndefined: Self = StObject.set(x, "onIonPopoverWillDismiss", js.undefined)
    
    inline def setOnIonPopoverWillPresent(value: /* event */ IonPopoverCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonPopoverWillPresent", js.Any.fromFunction1((t0: /* event */ IonPopoverCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonPopoverWillPresentUndefined: Self = StObject.set(x, "onIonPopoverWillPresent", js.undefined)
    
    inline def setOnWillDismiss(value: /* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]] => Callback): Self = StObject.set(x, "onWillDismiss", js.Any.fromFunction1((t0: /* event */ IonPopoverCustomEvent[OverlayEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnWillDismissUndefined: Self = StObject.set(x, "onWillDismiss", js.undefined)
    
    inline def setOnWillPresent(value: /* event */ IonPopoverCustomEvent[Unit] => Callback): Self = StObject.set(x, "onWillPresent", js.Any.fromFunction1((t0: /* event */ IonPopoverCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnWillPresentUndefined: Self = StObject.set(x, "onWillPresent", js.undefined)
    
    inline def setReference(value: PositionReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
    
    inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
    
    inline def setSide(value: PositionSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSize(value: PopoverSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerAction(value: TriggerAction): Self = StObject.set(x, "triggerAction", value.asInstanceOf[js.Any])
    
    inline def setTriggerActionUndefined: Self = StObject.set(x, "triggerAction", js.undefined)
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
