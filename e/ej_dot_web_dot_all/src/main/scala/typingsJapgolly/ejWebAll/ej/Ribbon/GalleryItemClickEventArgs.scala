package typingsJapgolly.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryItemClickEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the gallery model.
    */
  var galleryModel: js.UndefOr[js.Any] = js.undefined
  /** returns the ribbon model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the item clicked in the gallery.
    */
  var target: js.UndefOr[Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object GalleryItemClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    galleryModel: js.Any = null,
    model: js.Any = null,
    target: Int | Double = null,
    `type`: String = null
  ): GalleryItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (galleryModel != null) __obj.updateDynamic("galleryModel")(galleryModel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryItemClickEventArgs]
  }
}

