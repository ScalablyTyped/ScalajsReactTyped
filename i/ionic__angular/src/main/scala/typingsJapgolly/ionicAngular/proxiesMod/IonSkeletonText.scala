package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSkeletonText")
@js.native
class IonSkeletonText protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonSkeletonText {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the skeleton text will animate.
    */
  /* CompleteClass */
  override var animated: Boolean = js.native
  var el: HTMLElement = js.native
  var z: NgZone = js.native
}

