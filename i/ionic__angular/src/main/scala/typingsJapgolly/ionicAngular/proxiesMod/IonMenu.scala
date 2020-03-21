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

@JSImport("@ionic/angular/dist/directives/proxies", "IonMenu")
@js.native
class IonMenu protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonMenu {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionDidClose: EventEmitter[CustomEvent] = js.native
  var ionDidOpen: EventEmitter[CustomEvent] = js.native
  var ionWillClose: EventEmitter[CustomEvent] = js.native
  var ionWillOpen: EventEmitter[CustomEvent] = js.native
  var z: NgZone = js.native
}

