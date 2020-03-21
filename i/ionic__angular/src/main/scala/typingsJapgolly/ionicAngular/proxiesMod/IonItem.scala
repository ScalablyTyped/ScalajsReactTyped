package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonItem")
@js.native
class IonItem protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonItem {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * If `true`, a button tag will be rendered and the item will be tappable.
    */
  /* CompleteClass */
  override var button: Boolean = js.native
  /**
    * The icon to use when `detail` is set to `true`.
    */
  /* CompleteClass */
  override var detailIcon: String = js.native
  /**
    * If `true`, the user cannot interact with the item.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  var el: HTMLElement = js.native
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  /* CompleteClass */
  override var routerDirection: RouterDirection = js.native
  /**
    * The type of the button. Only used when an `onclick` or `button` property is present.
    */
  /* CompleteClass */
  override var `type`: submit | reset | button = js.native
  var z: NgZone = js.native
}

