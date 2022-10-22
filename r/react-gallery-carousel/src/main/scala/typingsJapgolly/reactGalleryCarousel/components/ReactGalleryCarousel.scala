package typingsJapgolly.reactGalleryCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactGalleryCarousel.anon.CurIndex
import typingsJapgolly.reactGalleryCarousel.mod.Image
import typingsJapgolly.reactGalleryCarousel.mod.Images
import typingsJapgolly.reactGalleryCarousel.mod.LargeWidgetPositions
import typingsJapgolly.reactGalleryCarousel.mod.ObjectFit
import typingsJapgolly.reactGalleryCarousel.mod.SmallWidgetPositions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGalleryCarousel {
  
  object CarouselWithChildrenParti {
    
    @JSImport("react-gallery-carousel", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def activeIcon(value: VdomNode): this.type = set("activeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def activeIconNull: this.type = set("activeIcon", null)
      
      inline def activeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("activeIcon", js.Array(value*))
      
      inline def activeIconVdomElement(value: VdomElement): this.type = set("activeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def autoPlayInterval(value: Double): this.type = set("autoPlayInterval", value.asInstanceOf[js.Any])
      
      inline def canAutoPlay(value: Boolean): this.type = set("canAutoPlay", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def hasCaptions(value: LargeWidgetPositions | Boolean): this.type = set("hasCaptions", value.asInstanceOf[js.Any])
      
      inline def hasCaptionsAtMax(value: LargeWidgetPositions | Boolean): this.type = set("hasCaptionsAtMax", value.asInstanceOf[js.Any])
      
      inline def hasDotButtons(value: LargeWidgetPositions | Boolean): this.type = set("hasDotButtons", value.asInstanceOf[js.Any])
      
      inline def hasDotButtonsAtMax(value: LargeWidgetPositions | Boolean): this.type = set("hasDotButtonsAtMax", value.asInstanceOf[js.Any])
      
      inline def hasIndexBoard(value: SmallWidgetPositions | Boolean): this.type = set("hasIndexBoard", value.asInstanceOf[js.Any])
      
      inline def hasIndexBoardButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasIndexBoardButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasLeftButton(value: SmallWidgetPositions | Boolean): this.type = set("hasLeftButton", value.asInstanceOf[js.Any])
      
      inline def hasLeftButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasLeftButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasMediaButton(value: SmallWidgetPositions | Boolean): this.type = set("hasMediaButton", value.asInstanceOf[js.Any])
      
      inline def hasMediaButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasMediaButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasRightButton(value: SmallWidgetPositions | Boolean): this.type = set("hasRightButton", value.asInstanceOf[js.Any])
      
      inline def hasRightButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasRightButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasSizeButton(value: SmallWidgetPositions | Boolean): this.type = set("hasSizeButton", value.asInstanceOf[js.Any])
      
      inline def hasSizeButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasSizeButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasThumbnails(value: Boolean): this.type = set("hasThumbnails", value.asInstanceOf[js.Any])
      
      inline def hasThumbnailsAtMax(value: Boolean): this.type = set("hasThumbnailsAtMax", value.asInstanceOf[js.Any])
      
      inline def hasTransition(value: Boolean): this.type = set("hasTransition", value.asInstanceOf[js.Any])
      
      inline def images(value: Images): this.type = set("images", value.asInstanceOf[js.Any])
      
      inline def imagesVarargs(value: Image*): this.type = set("images", js.Array(value*))
      
      inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
      
      inline def isAutoPlaying(value: Boolean): this.type = set("isAutoPlaying", value.asInstanceOf[js.Any])
      
      inline def isLoop(value: Boolean): this.type = set("isLoop", value.asInstanceOf[js.Any])
      
      inline def isMaximized(value: Boolean): this.type = set("isMaximized", value.asInstanceOf[js.Any])
      
      inline def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
      
      inline def leftIcon(value: VdomNode): this.type = set("leftIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def leftIconNull: this.type = set("leftIcon", null)
      
      inline def leftIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("leftIcon", js.Array(value*))
      
      inline def leftIconVdomElement(value: VdomElement): this.type = set("leftIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def maxIcon(value: VdomNode): this.type = set("maxIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def maxIconNull: this.type = set("maxIcon", null)
      
      inline def maxIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("maxIcon", js.Array(value*))
      
      inline def maxIconVdomElement(value: VdomElement): this.type = set("maxIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def minIcon(value: VdomNode): this.type = set("minIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def minIconNull: this.type = set("minIcon", null)
      
      inline def minIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("minIcon", js.Array(value*))
      
      inline def minIconVdomElement(value: VdomElement): this.type = set("minIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def objectFit(value: ObjectFit): this.type = set("objectFit", value.asInstanceOf[js.Any])
      
      inline def objectFitAtMax(value: ObjectFit): this.type = set("objectFitAtMax", value.asInstanceOf[js.Any])
      
      inline def onIndexChange(value: /* hasCurIndexCurIndexForDisplay */ CurIndex => Callback): this.type = set("onIndexChange", js.Any.fromFunction1((t0: /* hasCurIndexCurIndexForDisplay */ CurIndex) => value(t0).runNow()))
      
      inline def onSwipeEndDown(value: Callback): this.type = set("onSwipeEndDown", value.toJsFn)
      
      inline def onSwipeMoveX(value: /* displacementX */ Double => Callback): this.type = set("onSwipeMoveX", js.Any.fromFunction1((t0: /* displacementX */ Double) => value(t0).runNow()))
      
      inline def onSwipeMoveY(value: /* displacementY */ Double => Callback): this.type = set("onSwipeMoveY", js.Any.fromFunction1((t0: /* displacementY */ Double) => value(t0).runNow()))
      
      inline def onTap(value: Callback): this.type = set("onTap", value.toJsFn)
      
      inline def passiveIcon(value: VdomNode): this.type = set("passiveIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def passiveIconNull: this.type = set("passiveIcon", null)
      
      inline def passiveIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("passiveIcon", js.Array(value*))
      
      inline def passiveIconVdomElement(value: VdomElement): this.type = set("passiveIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def pauseIcon(value: VdomNode): this.type = set("pauseIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def pauseIconNull: this.type = set("pauseIcon", null)
      
      inline def pauseIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("pauseIcon", js.Array(value*))
      
      inline def pauseIconVdomElement(value: VdomElement): this.type = set("pauseIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def playIcon(value: VdomNode): this.type = set("playIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def playIconNull: this.type = set("playIcon", null)
      
      inline def playIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("playIcon", js.Array(value*))
      
      inline def playIconVdomElement(value: VdomElement): this.type = set("playIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def rightIcon(value: VdomNode): this.type = set("rightIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def rightIconNull: this.type = set("rightIcon", null)
      
      inline def rightIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rightIcon", js.Array(value*))
      
      inline def rightIconVdomElement(value: VdomElement): this.type = set("rightIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def shouldLazyLoad(value: Boolean): this.type = set("shouldLazyLoad", value.asInstanceOf[js.Any])
      
      inline def shouldMaximizeOnClick(value: Boolean): this.type = set("shouldMaximizeOnClick", value.asInstanceOf[js.Any])
      
      inline def shouldMinimizeOnClick(value: Boolean): this.type = set("shouldMinimizeOnClick", value.asInstanceOf[js.Any])
      
      inline def shouldMinimizeOnSwipeDown(value: Boolean): this.type = set("shouldMinimizeOnSwipeDown", value.asInstanceOf[js.Any])
      
      inline def shouldSwipeOnMouse(value: Boolean): this.type = set("shouldSwipeOnMouse", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def swipeRollBackSpeed(value: Double): this.type = set("swipeRollBackSpeed", value.asInstanceOf[js.Any])
      
      inline def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def thumbnailHeight(value: String): this.type = set("thumbnailHeight", value.asInstanceOf[js.Any])
      
      inline def thumbnailWidth(value: String): this.type = set("thumbnailWidth", value.asInstanceOf[js.Any])
      
      inline def thumbnails(value: VdomNode): this.type = set("thumbnails", value.rawNode.asInstanceOf[js.Any])
      
      inline def thumbnailsNull: this.type = set("thumbnails", null)
      
      inline def thumbnailsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("thumbnails", js.Array(value*))
      
      inline def thumbnailsVdomElement(value: VdomElement): this.type = set("thumbnails", value.rawElement.asInstanceOf[js.Any])
      
      inline def transitionDurationLimit(value: Double): this.type = set("transitionDurationLimit", value.asInstanceOf[js.Any])
      
      inline def transitionDurationMax(value: Double): this.type = set("transitionDurationMax", value.asInstanceOf[js.Any])
      
      inline def transitionDurationMin(value: Double): this.type = set("transitionDurationMin", value.asInstanceOf[js.Any])
      
      inline def transitionSpeed(value: Double): this.type = set("transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def widgetsHasShadow(value: Boolean): this.type = set("widgetsHasShadow", value.asInstanceOf[js.Any])
      
      inline def zIndexAtMax(value: Double): this.type = set("zIndexAtMax", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: CarouselWithChildrenParti.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsJapgolly.reactGalleryCarousel.anon.CarouselWithChildrenParti): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object CarouselWithImagesPartial {
    
    inline def apply(images: Images): Builder = {
      val __props = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactGalleryCarousel.anon.CarouselWithImagesPartial]))
    }
    
    @JSImport("react-gallery-carousel", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def activeIcon(value: VdomNode): this.type = set("activeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def activeIconNull: this.type = set("activeIcon", null)
      
      inline def activeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("activeIcon", js.Array(value*))
      
      inline def activeIconVdomElement(value: VdomElement): this.type = set("activeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def autoPlayInterval(value: Double): this.type = set("autoPlayInterval", value.asInstanceOf[js.Any])
      
      inline def canAutoPlay(value: Boolean): this.type = set("canAutoPlay", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def hasCaptions(value: LargeWidgetPositions | Boolean): this.type = set("hasCaptions", value.asInstanceOf[js.Any])
      
      inline def hasCaptionsAtMax(value: LargeWidgetPositions | Boolean): this.type = set("hasCaptionsAtMax", value.asInstanceOf[js.Any])
      
      inline def hasDotButtons(value: LargeWidgetPositions | Boolean): this.type = set("hasDotButtons", value.asInstanceOf[js.Any])
      
      inline def hasDotButtonsAtMax(value: LargeWidgetPositions | Boolean): this.type = set("hasDotButtonsAtMax", value.asInstanceOf[js.Any])
      
      inline def hasIndexBoard(value: SmallWidgetPositions | Boolean): this.type = set("hasIndexBoard", value.asInstanceOf[js.Any])
      
      inline def hasIndexBoardButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasIndexBoardButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasLeftButton(value: SmallWidgetPositions | Boolean): this.type = set("hasLeftButton", value.asInstanceOf[js.Any])
      
      inline def hasLeftButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasLeftButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasMediaButton(value: SmallWidgetPositions | Boolean): this.type = set("hasMediaButton", value.asInstanceOf[js.Any])
      
      inline def hasMediaButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasMediaButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasRightButton(value: SmallWidgetPositions | Boolean): this.type = set("hasRightButton", value.asInstanceOf[js.Any])
      
      inline def hasRightButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasRightButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasSizeButton(value: SmallWidgetPositions | Boolean): this.type = set("hasSizeButton", value.asInstanceOf[js.Any])
      
      inline def hasSizeButtonAtMax(value: SmallWidgetPositions | Boolean): this.type = set("hasSizeButtonAtMax", value.asInstanceOf[js.Any])
      
      inline def hasThumbnails(value: Boolean): this.type = set("hasThumbnails", value.asInstanceOf[js.Any])
      
      inline def hasThumbnailsAtMax(value: Boolean): this.type = set("hasThumbnailsAtMax", value.asInstanceOf[js.Any])
      
      inline def hasTransition(value: Boolean): this.type = set("hasTransition", value.asInstanceOf[js.Any])
      
      inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
      
      inline def isAutoPlaying(value: Boolean): this.type = set("isAutoPlaying", value.asInstanceOf[js.Any])
      
      inline def isLoop(value: Boolean): this.type = set("isLoop", value.asInstanceOf[js.Any])
      
      inline def isMaximized(value: Boolean): this.type = set("isMaximized", value.asInstanceOf[js.Any])
      
      inline def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
      
      inline def leftIcon(value: VdomNode): this.type = set("leftIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def leftIconNull: this.type = set("leftIcon", null)
      
      inline def leftIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("leftIcon", js.Array(value*))
      
      inline def leftIconVdomElement(value: VdomElement): this.type = set("leftIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def maxIcon(value: VdomNode): this.type = set("maxIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def maxIconNull: this.type = set("maxIcon", null)
      
      inline def maxIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("maxIcon", js.Array(value*))
      
      inline def maxIconVdomElement(value: VdomElement): this.type = set("maxIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def minIcon(value: VdomNode): this.type = set("minIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def minIconNull: this.type = set("minIcon", null)
      
      inline def minIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("minIcon", js.Array(value*))
      
      inline def minIconVdomElement(value: VdomElement): this.type = set("minIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def objectFit(value: ObjectFit): this.type = set("objectFit", value.asInstanceOf[js.Any])
      
      inline def objectFitAtMax(value: ObjectFit): this.type = set("objectFitAtMax", value.asInstanceOf[js.Any])
      
      inline def onIndexChange(value: /* hasCurIndexCurIndexForDisplay */ CurIndex => Callback): this.type = set("onIndexChange", js.Any.fromFunction1((t0: /* hasCurIndexCurIndexForDisplay */ CurIndex) => value(t0).runNow()))
      
      inline def onSwipeEndDown(value: Callback): this.type = set("onSwipeEndDown", value.toJsFn)
      
      inline def onSwipeMoveX(value: /* displacementX */ Double => Callback): this.type = set("onSwipeMoveX", js.Any.fromFunction1((t0: /* displacementX */ Double) => value(t0).runNow()))
      
      inline def onSwipeMoveY(value: /* displacementY */ Double => Callback): this.type = set("onSwipeMoveY", js.Any.fromFunction1((t0: /* displacementY */ Double) => value(t0).runNow()))
      
      inline def onTap(value: Callback): this.type = set("onTap", value.toJsFn)
      
      inline def passiveIcon(value: VdomNode): this.type = set("passiveIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def passiveIconNull: this.type = set("passiveIcon", null)
      
      inline def passiveIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("passiveIcon", js.Array(value*))
      
      inline def passiveIconVdomElement(value: VdomElement): this.type = set("passiveIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def pauseIcon(value: VdomNode): this.type = set("pauseIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def pauseIconNull: this.type = set("pauseIcon", null)
      
      inline def pauseIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("pauseIcon", js.Array(value*))
      
      inline def pauseIconVdomElement(value: VdomElement): this.type = set("pauseIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def playIcon(value: VdomNode): this.type = set("playIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def playIconNull: this.type = set("playIcon", null)
      
      inline def playIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("playIcon", js.Array(value*))
      
      inline def playIconVdomElement(value: VdomElement): this.type = set("playIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def rightIcon(value: VdomNode): this.type = set("rightIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def rightIconNull: this.type = set("rightIcon", null)
      
      inline def rightIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rightIcon", js.Array(value*))
      
      inline def rightIconVdomElement(value: VdomElement): this.type = set("rightIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def shouldLazyLoad(value: Boolean): this.type = set("shouldLazyLoad", value.asInstanceOf[js.Any])
      
      inline def shouldMaximizeOnClick(value: Boolean): this.type = set("shouldMaximizeOnClick", value.asInstanceOf[js.Any])
      
      inline def shouldMinimizeOnClick(value: Boolean): this.type = set("shouldMinimizeOnClick", value.asInstanceOf[js.Any])
      
      inline def shouldMinimizeOnSwipeDown(value: Boolean): this.type = set("shouldMinimizeOnSwipeDown", value.asInstanceOf[js.Any])
      
      inline def shouldSwipeOnMouse(value: Boolean): this.type = set("shouldSwipeOnMouse", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def swipeRollBackSpeed(value: Double): this.type = set("swipeRollBackSpeed", value.asInstanceOf[js.Any])
      
      inline def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def thumbnailHeight(value: String): this.type = set("thumbnailHeight", value.asInstanceOf[js.Any])
      
      inline def thumbnailWidth(value: String): this.type = set("thumbnailWidth", value.asInstanceOf[js.Any])
      
      inline def thumbnails(value: VdomNode): this.type = set("thumbnails", value.rawNode.asInstanceOf[js.Any])
      
      inline def thumbnailsNull: this.type = set("thumbnails", null)
      
      inline def thumbnailsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("thumbnails", js.Array(value*))
      
      inline def thumbnailsVdomElement(value: VdomElement): this.type = set("thumbnails", value.rawElement.asInstanceOf[js.Any])
      
      inline def transitionDurationLimit(value: Double): this.type = set("transitionDurationLimit", value.asInstanceOf[js.Any])
      
      inline def transitionDurationMax(value: Double): this.type = set("transitionDurationMax", value.asInstanceOf[js.Any])
      
      inline def transitionDurationMin(value: Double): this.type = set("transitionDurationMin", value.asInstanceOf[js.Any])
      
      inline def transitionSpeed(value: Double): this.type = set("transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def widgetsHasShadow(value: Boolean): this.type = set("widgetsHasShadow", value.asInstanceOf[js.Any])
      
      inline def zIndexAtMax(value: Double): this.type = set("zIndexAtMax", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactGalleryCarousel.anon.CarouselWithImagesPartial): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
