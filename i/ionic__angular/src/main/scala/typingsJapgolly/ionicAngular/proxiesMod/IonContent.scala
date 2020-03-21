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

@JSImport("@ionic/angular/dist/directives/proxies", "IonContent")
@js.native
class IonContent protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonContent {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionScroll: EventEmitter[CustomEvent] = js.native
  var ionScrollEnd: EventEmitter[CustomEvent] = js.native
  var ionScrollStart: EventEmitter[CustomEvent] = js.native
  var z: NgZone = js.native
}

