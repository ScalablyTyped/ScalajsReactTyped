package typingsJapgolly.rmcNukaCarousel.decoratorsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecoratorProps extends js.Object {
  var cellSpacing: js.UndefOr[Double] = js.undefined
  var currentSlide: Double
  var frameWidth: Double | String
  var goToSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var nextSlide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var slideCount: Double
  var slideWidth: Double | String
  var slidesToScroll: Double
  var slidesToShow: js.UndefOr[Double] = js.undefined
  var wrapAround: js.UndefOr[Boolean] = js.undefined
  def previousSlide(): Unit
}

object IDecoratorProps {
  @scala.inline
  def apply(
    currentSlide: Double,
    frameWidth: Double | String,
    previousSlide: Callback,
    slideCount: Double,
    slideWidth: Double | String,
    slidesToScroll: Double,
    cellSpacing: Int | Double = null,
    goToSlide: /* index */ Double => Callback = null,
    nextSlide: js.UndefOr[Callback] = js.undefined,
    slidesToShow: Int | Double = null,
    wrapAround: js.UndefOr[Boolean] = js.undefined
  ): IDecoratorProps = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any])
    __obj.updateDynamic("previousSlide")(previousSlide.toJsFn)
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (goToSlide != null) __obj.updateDynamic("goToSlide")(js.Any.fromFunction1((t0: /* index */ scala.Double) => goToSlide(t0).runNow()))
    nextSlide.foreach(p => __obj.updateDynamic("nextSlide")(p.toJsFn))
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDecoratorProps]
  }
}

