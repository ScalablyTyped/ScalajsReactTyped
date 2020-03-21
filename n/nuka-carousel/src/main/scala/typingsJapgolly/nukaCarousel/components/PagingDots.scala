package typingsJapgolly.nukaCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nukaCarousel.mod.CarouselCellAlignProp
import typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps
import typingsJapgolly.nukaCarousel.mod.CarouselSlidesToScrollProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PagingDots {
  def apply(
    cellAlign: CarouselCellAlignProp,
    cellSpacing: Double,
    currentSlide: Double,
    frameWidth: Double,
    slideCount: Double,
    slideWidth: Double,
    slidesToScroll: CarouselSlidesToScrollProp,
    slidesToShow: Double,
    wrapAround: Boolean,
    goToSlide: Double => Callback,
    nextSlide: Callback,
    previousSlide: Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CarouselSlideRenderControlProps, 
    typingsJapgolly.nukaCarousel.mod.PagingDots, 
    Unit, 
    CarouselSlideRenderControlProps
  ] = {
    val __obj = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
  
      __obj.updateDynamic("goToSlide")(js.Any.fromFunction1((t0: scala.Double) => goToSlide(t0).runNow()))
    __obj.updateDynamic("nextSlide")(nextSlide.toJsFn)
    __obj.updateDynamic("previousSlide")(previousSlide.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nukaCarousel.mod.PagingDots](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps])(children: _*)
  }
  @JSImport("nuka-carousel", "PagingDots")
  @js.native
  object componentImport extends js.Object
  
}

