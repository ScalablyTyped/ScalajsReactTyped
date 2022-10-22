package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.Options
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-slides`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonSlides")
@js.native
open class IonSlides protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonSlides {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Emitted after the active slide has changed.
    */
  var ionSlideDidChange: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the user double taps on the slide's container.
    */
  var ionSlideDoubleTap: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the slider is actively being moved.
    */
  var ionSlideDrag: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the next slide has ended.
    */
  var ionSlideNextEnd: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the next slide has started.
    */
  var ionSlideNextStart: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the previous slide has ended.
    */
  var ionSlidePrevEnd: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the previous slide has started.
    */
  var ionSlidePrevStart: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the slider is at the last slide.
    */
  var ionSlideReachEnd: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the slider is at its initial position.
    */
  var ionSlideReachStart: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the user taps/clicks on the slide's container.
    */
  var ionSlideTap: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the user releases the touch.
    */
  var ionSlideTouchEnd: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the user first touches the slider.
    */
  var ionSlideTouchStart: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the slide transition has ended.
    */
  var ionSlideTransitionEnd: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the slide transition has started.
    */
  var ionSlideTransitionStart: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted before the active slide has changed.
    */
  var ionSlideWillChange: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted after Swiper initialization
    */
  var ionSlidesDidLoad: EventEmitter[CustomEvent] = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonSlides {
  
  @JSImport("@ionic/angular/directives/proxies", "IonSlides")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonSlides.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonSlides, 
    `ion-slides`, 
    scala.Nothing, 
    Options, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonSlides, 
      `ion-slides`, 
      scala.Nothing, 
      Options, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonSlides.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonSlides, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonSlides, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
