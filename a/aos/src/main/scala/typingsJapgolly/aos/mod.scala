package typingsJapgolly.aos

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import typingsJapgolly.aos.aosStrings.mobile
import typingsJapgolly.aos.aosStrings.phone
import typingsJapgolly.aos.aosStrings.tablet
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("aos", JSImport.Namespace)
  @js.native
  val ^ : Aos = js.native
  
  @js.native
  trait Aos extends StObject {
    
    /**
      * Initializing AOS
      * - Create options merging defaults with user defined options
      * - Set attributes on <body> as global setting - css relies on it
      * - Attach preparing elements to options.startEvent,
      *   window resize and orientation change
      * - Attach function that handle scroll and everything connected to it
      *   to window scroll event and fire once document is ready to set initial state
      *  @param options options
      */
    def init(): Unit = js.native
    def init(options: AosOptions): Unit = js.native
    
    /**
      * Refresh AOS
      */
    def refresh(): Unit = js.native
    
    /**
      * Hard refresh
      * create array with new elements and trigger refresh
      */
    def refreshHard(): Unit = js.native
  }
  
  @js.native
  trait AosEvent
    extends StObject
       with Event {
    
    var detail: Element = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.aos.aosStrings.aosColonin
    - typingsJapgolly.aos.aosStrings.aosColonout
  */
  trait AosEventType extends StObject
  object AosEventType {
    
    inline def aosColonin: typingsJapgolly.aos.aosStrings.aosColonin = "aos:in".asInstanceOf[typingsJapgolly.aos.aosStrings.aosColonin]
    
    inline def aosColonout: typingsJapgolly.aos.aosStrings.aosColonout = "aos:out".asInstanceOf[typingsJapgolly.aos.aosStrings.aosColonout]
  }
  
  trait AosOptions extends StObject {
    
    // #endregion
    // #region Settings that can be overridden on per-element basis, by `data-aos-*` attributes
    /**
      * Defines which position of the element regarding to window should trigger the animation
      */
    var anchorPlacement: js.UndefOr[anchorPlacementOptions] = js.undefined
    
    // #region Global settings
    /**
      * Class applied on animation
      */
    var animatedClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The delay on debounce used while resizing window
      */
    var debounceDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Values from 0 to 3000, with step 50ms
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Accepts following values: 'phone', 'tablet', 'mobile', boolean, expression or function
      */
    var disable: js.UndefOr[phone | tablet | mobile | Boolean | js.Function0[Boolean]] = js.undefined
    
    /**
      * Disables automatic mutations' detections
      */
    var disableMutationObserver: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Values from 0 to 3000, with step 50ms
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Default easing for AOS animations
      */
    var easing: js.UndefOr[easingOptions] = js.undefined
    
    /**
      * Class applied after initialization
      */
    var initClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Whether elements should animate out while scrolling past them
      */
    var mirror: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Offset (in px) from the original trigger point
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether animation should happen only once - while scrolling down
      */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the event dispatched on the document, that AOS should initialize on
      */
    var startEvent: js.UndefOr[String] = js.undefined
    
    /**
      * The delay on throttle used while scrolling the page
      */
    var throttleDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, will add content of `data-aos` as classes on scroll
      */
    var useClassNames: js.UndefOr[Boolean] = js.undefined
  }
  object AosOptions {
    
    inline def apply(): AosOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AosOptions]
    }
    
    extension [Self <: AosOptions](x: Self) {
      
      inline def setAnchorPlacement(value: anchorPlacementOptions): Self = StObject.set(x, "anchorPlacement", value.asInstanceOf[js.Any])
      
      inline def setAnchorPlacementUndefined: Self = StObject.set(x, "anchorPlacement", js.undefined)
      
      inline def setAnimatedClassName(value: String): Self = StObject.set(x, "animatedClassName", value.asInstanceOf[js.Any])
      
      inline def setAnimatedClassNameUndefined: Self = StObject.set(x, "animatedClassName", js.undefined)
      
      inline def setDebounceDelay(value: Double): Self = StObject.set(x, "debounceDelay", value.asInstanceOf[js.Any])
      
      inline def setDebounceDelayUndefined: Self = StObject.set(x, "debounceDelay", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisable(value: phone | tablet | mobile | Boolean | js.Function0[Boolean]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setDisableMutationObserver(value: Boolean): Self = StObject.set(x, "disableMutationObserver", value.asInstanceOf[js.Any])
      
      inline def setDisableMutationObserverUndefined: Self = StObject.set(x, "disableMutationObserver", js.undefined)
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: easingOptions): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setInitClassName(value: String): Self = StObject.set(x, "initClassName", value.asInstanceOf[js.Any])
      
      inline def setInitClassNameUndefined: Self = StObject.set(x, "initClassName", js.undefined)
      
      inline def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
      
      inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setStartEvent(value: String): Self = StObject.set(x, "startEvent", value.asInstanceOf[js.Any])
      
      inline def setStartEventUndefined: Self = StObject.set(x, "startEvent", js.undefined)
      
      inline def setThrottleDelay(value: Double): Self = StObject.set(x, "throttleDelay", value.asInstanceOf[js.Any])
      
      inline def setThrottleDelayUndefined: Self = StObject.set(x, "throttleDelay", js.undefined)
      
      inline def setUseClassNames(value: Boolean): Self = StObject.set(x, "useClassNames", value.asInstanceOf[js.Any])
      
      inline def setUseClassNamesUndefined: Self = StObject.set(x, "useClassNames", js.undefined)
    }
  }
  
  type _To = Aos
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Aos = ^
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.aos.aosStrings.`top-bottom`
    - typingsJapgolly.aos.aosStrings.`top-center`
    - typingsJapgolly.aos.aosStrings.`top-top`
    - typingsJapgolly.aos.aosStrings.`center-bottom`
    - typingsJapgolly.aos.aosStrings.`center-center`
    - typingsJapgolly.aos.aosStrings.`center-top`
    - typingsJapgolly.aos.aosStrings.`bottom-bottom`
    - typingsJapgolly.aos.aosStrings.`bottom-center`
    - typingsJapgolly.aos.aosStrings.`bottom-top`
  */
  trait anchorPlacementOptions extends StObject
  object anchorPlacementOptions {
    
    inline def `bottom-bottom`: typingsJapgolly.aos.aosStrings.`bottom-bottom` = "bottom-bottom".asInstanceOf[typingsJapgolly.aos.aosStrings.`bottom-bottom`]
    
    inline def `bottom-center`: typingsJapgolly.aos.aosStrings.`bottom-center` = "bottom-center".asInstanceOf[typingsJapgolly.aos.aosStrings.`bottom-center`]
    
    inline def `bottom-top`: typingsJapgolly.aos.aosStrings.`bottom-top` = "bottom-top".asInstanceOf[typingsJapgolly.aos.aosStrings.`bottom-top`]
    
    inline def `center-bottom`: typingsJapgolly.aos.aosStrings.`center-bottom` = "center-bottom".asInstanceOf[typingsJapgolly.aos.aosStrings.`center-bottom`]
    
    inline def `center-center`: typingsJapgolly.aos.aosStrings.`center-center` = "center-center".asInstanceOf[typingsJapgolly.aos.aosStrings.`center-center`]
    
    inline def `center-top`: typingsJapgolly.aos.aosStrings.`center-top` = "center-top".asInstanceOf[typingsJapgolly.aos.aosStrings.`center-top`]
    
    inline def `top-bottom`: typingsJapgolly.aos.aosStrings.`top-bottom` = "top-bottom".asInstanceOf[typingsJapgolly.aos.aosStrings.`top-bottom`]
    
    inline def `top-center`: typingsJapgolly.aos.aosStrings.`top-center` = "top-center".asInstanceOf[typingsJapgolly.aos.aosStrings.`top-center`]
    
    inline def `top-top`: typingsJapgolly.aos.aosStrings.`top-top` = "top-top".asInstanceOf[typingsJapgolly.aos.aosStrings.`top-top`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.aos.aosStrings.linear
    - typingsJapgolly.aos.aosStrings.ease
    - typingsJapgolly.aos.aosStrings.`ease-in`
    - typingsJapgolly.aos.aosStrings.`ease-out`
    - typingsJapgolly.aos.aosStrings.`ease-in-out`
    - typingsJapgolly.aos.aosStrings.`ease-in-back`
    - typingsJapgolly.aos.aosStrings.`ease-out-back`
    - typingsJapgolly.aos.aosStrings.`ease-in-out-back`
    - typingsJapgolly.aos.aosStrings.`ease-in-sine`
    - typingsJapgolly.aos.aosStrings.`ease-out-sine`
    - typingsJapgolly.aos.aosStrings.`ease-in-out-sine`
    - typingsJapgolly.aos.aosStrings.`ease-in-quad`
    - typingsJapgolly.aos.aosStrings.`ease-out-quad`
    - typingsJapgolly.aos.aosStrings.`ease-in-out-quad`
    - typingsJapgolly.aos.aosStrings.`ease-in-cubic`
    - typingsJapgolly.aos.aosStrings.`ease-out-cubic`
    - typingsJapgolly.aos.aosStrings.`ease-in-out-cubic`
    - typingsJapgolly.aos.aosStrings.`ease-in-quart`
    - typingsJapgolly.aos.aosStrings.`ease-out-quart`
    - typingsJapgolly.aos.aosStrings.`ease-in-out-quart`
  */
  trait easingOptions extends StObject
  object easingOptions {
    
    inline def ease: typingsJapgolly.aos.aosStrings.ease = "ease".asInstanceOf[typingsJapgolly.aos.aosStrings.ease]
    
    inline def `ease-in`: typingsJapgolly.aos.aosStrings.`ease-in` = "ease-in".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in`]
    
    inline def `ease-in-back`: typingsJapgolly.aos.aosStrings.`ease-in-back` = "ease-in-back".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-back`]
    
    inline def `ease-in-cubic`: typingsJapgolly.aos.aosStrings.`ease-in-cubic` = "ease-in-cubic".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-cubic`]
    
    inline def `ease-in-out`: typingsJapgolly.aos.aosStrings.`ease-in-out` = "ease-in-out".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-out`]
    
    inline def `ease-in-out-back`: typingsJapgolly.aos.aosStrings.`ease-in-out-back` = "ease-in-out-back".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-out-back`]
    
    inline def `ease-in-out-cubic`: typingsJapgolly.aos.aosStrings.`ease-in-out-cubic` = "ease-in-out-cubic".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-out-cubic`]
    
    inline def `ease-in-out-quad`: typingsJapgolly.aos.aosStrings.`ease-in-out-quad` = "ease-in-out-quad".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-out-quad`]
    
    inline def `ease-in-out-quart`: typingsJapgolly.aos.aosStrings.`ease-in-out-quart` = "ease-in-out-quart".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-out-quart`]
    
    inline def `ease-in-out-sine`: typingsJapgolly.aos.aosStrings.`ease-in-out-sine` = "ease-in-out-sine".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-out-sine`]
    
    inline def `ease-in-quad`: typingsJapgolly.aos.aosStrings.`ease-in-quad` = "ease-in-quad".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-quad`]
    
    inline def `ease-in-quart`: typingsJapgolly.aos.aosStrings.`ease-in-quart` = "ease-in-quart".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-quart`]
    
    inline def `ease-in-sine`: typingsJapgolly.aos.aosStrings.`ease-in-sine` = "ease-in-sine".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-in-sine`]
    
    inline def `ease-out`: typingsJapgolly.aos.aosStrings.`ease-out` = "ease-out".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-out`]
    
    inline def `ease-out-back`: typingsJapgolly.aos.aosStrings.`ease-out-back` = "ease-out-back".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-out-back`]
    
    inline def `ease-out-cubic`: typingsJapgolly.aos.aosStrings.`ease-out-cubic` = "ease-out-cubic".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-out-cubic`]
    
    inline def `ease-out-quad`: typingsJapgolly.aos.aosStrings.`ease-out-quad` = "ease-out-quad".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-out-quad`]
    
    inline def `ease-out-quart`: typingsJapgolly.aos.aosStrings.`ease-out-quart` = "ease-out-quart".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-out-quart`]
    
    inline def `ease-out-sine`: typingsJapgolly.aos.aosStrings.`ease-out-sine` = "ease-out-sine".asInstanceOf[typingsJapgolly.aos.aosStrings.`ease-out-sine`]
    
    inline def linear: typingsJapgolly.aos.aosStrings.linear = "linear".asInstanceOf[typingsJapgolly.aos.aosStrings.linear]
  }
  
  object global {
    
    @js.native
    trait Document extends StObject {
      
      def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit]): Unit = js.native
      def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit], options: Boolean): Unit = js.native
      def addEventListener(
        `type`: AosEventType,
        listener: js.Function1[/* event */ AosEvent, Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
    }
  }
}
