package typingsJapgolly.leaflet.leafletMod

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileErrorEvent extends TileEvent {
  var error: js.Error
}

object TileErrorEvent {
  @scala.inline
  def apply(
    coords: Point,
    error: js.Error,
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    tile: HTMLImageElement,
    `type`: String
  ): TileErrorEvent = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileErrorEvent]
  }
}

