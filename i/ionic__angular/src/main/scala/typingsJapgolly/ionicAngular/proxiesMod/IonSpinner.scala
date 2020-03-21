package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonSpinner")
@js.native
class IonSpinner protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonSpinner {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * If `true`, the spinner's animation will be paused.
    */
  /* CompleteClass */
  override var paused: Boolean = js.native
  var z: NgZone = js.native
}

