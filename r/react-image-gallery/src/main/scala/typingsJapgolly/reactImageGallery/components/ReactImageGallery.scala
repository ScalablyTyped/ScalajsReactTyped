package typingsJapgolly.reactImageGallery.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.reactImageGallery.mod.ReactImageGalleryItem
import typingsJapgolly.reactImageGallery.mod.ReactImageGalleryProps
import typingsJapgolly.reactImageGallery.mod.default
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.bottom
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.left
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.right
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImageGallery {
  def apply(
    items: js.Array[ReactImageGalleryItem],
    additionalClass: String = null,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    disableArrowKeys: js.UndefOr[Boolean] = js.undefined,
    disableSwipe: js.UndefOr[Boolean] = js.undefined,
    disableThumbnailScroll: js.UndefOr[Boolean] = js.undefined,
    flickThreshold: Int | Double = null,
    indexSeparator: String = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ MouseEventHandler[HTMLDivElement] => Callback = null,
    onErrorImage: String = null,
    onImageError: /* event */ ReactEventHandler[HTMLImageElement] => Callback = null,
    onImageLoad: /* event */ ReactEventHandler[HTMLImageElement] => Callback = null,
    onMouseLeave: /* event */ MouseEventHandler[HTMLDivElement] => Callback = null,
    onMouseOver: /* event */ MouseEventHandler[HTMLDivElement] => Callback = null,
    onPause: /* currentIndex */ Double => Callback = null,
    onPlay: /* currentIndex */ Double => Callback = null,
    onScreenChange: /* fullScreenElement */ Element => Callback = null,
    onSlide: /* currentIndex */ Double => Callback = null,
    onThumbnailClick: (/* event */ MouseEventHandler[HTMLAnchorElement], /* index */ Double) => Callback = null,
    onThumbnailError: /* event */ ReactEventHandler[HTMLImageElement] => Callback = null,
    onTouchEnd: /* event */ TouchEventHandler[HTMLDivElement] => Callback = null,
    onTouchMove: /* event */ TouchEventHandler[HTMLDivElement] => Callback = null,
    onTouchStart: /* event */ TouchEventHandler[HTMLDivElement] => Callback = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    renderCustomControls: js.UndefOr[CallbackTo[Node]] = js.undefined,
    renderFullscreenButton: (/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean) => CallbackTo[Node] = null,
    renderItem: /* item */ ReactImageGalleryItem => CallbackTo[Node] = null,
    renderLeftNav: (/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean) => CallbackTo[Node] = null,
    renderPlayPauseButton: (/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean) => CallbackTo[Node] = null,
    renderRightNav: (/* onClick */ MouseEventHandler[HTMLElement], /* isDisabled */ Boolean) => CallbackTo[Node] = null,
    renderThumbInner: /* item */ ReactImageGalleryItem => CallbackTo[Node] = null,
    showBullets: js.UndefOr[Boolean] = js.undefined,
    showFullscreenButton: js.UndefOr[Boolean] = js.undefined,
    showIndex: js.UndefOr[Boolean] = js.undefined,
    showNav: js.UndefOr[Boolean] = js.undefined,
    showPlayButton: js.UndefOr[Boolean] = js.undefined,
    showThumbnails: js.UndefOr[Boolean] = js.undefined,
    slideDuration: Int | Double = null,
    slideInterval: Int | Double = null,
    slideOnThumbnailOver: js.UndefOr[Boolean] = js.undefined,
    startIndex: Int | Double = null,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    swipeThreshold: Int | Double = null,
    swipingTransitionDuration: Int | Double = null,
    thumbnailPosition: top | right | bottom | left = null,
    useBrowserFullscreen: js.UndefOr[Boolean] = js.undefined,
    useTranslate3D: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactImageGalleryProps, default, Unit, ReactImageGalleryProps] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      if (additionalClass != null) __obj.updateDynamic("additionalClass")(additionalClass.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disableArrowKeys)) __obj.updateDynamic("disableArrowKeys")(disableArrowKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSwipe)) __obj.updateDynamic("disableSwipe")(disableSwipe.asInstanceOf[js.Any])
    if (!js.isUndefined(disableThumbnailScroll)) __obj.updateDynamic("disableThumbnailScroll")(disableThumbnailScroll.asInstanceOf[js.Any])
    if (flickThreshold != null) __obj.updateDynamic("flickThreshold")(flickThreshold.asInstanceOf[js.Any])
    if (indexSeparator != null) __obj.updateDynamic("indexSeparator")(indexSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    if (onErrorImage != null) __obj.updateDynamic("onErrorImage")(onErrorImage.asInstanceOf[js.Any])
    if (onImageError != null) __obj.updateDynamic("onImageError")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.react.mod.ReactEventHandler[org.scalajs.dom.raw.HTMLImageElement]) => onImageError(t0).runNow()))
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.react.mod.ReactEventHandler[org.scalajs.dom.raw.HTMLImageElement]) => onImageLoad(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLDivElement]) => onMouseLeave(t0).runNow()))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLDivElement]) => onMouseOver(t0).runNow()))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: /* currentIndex */ scala.Double) => onPause(t0).runNow()))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: /* currentIndex */ scala.Double) => onPlay(t0).runNow()))
    if (onScreenChange != null) __obj.updateDynamic("onScreenChange")(js.Any.fromFunction1((t0: /* fullScreenElement */ org.scalajs.dom.raw.Element) => onScreenChange(t0).runNow()))
    if (onSlide != null) __obj.updateDynamic("onSlide")(js.Any.fromFunction1((t0: /* currentIndex */ scala.Double) => onSlide(t0).runNow()))
    if (onThumbnailClick != null) __obj.updateDynamic("onThumbnailClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* index */ scala.Double) => onThumbnailClick(t0, t1).runNow()))
    if (onThumbnailError != null) __obj.updateDynamic("onThumbnailError")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.react.mod.ReactEventHandler[org.scalajs.dom.raw.HTMLImageElement]) => onThumbnailError(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.react.mod.TouchEventHandler[org.scalajs.dom.raw.HTMLDivElement]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.react.mod.TouchEventHandler[org.scalajs.dom.raw.HTMLDivElement]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.react.mod.TouchEventHandler[org.scalajs.dom.raw.HTMLDivElement]) => onTouchStart(t0).runNow()))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent.asInstanceOf[js.Any])
    renderCustomControls.foreach(p => __obj.updateDynamic("renderCustomControls")(p.toJsFn))
    if (renderFullscreenButton != null) __obj.updateDynamic("renderFullscreenButton")(js.Any.fromFunction2((t0: /* onClick */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLElement], t1: /* isFullscreen */ scala.Boolean) => renderFullscreenButton(t0, t1).runNow()))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.reactImageGallery.mod.ReactImageGalleryItem) => renderItem(t0).runNow()))
    if (renderLeftNav != null) __obj.updateDynamic("renderLeftNav")(js.Any.fromFunction2((t0: /* onClick */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLElement], t1: /* isDisabled */ scala.Boolean) => renderLeftNav(t0, t1).runNow()))
    if (renderPlayPauseButton != null) __obj.updateDynamic("renderPlayPauseButton")(js.Any.fromFunction2((t0: /* onClick */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLElement], t1: /* isPlaying */ scala.Boolean) => renderPlayPauseButton(t0, t1).runNow()))
    if (renderRightNav != null) __obj.updateDynamic("renderRightNav")(js.Any.fromFunction2((t0: /* onClick */ typingsJapgolly.react.mod.MouseEventHandler[org.scalajs.dom.raw.HTMLElement], t1: /* isDisabled */ scala.Boolean) => renderRightNav(t0, t1).runNow()))
    if (renderThumbInner != null) __obj.updateDynamic("renderThumbInner")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.reactImageGallery.mod.ReactImageGalleryItem) => renderThumbInner(t0).runNow()))
    if (!js.isUndefined(showBullets)) __obj.updateDynamic("showBullets")(showBullets.asInstanceOf[js.Any])
    if (!js.isUndefined(showFullscreenButton)) __obj.updateDynamic("showFullscreenButton")(showFullscreenButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndex)) __obj.updateDynamic("showIndex")(showIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(showNav)) __obj.updateDynamic("showNav")(showNav.asInstanceOf[js.Any])
    if (!js.isUndefined(showPlayButton)) __obj.updateDynamic("showPlayButton")(showPlayButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showThumbnails)) __obj.updateDynamic("showThumbnails")(showThumbnails.asInstanceOf[js.Any])
    if (slideDuration != null) __obj.updateDynamic("slideDuration")(slideDuration.asInstanceOf[js.Any])
    if (slideInterval != null) __obj.updateDynamic("slideInterval")(slideInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(slideOnThumbnailOver)) __obj.updateDynamic("slideOnThumbnailOver")(slideOnThumbnailOver.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (swipingTransitionDuration != null) __obj.updateDynamic("swipingTransitionDuration")(swipingTransitionDuration.asInstanceOf[js.Any])
    if (thumbnailPosition != null) __obj.updateDynamic("thumbnailPosition")(thumbnailPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(useBrowserFullscreen)) __obj.updateDynamic("useBrowserFullscreen")(useBrowserFullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(useTranslate3D)) __obj.updateDynamic("useTranslate3D")(useTranslate3D.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactImageGallery.mod.ReactImageGalleryProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactImageGallery.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactImageGallery.mod.ReactImageGalleryProps])(children: _*)
  }
  @JSImport("react-image-gallery", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

