package typingsJapgolly.reactAvatarEditor.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.File
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarEditorProps extends js.Object {
  var border: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[js.Array[Double]] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var disableBoundaryChecks: js.UndefOr[Boolean] = js.undefined
  var disableDrop: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var image: String | File
  var onDropFile: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onImageChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onImageReady: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onLoadFailure: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onLoadSuccess: js.UndefOr[js.Function1[/* imgInfo */ ImageState, Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPositionChange: js.UndefOr[js.Function1[/* position */ Position, Unit]] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AvatarEditorProps {
  @scala.inline
  def apply(
    image: String | File,
    border: Double | js.Array[Double] = null,
    borderRadius: Int | Double = null,
    className: String = null,
    color: js.Array[Double] = null,
    crossOrigin: String = null,
    disableBoundaryChecks: js.UndefOr[Boolean] = js.undefined,
    disableDrop: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onDropFile: /* event */ DragEvent => Callback = null,
    onImageChange: js.UndefOr[Callback] = js.undefined,
    onImageReady: /* event */ Event_ => Callback = null,
    onLoadFailure: /* event */ Event_ => Callback = null,
    onLoadSuccess: /* imgInfo */ ImageState => Callback = null,
    onMouseMove: /* event */ Event_ => Callback = null,
    onMouseUp: js.UndefOr[Callback] = js.undefined,
    onPositionChange: /* position */ Position => Callback = null,
    position: Position = null,
    rotate: Int | Double = null,
    scale: Int | Double = null,
    style: js.Object = null,
    width: Int | Double = null
  ): AvatarEditorProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disableBoundaryChecks)) __obj.updateDynamic("disableBoundaryChecks")(disableBoundaryChecks.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDrop)) __obj.updateDynamic("disableDrop")(disableDrop.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDropFile != null) __obj.updateDynamic("onDropFile")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDropFile(t0).runNow()))
    onImageChange.foreach(p => __obj.updateDynamic("onImageChange")(p.toJsFn))
    if (onImageReady != null) __obj.updateDynamic("onImageReady")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onImageReady(t0).runNow()))
    if (onLoadFailure != null) __obj.updateDynamic("onLoadFailure")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onLoadFailure(t0).runNow()))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1((t0: /* imgInfo */ typingsJapgolly.reactAvatarEditor.mod.ImageState) => onLoadSuccess(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onMouseMove(t0).runNow()))
    onMouseUp.foreach(p => __obj.updateDynamic("onMouseUp")(p.toJsFn))
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(js.Any.fromFunction1((t0: /* position */ typingsJapgolly.reactAvatarEditor.mod.Position) => onPositionChange(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarEditorProps]
  }
}

