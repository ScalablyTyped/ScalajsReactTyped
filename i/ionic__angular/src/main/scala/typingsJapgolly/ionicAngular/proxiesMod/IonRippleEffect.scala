package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.ionicCore.ionicCoreStrings.bounded
import typingsJapgolly.ionicCore.ionicCoreStrings.unbounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonRippleEffect")
@js.native
class IonRippleEffect protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonRippleEffect {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * Sets the type of ripple-effect:  - `bounded`: the ripple effect expands from the user's click position - `unbounded`: the ripple effect expands from the center of the button and overflows the container.  NOTE: Surfaces for bounded ripples should have the overflow property set to hidden, while surfaces for unbounded ripples should have it set to visible.
    */
  /* CompleteClass */
  override var `type`: bounded | unbounded = js.native
  var z: NgZone = js.native
  /**
    * Adds the ripple effect to the parent element.
    * @param x The horizontal coordinate of where the ripple should start.
    * @param y The vertical coordinate of where the ripple should start.
    */
  /* CompleteClass */
  override def addRipple(x: Double, y: Double): js.Promise[js.Function0[Unit]] = js.native
}

