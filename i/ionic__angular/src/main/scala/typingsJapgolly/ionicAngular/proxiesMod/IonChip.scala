package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonChip")
@js.native
class IonChip protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonChip {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * Display an outline style button.
    */
  /* CompleteClass */
  override var outline: Boolean = js.native
  var z: NgZone = js.native
}

