package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonSlidesCustomEvent
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSlides extends StObject {
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted after the active slide has changed.
    */
  var onIonSlideDidChange: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the user double taps on the slide's container.
    */
  var onIonSlideDoubleTap: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slider is actively being moved.
    */
  var onIonSlideDrag: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the next slide has ended.
    */
  var onIonSlideNextEnd: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the next slide has started.
    */
  var onIonSlideNextStart: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the previous slide has ended.
    */
  var onIonSlidePrevEnd: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the previous slide has started.
    */
  var onIonSlidePrevStart: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slider is at the last slide.
    */
  var onIonSlideReachEnd: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slider is at its initial position.
    */
  var onIonSlideReachStart: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the user taps/clicks on the slide's container.
    */
  var onIonSlideTap: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the user releases the touch.
    */
  var onIonSlideTouchEnd: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the user first touches the slider.
    */
  var onIonSlideTouchStart: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slide transition has ended.
    */
  var onIonSlideTransitionEnd: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the slide transition has started.
    */
  var onIonSlideTransitionStart: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted before the active slide has changed.
    */
  var onIonSlideWillChange: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted after Swiper initialization
    */
  var onIonSlidesDidLoad: js.UndefOr[js.Function1[/* event */ IonSlidesCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Options to pass to the swiper instance. See https://swiperjs.com/swiper-api for valid options
    */
  var options: js.UndefOr[Any] = js.undefined
  
  /**
    * If `true`, show the pagination.
    */
  var pager: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, show the scrollbar.
    */
  var scrollbar: js.UndefOr[Boolean] = js.undefined
}
object IonSlides {
  
  inline def apply(): IonSlides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSlides]
  }
  
  extension [Self <: IonSlides](x: Self) {
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonSlideDidChange(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideDidChange", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideDidChangeUndefined: Self = StObject.set(x, "onIonSlideDidChange", js.undefined)
    
    inline def setOnIonSlideDoubleTap(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideDoubleTap", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideDoubleTapUndefined: Self = StObject.set(x, "onIonSlideDoubleTap", js.undefined)
    
    inline def setOnIonSlideDrag(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideDrag", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideDragUndefined: Self = StObject.set(x, "onIonSlideDrag", js.undefined)
    
    inline def setOnIonSlideNextEnd(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideNextEnd", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideNextEndUndefined: Self = StObject.set(x, "onIonSlideNextEnd", js.undefined)
    
    inline def setOnIonSlideNextStart(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideNextStart", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideNextStartUndefined: Self = StObject.set(x, "onIonSlideNextStart", js.undefined)
    
    inline def setOnIonSlidePrevEnd(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlidePrevEnd", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlidePrevEndUndefined: Self = StObject.set(x, "onIonSlidePrevEnd", js.undefined)
    
    inline def setOnIonSlidePrevStart(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlidePrevStart", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlidePrevStartUndefined: Self = StObject.set(x, "onIonSlidePrevStart", js.undefined)
    
    inline def setOnIonSlideReachEnd(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideReachEnd", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideReachEndUndefined: Self = StObject.set(x, "onIonSlideReachEnd", js.undefined)
    
    inline def setOnIonSlideReachStart(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideReachStart", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideReachStartUndefined: Self = StObject.set(x, "onIonSlideReachStart", js.undefined)
    
    inline def setOnIonSlideTap(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideTap", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideTapUndefined: Self = StObject.set(x, "onIonSlideTap", js.undefined)
    
    inline def setOnIonSlideTouchEnd(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideTouchEnd", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideTouchEndUndefined: Self = StObject.set(x, "onIonSlideTouchEnd", js.undefined)
    
    inline def setOnIonSlideTouchStart(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideTouchStart", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideTouchStartUndefined: Self = StObject.set(x, "onIonSlideTouchStart", js.undefined)
    
    inline def setOnIonSlideTransitionEnd(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideTransitionEnd", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideTransitionEndUndefined: Self = StObject.set(x, "onIonSlideTransitionEnd", js.undefined)
    
    inline def setOnIonSlideTransitionStart(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideTransitionStart", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideTransitionStartUndefined: Self = StObject.set(x, "onIonSlideTransitionStart", js.undefined)
    
    inline def setOnIonSlideWillChange(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlideWillChange", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlideWillChangeUndefined: Self = StObject.set(x, "onIonSlideWillChange", js.undefined)
    
    inline def setOnIonSlidesDidLoad(value: /* event */ IonSlidesCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonSlidesDidLoad", js.Any.fromFunction1((t0: /* event */ IonSlidesCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonSlidesDidLoadUndefined: Self = StObject.set(x, "onIonSlidesDidLoad", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setScrollbar(value: Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
  }
}
