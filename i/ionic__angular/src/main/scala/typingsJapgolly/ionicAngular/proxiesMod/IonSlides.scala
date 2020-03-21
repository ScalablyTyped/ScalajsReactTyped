package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSlides")
@js.native
class IonSlides protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonSlides {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionSlideDidChange: EventEmitter[CustomEvent] = js.native
  var ionSlideDoubleTap: EventEmitter[CustomEvent] = js.native
  var ionSlideDrag: EventEmitter[CustomEvent] = js.native
  var ionSlideNextEnd: EventEmitter[CustomEvent] = js.native
  var ionSlideNextStart: EventEmitter[CustomEvent] = js.native
  var ionSlidePrevEnd: EventEmitter[CustomEvent] = js.native
  var ionSlidePrevStart: EventEmitter[CustomEvent] = js.native
  var ionSlideReachEnd: EventEmitter[CustomEvent] = js.native
  var ionSlideReachStart: EventEmitter[CustomEvent] = js.native
  var ionSlideTap: EventEmitter[CustomEvent] = js.native
  var ionSlideTouchEnd: EventEmitter[CustomEvent] = js.native
  var ionSlideTouchStart: EventEmitter[CustomEvent] = js.native
  var ionSlideTransitionEnd: EventEmitter[CustomEvent] = js.native
  var ionSlideTransitionStart: EventEmitter[CustomEvent] = js.native
  var ionSlideWillChange: EventEmitter[CustomEvent] = js.native
  var ionSlidesDidLoad: EventEmitter[CustomEvent] = js.native
  var z: NgZone = js.native
}

