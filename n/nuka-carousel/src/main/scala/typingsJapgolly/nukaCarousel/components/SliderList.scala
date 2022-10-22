package typingsJapgolly.nukaCarousel.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nukaCarousel.libSliderListMod.SliderListProps
import typingsJapgolly.nukaCarousel.libTypesMod.Alignment
import typingsJapgolly.nukaCarousel.libTypesMod.ScrollMode
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.fade
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.zoom
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SliderList {
  
  inline def apply(
    animationDistance: Double,
    cellAlign: Alignment,
    currentSlide: Double,
    disableAnimation: Boolean,
    disableEdgeSwiping: Boolean,
    draggedOffset: Double,
    easing: /* normalizedTime */ Double => Double,
    edgeEasing: /* normalizedTime */ Double => Double,
    isDragging: Boolean,
    scrollMode: ScrollMode,
    slideCount: Double,
    slidesToScroll: Double,
    slidesToShow: Double,
    speed: Double,
    wrapAround: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(animationDistance = animationDistance.asInstanceOf[js.Any], cellAlign = cellAlign.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], disableAnimation = disableAnimation.asInstanceOf[js.Any], disableEdgeSwiping = disableEdgeSwiping.asInstanceOf[js.Any], draggedOffset = draggedOffset.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), edgeEasing = js.Any.fromFunction1(edgeEasing), isDragging = isDragging.asInstanceOf[js.Any], scrollMode = scrollMode.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SliderListProps & RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("nuka-carousel/lib/slider-list", "SliderList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def animation(value: zoom | fade): this.type = set("animation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SliderListProps & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
