package typingsJapgolly.wallop

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wallop", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Wallop {
    /**
      * Implement new instance of Wallop.
      */
    def this(selector: Element) = this()
    def this(selector: Element, options: Options) = this()
    
    /**
      * Advances to the slide with the given index.
      */
    /* CompleteClass */
    override def goTo(index: Double): Wallop = js.native
    
    /**
      * Advances to next slide.
      */
    /* CompleteClass */
    override def next(): Wallop = js.native
    
    /**
      * Unbinds method from custom event.
      */
    /* CompleteClass */
    override def off(eventName: String, callback: js.Function0[Unit]): Wallop = js.native
    
    /**
      * Bind method to custom event.
      */
    /* CompleteClass */
    override def on(eventName: String, callback: js.Function0[Unit]): Wallop = js.native
    
    /**
      * Returns to previous slide.
      */
    /* CompleteClass */
    override def previous(): Wallop = js.native
    
    /**
      * Resets current Wallop instance to defaults.
      */
    /* CompleteClass */
    override def reset(): Wallop = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Override class for "next" button.
      *
      * @default 'Wallop-buttonNext'
      */
    var buttonNextClass: js.UndefOr[String] = js.undefined
    
    /**
      * Override class for "previous" button.
      *
      * @default 'Wallop-buttonPrevious'
      */
    var buttonPreviousClass: js.UndefOr[String] = js.undefined
    
    /**
      * Enable/disable carousel mode.
      *
      * @default true
      */
    var carousel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override class for current item.
      *
      * @default 'Wallop-item--current'
      */
    var currentItemClass: js.UndefOr[String] = js.undefined
    
    /**
      * Override class that hides next item.
      *
      * @default 'Wallop-item--hideNext'
      */
    var hideNextClass: js.UndefOr[String] = js.undefined
    
    /**
      * Override class that hides previous item.
      *
      * @default 'Wallop-item--hidePrevious'
      */
    var hidePreviousClass: js.UndefOr[String] = js.undefined
    
    /**
      * Override class for item.
      *
      * @default 'Wallop-item'
      */
    var itemClass: js.UndefOr[String] = js.undefined
    
    /**
      * Override class for item that will show next.
      *
      * @default 'Wallop-item--showNext'
      */
    var showNextClass: js.UndefOr[String] = js.undefined
    
    /**
      * Override class for item that will showed previously.
      *
      * @default 'Wallop-item--showPrevious'
      */
    var showPreviousClass: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setButtonNextClass(value: String): Self = StObject.set(x, "buttonNextClass", value.asInstanceOf[js.Any])
      
      inline def setButtonNextClassUndefined: Self = StObject.set(x, "buttonNextClass", js.undefined)
      
      inline def setButtonPreviousClass(value: String): Self = StObject.set(x, "buttonPreviousClass", value.asInstanceOf[js.Any])
      
      inline def setButtonPreviousClassUndefined: Self = StObject.set(x, "buttonPreviousClass", js.undefined)
      
      inline def setCarousel(value: Boolean): Self = StObject.set(x, "carousel", value.asInstanceOf[js.Any])
      
      inline def setCarouselUndefined: Self = StObject.set(x, "carousel", js.undefined)
      
      inline def setCurrentItemClass(value: String): Self = StObject.set(x, "currentItemClass", value.asInstanceOf[js.Any])
      
      inline def setCurrentItemClassUndefined: Self = StObject.set(x, "currentItemClass", js.undefined)
      
      inline def setHideNextClass(value: String): Self = StObject.set(x, "hideNextClass", value.asInstanceOf[js.Any])
      
      inline def setHideNextClassUndefined: Self = StObject.set(x, "hideNextClass", js.undefined)
      
      inline def setHidePreviousClass(value: String): Self = StObject.set(x, "hidePreviousClass", value.asInstanceOf[js.Any])
      
      inline def setHidePreviousClassUndefined: Self = StObject.set(x, "hidePreviousClass", js.undefined)
      
      inline def setItemClass(value: String): Self = StObject.set(x, "itemClass", value.asInstanceOf[js.Any])
      
      inline def setItemClassUndefined: Self = StObject.set(x, "itemClass", js.undefined)
      
      inline def setShowNextClass(value: String): Self = StObject.set(x, "showNextClass", value.asInstanceOf[js.Any])
      
      inline def setShowNextClassUndefined: Self = StObject.set(x, "showNextClass", js.undefined)
      
      inline def setShowPreviousClass(value: String): Self = StObject.set(x, "showPreviousClass", value.asInstanceOf[js.Any])
      
      inline def setShowPreviousClassUndefined: Self = StObject.set(x, "showPreviousClass", js.undefined)
    }
  }
  
  trait Wallop extends StObject {
    
    /**
      * Advances to the slide with the given index.
      */
    def goTo(index: Double): Wallop
    
    /**
      * Advances to next slide.
      */
    def next(): Wallop
    
    /**
      * Unbinds method from custom event.
      */
    def off(eventName: String, callback: js.Function0[Unit]): Wallop
    
    /**
      * Bind method to custom event.
      */
    def on(eventName: String, callback: js.Function0[Unit]): Wallop
    
    /**
      * Returns to previous slide.
      */
    def previous(): Wallop
    
    /**
      * Resets current Wallop instance to defaults.
      */
    def reset(): Wallop
  }
  object Wallop {
    
    inline def apply(
      goTo: Double => Wallop,
      next: CallbackTo[Wallop],
      off: (String, js.Function0[Unit]) => Wallop,
      on: (String, js.Function0[Unit]) => Wallop,
      previous: CallbackTo[Wallop],
      reset: CallbackTo[Wallop]
    ): Wallop = {
      val __obj = js.Dynamic.literal(goTo = js.Any.fromFunction1(goTo), next = next.toJsFn, off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), previous = previous.toJsFn, reset = reset.toJsFn)
      __obj.asInstanceOf[Wallop]
    }
    
    extension [Self <: Wallop](x: Self) {
      
      inline def setGoTo(value: Double => Wallop): Self = StObject.set(x, "goTo", js.Any.fromFunction1(value))
      
      inline def setNext(value: CallbackTo[Wallop]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setOff(value: (String, js.Function0[Unit]) => Wallop): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, js.Function0[Unit]) => Wallop): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setPrevious(value: CallbackTo[Wallop]): Self = StObject.set(x, "previous", value.toJsFn)
      
      inline def setReset(value: CallbackTo[Wallop]): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
}
