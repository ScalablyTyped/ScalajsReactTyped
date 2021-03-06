package typingsJapgolly.kineticjs.Kinetic

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  var animation: js.UndefOr[js.Any] = js.undefined
  var animations: js.UndefOr[js.Any] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var image: js.Any
}

object SpriteConfig {
  @scala.inline
  def apply(
    image: js.Any,
    animation: js.Any = null,
    animations: js.Any = null,
    dragBoundFunc: /* pos */ Vector2d => CallbackTo[Vector2d] = null,
    dragBounds: js.Any = null,
    dragConstraint: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    frameRate: Int | Double = null,
    height: Int | Double = null,
    id: String = null,
    lineJoin: String = null,
    listening: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    rotation: Int | Double = null,
    rotationDeg: Int | Double = null,
    scale: Vector2d = null,
    shadow: js.Any = null,
    stroke: String = null,
    strokeWidth: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): SpriteConfig = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animations != null) __obj.updateDynamic("animations")(animations.asInstanceOf[js.Any])
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(js.Any.fromFunction1((t0: /* pos */ typingsJapgolly.kineticjs.Kinetic.Vector2d) => dragBoundFunc(t0).runNow()))
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds.asInstanceOf[js.Any])
    if (dragConstraint != null) __obj.updateDynamic("dragConstraint")(dragConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(listening)) __obj.updateDynamic("listening")(listening.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationDeg != null) __obj.updateDynamic("rotationDeg")(rotationDeg.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteConfig]
  }
}

