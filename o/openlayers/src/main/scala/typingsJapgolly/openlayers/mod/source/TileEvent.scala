package typingsJapgolly.openlayers.mod.source

import typingsJapgolly.openlayers.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Events emitted by {@link ol.source.Tile} instances are instances of this
  * type.
  *
  * @param type Type.
  * @param tile The tile.
  */
@JSImport("openlayers", "source.TileEvent")
@js.native
class TileEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Tile} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param tile The tile.
    */
  def this(`type`: String, tile: typingsJapgolly.openlayers.mod.Tile) = this()
  /**
    * The tile related to the event.
    * @api
    */
  var tile: typingsJapgolly.openlayers.mod.Tile = js.native
}

