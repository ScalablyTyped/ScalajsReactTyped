package typingsJapgolly.reactJoyride.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactJoyride.mod.CallBackProps
import typingsJapgolly.reactJoyride.mod.FloaterProps
import typingsJapgolly.reactJoyride.mod.Locale
import typingsJapgolly.reactJoyride.mod.Props
import typingsJapgolly.reactJoyride.mod.Step
import typingsJapgolly.reactJoyride.mod.StoreHelpers
import typingsJapgolly.reactJoyride.mod.Styles
import typingsJapgolly.reactJoyride.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJoyride {
  def apply(
    steps: js.Array[Step],
    beaconComponent: ElementType = null,
    callback: /* data */ CallBackProps => Callback = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    disableOverlay: js.UndefOr[Boolean] = js.undefined,
    disableOverlayClose: js.UndefOr[Boolean] = js.undefined,
    disableScrollParentFix: js.UndefOr[Boolean] = js.undefined,
    disableScrolling: js.UndefOr[Boolean] = js.undefined,
    floaterProps: FloaterProps = null,
    getHelpers: /* helpers */ StoreHelpers => CallbackTo[js.Any] = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    locale: Locale = null,
    run: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: Int | Double = null,
    scrollToFirstStep: js.UndefOr[Boolean] = js.undefined,
    showProgress: js.UndefOr[Boolean] = js.undefined,
    showSkipButton: js.UndefOr[Boolean] = js.undefined,
    spotlightClicks: js.UndefOr[Boolean] = js.undefined,
    spotlightPadding: Int | Double = null,
    stepIndex: Int | Double = null,
    styles: Styles = null,
    tooltipComponent: ElementType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
  
      if (beaconComponent != null) __obj.updateDynamic("beaconComponent")(beaconComponent.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactJoyride.mod.CallBackProps) => callback(t0).runNow()))
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCloseOnEsc)) __obj.updateDynamic("disableCloseOnEsc")(disableCloseOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOverlay)) __obj.updateDynamic("disableOverlay")(disableOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOverlayClose)) __obj.updateDynamic("disableOverlayClose")(disableOverlayClose.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrollParentFix)) __obj.updateDynamic("disableScrollParentFix")(disableScrollParentFix.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrolling)) __obj.updateDynamic("disableScrolling")(disableScrolling.asInstanceOf[js.Any])
    if (floaterProps != null) __obj.updateDynamic("floaterProps")(floaterProps.asInstanceOf[js.Any])
    if (getHelpers != null) __obj.updateDynamic("getHelpers")(js.Any.fromFunction1((t0: /* helpers */ typingsJapgolly.reactJoyride.mod.StoreHelpers) => getHelpers(t0).runNow()))
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(run)) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToFirstStep)) __obj.updateDynamic("scrollToFirstStep")(scrollToFirstStep.asInstanceOf[js.Any])
    if (!js.isUndefined(showProgress)) __obj.updateDynamic("showProgress")(showProgress.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkipButton)) __obj.updateDynamic("showSkipButton")(showSkipButton.asInstanceOf[js.Any])
    if (!js.isUndefined(spotlightClicks)) __obj.updateDynamic("spotlightClicks")(spotlightClicks.asInstanceOf[js.Any])
    if (spotlightPadding != null) __obj.updateDynamic("spotlightPadding")(spotlightPadding.asInstanceOf[js.Any])
    if (stepIndex != null) __obj.updateDynamic("stepIndex")(stepIndex.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tooltipComponent != null) __obj.updateDynamic("tooltipComponent")(tooltipComponent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactJoyride.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactJoyride.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactJoyride.mod.Props])(children: _*)
  }
  @JSImport("react-joyride", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

