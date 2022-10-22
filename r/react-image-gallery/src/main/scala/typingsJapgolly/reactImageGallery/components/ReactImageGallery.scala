package typingsJapgolly.reactImageGallery.components

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
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactImageGallery.mod.ReactImageGalleryItem
import typingsJapgolly.reactImageGallery.mod.ReactImageGalleryProps
import typingsJapgolly.reactImageGallery.mod.default
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.bottom
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.left
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.right
import typingsJapgolly.reactImageGallery.reactImageGalleryStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImageGallery {
  
  inline def apply(items: js.Array[ReactImageGalleryItem]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactImageGalleryProps]))
  }
  
  @JSImport("react-image-gallery", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def additionalClass(value: String): this.type = set("additionalClass", value.asInstanceOf[js.Any])
    
    inline def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    
    inline def disableKeyDown(value: Boolean): this.type = set("disableKeyDown", value.asInstanceOf[js.Any])
    
    inline def disableSwipe(value: Boolean): this.type = set("disableSwipe", value.asInstanceOf[js.Any])
    
    inline def disableThumbnailScroll(value: Boolean): this.type = set("disableThumbnailScroll", value.asInstanceOf[js.Any])
    
    inline def flickThreshold(value: Double): this.type = set("flickThreshold", value.asInstanceOf[js.Any])
    
    inline def indexSeparator(value: String): this.type = set("indexSeparator", value.asInstanceOf[js.Any])
    
    inline def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    inline def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
    
    inline def lazyLoad(value: Boolean): this.type = set("lazyLoad", value.asInstanceOf[js.Any])
    
    inline def onBeforeSlide(value: /* currentIndex */ Double => Callback): this.type = set("onBeforeSlide", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onErrorImageURL(value: String): this.type = set("onErrorImageURL", value.asInstanceOf[js.Any])
    
    inline def onImageError(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onImageError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onImageLoad(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onImageLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onPause(value: /* currentIndex */ Double => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
    
    inline def onPlay(value: /* currentIndex */ Double => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
    
    inline def onScreenChange(value: /* fullScreen */ Boolean => Callback): this.type = set("onScreenChange", js.Any.fromFunction1((t0: /* fullScreen */ Boolean) => value(t0).runNow()))
    
    inline def onSlide(value: /* currentIndex */ Double => Callback): this.type = set("onSlide", js.Any.fromFunction1((t0: /* currentIndex */ Double) => value(t0).runNow()))
    
    inline def onThumbnailClick(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* index */ Double) => Callback): this.type = set("onThumbnailClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def onThumbnailError(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onThumbnailError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def preventDefaultTouchmoveEvent(value: Boolean): this.type = set("preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
    
    inline def renderCustomControls(value: CallbackTo[Node]): this.type = set("renderCustomControls", value.toJsFn)
    
    inline def renderFullscreenButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean) => Node): this.type = set("renderFullscreenButton", js.Any.fromFunction2(value))
    
    inline def renderItem(value: /* item */ ReactImageGalleryItem => Node): this.type = set("renderItem", js.Any.fromFunction1(value))
    
    inline def renderLeftNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean) => Node): this.type = set("renderLeftNav", js.Any.fromFunction2(value))
    
    inline def renderPlayPauseButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean) => Node): this.type = set("renderPlayPauseButton", js.Any.fromFunction2(value))
    
    inline def renderRightNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean) => Node): this.type = set("renderRightNav", js.Any.fromFunction2(value))
    
    inline def renderThumbInner(value: /* item */ ReactImageGalleryItem => Node): this.type = set("renderThumbInner", js.Any.fromFunction1(value))
    
    inline def showBullets(value: Boolean): this.type = set("showBullets", value.asInstanceOf[js.Any])
    
    inline def showFullscreenButton(value: Boolean): this.type = set("showFullscreenButton", value.asInstanceOf[js.Any])
    
    inline def showIndex(value: Boolean): this.type = set("showIndex", value.asInstanceOf[js.Any])
    
    inline def showNav(value: Boolean): this.type = set("showNav", value.asInstanceOf[js.Any])
    
    inline def showPlayButton(value: Boolean): this.type = set("showPlayButton", value.asInstanceOf[js.Any])
    
    inline def showThumbnails(value: Boolean): this.type = set("showThumbnails", value.asInstanceOf[js.Any])
    
    inline def slideDuration(value: Double): this.type = set("slideDuration", value.asInstanceOf[js.Any])
    
    inline def slideInterval(value: Double): this.type = set("slideInterval", value.asInstanceOf[js.Any])
    
    inline def slideOnThumbnailOver(value: Boolean): this.type = set("slideOnThumbnailOver", value.asInstanceOf[js.Any])
    
    inline def startIndex(value: Double): this.type = set("startIndex", value.asInstanceOf[js.Any])
    
    inline def stopPropagation(value: Boolean): this.type = set("stopPropagation", value.asInstanceOf[js.Any])
    
    inline def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
    
    inline def swipingTransitionDuration(value: Double): this.type = set("swipingTransitionDuration", value.asInstanceOf[js.Any])
    
    inline def thumbnailPosition(value: top | right | bottom | left): this.type = set("thumbnailPosition", value.asInstanceOf[js.Any])
    
    inline def useBrowserFullscreen(value: Boolean): this.type = set("useBrowserFullscreen", value.asInstanceOf[js.Any])
    
    inline def useTranslate3D(value: Boolean): this.type = set("useTranslate3D", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactImageGalleryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
