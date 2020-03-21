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

@JSImport("@ionic/angular/dist/directives/proxies", "IonBackdrop")
@js.native
class IonBackdrop protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonBackdrop {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionBackdropTap: EventEmitter[CustomEvent] = js.native
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  /* CompleteClass */
  override var stopPropagation: Boolean = js.native
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  /* CompleteClass */
  override var tappable: Boolean = js.native
  /**
    * If `true`, the backdrop will be visible.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  var z: NgZone = js.native
}

