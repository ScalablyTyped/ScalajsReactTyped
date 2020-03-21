package typingsJapgolly.ionicCore.componentsMod.Components

import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typingsJapgolly.ionicCore.toastInterfaceMod.ToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonToastController extends js.Object {
  /**
    * Create a toast overlay with toast options.
    * @param options The options to use to create the toast.
    */
  def create(): js.Promise[HTMLIonToastElement] = js.native
  def create(options: ToastOptions): js.Promise[HTMLIonToastElement] = js.native
  /**
    * Dismiss the open toast overlay.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the toast. For example, 'cancel' or 'backdrop'.
    * @param id The id of the toast to dismiss. If an id is not provided, it will dismiss the most recently opened toast.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: js.UndefOr[scala.Nothing], id: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
  /**
    * Get the most recently opened toast overlay.
    */
  def getTop(): js.Promise[js.UndefOr[HTMLIonToastElement]] = js.native
}

