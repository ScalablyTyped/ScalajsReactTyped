package typingsJapgolly.reactRnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.reResizable.mod.ResizeDirection
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactDraggable.mod.DraggableEvent
import typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
import typingsJapgolly.reactRnd.AnonX
import typingsJapgolly.reactRnd.reactRndStrings.both
import typingsJapgolly.reactRnd.reactRndStrings.none
import typingsJapgolly.reactRnd.reactRndStrings.x
import typingsJapgolly.reactRnd.reactRndStrings.y
import typingsJapgolly.reactRnd.xnumberynumberSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends /* key */ StringDictionary[js.Any] {
  var bounds: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[xnumberynumberSize] = js.undefined
  var disableDragging: js.UndefOr[Boolean] = js.undefined
  var dragAxis: js.UndefOr[x | y | both | none] = js.undefined
  var dragGrid: js.UndefOr[Grid] = js.undefined
  var dragHandleClassName: js.UndefOr[String] = js.undefined
  var enableResizing: js.UndefOr[ResizeEnable] = js.undefined
  var enableUserSelectHack: js.UndefOr[Boolean] = js.undefined
  var lockAspectRatio: js.UndefOr[Boolean | Double] = js.undefined
  var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.undefined
  var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var minHeight: js.UndefOr[Double | String] = js.undefined
  var minWidth: js.UndefOr[Double | String] = js.undefined
  var onDrag: js.UndefOr[RndDragCallback] = js.undefined
  var onDragStart: js.UndefOr[RndDragCallback] = js.undefined
  var onDragStop: js.UndefOr[RndDragCallback] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onResize: js.UndefOr[RndResizeCallback] = js.undefined
  var onResizeStart: js.UndefOr[RndResizeStartCallback] = js.undefined
  var onResizeStop: js.UndefOr[RndResizeCallback] = js.undefined
  var position: js.UndefOr[AnonX] = js.undefined
  var resizeGrid: js.UndefOr[Grid] = js.undefined
  var resizeHandleClasses: js.UndefOr[HandleClasses] = js.undefined
  var resizeHandleComponent: js.UndefOr[HandleComponent] = js.undefined
  var resizeHandleStyles: js.UndefOr[HandleStyles] = js.undefined
  var resizeHandleWrapperClass: js.UndefOr[String] = js.undefined
  var resizeHandleWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    bounds: String = null,
    cancel: String = null,
    children: VdomNode = null,
    className: String = null,
    default: xnumberynumberSize = null,
    disableDragging: js.UndefOr[Boolean] = js.undefined,
    dragAxis: x | y | both | none = null,
    dragGrid: Grid = null,
    dragHandleClassName: String = null,
    enableResizing: ResizeEnable = null,
    enableUserSelectHack: js.UndefOr[Boolean] = js.undefined,
    lockAspectRatio: Boolean | Double = null,
    lockAspectRatioExtraHeight: Int | Double = null,
    lockAspectRatioExtraWidth: Int | Double = null,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    minHeight: Double | String = null,
    minWidth: Double | String = null,
    onDrag: (/* e */ DraggableEvent, /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => CallbackTo[Unit | `false`] = null,
    onDragStart: (/* e */ DraggableEvent, /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => CallbackTo[Unit | `false`] = null,
    onDragStop: (/* e */ DraggableEvent, /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => CallbackTo[Unit | `false`] = null,
    onMouseDown: /* e */ MouseEvent => Callback = null,
    onMouseUp: /* e */ MouseEvent => Callback = null,
    onResize: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Callback = null,
    onResizeStart: (/* e */ ReactMouseEventFrom[HTMLDivElement] | ReactTouchEventFrom[HTMLDivElement], /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement) => Callback = null,
    onResizeStop: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Callback = null,
    position: AnonX = null,
    resizeGrid: Grid = null,
    resizeHandleClasses: HandleClasses = null,
    resizeHandleComponent: HandleComponent = null,
    resizeHandleStyles: HandleStyles = null,
    resizeHandleWrapperClass: String = null,
    resizeHandleWrapperStyle: CSSProperties = null,
    scale: Int | Double = null,
    size: Size = null,
    style: CSSProperties = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDragging)) __obj.updateDynamic("disableDragging")(disableDragging.asInstanceOf[js.Any])
    if (dragAxis != null) __obj.updateDynamic("dragAxis")(dragAxis.asInstanceOf[js.Any])
    if (dragGrid != null) __obj.updateDynamic("dragGrid")(dragGrid.asInstanceOf[js.Any])
    if (dragHandleClassName != null) __obj.updateDynamic("dragHandleClassName")(dragHandleClassName.asInstanceOf[js.Any])
    if (enableResizing != null) __obj.updateDynamic("enableResizing")(enableResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUserSelectHack)) __obj.updateDynamic("enableUserSelectHack")(enableUserSelectHack.asInstanceOf[js.Any])
    if (lockAspectRatio != null) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.asInstanceOf[js.Any])
    if (lockAspectRatioExtraHeight != null) __obj.updateDynamic("lockAspectRatioExtraHeight")(lockAspectRatioExtraHeight.asInstanceOf[js.Any])
    if (lockAspectRatioExtraWidth != null) __obj.updateDynamic("lockAspectRatioExtraWidth")(lockAspectRatioExtraWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDrag(t0, t1).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDragStart(t0, t1).runNow()))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, t1: /* data */ typingsJapgolly.reactDraggable.mod.DraggableData) => onDragStop(t0, t1).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MouseEvent) => onMouseDown(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MouseEvent) => onMouseUp(t0).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction5((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, t1: /* dir */ typingsJapgolly.reResizable.mod.ResizeDirection, t2: /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, t3: /* delta */ typingsJapgolly.reactRnd.mod.ResizableDelta, t4: /* position */ typingsJapgolly.reactRnd.mod.Position) => onResize(t0, t1, t2, t3, t4).runNow()))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* dir */ typingsJapgolly.reResizable.mod.ResizeDirection, t2: /* elementRef */ org.scalajs.dom.raw.HTMLDivElement) => onResizeStart(t0, t1, t2).runNow()))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction5((t0: /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, t1: /* dir */ typingsJapgolly.reResizable.mod.ResizeDirection, t2: /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, t3: /* delta */ typingsJapgolly.reactRnd.mod.ResizableDelta, t4: /* position */ typingsJapgolly.reactRnd.mod.Position) => onResizeStop(t0, t1, t2, t3, t4).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (resizeGrid != null) __obj.updateDynamic("resizeGrid")(resizeGrid.asInstanceOf[js.Any])
    if (resizeHandleClasses != null) __obj.updateDynamic("resizeHandleClasses")(resizeHandleClasses.asInstanceOf[js.Any])
    if (resizeHandleComponent != null) __obj.updateDynamic("resizeHandleComponent")(resizeHandleComponent.asInstanceOf[js.Any])
    if (resizeHandleStyles != null) __obj.updateDynamic("resizeHandleStyles")(resizeHandleStyles.asInstanceOf[js.Any])
    if (resizeHandleWrapperClass != null) __obj.updateDynamic("resizeHandleWrapperClass")(resizeHandleWrapperClass.asInstanceOf[js.Any])
    if (resizeHandleWrapperStyle != null) __obj.updateDynamic("resizeHandleWrapperStyle")(resizeHandleWrapperStyle.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

