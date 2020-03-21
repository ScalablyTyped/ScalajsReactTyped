package typingsJapgolly.primereact.carouselCarouselMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.primereact.AnonPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends js.Object {
  var autoplayInterval: js.UndefOr[Double] = js.undefined
  var circular: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var containerClassName: js.UndefOr[String] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var dotsContainerClassName: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Any] = js.undefined
  var numScroll: js.UndefOr[Double] = js.undefined
  var numVisible: js.UndefOr[Double] = js.undefined
  var onPageChange: js.UndefOr[js.Function1[/* e */ AnonPage, Unit]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var responsiveOptions: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var verticalViewPortHeight: js.UndefOr[String] = js.undefined
}

object CarouselProps {
  @scala.inline
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
    verticalViewPortHeight: String = null
  ): CarouselProps = {
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
    __obj.asInstanceOf[CarouselProps]
  }
}

