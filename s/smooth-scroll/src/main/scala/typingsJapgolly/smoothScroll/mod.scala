package typingsJapgolly.smoothScroll

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smooth-scroll", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SmoothScroll {
    def this(selector: String) = this()
    def this(selector: String, options: Options) = this()
    def this(selector: Unit, options: Options) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.smoothScroll.smoothScrollStrings.Linear
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeInQuad
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeInCubic
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeInQuart
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeInQuint
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutQuad
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutCubic
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutQuart
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutQuint
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutQuad
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutCubic
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutQuart
    - typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutQuint
  */
  trait Easing extends StObject
  object Easing {
    
    inline def Linear: typingsJapgolly.smoothScroll.smoothScrollStrings.Linear = "Linear".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.Linear]
    
    inline def easeInCubic: typingsJapgolly.smoothScroll.smoothScrollStrings.easeInCubic = "easeInCubic".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeInCubic]
    
    inline def easeInOutCubic: typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutCubic]
    
    inline def easeInOutQuad: typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutQuad]
    
    inline def easeInOutQuart: typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutQuart]
    
    inline def easeInOutQuint: typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeInOutQuint]
    
    inline def easeInQuad: typingsJapgolly.smoothScroll.smoothScrollStrings.easeInQuad = "easeInQuad".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeInQuad]
    
    inline def easeInQuart: typingsJapgolly.smoothScroll.smoothScrollStrings.easeInQuart = "easeInQuart".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeInQuart]
    
    inline def easeInQuint: typingsJapgolly.smoothScroll.smoothScrollStrings.easeInQuint = "easeInQuint".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeInQuint]
    
    inline def easeOutCubic: typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutCubic]
    
    inline def easeOutQuad: typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutQuad]
    
    inline def easeOutQuart: typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutQuart]
    
    inline def easeOutQuint: typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typingsJapgolly.smoothScroll.smoothScrollStrings.easeOutQuint]
  }
  
  trait Options extends StObject {
    
    var clip: js.UndefOr[Boolean] = js.undefined
    
    var customEasing: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.undefined
    
    var durationMax: js.UndefOr[Double | Null] = js.undefined
    
    var durationMin: js.UndefOr[Double | Null] = js.undefined
    
    var easing: js.UndefOr[Easing] = js.undefined
    
    // Custom Events
    var emitEvents: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    // Selectors
    var ignore: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[
        Double | (js.Function2[
          /* anchor */ js.UndefOr[Element | Double | Null], 
          /* toggle */ js.UndefOr[Element | Null], 
          Double
        ])
      ] = js.undefined
    
    var popstate: js.UndefOr[Boolean] = js.undefined
    
    // Speed & Easing
    var speed: js.UndefOr[Double] = js.undefined
    
    var speedAsDuration: js.UndefOr[Boolean] = js.undefined
    
    var topOnEmptyHash: js.UndefOr[Boolean] = js.undefined
    
    // History
    var updateURL: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setCustomEasing(value: /* time */ Double => Double): Self = StObject.set(x, "customEasing", js.Any.fromFunction1(value))
      
      inline def setCustomEasingUndefined: Self = StObject.set(x, "customEasing", js.undefined)
      
      inline def setDurationMax(value: Double): Self = StObject.set(x, "durationMax", value.asInstanceOf[js.Any])
      
      inline def setDurationMaxNull: Self = StObject.set(x, "durationMax", null)
      
      inline def setDurationMaxUndefined: Self = StObject.set(x, "durationMax", js.undefined)
      
      inline def setDurationMin(value: Double): Self = StObject.set(x, "durationMin", value.asInstanceOf[js.Any])
      
      inline def setDurationMinNull: Self = StObject.set(x, "durationMin", null)
      
      inline def setDurationMinUndefined: Self = StObject.set(x, "durationMin", js.undefined)
      
      inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEmitEvents(value: Boolean): Self = StObject.set(x, "emitEvents", value.asInstanceOf[js.Any])
      
      inline def setEmitEventsUndefined: Self = StObject.set(x, "emitEvents", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setOffset(
        value: Double | (js.Function2[
              /* anchor */ js.UndefOr[Element | Double | Null], 
              /* toggle */ js.UndefOr[Element | Null], 
              Double
            ])
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction2(
        value: (/* anchor */ js.UndefOr[Element | Double | Null], /* toggle */ js.UndefOr[Element | Null]) => Double
      ): Self = StObject.set(x, "offset", js.Any.fromFunction2(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPopstate(value: Boolean): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
      
      inline def setPopstateUndefined: Self = StObject.set(x, "popstate", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedAsDuration(value: Boolean): Self = StObject.set(x, "speedAsDuration", value.asInstanceOf[js.Any])
      
      inline def setSpeedAsDurationUndefined: Self = StObject.set(x, "speedAsDuration", js.undefined)
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setTopOnEmptyHash(value: Boolean): Self = StObject.set(x, "topOnEmptyHash", value.asInstanceOf[js.Any])
      
      inline def setTopOnEmptyHashUndefined: Self = StObject.set(x, "topOnEmptyHash", js.undefined)
      
      inline def setUpdateURL(value: Boolean): Self = StObject.set(x, "updateURL", value.asInstanceOf[js.Any])
      
      inline def setUpdateURLUndefined: Self = StObject.set(x, "updateURL", js.undefined)
    }
  }
  
  @js.native
  trait SmoothScroll extends StObject {
    
    def animateScroll(): Unit = js.native
    def animateScroll(anchor: Element): Unit = js.native
    def animateScroll(anchor: Element, toggle: Element): Unit = js.native
    def animateScroll(anchor: Element, toggle: Element, options: Options): Unit = js.native
    def animateScroll(anchor: Element, toggle: Null, options: Options): Unit = js.native
    def animateScroll(anchor: Element, toggle: Unit, options: Options): Unit = js.native
    def animateScroll(anchor: Double): Unit = js.native
    def animateScroll(anchor: Double, toggle: Element): Unit = js.native
    def animateScroll(anchor: Double, toggle: Element, options: Options): Unit = js.native
    def animateScroll(anchor: Double, toggle: Null, options: Options): Unit = js.native
    def animateScroll(anchor: Double, toggle: Unit, options: Options): Unit = js.native
    def animateScroll(anchor: Null, toggle: Element): Unit = js.native
    def animateScroll(anchor: Null, toggle: Element, options: Options): Unit = js.native
    def animateScroll(anchor: Null, toggle: Null, options: Options): Unit = js.native
    def animateScroll(anchor: Null, toggle: Unit, options: Options): Unit = js.native
    
    def cancelScroll(): Unit = js.native
    def cancelScroll(noEvent: Boolean): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
    def init(options: Options): Unit = js.native
  }
}
