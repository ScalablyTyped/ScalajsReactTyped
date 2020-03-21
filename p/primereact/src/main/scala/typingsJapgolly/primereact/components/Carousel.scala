package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonPage
import typingsJapgolly.primereact.carouselCarouselMod.CarouselProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Carousel {
  def apply(
    autoplayInterval: Int | Double = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    containerClassName: String = null,
    contentClassName: String = null,
    dotsContainerClassName: String = null,
    footer: js.Any = null,
    header: js.Any = null,
    id: String = null,
    itemTemplate: js.Any = null,
    numScroll: Int | Double = null,
    numVisible: Int | Double = null,
    onPageChange: /* e */ AnonPage => Callback = null,
    orientation: String = null,
    page: Int | Double = null,
    responsiveOptions: js.Any = null,
    style: js.Object = null,
    value: js.Any = null,
    verticalViewPortHeight: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselProps, typingsJapgolly.primereact.carouselMod.Carousel, Unit, CarouselProps] = {
    val __obj = js.Dynamic.literal()
  
      if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (dotsContainerClassName != null) __obj.updateDynamic("dotsContainerClassName")(dotsContainerClassName.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (numScroll != null) __obj.updateDynamic("numScroll")(numScroll.asInstanceOf[js.Any])
    if (numVisible != null) __obj.updateDynamic("numVisible")(numVisible.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonPage) => onPageChange(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (responsiveOptions != null) __obj.updateDynamic("responsiveOptions")(responsiveOptions.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (verticalViewPortHeight != null) __obj.updateDynamic("verticalViewPortHeight")(verticalViewPortHeight.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.carouselCarouselMod.CarouselProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.carouselMod.Carousel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.carouselCarouselMod.CarouselProps])(children: _*)
  }
  @JSImport("primereact/carousel", "Carousel")
  @js.native
  object componentImport extends js.Object
  
}

