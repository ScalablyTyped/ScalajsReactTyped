package typingsJapgolly.reactImages.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.react.mod.ReactHTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightboxProps extends js.Object {
  /**
    * Allow users to exit the lightbox by clicking the backdrop. Default value: false.
    */
  var backdropClosesModal: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom close esc title. Default value: ' Close (Esc) '
    */
  var closeButtonTitle: js.UndefOr[String] = js.undefined
  /**
    * The index of the image to display initially. Default value: 0
    */
  var currentImage: js.UndefOr[Double] = js.undefined
  /**
    * An array of elements to display as custom controls on the top of lightbox. Default value: undefined
    */
  var customControls: js.UndefOr[js.Array[ReactHTMLElement[_]]] = js.undefined
  /**
    * Supports keyboard input - esc, arrow left, and arrow right. Default value: true
    */
  var enableKeyboardInput: js.UndefOr[Boolean] = js.undefined
  /**
    * The image count separator. Default value: ' of '
    */
  var imageCountSeparator: js.UndefOr[String] = js.undefined
  /**
    * Array of image objects. Required.
    */
  var images: js.Array[Image]
  /**
    * Whether or not the lightbox is displayed. Default value: false;
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom of left arrow title. Default value: ' Previous (Left arrow key) '
    */
  var leftArrowTitle: js.UndefOr[String] = js.undefined
  /**
    * Handle click on image.
    */
  var onClickImage: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLImageElement], Unit]] = js.undefined
  /**
    * Fired on request of the next image.
    */
  var onClickNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Fired on request of the previous image.
    */
  var onClickPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Handle click on thumbnail.
    */
  var onClickThumbnail: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  /**
    * Based on the direction the user is navigating, preload the next available image. Default value: true
    */
  var preloadNextImage: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether scrolling is prevented via react-scrolllock. Default value: true
    */
  var preventScroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize right arrow title. Default value: ' Next (Right arrow key) '
    */
  var rightArrowTitle: js.UndefOr[String] = js.undefined
  /**
    * Optionally display a close "X" button in top right corner. Default value: true
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Optionally display image index, e.g., "3 of 20". Default value: true
    */
  var showImageCount: js.UndefOr[Boolean] = js.undefined
  /**
    * Optionally display thumbnails beneath the Lightbox
    */
  var showThumbnails: js.UndefOr[Boolean] = js.undefined
  /**
    * Spinner component.
    */
  var spinner: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    *  Color of spinner. Default value: 'white'
    */
  var spinnerColor: js.UndefOr[String] = js.undefined
  /**
    * Size of spinner. Default value: 100
    */
  var spinnerSize: js.UndefOr[Double] = js.undefined
  /**
    * Maximum width of the carousel; defaults to 1024px
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Handle closing of the lightbox. Required.
    */
  def onClose(): Unit
}

object LightboxProps {
  @scala.inline
  def apply(
    images: js.Array[Image],
    onClose: Callback,
    backdropClosesModal: js.UndefOr[Boolean] = js.undefined,
    closeButtonTitle: String = null,
    currentImage: Int | Double = null,
    customControls: js.Array[ReactHTMLElement[_]] = null,
    enableKeyboardInput: js.UndefOr[Boolean] = js.undefined,
    imageCountSeparator: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    leftArrowTitle: String = null,
    onClickImage: /* e */ ReactMouseEventFrom[HTMLImageElement] => Callback = null,
    onClickNext: js.UndefOr[Callback] = js.undefined,
    onClickPrev: js.UndefOr[Callback] = js.undefined,
    onClickThumbnail: /* index */ Double => Callback = null,
    preloadNextImage: js.UndefOr[Boolean] = js.undefined,
    preventScroll: js.UndefOr[Boolean] = js.undefined,
    rightArrowTitle: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showImageCount: js.UndefOr[Boolean] = js.undefined,
    showThumbnails: js.UndefOr[Boolean] = js.undefined,
    spinner: js.UndefOr[CallbackTo[Element]] = js.undefined,
    spinnerColor: String = null,
    spinnerSize: Int | Double = null,
    width: Int | Double = null
  ): LightboxProps = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    if (!js.isUndefined(backdropClosesModal)) __obj.updateDynamic("backdropClosesModal")(backdropClosesModal.asInstanceOf[js.Any])
    if (closeButtonTitle != null) __obj.updateDynamic("closeButtonTitle")(closeButtonTitle.asInstanceOf[js.Any])
    if (currentImage != null) __obj.updateDynamic("currentImage")(currentImage.asInstanceOf[js.Any])
    if (customControls != null) __obj.updateDynamic("customControls")(customControls.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyboardInput)) __obj.updateDynamic("enableKeyboardInput")(enableKeyboardInput.asInstanceOf[js.Any])
    if (imageCountSeparator != null) __obj.updateDynamic("imageCountSeparator")(imageCountSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (leftArrowTitle != null) __obj.updateDynamic("leftArrowTitle")(leftArrowTitle.asInstanceOf[js.Any])
    if (onClickImage != null) __obj.updateDynamic("onClickImage")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onClickImage(t0).runNow()))
    onClickNext.foreach(p => __obj.updateDynamic("onClickNext")(p.toJsFn))
    onClickPrev.foreach(p => __obj.updateDynamic("onClickPrev")(p.toJsFn))
    if (onClickThumbnail != null) __obj.updateDynamic("onClickThumbnail")(js.Any.fromFunction1((t0: /* index */ scala.Double) => onClickThumbnail(t0).runNow()))
    if (!js.isUndefined(preloadNextImage)) __obj.updateDynamic("preloadNextImage")(preloadNextImage.asInstanceOf[js.Any])
    if (!js.isUndefined(preventScroll)) __obj.updateDynamic("preventScroll")(preventScroll.asInstanceOf[js.Any])
    if (rightArrowTitle != null) __obj.updateDynamic("rightArrowTitle")(rightArrowTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showImageCount)) __obj.updateDynamic("showImageCount")(showImageCount.asInstanceOf[js.Any])
    if (!js.isUndefined(showThumbnails)) __obj.updateDynamic("showThumbnails")(showThumbnails.asInstanceOf[js.Any])
    spinner.foreach(p => __obj.updateDynamic("spinner")(p.toJsFn))
    if (spinnerColor != null) __obj.updateDynamic("spinnerColor")(spinnerColor.asInstanceOf[js.Any])
    if (spinnerSize != null) __obj.updateDynamic("spinnerSize")(spinnerSize.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightboxProps]
  }
}

