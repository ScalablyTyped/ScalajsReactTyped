package typingsJapgolly.reactNativeAppIntroSlider.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeAppIntroSlider.mod.AppIntroProps
import typingsJapgolly.reactNativeAppIntroSlider.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeAppIntroSlider {
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
    skipLabel: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AppIntroProps, default, Unit, AppIntroProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeAppIntroSlider.mod.AppIntroProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeAppIntroSlider.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeAppIntroSlider.mod.AppIntroProps])(children: _*)
  }
  @JSImport("react-native-app-intro-slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

