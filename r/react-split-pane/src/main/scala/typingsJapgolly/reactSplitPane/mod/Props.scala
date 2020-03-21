package typingsJapgolly.reactSplitPane.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.first
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.horizontal
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.second
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var allowResize: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultSize: js.UndefOr[Size] = js.undefined
  var maxSize: js.UndefOr[Size] = js.undefined
  var minSize: js.UndefOr[Size] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.undefined
  var onDragFinished: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.undefined
  var onDragStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onResizerClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var onResizerDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var pane1Style: js.UndefOr[CSSProperties] = js.undefined
  var pane2Style: js.UndefOr[CSSProperties] = js.undefined
  var paneStyle: js.UndefOr[CSSProperties] = js.undefined
  var primary: js.UndefOr[first | second] = js.undefined
  var resizerClassName: js.UndefOr[String] = js.undefined
  var resizerStyle: js.UndefOr[CSSProperties] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var split: js.UndefOr[vertical | horizontal] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    allowResize: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultSize: Size = null,
    maxSize: Size = null,
    minSize: Size = null,
    onChange: /* newSize */ Double => Callback = null,
    onDragFinished: /* newSize */ Double => Callback = null,
    onDragStarted: js.UndefOr[Callback] = js.undefined,
    onResizerClick: /* event */ MouseEvent => Callback = null,
    onResizerDoubleClick: /* event */ MouseEvent => Callback = null,
    pane1Style: CSSProperties = null,
    pane2Style: CSSProperties = null,
    paneStyle: CSSProperties = null,
    primary: first | second = null,
    resizerClassName: String = null,
    resizerStyle: CSSProperties = null,
    size: Size = null,
    split: vertical | horizontal = null,
    step: Int | Double = null,
    style: CSSProperties = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowResize)) __obj.updateDynamic("allowResize")(allowResize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* newSize */ scala.Double) => onChange(t0).runNow()))
    if (onDragFinished != null) __obj.updateDynamic("onDragFinished")(js.Any.fromFunction1((t0: /* newSize */ scala.Double) => onDragFinished(t0).runNow()))
    onDragStarted.foreach(p => __obj.updateDynamic("onDragStarted")(p.toJsFn))
    if (onResizerClick != null) __obj.updateDynamic("onResizerClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onResizerClick(t0).runNow()))
    if (onResizerDoubleClick != null) __obj.updateDynamic("onResizerDoubleClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onResizerDoubleClick(t0).runNow()))
    if (pane1Style != null) __obj.updateDynamic("pane1Style")(pane1Style.asInstanceOf[js.Any])
    if (pane2Style != null) __obj.updateDynamic("pane2Style")(pane2Style.asInstanceOf[js.Any])
    if (paneStyle != null) __obj.updateDynamic("paneStyle")(paneStyle.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (resizerClassName != null) __obj.updateDynamic("resizerClassName")(resizerClassName.asInstanceOf[js.Any])
    if (resizerStyle != null) __obj.updateDynamic("resizerStyle")(resizerStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

