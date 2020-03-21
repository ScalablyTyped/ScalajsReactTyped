package typingsJapgolly.openlayers.mod.olx.control

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.openlayers.mod.CoordinateFormatType
import typingsJapgolly.openlayers.mod.Coordinate_
import typingsJapgolly.openlayers.mod.MapEvent
import typingsJapgolly.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MousePositionOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var coordinateFormat: js.UndefOr[CoordinateFormatType] = js.undefined
  var projection: ProjectionLike
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var undefinedHTML: js.UndefOr[String] = js.undefined
}

object MousePositionOptions {
  @scala.inline
  def apply(
    className: String = null,
    coordinateFormat: /* coords */ js.UndefOr[Coordinate_] => CallbackTo[String] = null,
    projection: ProjectionLike = null,
    render: /* event */ MapEvent => CallbackTo[js.Any] = null,
    target: Element = null,
    undefinedHTML: String = null
  ): MousePositionOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (coordinateFormat != null) __obj.updateDynamic("coordinateFormat")(js.Any.fromFunction1((t0: /* coords */ js.UndefOr[typingsJapgolly.openlayers.mod.Coordinate_]) => coordinateFormat(t0).runNow()))
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.openlayers.mod.MapEvent) => render(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (undefinedHTML != null) __obj.updateDynamic("undefinedHTML")(undefinedHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[MousePositionOptions]
  }
}

