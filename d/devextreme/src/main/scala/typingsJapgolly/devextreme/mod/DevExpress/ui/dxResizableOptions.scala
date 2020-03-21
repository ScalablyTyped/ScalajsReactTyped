package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonEventHeight
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.devextremeStrings.all
import typingsJapgolly.devextreme.devextremeStrings.bottom
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.top
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxResizableOptions extends DOMComponentOptions[dxResizable] {
  /** Specifies which borders of the widget element are used as a handle. */
  var handles: js.UndefOr[bottom | left | right | top | all | String] = js.undefined
  /** Specifies the upper height boundary for resizing. */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /** Specifies the upper width boundary for resizing. */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the lower height boundary for resizing. */
  var minHeight: js.UndefOr[Double] = js.undefined
  /** Specifies the lower width boundary for resizing. */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** A function that is executed each time the widget is resized by one pixel. */
  var onResize: js.UndefOr[js.Function1[/* e */ AnonEventHeight, _]] = js.undefined
  /** A function that is executed when resizing ends. */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ AnonEventHeight, _]] = js.undefined
  /** A function that is executed when resizing starts. */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ AnonEventHeight, _]] = js.undefined
}

object dxResizableOptions {
  @scala.inline
  def apply(
    bindingOptions: js.Any = null,
    elementAttr: js.Any = null,
    handles: bottom | left | right | top | all | String = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    onDisposing: /* e */ AnonModel[dxResizable] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxResizable] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxResizable] => CallbackTo[js.Any] = null,
    onResize: /* e */ AnonEventHeight => CallbackTo[js.Any] = null,
    onResizeEnd: /* e */ AnonEventHeight => CallbackTo[js.Any] = null,
    onResizeStart: /* e */ AnonEventHeight => CallbackTo[js.Any] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxResizableOptions = {
    val __obj = js.Dynamic.literal()
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxResizable]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxResizable]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxResizable]) => onOptionChanged(t0).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEventHeight) => onResize(t0).runNow()))
    if (onResizeEnd != null) __obj.updateDynamic("onResizeEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEventHeight) => onResizeEnd(t0).runNow()))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonEventHeight) => onResizeStart(t0).runNow()))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxResizableOptions]
  }
}

