package typingsJapgolly.antDesignReactSlick.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactSlick.mod.LazyLoadTypes
import typingsJapgolly.antDesignReactSlick.mod.ResponsiveObject
import typingsJapgolly.antDesignReactSlick.mod.Settings
import typingsJapgolly.antDesignReactSlick.mod.Slider
import typingsJapgolly.antDesignReactSlick.mod.SwipeDirection
import typingsJapgolly.antDesignReactSlick.mod.default
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSlick {
  
  @JSImport("@ant-design/react-slick", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def accessibility(value: Boolean): this.type = set("accessibility", value.asInstanceOf[js.Any])
    
    inline def adaptiveHeight(value: Boolean): this.type = set("adaptiveHeight", value.asInstanceOf[js.Any])
    
    inline def afterChange(value: /* currentSlide */ Double => Callback): this.type = set("afterChange", js.Any.fromFunction1((t0: /* currentSlide */ Double) => value(t0).runNow()))
    
    inline def appendDots(value: /* dots */ Node => Element): this.type = set("appendDots", js.Any.fromFunction1(value))
    
    inline def arrows(value: Boolean): this.type = set("arrows", value.asInstanceOf[js.Any])
    
    inline def asNavFor(value: Slider): this.type = set("asNavFor", value.asInstanceOf[js.Any])
    
    inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def autoplaySpeed(value: Double): this.type = set("autoplaySpeed", value.asInstanceOf[js.Any])
    
    inline def beforeChange(value: (/* currentSlide */ Double, /* nextSlide */ Double) => Callback): this.type = set("beforeChange", js.Any.fromFunction2((t0: /* currentSlide */ Double, t1: /* nextSlide */ Double) => (value(t0, t1)).runNow()))
    
    inline def centerMode(value: Boolean): this.type = set("centerMode", value.asInstanceOf[js.Any])
    
    inline def centerPadding(value: String): this.type = set("centerPadding", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cssEase(value: String): this.type = set("cssEase", value.asInstanceOf[js.Any])
    
    inline def customPaging(value: /* index */ Double => Element): this.type = set("customPaging", js.Any.fromFunction1(value))
    
    inline def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
    
    inline def dotsClass(value: String): this.type = set("dotsClass", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
    
    inline def edgeFriction(value: Double): this.type = set("edgeFriction", value.asInstanceOf[js.Any])
    
    inline def fade(value: Boolean): this.type = set("fade", value.asInstanceOf[js.Any])
    
    inline def focusOnSelect(value: Boolean): this.type = set("focusOnSelect", value.asInstanceOf[js.Any])
    
    inline def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    inline def initialSlide(value: Double): this.type = set("initialSlide", value.asInstanceOf[js.Any])
    
    inline def lazyLoad(value: LazyLoadTypes): this.type = set("lazyLoad", value.asInstanceOf[js.Any])
    
    inline def nextArrow(value: VdomElement): this.type = set("nextArrow", value.rawElement.asInstanceOf[js.Any])
    
    inline def onEdge(value: /* swipeDirection */ SwipeDirection => Callback): this.type = set("onEdge", js.Any.fromFunction1((t0: /* swipeDirection */ SwipeDirection) => value(t0).runNow()))
    
    inline def onInit(value: Callback): this.type = set("onInit", value.toJsFn)
    
    inline def onLazyLoad(value: /* slidesToLoad */ js.Array[Double] => Callback): this.type = set("onLazyLoad", js.Any.fromFunction1((t0: /* slidesToLoad */ js.Array[Double]) => value(t0).runNow()))
    
    inline def onReInit(value: Callback): this.type = set("onReInit", value.toJsFn)
    
    inline def onSwipe(value: /* swipeDirection */ SwipeDirection => Callback): this.type = set("onSwipe", js.Any.fromFunction1((t0: /* swipeDirection */ SwipeDirection) => value(t0).runNow()))
    
    inline def pauseOnDotsHover(value: Boolean): this.type = set("pauseOnDotsHover", value.asInstanceOf[js.Any])
    
    inline def pauseOnFocus(value: Boolean): this.type = set("pauseOnFocus", value.asInstanceOf[js.Any])
    
    inline def pauseOnHover(value: Boolean): this.type = set("pauseOnHover", value.asInstanceOf[js.Any])
    
    inline def prevArrow(value: VdomElement): this.type = set("prevArrow", value.rawElement.asInstanceOf[js.Any])
    
    inline def responsive(value: js.Array[ResponsiveObject]): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def responsiveVarargs(value: ResponsiveObject*): this.type = set("responsive", js.Array(value*))
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def slide(value: String): this.type = set("slide", value.asInstanceOf[js.Any])
    
    inline def slidesPerRow(value: Double): this.type = set("slidesPerRow", value.asInstanceOf[js.Any])
    
    inline def slidesToScroll(value: Double): this.type = set("slidesToScroll", value.asInstanceOf[js.Any])
    
    inline def slidesToShow(value: Double): this.type = set("slidesToShow", value.asInstanceOf[js.Any])
    
    inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    inline def swipe(value: Boolean): this.type = set("swipe", value.asInstanceOf[js.Any])
    
    inline def swipeEvent(value: /* swipeDirection */ SwipeDirection => Callback): this.type = set("swipeEvent", js.Any.fromFunction1((t0: /* swipeDirection */ SwipeDirection) => value(t0).runNow()))
    
    inline def swipeToSlide(value: Boolean): this.type = set("swipeToSlide", value.asInstanceOf[js.Any])
    
    inline def touchMove(value: Boolean): this.type = set("touchMove", value.asInstanceOf[js.Any])
    
    inline def touchThreshold(value: Double): this.type = set("touchThreshold", value.asInstanceOf[js.Any])
    
    inline def useCSS(value: Boolean): this.type = set("useCSS", value.asInstanceOf[js.Any])
    
    inline def useTransform(value: Boolean): this.type = set("useTransform", value.asInstanceOf[js.Any])
    
    inline def variableWidth(value: Boolean): this.type = set("variableWidth", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    
    inline def verticalSwiping(value: Boolean): this.type = set("verticalSwiping", value.asInstanceOf[js.Any])
    
    inline def waitForAnimate(value: Boolean): this.type = set("waitForAnimate", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSlick.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Settings): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
