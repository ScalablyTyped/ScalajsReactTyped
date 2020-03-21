package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends DraggableControlProps {
  var className: js.UndefOr[String] = js.undefined
  var latitude: Double
  var longitude: Double
  var offsetLeft: js.UndefOr[Double] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    offsetLeft: Int | Double = null,
    offsetTop: Int | Double = null,
    onDrag: /* event */ DragEvent => Callback = null,
    onDragEnd: /* event */ DragEvent => Callback = null,
    onDragStart: /* event */ DragEvent => Callback = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.DragEvent) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.DragEvent) => onDragEnd(t0).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.DragEvent) => onDragStart(t0).runNow()))
    __obj.asInstanceOf[MarkerProps]
  }
}

