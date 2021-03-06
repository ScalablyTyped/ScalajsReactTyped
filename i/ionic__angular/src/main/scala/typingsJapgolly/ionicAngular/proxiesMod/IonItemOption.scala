package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonItemOption")
@js.native
class IonItemOption protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonItemOption {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, the user cannot interact with the item option.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  /**
    * If `true`, the option will expand to take up the available width and cover any other options.
    */
  /* CompleteClass */
  override var expandable: Boolean = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: submit | reset | button = js.native
  var z: NgZone = js.native
}

