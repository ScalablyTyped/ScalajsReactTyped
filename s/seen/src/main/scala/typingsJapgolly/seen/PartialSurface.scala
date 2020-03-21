package typingsJapgolly.seen

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.seen.mod.Color
import typingsJapgolly.seen.mod.Material
import typingsJapgolly.seen.mod.Painter
import typingsJapgolly.seen.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<seen.seen.Surface> */
trait PartialSurface extends js.Object {
  var constructor: js.UndefOr[
    js.Function2[/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter], js.Any]
  ] = js.undefined
  var cullBackfaces: js.UndefOr[Boolean] = js.undefined
  var dirty: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[js.Function1[/* fill */ String | Color, this.type]] = js.undefined
  var fillMaterial: js.UndefOr[Material] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var painter: js.UndefOr[Painter] = js.undefined
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  var stroke: js.UndefOr[js.Function1[/* stroke */ String | Color, this.type]] = js.undefined
  var strokeMaterial: js.UndefOr[Material] = js.undefined
}

object PartialSurface {
  @scala.inline
  def apply(
    constructor: (/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter]) => CallbackTo[js.Any] = null,
    cullBackfaces: js.UndefOr[Boolean] = js.undefined,
    dirty: js.UndefOr[Boolean] = js.undefined,
    fill: /* fill */ String | Color => CallbackTo[PartialSurface] = null,
    fillMaterial: Material = null,
    id: String = null,
    painter: Painter = null,
    points: js.Array[Point] = null,
    stroke: /* stroke */ String | Color => CallbackTo[PartialSurface] = null,
    strokeMaterial: Material = null
  ): PartialSurface = {
    val __obj = js.Dynamic.literal()
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction2((t0: /* points */ js.Array[typingsJapgolly.seen.mod.Point], t1: /* painter */ js.UndefOr[typingsJapgolly.seen.mod.Painter]) => constructor(t0, t1).runNow()))
    if (!js.isUndefined(cullBackfaces)) __obj.updateDynamic("cullBackfaces")(cullBackfaces.asInstanceOf[js.Any])
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(js.Any.fromFunction1((t0: /* fill */ java.lang.String | typingsJapgolly.seen.mod.Color) => fill(t0).runNow()))
    if (fillMaterial != null) __obj.updateDynamic("fillMaterial")(fillMaterial.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (painter != null) __obj.updateDynamic("painter")(painter.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(js.Any.fromFunction1((t0: /* stroke */ java.lang.String | typingsJapgolly.seen.mod.Color) => stroke(t0).runNow()))
    if (strokeMaterial != null) __obj.updateDynamic("strokeMaterial")(strokeMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSurface]
  }
}

