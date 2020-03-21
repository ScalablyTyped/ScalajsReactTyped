package typingsJapgolly.reactImages.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.react.mod.ReactHTMLElement
import typingsJapgolly.reactImages.mod.Image
import typingsJapgolly.reactImages.mod.LightboxProps
import typingsJapgolly.reactImages.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImages {
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
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LightboxProps, default, Unit, LightboxProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactImages.mod.LightboxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactImages.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactImages.mod.LightboxProps])(children: _*)
  }
  @JSImport("react-images", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

