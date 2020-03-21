package typingsJapgolly.reactNativeAppIntroSlider.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppIntroProps extends js.Object {
  var activeDotStyle: js.UndefOr[ViewStyle] = js.undefined
  var bottomButton: js.UndefOr[Boolean] = js.undefined
  var buttonStyle: js.UndefOr[ViewStyle] = js.undefined
  var buttonTextStyle: js.UndefOr[TextProps] = js.undefined
  var doneLabel: js.UndefOr[String] = js.undefined
  var dotStyle: js.UndefOr[ViewStyle] = js.undefined
  var hidePagination: js.UndefOr[Boolean] = js.undefined
  var nextLabel: js.UndefOr[String] = js.undefined
  var onDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSkip: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSlideChange: js.UndefOr[js.Function2[/* index */ Double, /* lastIndex */ Double, Unit]] = js.undefined
  var paginationStyle: js.UndefOr[ViewStyle] = js.undefined
  var prevLabel: js.UndefOr[String] = js.undefined
  var renderDoneButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderItem: js.UndefOr[js.Function1[/* item */ js.Any, Element]] = js.undefined
  var renderNextButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderPrevButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderSkipButton: js.UndefOr[js.Function0[Unit]] = js.undefined
  var showDoneButton: js.UndefOr[Boolean] = js.undefined
  var showNextButton: js.UndefOr[Boolean] = js.undefined
  var showPrevButton: js.UndefOr[Boolean] = js.undefined
  var showSkipButton: js.UndefOr[Boolean] = js.undefined
  var skipLabel: js.UndefOr[String] = js.undefined
  var slides: js.Array[_]
}

object AppIntroProps {
  @scala.inline
  def apply(
    slides: js.Array[_],
    activeDotStyle: ViewStyle = null,
    bottomButton: js.UndefOr[Boolean] = js.undefined,
    buttonStyle: ViewStyle = null,
    buttonTextStyle: TextProps = null,
    doneLabel: String = null,
    dotStyle: ViewStyle = null,
    hidePagination: js.UndefOr[Boolean] = js.undefined,
    nextLabel: String = null,
    onDone: js.UndefOr[Callback] = js.undefined,
    onSkip: js.UndefOr[Callback] = js.undefined,
    onSlideChange: (/* index */ Double, /* lastIndex */ Double) => Callback = null,
    paginationStyle: ViewStyle = null,
    prevLabel: String = null,
    renderDoneButton: js.UndefOr[Callback] = js.undefined,
    renderItem: /* item */ js.Any => CallbackTo[Element] = null,
    renderNextButton: js.UndefOr[Callback] = js.undefined,
    renderPrevButton: js.UndefOr[Callback] = js.undefined,
    renderSkipButton: js.UndefOr[Callback] = js.undefined,
    showDoneButton: js.UndefOr[Boolean] = js.undefined,
    showNextButton: js.UndefOr[Boolean] = js.undefined,
    showPrevButton: js.UndefOr[Boolean] = js.undefined,
    showSkipButton: js.UndefOr[Boolean] = js.undefined,
    skipLabel: String = null
  ): AppIntroProps = {
    val __obj = js.Dynamic.literal(slides = slides.asInstanceOf[js.Any])
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomButton)) __obj.updateDynamic("bottomButton")(bottomButton.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle.asInstanceOf[js.Any])
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePagination)) __obj.updateDynamic("hidePagination")(hidePagination.asInstanceOf[js.Any])
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel.asInstanceOf[js.Any])
    onDone.foreach(p => __obj.updateDynamic("onDone")(p.toJsFn))
    onSkip.foreach(p => __obj.updateDynamic("onSkip")(p.toJsFn))
    if (onSlideChange != null) __obj.updateDynamic("onSlideChange")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* lastIndex */ scala.Double) => onSlideChange(t0, t1).runNow()))
    if (paginationStyle != null) __obj.updateDynamic("paginationStyle")(paginationStyle.asInstanceOf[js.Any])
    if (prevLabel != null) __obj.updateDynamic("prevLabel")(prevLabel.asInstanceOf[js.Any])
    renderDoneButton.foreach(p => __obj.updateDynamic("renderDoneButton")(p.toJsFn))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: /* item */ js.Any) => renderItem(t0).runNow()))
    renderNextButton.foreach(p => __obj.updateDynamic("renderNextButton")(p.toJsFn))
    renderPrevButton.foreach(p => __obj.updateDynamic("renderPrevButton")(p.toJsFn))
    renderSkipButton.foreach(p => __obj.updateDynamic("renderSkipButton")(p.toJsFn))
    if (!js.isUndefined(showDoneButton)) __obj.updateDynamic("showDoneButton")(showDoneButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showNextButton)) __obj.updateDynamic("showNextButton")(showNextButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrevButton)) __obj.updateDynamic("showPrevButton")(showPrevButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkipButton)) __obj.updateDynamic("showSkipButton")(showSkipButton.asInstanceOf[js.Any])
    if (skipLabel != null) __obj.updateDynamic("skipLabel")(skipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppIntroProps]
  }
}

