package typingsJapgolly.openlayers.mod.source

import typingsJapgolly.openlayers.mod.olx.source.VectorTileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Class for layer sources providing vector data divided into a tile grid, to be
  * used with {@link ol.layer.VectorTile}. Although this source receives tiles
  * with vector features from the server, it is not meant for feature editing.
  * Features are optimized for rendering, their geometries are clipped at or near
  * tile boundaries and simplified for a view resolution. See
  * {@link ol.source.Vector} for vector sources that are suitable for feature
  * editing.
  *
  * @fires ol.source.TileEvent
  * @param options Vector tile options.
  * @api
  */
@JSImport("openlayers", "source.VectorTile")
@js.native
open class VectorTile protected () extends UrlTile {
  /**
    * @classdesc
    * Class for layer sources providing vector data divided into a tile grid, to be
    * used with {@link ol.layer.VectorTile}. Although this source receives tiles
    * with vector features from the server, it is not meant for feature editing.
    * Features are optimized for rendering, their geometries are clipped at or near
    * tile boundaries and simplified for a view resolution. See
    * {@link ol.source.Vector} for vector sources that are suitable for feature
    * editing.
    *
    * @fires ol.source.TileEvent
    * @param options Vector tile options.
    * @api
    */
  def this(options: VectorTileOptions) = this()
}
