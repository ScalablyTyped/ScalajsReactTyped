package typingsJapgolly.reactImageGallery

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.reactImageGallery.anon.CurrentIndex
import typingsJapgolly.reactImageGallery.anon.Media
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.bottom
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.left
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.right
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-image-gallery", JSImport.Default)
  @js.native
  open class default () extends ReactImageGallery
  
  @js.native
  trait ReactImageGallery
    extends Component[ReactImageGalleryProps, js.Object, Any] {
    
    def exitFullScreen(): Unit = js.native
    
    def fullScreen(): Unit = js.native
    
    def getCurrentIndex(): Double = js.native
    
    def pause(): Unit = js.native
    def pause(callback: Boolean): Unit = js.native
    
    def play(): Unit = js.native
    def play(callback: Boolean): Unit = js.native
    
    def slideToIndex(index: Double): Unit = js.native
  }
  
  type ReactImageGalleryImageSet = js.Array[Media]
  
  trait ReactImageGalleryItem extends StObject {
    
    var bulletClass: js.UndefOr[String] = js.undefined
    
    var bulletOnClick: js.UndefOr[js.Function1[/* hasItemItemIndexCurrentIndex */ CurrentIndex, Unit]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var fullscreen: js.UndefOr[String] = js.undefined
    
    var imageSet: js.UndefOr[ReactImageGalleryImageSet] = js.undefined
    
    var original: String
    
    var originalAlt: js.UndefOr[String] = js.undefined
    
    var originalClass: js.UndefOr[String] = js.undefined
    
    var originalHeight: js.UndefOr[Double] = js.undefined
    
    var originalTitle: js.UndefOr[String] = js.undefined
    
    var originalWidth: js.UndefOr[Double] = js.undefined
    
    var renderItem: js.UndefOr[js.Function1[/* item */ this.type, Node]] = js.undefined
    
    var renderThumbInner: js.UndefOr[js.Function1[/* item */ this.type, Node]] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var srcSet: js.UndefOr[String] = js.undefined
    
    var thumbnail: js.UndefOr[String] = js.undefined
    
    var thumbnailAlt: js.UndefOr[String] = js.undefined
    
    var thumbnailClass: js.UndefOr[String] = js.undefined
    
    var thumbnailHeight: js.UndefOr[Double] = js.undefined
    
    var thumbnailLabel: js.UndefOr[String] = js.undefined
    
    var thumbnailTitle: js.UndefOr[String] = js.undefined
    
    var thumbnailWidth: js.UndefOr[Double] = js.undefined
  }
  object ReactImageGalleryItem {
    
    inline def apply(original: String): ReactImageGalleryItem = {
      val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactImageGalleryItem]
    }
    
    extension [Self <: ReactImageGalleryItem](x: Self) {
      
      inline def setBulletClass(value: String): Self = StObject.set(x, "bulletClass", value.asInstanceOf[js.Any])
      
      inline def setBulletClassUndefined: Self = StObject.set(x, "bulletClass", js.undefined)
      
      inline def setBulletOnClick(value: /* hasItemItemIndexCurrentIndex */ CurrentIndex => Callback): Self = StObject.set(x, "bulletOnClick", js.Any.fromFunction1((t0: /* hasItemItemIndexCurrentIndex */ CurrentIndex) => value(t0).runNow()))
      
      inline def setBulletOnClickUndefined: Self = StObject.set(x, "bulletOnClick", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFullscreen(value: String): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setImageSet(value: ReactImageGalleryImageSet): Self = StObject.set(x, "imageSet", value.asInstanceOf[js.Any])
      
      inline def setImageSetUndefined: Self = StObject.set(x, "imageSet", js.undefined)
      
      inline def setImageSetVarargs(value: Media*): Self = StObject.set(x, "imageSet", js.Array(value*))
      
      inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalAlt(value: String): Self = StObject.set(x, "originalAlt", value.asInstanceOf[js.Any])
      
      inline def setOriginalAltUndefined: Self = StObject.set(x, "originalAlt", js.undefined)
      
      inline def setOriginalClass(value: String): Self = StObject.set(x, "originalClass", value.asInstanceOf[js.Any])
      
      inline def setOriginalClassUndefined: Self = StObject.set(x, "originalClass", js.undefined)
      
      inline def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
      
      inline def setOriginalHeightUndefined: Self = StObject.set(x, "originalHeight", js.undefined)
      
      inline def setOriginalTitle(value: String): Self = StObject.set(x, "originalTitle", value.asInstanceOf[js.Any])
      
      inline def setOriginalTitleUndefined: Self = StObject.set(x, "originalTitle", js.undefined)
      
      inline def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
      
      inline def setOriginalWidthUndefined: Self = StObject.set(x, "originalWidth", js.undefined)
      
      inline def setRenderItem(value: ReactImageGalleryItem => Node): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setRenderThumbInner(value: ReactImageGalleryItem => Node): Self = StObject.set(x, "renderThumbInner", js.Any.fromFunction1(value))
      
      inline def setRenderThumbInnerUndefined: Self = StObject.set(x, "renderThumbInner", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailAlt(value: String): Self = StObject.set(x, "thumbnailAlt", value.asInstanceOf[js.Any])
      
      inline def setThumbnailAltUndefined: Self = StObject.set(x, "thumbnailAlt", js.undefined)
      
      inline def setThumbnailClass(value: String): Self = StObject.set(x, "thumbnailClass", value.asInstanceOf[js.Any])
      
      inline def setThumbnailClassUndefined: Self = StObject.set(x, "thumbnailClass", js.undefined)
      
      inline def setThumbnailHeight(value: Double): Self = StObject.set(x, "thumbnailHeight", value.asInstanceOf[js.Any])
      
      inline def setThumbnailHeightUndefined: Self = StObject.set(x, "thumbnailHeight", js.undefined)
      
      inline def setThumbnailLabel(value: String): Self = StObject.set(x, "thumbnailLabel", value.asInstanceOf[js.Any])
      
      inline def setThumbnailLabelUndefined: Self = StObject.set(x, "thumbnailLabel", js.undefined)
      
      inline def setThumbnailTitle(value: String): Self = StObject.set(x, "thumbnailTitle", value.asInstanceOf[js.Any])
      
      inline def setThumbnailTitleUndefined: Self = StObject.set(x, "thumbnailTitle", js.undefined)
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setThumbnailWidth(value: Double): Self = StObject.set(x, "thumbnailWidth", value.asInstanceOf[js.Any])
      
      inline def setThumbnailWidthUndefined: Self = StObject.set(x, "thumbnailWidth", js.undefined)
    }
  }
  
  trait ReactImageGalleryProps extends StObject {
    
    var additionalClass: js.UndefOr[String] = js.undefined
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var disableKeyDown: js.UndefOr[Boolean] = js.undefined
    
    var disableSwipe: js.UndefOr[Boolean] = js.undefined
    
    var disableThumbnailScroll: js.UndefOr[Boolean] = js.undefined
    
    var flickThreshold: js.UndefOr[Double] = js.undefined
    
    var indexSeparator: js.UndefOr[String] = js.undefined
    
    var infinite: js.UndefOr[Boolean] = js.undefined
    
    var isRTL: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[ReactImageGalleryItem]
    
    var lazyLoad: js.UndefOr[Boolean] = js.undefined
    
    var onBeforeSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onErrorImageURL: js.UndefOr[String] = js.undefined
    
    var onImageError: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
    
    var onImageLoad: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onPause: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
    
    var onPlay: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
    
    var onScreenChange: js.UndefOr[js.Function1[/* fullScreen */ Boolean, Unit]] = js.undefined
    
    var onSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
    
    var onThumbnailClick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* index */ Double, Unit]
      ] = js.undefined
    
    var onThumbnailError: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.undefined
    
    var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined
    
    var renderCustomControls: js.UndefOr[js.Function0[Node]] = js.undefined
    
    var renderFullscreenButton: js.UndefOr[
        js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean, Node]
      ] = js.undefined
    
    var renderItem: js.UndefOr[js.Function1[/* item */ ReactImageGalleryItem, Node]] = js.undefined
    
    var renderLeftNav: js.UndefOr[
        js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean, Node]
      ] = js.undefined
    
    var renderPlayPauseButton: js.UndefOr[
        js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean, Node]
      ] = js.undefined
    
    var renderRightNav: js.UndefOr[
        js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean, Node]
      ] = js.undefined
    
    var renderThumbInner: js.UndefOr[js.Function1[/* item */ ReactImageGalleryItem, Node]] = js.undefined
    
    var showBullets: js.UndefOr[Boolean] = js.undefined
    
    var showFullscreenButton: js.UndefOr[Boolean] = js.undefined
    
    var showIndex: js.UndefOr[Boolean] = js.undefined
    
    var showNav: js.UndefOr[Boolean] = js.undefined
    
    var showPlayButton: js.UndefOr[Boolean] = js.undefined
    
    var showThumbnails: js.UndefOr[Boolean] = js.undefined
    
    var slideDuration: js.UndefOr[Double] = js.undefined
    
    var slideInterval: js.UndefOr[Double] = js.undefined
    
    var slideOnThumbnailOver: js.UndefOr[Boolean] = js.undefined
    
    var startIndex: js.UndefOr[Double] = js.undefined
    
    var stopPropagation: js.UndefOr[Boolean] = js.undefined
    
    var swipeThreshold: js.UndefOr[Double] = js.undefined
    
    var swipingTransitionDuration: js.UndefOr[Double] = js.undefined
    
    var thumbnailPosition: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var useBrowserFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var useTranslate3D: js.UndefOr[Boolean] = js.undefined
  }
  object ReactImageGalleryProps {
    
    inline def apply(items: js.Array[ReactImageGalleryItem]): ReactImageGalleryProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactImageGalleryProps]
    }
    
    extension [Self <: ReactImageGalleryProps](x: Self) {
      
      inline def setAdditionalClass(value: String): Self = StObject.set(x, "additionalClass", value.asInstanceOf[js.Any])
      
      inline def setAdditionalClassUndefined: Self = StObject.set(x, "additionalClass", js.undefined)
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setDisableKeyDown(value: Boolean): Self = StObject.set(x, "disableKeyDown", value.asInstanceOf[js.Any])
      
      inline def setDisableKeyDownUndefined: Self = StObject.set(x, "disableKeyDown", js.undefined)
      
      inline def setDisableSwipe(value: Boolean): Self = StObject.set(x, "disableSwipe", value.asInstanceOf[js.Any])
      
      inline def setDisableSwipeUndefined: Self = StObject.set(x, "disableSwipe", js.undefined)
      
      inline def setDisableThumbnailScroll(value: Boolean): Self = StObject.set(x, "disableThumbnailScroll", value.asInstanceOf[js.Any])
      
      inline def setDisableThumbnailScrollUndefined: Self = StObject.set(x, "disableThumbnailScroll", js.undefined)
      
      inline def setFlickThreshold(value: Double): Self = StObject.set(x, "flickThreshold", value.asInstanceOf[js.Any])
      
      inline def setFlickThresholdUndefined: Self = StObject.set(x, "flickThreshold", js.undefined)
      
      inline def setIndexSeparator(value: String): Self = StObject.set(x, "indexSeparator", value.asInstanceOf[js.Any])
      
      inline def setIndexSeparatorUndefined: Self = StObject.set(x, "indexSeparator", js.undefined)
      
      inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      inline def setItems(value: js.Array[ReactImageGalleryItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ReactImageGalleryItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      inline def setOnBeforeSlide(value: /* currentIndex */ Double => Callback): Self = StObject.set(x, "onBeforeSlide", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
      
      inline def setOnBeforeSlideUndefined: Self = StObject.set(x, "onBeforeSlide", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnErrorImageURL(value: String): Self = StObject.set(x, "onErrorImageURL", value.asInstanceOf[js.Any])
      
      inline def setOnErrorImageURLUndefined: Self = StObject.set(x, "onErrorImageURL", js.undefined)
      
      inline def setOnImageError(value: ReactEventFrom[HTMLImageElement & Element] => Callback): Self = StObject.set(x, "onImageError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
      
      inline def setOnImageErrorUndefined: Self = StObject.set(x, "onImageError", js.undefined)
      
      inline def setOnImageLoad(value: ReactEventFrom[HTMLImageElement & Element] => Callback): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
      
      inline def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseOver(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnPause(value: /* currentIndex */ Double => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: /* currentIndex */ Double => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnScreenChange(value: /* fullScreen */ Boolean => Callback): Self = StObject.set(x, "onScreenChange", js.Any.fromFunction1((t0: /* fullScreen */ Boolean) => value(t0).runNow()))
      
      inline def setOnScreenChangeUndefined: Self = StObject.set(x, "onScreenChange", js.undefined)
      
      inline def setOnSlide(value: /* currentIndex */ Double => Callback): Self = StObject.set(x, "onSlide", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
      
      inline def setOnSlideUndefined: Self = StObject.set(x, "onSlide", js.undefined)
      
      inline def setOnThumbnailClick(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* index */ Double) => Callback): Self = StObject.set(x, "onThumbnailClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* index */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnThumbnailClickUndefined: Self = StObject.set(x, "onThumbnailClick", js.undefined)
      
      inline def setOnThumbnailError(value: ReactEventFrom[HTMLImageElement & Element] => Callback): Self = StObject.set(x, "onThumbnailError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
      
      inline def setOnThumbnailErrorUndefined: Self = StObject.set(x, "onThumbnailError", js.undefined)
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setPreventDefaultTouchmoveEvent(value: Boolean): Self = StObject.set(x, "preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultTouchmoveEventUndefined: Self = StObject.set(x, "preventDefaultTouchmoveEvent", js.undefined)
      
      inline def setRenderCustomControls(value: CallbackTo[Node]): Self = StObject.set(x, "renderCustomControls", value.toJsFn)
      
      inline def setRenderCustomControlsUndefined: Self = StObject.set(x, "renderCustomControls", js.undefined)
      
      inline def setRenderFullscreenButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean) => Node): Self = StObject.set(x, "renderFullscreenButton", js.Any.fromFunction2(value))
      
      inline def setRenderFullscreenButtonUndefined: Self = StObject.set(x, "renderFullscreenButton", js.undefined)
      
      inline def setRenderItem(value: /* item */ ReactImageGalleryItem => Node): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setRenderLeftNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean) => Node): Self = StObject.set(x, "renderLeftNav", js.Any.fromFunction2(value))
      
      inline def setRenderLeftNavUndefined: Self = StObject.set(x, "renderLeftNav", js.undefined)
      
      inline def setRenderPlayPauseButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean) => Node): Self = StObject.set(x, "renderPlayPauseButton", js.Any.fromFunction2(value))
      
      inline def setRenderPlayPauseButtonUndefined: Self = StObject.set(x, "renderPlayPauseButton", js.undefined)
      
      inline def setRenderRightNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean) => Node): Self = StObject.set(x, "renderRightNav", js.Any.fromFunction2(value))
      
      inline def setRenderRightNavUndefined: Self = StObject.set(x, "renderRightNav", js.undefined)
      
      inline def setRenderThumbInner(value: /* item */ ReactImageGalleryItem => Node): Self = StObject.set(x, "renderThumbInner", js.Any.fromFunction1(value))
      
      inline def setRenderThumbInnerUndefined: Self = StObject.set(x, "renderThumbInner", js.undefined)
      
      inline def setShowBullets(value: Boolean): Self = StObject.set(x, "showBullets", value.asInstanceOf[js.Any])
      
      inline def setShowBulletsUndefined: Self = StObject.set(x, "showBullets", js.undefined)
      
      inline def setShowFullscreenButton(value: Boolean): Self = StObject.set(x, "showFullscreenButton", value.asInstanceOf[js.Any])
      
      inline def setShowFullscreenButtonUndefined: Self = StObject.set(x, "showFullscreenButton", js.undefined)
      
      inline def setShowIndex(value: Boolean): Self = StObject.set(x, "showIndex", value.asInstanceOf[js.Any])
      
      inline def setShowIndexUndefined: Self = StObject.set(x, "showIndex", js.undefined)
      
      inline def setShowNav(value: Boolean): Self = StObject.set(x, "showNav", value.asInstanceOf[js.Any])
      
      inline def setShowNavUndefined: Self = StObject.set(x, "showNav", js.undefined)
      
      inline def setShowPlayButton(value: Boolean): Self = StObject.set(x, "showPlayButton", value.asInstanceOf[js.Any])
      
      inline def setShowPlayButtonUndefined: Self = StObject.set(x, "showPlayButton", js.undefined)
      
      inline def setShowThumbnails(value: Boolean): Self = StObject.set(x, "showThumbnails", value.asInstanceOf[js.Any])
      
      inline def setShowThumbnailsUndefined: Self = StObject.set(x, "showThumbnails", js.undefined)
      
      inline def setSlideDuration(value: Double): Self = StObject.set(x, "slideDuration", value.asInstanceOf[js.Any])
      
      inline def setSlideDurationUndefined: Self = StObject.set(x, "slideDuration", js.undefined)
      
      inline def setSlideInterval(value: Double): Self = StObject.set(x, "slideInterval", value.asInstanceOf[js.Any])
      
      inline def setSlideIntervalUndefined: Self = StObject.set(x, "slideInterval", js.undefined)
      
      inline def setSlideOnThumbnailOver(value: Boolean): Self = StObject.set(x, "slideOnThumbnailOver", value.asInstanceOf[js.Any])
      
      inline def setSlideOnThumbnailOverUndefined: Self = StObject.set(x, "slideOnThumbnailOver", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
      inline def setSwipingTransitionDuration(value: Double): Self = StObject.set(x, "swipingTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setSwipingTransitionDurationUndefined: Self = StObject.set(x, "swipingTransitionDuration", js.undefined)
      
      inline def setThumbnailPosition(value: top | right | bottom | left): Self = StObject.set(x, "thumbnailPosition", value.asInstanceOf[js.Any])
      
      inline def setThumbnailPositionUndefined: Self = StObject.set(x, "thumbnailPosition", js.undefined)
      
      inline def setUseBrowserFullscreen(value: Boolean): Self = StObject.set(x, "useBrowserFullscreen", value.asInstanceOf[js.Any])
      
      inline def setUseBrowserFullscreenUndefined: Self = StObject.set(x, "useBrowserFullscreen", js.undefined)
      
      inline def setUseTranslate3D(value: Boolean): Self = StObject.set(x, "useTranslate3D", value.asInstanceOf[js.Any])
      
      inline def setUseTranslate3DUndefined: Self = StObject.set(x, "useTranslate3D", js.undefined)
    }
  }
}
