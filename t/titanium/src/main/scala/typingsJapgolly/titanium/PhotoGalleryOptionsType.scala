package typingsJapgolly.titanium

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying options to
  * [openPhotoGallery](Titanium.Media.openPhotoGallery).
  */
trait PhotoGalleryOptionsType extends js.Object {
  /**
  	 * Specifies if the media should be editable after capture/selection.
  	 */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies if the user should be able to select multiple photos.
  	 */
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies if the dialog should be animated upon showing and hiding.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Controls the type of arrow and position of the popover.
  	 */
  var arrowDirection: js.UndefOr[Double] = js.undefined
  /**
  	 * Specifies if the photo gallery should be hidden automatically after the media
  	 * selection is completed.
  	 */
  var autohide: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Function to call if the user presses the cancel button.
  	 */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, _]] = js.undefined
  /**
  	 * Function to call upon receiving an error.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, _]] = js.undefined
  /**
  	 * Array of media type constants to allow.
  	 * Live photos is only supported on the iOS platform, starting with iOS 9.1. If you want
  	 * to allow live photos with <Titanium.Media.MEDIA_TYPE_LIVEPHOTO>, you also need to specify
  	 * at least <Titanium.Media.MEDIA_TYPE_PHOTO> as a fallback. If you do not allow live
  	 * photos, they still can be selected, but will be represented as a normal static photo.
  	 */
  var mediaTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * View to position the photo gallery popover on top of.
  	 */
  var popoverView: js.UndefOr[View] = js.undefined
  /**
  	 * Function to call when the photo gallery is closed after a successful selection.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ CameraMediaItemType, _]] = js.undefined
}

object PhotoGalleryOptionsType {
  @scala.inline
  def apply(
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    animated: js.UndefOr[Boolean] = js.undefined,
    arrowDirection: Int | Double = null,
    autohide: js.UndefOr[Boolean] = js.undefined,
    cancel: /* param0 */ FailureResponse => CallbackTo[js.Any] = null,
    error: /* param0 */ FailureResponse => CallbackTo[js.Any] = null,
    mediaTypes: js.Array[String] = null,
    popoverView: View = null,
    success: /* param0 */ CameraMediaItemType => CallbackTo[js.Any] = null
  ): PhotoGalleryOptionsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (arrowDirection != null) __obj.updateDynamic("arrowDirection")(arrowDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.titanium.FailureResponse) => cancel(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.titanium.FailureResponse) => error(t0).runNow()))
    if (mediaTypes != null) __obj.updateDynamic("mediaTypes")(mediaTypes.asInstanceOf[js.Any])
    if (popoverView != null) __obj.updateDynamic("popoverView")(popoverView.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.titanium.CameraMediaItemType) => success(t0).runNow()))
    __obj.asInstanceOf[PhotoGalleryOptionsType]
  }
}

