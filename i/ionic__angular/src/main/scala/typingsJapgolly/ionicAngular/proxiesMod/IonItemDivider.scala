package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonItemDivider")
@js.native
class IonItemDivider protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonItemDivider {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * When it's set to `true`, the item-divider will stay visible when it reaches the top of the viewport until the next `ion-item-divider` replaces it.  This feature relies in `position:sticky`: https://caniuse.com/#feat=css-sticky
    */
  /* CompleteClass */
  override var sticky: Boolean = js.native
  var z: NgZone = js.native
}

