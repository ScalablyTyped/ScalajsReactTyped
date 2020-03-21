package typingsJapgolly.brainhubeuReactCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.brainhubeuReactCarousel.mod.CarouselProps
import typingsJapgolly.brainhubeuReactCarousel.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCarousel {
  def apply(
    addArrowClickHandler: js.UndefOr[Boolean] = js.undefined,
    animationSpeed: Int | Double = null,
    arrowLeft: VdomElement = null,
    arrowRight: VdomElement = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    autoPlay: Int | Double = null,
    breakpoints: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    clickToChange: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    itemWidth: Int | Double = null,
    keepDirectionWhenDragging: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    onChange: /* value */ Double => Callback = null,
    slides: js.Array[Element] = null,
    slidesPerPage: Int | Double = null,
    slidesPerScroll: Int | Double = null,
    stopAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselProps, default, Unit, CarouselProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(addArrowClickHandler)) __obj.updateDynamic("addArrowClickHandler")(addArrowClickHandler.asInstanceOf[js.Any])
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (arrowLeft != null) __obj.updateDynamic("arrowLeft")(arrowLeft.rawElement.asInstanceOf[js.Any])
    if (arrowRight != null) __obj.updateDynamic("arrowRight")(arrowRight.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (autoPlay != null) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToChange)) __obj.updateDynamic("clickToChange")(clickToChange.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(keepDirectionWhenDragging)) __obj.updateDynamic("keepDirectionWhenDragging")(keepDirectionWhenDragging.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onChange(t0).runNow()))
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    if (slidesPerPage != null) __obj.updateDynamic("slidesPerPage")(slidesPerPage.asInstanceOf[js.Any])
    if (slidesPerScroll != null) __obj.updateDynamic("slidesPerScroll")(slidesPerScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAutoPlayOnHover)) __obj.updateDynamic("stopAutoPlayOnHover")(stopAutoPlayOnHover.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.brainhubeuReactCarousel.mod.CarouselProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.brainhubeuReactCarousel.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.brainhubeuReactCarousel.mod.CarouselProps])(children: _*)
  }
  @JSImport("@brainhubeu/react-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

