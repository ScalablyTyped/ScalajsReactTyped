package typingsJapgolly.reactMdStates

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.MergableRippleHandlers
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseInteractionStatesMod {
  
  @JSImport("@react-md/states/types/useInteractionStates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useInteractionStates[E /* <: HTMLElement */](): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractionStates")().asInstanceOf[ReturnValue[E]]
  inline def useInteractionStates[E /* <: HTMLElement */](options: InteractionStatesOptions[E]): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractionStates")(options.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  /* Inlined parent std.Partial<@react-md/states.@react-md/states/types/StatesConfig.StatesConfigContextType> */
  /* Inlined parent @react-md/states.@react-md/states/types/ripples/types.RipplesOptions<E> */
  trait InteractionStatesOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * An optional className to merge with the different interaction states.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the enter keyboard click polyfill should be completely disabled.
      * This is generally used if the keyboard functionality is already built-in to
      * the element like buttons or labels.
      */
    var disableEnterClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the component should fallback to using the custom pressed class
      * names when ripples are disabled.
      *
      * @defaultValue `false`
      */
    var disablePressedFallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the ripple effect should not occur after a programmatic trigger
      * of a click event. This would normally happen if using `aria-activedescendant`
      * movement and the user "presses" the current active element.
      */
    var disableProgrammaticRipple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the ripple effect should be disabled. This will make the `useRipples`
      * hook not provide any additional logic for the provided handlers.
      */
    var disableRipple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the spacebar should not trigger a click event when using the
      * user pressed spacebar on a focusable element. You _normally_ want the
      * spacebar to also trigger a click event , but there are a few cases where it
      * should not (like custom links).
      *
      * When this is disabled, it will also make sure that the ripple and pressed
      * effects are not triggered from a spacebar click.
      *
      * @defaultValue `false`
      */
    var disableSpacebarClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional boolean if the element is currently disabled. This will ensure
      * that the ripple states are not applied during these times.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the element should be able to gain both the ripple effect and
      * the pressed states changes. This will only be enabled if both the
      * `disableRipple` and `disabledPressedFallback` are still `false`
      */
    var enablePressedAndRipple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional object of event handlers to merge with the required
      * ripple trigger event handlers.
      */
    var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.undefined
    
    /**
      * An optional className to apply to the ripple element.
      */
    var rippleClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional object containing the different transition class names for the ripple
      * effect. If this is undefined, it will be extracted from the current `StatesContext`
      * instead.
      */
    var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    /**
      * An optional className to apply to the ripple's container element.
      */
    var rippleContainerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional timeout duration for the ripple effect. If this is undefined, its value
      * will be extracted from the current `StatesContext` instead.
      */
    var rippleTimeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object InteractionStatesOptions {
    
    inline def apply[E /* <: HTMLElement */](): InteractionStatesOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionStatesOptions[E]]
    }
    
    extension [Self <: InteractionStatesOptions[?], E /* <: HTMLElement */](x: Self & InteractionStatesOptions[E]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableEnterClick(value: Boolean): Self = StObject.set(x, "disableEnterClick", value.asInstanceOf[js.Any])
      
      inline def setDisableEnterClickUndefined: Self = StObject.set(x, "disableEnterClick", js.undefined)
      
      inline def setDisablePressedFallback(value: Boolean): Self = StObject.set(x, "disablePressedFallback", value.asInstanceOf[js.Any])
      
      inline def setDisablePressedFallbackUndefined: Self = StObject.set(x, "disablePressedFallback", js.undefined)
      
      inline def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableProgrammaticRippleUndefined: Self = StObject.set(x, "disableProgrammaticRipple", js.undefined)
      
      inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      inline def setDisableSpacebarClick(value: Boolean): Self = StObject.set(x, "disableSpacebarClick", value.asInstanceOf[js.Any])
      
      inline def setDisableSpacebarClickUndefined: Self = StObject.set(x, "disableSpacebarClick", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnablePressedAndRipple(value: Boolean): Self = StObject.set(x, "enablePressedAndRipple", value.asInstanceOf[js.Any])
      
      inline def setEnablePressedAndRippleUndefined: Self = StObject.set(x, "enablePressedAndRipple", js.undefined)
      
      inline def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setRippleClassName(value: String): Self = StObject.set(x, "rippleClassName", value.asInstanceOf[js.Any])
      
      inline def setRippleClassNameUndefined: Self = StObject.set(x, "rippleClassName", js.undefined)
      
      inline def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      inline def setRippleClassNamesUndefined: Self = StObject.set(x, "rippleClassNames", js.undefined)
      
      inline def setRippleContainerClassName(value: String): Self = StObject.set(x, "rippleContainerClassName", value.asInstanceOf[js.Any])
      
      inline def setRippleContainerClassNameUndefined: Self = StObject.set(x, "rippleContainerClassName", js.undefined)
      
      inline def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
      
      inline def setRippleTimeoutUndefined: Self = StObject.set(x, "rippleTimeout", js.undefined)
    }
  }
  
  trait ReturnValue[E /* <: HTMLElement */] extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var handlers: MergableRippleHandlers[E]
    
    var ripples: Node
  }
  object ReturnValue {
    
    inline def apply[E /* <: HTMLElement */](handlers: MergableRippleHandlers[E]): ReturnValue[E] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], ripples = null)
      __obj.asInstanceOf[ReturnValue[E]]
    }
    
    extension [Self <: ReturnValue[?], E /* <: HTMLElement */](x: Self & ReturnValue[E]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setRipples(value: VdomNode): Self = StObject.set(x, "ripples", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRipplesNull: Self = StObject.set(x, "ripples", null)
      
      inline def setRipplesVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "ripples", js.Array(value*))
      
      inline def setRipplesVdomElement(value: VdomElement): Self = StObject.set(x, "ripples", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
