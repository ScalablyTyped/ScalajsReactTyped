package typingsJapgolly.reactAliceCarousel.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAliceCarousel.anon.IsDisabled
import typingsJapgolly.reactAliceCarousel.anon.IsPlaying
import typingsJapgolly.reactAliceCarousel.libTypesMod.AnimationType
import typingsJapgolly.reactAliceCarousel.libTypesMod.AutoPlayStrategy
import typingsJapgolly.reactAliceCarousel.libTypesMod.AutoplayDirection
import typingsJapgolly.reactAliceCarousel.libTypesMod.ControlsStrategy
import typingsJapgolly.reactAliceCarousel.libTypesMod.DotsItem
import typingsJapgolly.reactAliceCarousel.libTypesMod.EventObject
import typingsJapgolly.reactAliceCarousel.libTypesMod.Props
import typingsJapgolly.reactAliceCarousel.libTypesMod.Responsive
import typingsJapgolly.reactAliceCarousel.libTypesMod.RootElement
import typingsJapgolly.reactAliceCarousel.mod.default
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.action
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.all
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.alternate
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.fadeout
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.ltr
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.none
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.responsive
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.rtl
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAliceCarousel {
  
  @JSImport("react-alice-carousel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def animationEasingFunction(value: String): this.type = set("animationEasingFunction", value.asInstanceOf[js.Any])
    
    inline def animationType(value: slide | fadeout | AnimationType): this.type = set("animationType", value.asInstanceOf[js.Any])
    
    inline def autoHeight(value: Boolean): this.type = set("autoHeight", value.asInstanceOf[js.Any])
    
    inline def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    
    inline def autoPlayControls(value: Boolean): this.type = set("autoPlayControls", value.asInstanceOf[js.Any])
    
    inline def autoPlayDirection(value: rtl | ltr | AutoplayDirection): this.type = set("autoPlayDirection", value.asInstanceOf[js.Any])
    
    inline def autoPlayInterval(value: Double): this.type = set("autoPlayInterval", value.asInstanceOf[js.Any])
    
    inline def autoPlayStrategy(
      value: typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.default | all | action | none | AutoPlayStrategy
    ): this.type = set("autoPlayStrategy", value.asInstanceOf[js.Any])
    
    inline def autoWidth(value: Boolean): this.type = set("autoWidth", value.asInstanceOf[js.Any])
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def controlsStrategy(
      value: typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.default | responsive | alternate | String | ControlsStrategy
    ): this.type = set("controlsStrategy", value.asInstanceOf[js.Any])
    
    inline def disableButtonsControls(value: Boolean): this.type = set("disableButtonsControls", value.asInstanceOf[js.Any])
    
    inline def disableDotsControls(value: Boolean): this.type = set("disableDotsControls", value.asInstanceOf[js.Any])
    
    inline def disableSlideInfo(value: Boolean): this.type = set("disableSlideInfo", value.asInstanceOf[js.Any])
    
    inline def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    inline def innerWidth(value: Double): this.type = set("innerWidth", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[Any]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: Any*): this.type = set("items", js.Array(value*))
    
    inline def keyboardNavigation(value: Boolean): this.type = set("keyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def mouseTracking(value: Boolean): this.type = set("mouseTracking", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onInitialized(value: /* e */ EventObject => Callback): this.type = set("onInitialized", js.Any.fromFunction1((t0: /* e */ EventObject) => value(t0).runNow()))
    
    inline def onResizeEvent(value: (/* e */ Event, /* prevProps */ RootElement, /* nextProps */ RootElement) => Boolean): this.type = set("onResizeEvent", js.Any.fromFunction3(value))
    
    inline def onResized(value: /* e */ EventObject => Callback): this.type = set("onResized", js.Any.fromFunction1((t0: /* e */ EventObject) => value(t0).runNow()))
    
    inline def onSlideChange(value: /* e */ EventObject => Callback): this.type = set("onSlideChange", js.Any.fromFunction1((t0: /* e */ EventObject) => value(t0).runNow()))
    
    inline def onSlideChanged(value: /* e */ EventObject => Callback): this.type = set("onSlideChanged", js.Any.fromFunction1((t0: /* e */ EventObject) => value(t0).runNow()))
    
    inline def paddingLeft(value: Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingRight(value: Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def preservePosition(value: Boolean): this.type = set("preservePosition", value.asInstanceOf[js.Any])
    
    inline def renderDotsItem(value: /* e */ DotsItem => Any): this.type = set("renderDotsItem", js.Any.fromFunction1(value))
    
    inline def renderKey(value: Double): this.type = set("renderKey", value.asInstanceOf[js.Any])
    
    inline def renderNextButton(value: /* hasIsDisabled */ IsDisabled => Any): this.type = set("renderNextButton", js.Any.fromFunction1(value))
    
    inline def renderPlayPauseButton(value: /* hasIsPlaying */ IsPlaying => Any): this.type = set("renderPlayPauseButton", js.Any.fromFunction1(value))
    
    inline def renderPrevButton(value: /* hasIsDisabled */ IsDisabled => Any): this.type = set("renderPrevButton", js.Any.fromFunction1(value))
    
    inline def renderSlideInfo(value: /* e */ typingsJapgolly.reactAliceCarousel.libTypesMod.SlideInfo => Any): this.type = set("renderSlideInfo", js.Any.fromFunction1(value))
    
    inline def responsive(value: Responsive): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def ssrSilentMode(value: Boolean): this.type = set("ssrSilentMode", value.asInstanceOf[js.Any])
    
    inline def swipeDelta(value: Double): this.type = set("swipeDelta", value.asInstanceOf[js.Any])
    
    inline def swipeExtraPadding(value: Double): this.type = set("swipeExtraPadding", value.asInstanceOf[js.Any])
    
    inline def touchMoveDefaultEvents(value: Boolean): this.type = set("touchMoveDefaultEvents", value.asInstanceOf[js.Any])
    
    inline def touchTracking(value: Boolean): this.type = set("touchTracking", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactAliceCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
