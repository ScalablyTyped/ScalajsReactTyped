package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonFab")
@js.native
class IonFab protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonFab {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, both the `ion-fab-button` and all `ion-fab-list` inside `ion-fab` will become active. That means `ion-fab-button` will become a `close` icon and `ion-fab-list` will become visible.
    */
  /* CompleteClass */
  override var activated: Boolean = js.native
  /**
    * If `true`, the fab will display on the edge of the header if `vertical` is `"top"`, and on the edge of the footer if it is `"bottom"`. Should be used with a `fixed` slot.
    */
  /* CompleteClass */
  override var edge: Boolean = js.native
  var el: HTMLElement = js.native
  var z: NgZone = js.native
  /**
    * Close an active FAB list container.
    */
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
}

