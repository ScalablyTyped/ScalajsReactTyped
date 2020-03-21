package typingsJapgolly.angularBootstrapLightbox.angular.bootstrap.lightbox

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightbox extends js.Object {
  def openModal(images: js.Array[ILightboxImageInfo], index: Double): Unit
}

object ILightbox {
  @scala.inline
  def apply(openModal: (js.Array[ILightboxImageInfo], Double) => Callback): ILightbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openModal")(js.Any.fromFunction2((t0: js.Array[
  typingsJapgolly.angularBootstrapLightbox.angular.bootstrap.lightbox.ILightboxImageInfo], t1: scala.Double) => openModal(t0, t1).runNow()))
    __obj.asInstanceOf[ILightbox]
  }
}

