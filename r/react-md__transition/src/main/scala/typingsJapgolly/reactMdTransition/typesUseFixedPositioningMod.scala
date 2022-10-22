package typingsJapgolly.reactMdTransition

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMdTransition.anon.ReadonlyRequiredFixedPosi
import typingsJapgolly.reactMdTransition.typesTypesMod.FixedPositioningScrollData
import typingsJapgolly.reactMdTransition.typesTypesMod.FixedPositioningTransitionOptions
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionScrollCallback
import typingsJapgolly.reactMdUtils.typesPositioningTypesMod.CalculateFixedPositionOptions
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseFixedPositioningMod {
  
  @JSImport("@react-md/transition/types/useFixedPositioning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFixedPositioning[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */](
    hasPropStyleNodeRefFixedToOnEnterOnEnteringOnEnteredOnExitedAnchorDisableSwappingDisableVHBoundsInitialXInitialYPreventOverlapTransformOriginVhMarginVwMarginWidthXMarginYMarginGetFixedPositionOptionsOnScrollOnResize: FixedPositioningOptions[FixedToElement, FixedElement]
  ): FixedPositioningHookReturnValue[FixedElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFixedPositioning")(hasPropStyleNodeRefFixedToOnEnterOnEnteringOnEnteredOnExitedAnchorDisableSwappingDisableVHBoundsInitialXInitialYPreventOverlapTransformOriginVhMarginVwMarginWidthXMarginYMarginGetFixedPositionOptionsOnScrollOnResize.asInstanceOf[js.Any]).asInstanceOf[FixedPositioningHookReturnValue[FixedElement]]
  
  trait FixedPositioningHookReturnValue[E /* <: HTMLElement */] extends StObject {
    
    /**
      * This should really only be used if the {@link transitionOptions} is not
      * being used.
      */
    var callbacks: ReadonlyRequiredFixedPosi
    
    /**
      * A ref that should be passed to a component for the fixed positioning
      * behavior to work correctly.
      *
      * This should really only be used if the {@link transitionOptions} is not
      * being used.
      */
    var ref: RefFn[E]
    
    /**
      * @see {@link FixedPositionStyle}
      */
    var style: CSSProperties
    
    /** {@inheritDoc FixedPositioningTransitionOptions} */
    var transitionOptions: Required[FixedPositioningTransitionOptions[E]]
    
    /**
      * A function that can be called to update the style for the fixed element.
      */
    def updateStyle(): Unit
  }
  object FixedPositioningHookReturnValue {
    
    inline def apply[E /* <: HTMLElement */](
      callbacks: ReadonlyRequiredFixedPosi,
      ref: E | Null => Callback,
      style: CSSProperties,
      transitionOptions: Required[FixedPositioningTransitionOptions[E]],
      updateStyle: Callback
    ): FixedPositioningHookReturnValue[E] = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], ref = js.Any.fromFunction1((t0: E | Null) => ref(t0).runNow()), style = style.asInstanceOf[js.Any], transitionOptions = transitionOptions.asInstanceOf[js.Any], updateStyle = updateStyle.toJsFn)
      __obj.asInstanceOf[FixedPositioningHookReturnValue[E]]
    }
    
    extension [Self <: FixedPositioningHookReturnValue[?], E /* <: HTMLElement */](x: Self & FixedPositioningHookReturnValue[E]) {
      
      inline def setCallbacks(value: ReadonlyRequiredFixedPosi): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setRef(value: E | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptions(value: Required[FixedPositioningTransitionOptions[E]]): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setUpdateStyle(value: Callback): Self = StObject.set(x, "updateStyle", value.toJsFn)
    }
  }
  
  trait FixedPositioningOptions[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */]
    extends StObject
       with FixedPositioningTransitionOptions[FixedElement]
       with CalculateFixedPositionOptions {
    
    /**
      * A ref pointing to an element that another element should be fixed to. This
      * **must** be provided for the positioning to work.
      */
    var fixedTo: RefHandle[FixedToElement]
    
    /**
      * An optional function that can be used to override positioning options if
      * some options require the element to be in the DOM for specific
      * calculations.
      */
    var getFixedPositionOptions: js.UndefOr[js.Function0[CalculateFixedPositionOptions]] = js.undefined
    
    /**
      * An optional function to call if the page resizes while the
      * {@link FixedElement} is visible.
      */
    var onResize: js.UndefOr[EventListener] = js.undefined
    
    /** {@inheritDoc TransitionScrollCallback} */
    var onScroll: js.UndefOr[TransitionScrollCallback[FixedToElement, FixedElement]] = js.undefined
    
    /**
      * An optional style that will be merged with the fixed positioning required
      * styles.
      *
      * @see {@link FixedPositionStyle}
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FixedPositioningOptions {
    
    inline def apply[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */](fixedTo: RefHandle[FixedToElement]): FixedPositioningOptions[FixedToElement, FixedElement] = {
      val __obj = js.Dynamic.literal(fixedTo = fixedTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedPositioningOptions[FixedToElement, FixedElement]]
    }
    
    extension [Self <: FixedPositioningOptions[?, ?], FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */](x: Self & (FixedPositioningOptions[FixedToElement, FixedElement])) {
      
      inline def setFixedTo(value: RefHandle[FixedToElement]): Self = StObject.set(x, "fixedTo", value.asInstanceOf[js.Any])
      
      inline def setGetFixedPositionOptions(value: CallbackTo[CalculateFixedPositionOptions]): Self = StObject.set(x, "getFixedPositionOptions", value.toJsFn)
      
      inline def setGetFixedPositionOptionsUndefined: Self = StObject.set(x, "getFixedPositionOptions", js.undefined)
      
      inline def setOnResize(value: /* evt */ Event => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(
        value: (/* event */ Event, /* data */ FixedPositioningScrollData[FixedToElement, FixedElement]) => Callback
      ): Self = StObject.set(x, "onScroll", js.Any.fromFunction2((t0: /* event */ Event, t1: /* data */ FixedPositioningScrollData[FixedToElement, FixedElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
