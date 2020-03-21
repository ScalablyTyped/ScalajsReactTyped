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

@JSImport("@ionic/angular/dist/directives/proxies", "IonImg")
@js.native
class IonImg protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonImg {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionError: EventEmitter[CustomEvent] = js.native
  var ionImgDidLoad: EventEmitter[CustomEvent] = js.native
  var ionImgWillLoad: EventEmitter[CustomEvent] = js.native
  var z: NgZone = js.native
}

