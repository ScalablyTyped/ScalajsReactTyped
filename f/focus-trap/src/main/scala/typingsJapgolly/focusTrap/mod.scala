package typingsJapgolly.focusTrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.SVGElement
import org.scalajs.dom.TouchEvent
import typingsJapgolly.focusTrap.focusTrapBooleans.`false`
import typingsJapgolly.tabbable.mod.CheckOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-trap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFocusTrap(element: String): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: String, userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: js.Array[HTMLElement | SVGElement | String]): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: js.Array[HTMLElement | SVGElement | String], userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: HTMLElement): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: HTMLElement, userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: SVGElement): FocusTrap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any]).asInstanceOf[FocusTrap]
  inline def createFocusTrap(element: SVGElement, userOptions: Options): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrap")(element.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
  
  /* Inlined std.Pick<focus-trap.focus-trap.Options, 'onActivate' | 'onPostActivate' | 'checkCanFocusTrap'> */
  trait ActivateOptions extends StObject {
    
    var checkCanFocusTrap: js.UndefOr[
        js.Function1[/* containers */ js.Array[HTMLElement | SVGElement], js.Promise[Unit]]
      ] = js.undefined
    
    var onActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPostActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ActivateOptions {
    
    inline def apply(): ActivateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivateOptions]
    }
    
    extension [Self <: ActivateOptions](x: Self) {
      
      inline def setCheckCanFocusTrap(value: /* containers */ js.Array[HTMLElement | SVGElement] => js.Promise[Unit]): Self = StObject.set(x, "checkCanFocusTrap", js.Any.fromFunction1(value))
      
      inline def setCheckCanFocusTrapUndefined: Self = StObject.set(x, "checkCanFocusTrap", js.undefined)
      
      inline def setOnActivate(value: Callback): Self = StObject.set(x, "onActivate", value.toJsFn)
      
      inline def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
      
      inline def setOnPostActivate(value: Callback): Self = StObject.set(x, "onPostActivate", value.toJsFn)
      
      inline def setOnPostActivateUndefined: Self = StObject.set(x, "onPostActivate", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<focus-trap.focus-trap.Options, 'onDeactivate' | 'onPostDeactivate' | 'checkCanReturnFocus'> */
  trait DeactivateOptions extends StObject {
    
    var checkCanReturnFocus: js.UndefOr[js.Function1[/* trigger */ HTMLElement | SVGElement, js.Promise[Unit]]] = js.undefined
    
    var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPostDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnFocus: js.UndefOr[Boolean] = js.undefined
  }
  object DeactivateOptions {
    
    inline def apply(): DeactivateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeactivateOptions]
    }
    
    extension [Self <: DeactivateOptions](x: Self) {
      
      inline def setCheckCanReturnFocus(value: /* trigger */ HTMLElement | SVGElement => js.Promise[Unit]): Self = StObject.set(x, "checkCanReturnFocus", js.Any.fromFunction1(value))
      
      inline def setCheckCanReturnFocusUndefined: Self = StObject.set(x, "checkCanReturnFocus", js.undefined)
      
      inline def setOnDeactivate(value: Callback): Self = StObject.set(x, "onDeactivate", value.toJsFn)
      
      inline def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
      
      inline def setOnPostDeactivate(value: Callback): Self = StObject.set(x, "onPostDeactivate", value.toJsFn)
      
      inline def setOnPostDeactivateUndefined: Self = StObject.set(x, "onPostDeactivate", js.undefined)
      
      inline def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
    }
  }
  
  type FocusTarget = FocusTargetValue | js.Function0[FocusTargetValue]
  
  type FocusTargetOrFalse = FocusTargetValueOrFalse | js.Function0[FocusTargetValueOrFalse]
  
  type FocusTargetValue = HTMLElement | SVGElement | String
  
  type FocusTargetValueOrFalse = FocusTargetValue | `false`
  
  @js.native
  trait FocusTrap extends StObject {
    
    def activate(): FocusTrap = js.native
    def activate(activateOptions: ActivateOptions): FocusTrap = js.native
    
    var active: Boolean = js.native
    
    def deactivate(): FocusTrap = js.native
    def deactivate(deactivateOptions: DeactivateOptions): FocusTrap = js.native
    
    def pause(): FocusTrap = js.native
    
    var paused: Boolean = js.native
    
    def unpause(): FocusTrap = js.native
    
    def updateContainerElements(containerElements: String): FocusTrap = js.native
    def updateContainerElements(containerElements: js.Array[HTMLElement | SVGElement | String]): FocusTrap = js.native
    def updateContainerElements(containerElements: HTMLElement): FocusTrap = js.native
    def updateContainerElements(containerElements: SVGElement): FocusTrap = js.native
  }
  
  type FocusTrapTabbableOptions = CheckOptions
  
  type KeyboardEventToBoolean = js.Function1[/* event */ KeyboardEvent, Boolean]
  
  type MouseEventToBoolean = js.Function1[/* event */ MouseEvent | TouchEvent, Boolean]
  
  trait Options extends StObject {
    
    /**
      * If set and is or returns `true`, a click outside the focus trap will not
      * be prevented, even when `clickOutsideDeactivates` is `false`. When
      * `clickOutsideDeactivates` is `true`, this option is **ignored** (i.e.
      * if it's a function, it will not be called). Use this option to control
      * if (and even which) clicks are allowed outside the trap in conjunction
      * with `clickOutsideDeactivates: false`. Default: `false`.
      */
    var allowOutsideClick: js.UndefOr[Boolean | MouseEventToBoolean] = js.undefined
    
    /**
      * A function for determining if it is safe to send focus to the focus trap
      * or not.
      *
      * It should return a promise that only resolves once all the listed `containers`
      * are able to receive focus.
      *
      * The purpose of this is to prevent early focus-trap activation on animated
      * dialogs that fade in and out. When a dialog fades in, there is a brief delay
      * between the activation of the trap and the trap element being focusable.
      */
    var checkCanFocusTrap: js.UndefOr[
        js.Function1[/* containers */ js.Array[HTMLElement | SVGElement], js.Promise[Unit]]
      ] = js.undefined
    
    /**
      * A function for determining if it is safe to send focus back to the `trigger` element.
      *
      * It should return a promise that only resolves once `trigger` is focusable.
      *
      * The purpose of this is to prevent the focus being sent to an animated trigger element too early.
      * If a trigger element fades in upon trap deactivation, there is a brief delay between the deactivation
      * of the trap and when the trigger element is focusable.
      *
      * `trigger` will be either the node that had focus prior to the trap being activated,
      * or the result of the `setReturnFocus` option, if configured.
      *
      * This handler is **not** called if the `returnFocusOnDeactivate` configuration option
      * (or the `returnFocus` deactivation option) is falsy.
      */
    var checkCanReturnFocus: js.UndefOr[js.Function1[/* trigger */ HTMLElement | SVGElement, js.Promise[Unit]]] = js.undefined
    
    /**
      * If `true` or returns `true`, a click outside the focus trap will
      * deactivate the focus trap and allow the click event to do its thing (i.e.
      * to pass-through to the element that was clicked). This option **takes
      * precedence** over `allowOutsideClick` when it's set to `true`, causing
      * that option to be ignored. Default: `false`.
      */
    var clickOutsideDeactivates: js.UndefOr[Boolean | MouseEventToBoolean] = js.undefined
    
    /**
      * Default: `true`. Delays the autofocus when the focus trap is activated.
      * This prevents elements within the focusable element from capturing
      * the event that triggered the focus trap activation.
      */
    var delayInitialFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: `window.document`. Document where the focus trap will be active.
      * This allows to use FocusTrap in an iFrame context.
      */
    var document: js.UndefOr[Document] = js.undefined
    
    /**
      * Default: `true`. If `false` or returns `false`, the `Escape` key will not trigger
      * deactivation of the focus trap. This can be useful if you want
      * to force the user to make a decision instead of allowing an easy
      * way out. Note that if a function is given, it's only called if the ESC key
      * was pressed.
      */
    var escapeDeactivates: js.UndefOr[Boolean | KeyboardEventToBoolean] = js.undefined
    
    /**
      * By default, an error will be thrown if the focus trap contains no
      * elements in its tab order. With this option you can specify a
      * fallback element to programmatically receive focus if no other
      * tabbable elements are found. For example, you may want a popover's
      * `<div>` to receive focus if the popover's content includes no
      * tabbable elements. *Make sure the fallback element has a negative
      * `tabindex` so it can be programmatically focused.
      *
      * NOTE: If `initialFocus` is `false` (or a function that returns `false`),
      * this function will not be called when the trap is activated, and no element
      * will be initially focused. This function may still be called while the trap
      * is active if things change such that there are no longer any tabbable nodes
      * in the trap.
      */
    var fallbackFocus: js.UndefOr[FocusTarget] = js.undefined
    
    /**
      * By default, when a focus trap is activated the first element in the
      * focus trap's tab order will receive focus. With this option you can
      * specify a different element to receive that initial focus, or use `false`
      * for no initially focused element at all.
      *
      * NOTE: Setting this option to `false` (or a function that returns `false`)
      * will prevent the `fallbackFocus` option from being used.
      */
    var initialFocus: js.UndefOr[FocusTargetOrFalse] = js.undefined
    
    /**
      * A function that will be called **before** sending focus to the
      * target element upon activation.
      */
    var onActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called **before** sending focus to the
      * trigger element upon deactivation.
      */
    var onDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called **after** focus has been sent to the
      * target element upon activation.
      */
    var onPostActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A function that will be called after the trap is deactivated, after `onDeactivate`.
      * If `returnFocus` was set, it will be called **after** focus has been sent to the trigger
      * element upon deactivation; otherwise, it will be called after deactivation completes.
      */
    var onPostDeactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * By default, focus() will scroll to the element if not in viewport.
      * It can produce unintended effects like scrolling back to the top of a modal.
      * If set to `true`, no scroll will happen.
      */
    var preventScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: `true`. If `false`, when the trap is deactivated,
      * focus will *not* return to the element that had focus before activation.
      */
    var returnFocusOnDeactivate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, focus trap on deactivation will return to the element
      * that was focused before activation.
      */
    var setReturnFocus: js.UndefOr[
        FocusTargetValueOrFalse | (js.Function1[
          /* nodeFocusedBeforeActivation */ HTMLElement | SVGElement, 
          FocusTargetValueOrFalse
        ])
      ] = js.undefined
    
    /**
      * Specific tabbable options configurable on focus-trap.
      */
    var tabbableOptions: js.UndefOr[FocusTrapTabbableOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowOutsideClick(value: Boolean | MouseEventToBoolean): Self = StObject.set(x, "allowOutsideClick", value.asInstanceOf[js.Any])
      
      inline def setAllowOutsideClickFunction1(value: /* event */ MouseEvent | TouchEvent => Boolean): Self = StObject.set(x, "allowOutsideClick", js.Any.fromFunction1(value))
      
      inline def setAllowOutsideClickUndefined: Self = StObject.set(x, "allowOutsideClick", js.undefined)
      
      inline def setCheckCanFocusTrap(value: /* containers */ js.Array[HTMLElement | SVGElement] => js.Promise[Unit]): Self = StObject.set(x, "checkCanFocusTrap", js.Any.fromFunction1(value))
      
      inline def setCheckCanFocusTrapUndefined: Self = StObject.set(x, "checkCanFocusTrap", js.undefined)
      
      inline def setCheckCanReturnFocus(value: /* trigger */ HTMLElement | SVGElement => js.Promise[Unit]): Self = StObject.set(x, "checkCanReturnFocus", js.Any.fromFunction1(value))
      
      inline def setCheckCanReturnFocusUndefined: Self = StObject.set(x, "checkCanReturnFocus", js.undefined)
      
      inline def setClickOutsideDeactivates(value: Boolean | MouseEventToBoolean): Self = StObject.set(x, "clickOutsideDeactivates", value.asInstanceOf[js.Any])
      
      inline def setClickOutsideDeactivatesFunction1(value: /* event */ MouseEvent | TouchEvent => Boolean): Self = StObject.set(x, "clickOutsideDeactivates", js.Any.fromFunction1(value))
      
      inline def setClickOutsideDeactivatesUndefined: Self = StObject.set(x, "clickOutsideDeactivates", js.undefined)
      
      inline def setDelayInitialFocus(value: Boolean): Self = StObject.set(x, "delayInitialFocus", value.asInstanceOf[js.Any])
      
      inline def setDelayInitialFocusUndefined: Self = StObject.set(x, "delayInitialFocus", js.undefined)
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setEscapeDeactivates(value: Boolean | KeyboardEventToBoolean): Self = StObject.set(x, "escapeDeactivates", value.asInstanceOf[js.Any])
      
      inline def setEscapeDeactivatesFunction1(value: /* event */ KeyboardEvent => Boolean): Self = StObject.set(x, "escapeDeactivates", js.Any.fromFunction1(value))
      
      inline def setEscapeDeactivatesUndefined: Self = StObject.set(x, "escapeDeactivates", js.undefined)
      
      inline def setFallbackFocus(value: FocusTarget): Self = StObject.set(x, "fallbackFocus", value.asInstanceOf[js.Any])
      
      inline def setFallbackFocusCallbackTo(value: CallbackTo[FocusTargetValue]): Self = StObject.set(x, "fallbackFocus", value.toJsFn)
      
      inline def setFallbackFocusUndefined: Self = StObject.set(x, "fallbackFocus", js.undefined)
      
      inline def setInitialFocus(value: FocusTargetOrFalse): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusCallbackTo(value: CallbackTo[FocusTargetValueOrFalse]): Self = StObject.set(x, "initialFocus", value.toJsFn)
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      inline def setOnActivate(value: Callback): Self = StObject.set(x, "onActivate", value.toJsFn)
      
      inline def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
      
      inline def setOnDeactivate(value: Callback): Self = StObject.set(x, "onDeactivate", value.toJsFn)
      
      inline def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
      
      inline def setOnPostActivate(value: Callback): Self = StObject.set(x, "onPostActivate", value.toJsFn)
      
      inline def setOnPostActivateUndefined: Self = StObject.set(x, "onPostActivate", js.undefined)
      
      inline def setOnPostDeactivate(value: Callback): Self = StObject.set(x, "onPostDeactivate", value.toJsFn)
      
      inline def setOnPostDeactivateUndefined: Self = StObject.set(x, "onPostDeactivate", js.undefined)
      
      inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
      
      inline def setReturnFocusOnDeactivate(value: Boolean): Self = StObject.set(x, "returnFocusOnDeactivate", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusOnDeactivateUndefined: Self = StObject.set(x, "returnFocusOnDeactivate", js.undefined)
      
      inline def setSetReturnFocus(
        value: FocusTargetValueOrFalse | (js.Function1[
              /* nodeFocusedBeforeActivation */ HTMLElement | SVGElement, 
              FocusTargetValueOrFalse
            ])
      ): Self = StObject.set(x, "setReturnFocus", value.asInstanceOf[js.Any])
      
      inline def setSetReturnFocusFunction1(value: /* nodeFocusedBeforeActivation */ HTMLElement | SVGElement => FocusTargetValueOrFalse): Self = StObject.set(x, "setReturnFocus", js.Any.fromFunction1(value))
      
      inline def setSetReturnFocusUndefined: Self = StObject.set(x, "setReturnFocus", js.undefined)
      
      inline def setTabbableOptions(value: FocusTrapTabbableOptions): Self = StObject.set(x, "tabbableOptions", value.asInstanceOf[js.Any])
      
      inline def setTabbableOptionsUndefined: Self = StObject.set(x, "tabbableOptions", js.undefined)
    }
  }
}
