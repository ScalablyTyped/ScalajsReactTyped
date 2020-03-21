package typingsJapgolly.ol.mousePositionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.coordinateMod.CoordinateFormat
import typingsJapgolly.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var coordinateFormat: js.UndefOr[CoordinateFormat] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typingsJapgolly.ol.mapEventMod.default, Unit]] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var undefinedHTML: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    coordinateFormat: /* p0 */ js.UndefOr[Coordinate] => CallbackTo[String] = null,
    projection: ProjectionLike = null,
    render: /* p0 */ typingsJapgolly.ol.mapEventMod.default => Callback = null,
    target: HTMLElement | String = null,
    undefinedHTML: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (coordinateFormat != null) __obj.updateDynamic("coordinateFormat")(js.Any.fromFunction1((t0: /* p0 */ js.UndefOr[typingsJapgolly.ol.coordinateMod.Coordinate]) => coordinateFormat(t0).runNow()))
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapEventMod.default) => render(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (undefinedHTML != null) __obj.updateDynamic("undefinedHTML")(undefinedHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

