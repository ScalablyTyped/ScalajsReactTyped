package typingsJapgolly.reResizable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.reResizable.AnonX
import typingsJapgolly.reResizable.reResizableStrings.parent
import typingsJapgolly.reResizable.reResizableStrings.window
import typingsJapgolly.reResizable.resizerMod.Direction
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableProps extends js.Object {
  var bounds: js.UndefOr[parent | window | HTMLElement] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultSize: js.UndefOr[Size] = js.undefined
  var enable: js.UndefOr[Enable] = js.undefined
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var handleClasses: js.UndefOr[HandleClassName] = js.undefined
  var handleComponent: js.UndefOr[HandleComponent] = js.undefined
  var handleStyles: js.UndefOr[HandleStyles] = js.undefined
  var handleWrapperClass: js.UndefOr[String] = js.undefined
  var handleWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  var lockAspectRatio: js.UndefOr[Boolean | Double] = js.undefined
  var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.undefined
  var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[String | Double] = js.undefined
  var maxWidth: js.UndefOr[String | Double] = js.undefined
  var minHeight: js.UndefOr[String | Double] = js.undefined
  var minWidth: js.UndefOr[String | Double] = js.undefined
  var onResize: js.UndefOr[ResizeCallback] = js.undefined
  var onResizeStart: js.UndefOr[ResizeStartCallback] = js.undefined
  var onResizeStop: js.UndefOr[ResizeCallback] = js.undefined
  var resizeRatio: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var snap: js.UndefOr[AnonX] = js.undefined
  var snapGap: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ResizableProps {
  @scala.inline
  def apply(
    bounds: parent | window | HTMLElement = null,
    children: VdomNode = null,
    className: String = null,
    defaultSize: Size = null,
    enable: Enable = null,
    grid: js.Tuple2[Double, Double] = null,
    handleClasses: HandleClassName = null,
    handleComponent: HandleComponent = null,
    handleStyles: HandleStyles = null,
    handleWrapperClass: String = null,
    handleWrapperStyle: CSSProperties = null,
    lockAspectRatio: Boolean | Double = null,
    lockAspectRatioExtraHeight: Int | Double = null,
    lockAspectRatioExtraWidth: Int | Double = null,
    maxHeight: String | Double = null,
    maxWidth: String | Double = null,
    minHeight: String | Double = null,
    minWidth: String | Double = null,
    onResize: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Callback = null,
    onResizeStart: (/* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], /* dir */ Direction, /* elementRef */ HTMLDivElement) => CallbackTo[Unit | Boolean] = null,
    onResizeStop: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Callback = null,
    resizeRatio: Int | Double = null,
    scale: Int | Double = null,
    size: Size = null,
    snap: AnonX = null,
    snapGap: Int | Double = null,
    style: CSSProperties = null
  ): ResizableProps = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handleClasses != null) __obj.updateDynamic("handleClasses")(handleClasses.asInstanceOf[js.Any])
    if (handleComponent != null) __obj.updateDynamic("handleComponent")(handleComponent.asInstanceOf[js.Any])
    if (handleStyles != null) __obj.updateDynamic("handleStyles")(handleStyles.asInstanceOf[js.Any])
    if (handleWrapperClass != null) __obj.updateDynamic("handleWrapperClass")(handleWrapperClass.asInstanceOf[js.Any])
    if (handleWrapperStyle != null) __obj.updateDynamic("handleWrapperStyle")(handleWrapperStyle.asInstanceOf[js.Any])
    if (lockAspectRatio != null) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.asInstanceOf[js.Any])
    if (lockAspectRatioExtraHeight != null) __obj.updateDynamic("lockAspectRatioExtraHeight")(lockAspectRatioExtraHeight.asInstanceOf[js.Any])
    if (lockAspectRatioExtraWidth != null) __obj.updateDynamic("lockAspectRatioExtraWidth")(lockAspectRatioExtraWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction4((t0: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, t1: /* direction */ typingsJapgolly.reResizable.resizerMod.Direction, t2: /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, t3: /* delta */ typingsJapgolly.reResizable.mod.NumberSize) => onResize(t0, t1, t2, t3).runNow()))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* dir */ typingsJapgolly.reResizable.resizerMod.Direction, t2: /* elementRef */ org.scalajs.dom.raw.HTMLDivElement) => onResizeStart(t0, t1, t2).runNow()))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction4((t0: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, t1: /* direction */ typingsJapgolly.reResizable.resizerMod.Direction, t2: /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, t3: /* delta */ typingsJapgolly.reResizable.mod.NumberSize) => onResizeStop(t0, t1, t2, t3).runNow()))
    if (resizeRatio != null) __obj.updateDynamic("resizeRatio")(resizeRatio.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (snapGap != null) __obj.updateDynamic("snapGap")(snapGap.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizableProps]
  }
}

