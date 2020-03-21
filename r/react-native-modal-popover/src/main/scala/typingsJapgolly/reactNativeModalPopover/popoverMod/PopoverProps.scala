package typingsJapgolly.reactNativeModalPopover.popoverMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Rect
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Size
import typingsJapgolly.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends js.Object {
  var arrowSize: js.UndefOr[Size] = js.undefined
  var arrowStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var backgroundStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var displayArea: js.UndefOr[Rect] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.undefined
  var fromRect: Rect
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placement: js.UndefOr[Placement | auto] = js.undefined
  var popoverStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    fromRect: Rect,
    arrowSize: Size = null,
    arrowStyle: StyleProp[ViewStyle] = null,
    backgroundStyle: StyleProp[ViewStyle] = null,
    contentStyle: StyleProp[ViewStyle] = null,
    displayArea: Rect = null,
    duration: Int | Double = null,
    easing: /* show */ Boolean => CallbackTo[js.Function1[/* value */ Double, Double]] = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    placement: Placement | auto = null,
    popoverStyle: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PopoverProps = {
    val __obj = js.Dynamic.literal(fromRect = fromRect.asInstanceOf[js.Any])
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (backgroundStyle != null) __obj.updateDynamic("backgroundStyle")(backgroundStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (displayArea != null) __obj.updateDynamic("displayArea")(displayArea.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1((t0: /* show */ scala.Boolean) => easing(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popoverStyle != null) __obj.updateDynamic("popoverStyle")(popoverStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

