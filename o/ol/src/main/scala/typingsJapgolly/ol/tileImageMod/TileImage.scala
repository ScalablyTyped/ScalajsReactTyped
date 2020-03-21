package typingsJapgolly.ol.tileImageMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileImage
  extends typingsJapgolly.ol.urlTileMod.default {
  var crossOrigin: String = js.native
  var tileCacheForProjection: StringDictionary[typingsJapgolly.ol.tileCacheMod.default] = js.native
  var tileClass: typingsJapgolly.ol.imageTileMod.default = js.native
  var tileGridForProjection: StringDictionary[typingsJapgolly.ol.tilegridTileGridMod.default] = js.native
  def getGutter(): Double = js.native
  /* protected */ def getTileInternal(
    z: Double,
    x: Double,
    y: Double,
    pixelRatio: Double,
    projection: typingsJapgolly.ol.projectionMod.default
  ): typingsJapgolly.ol.olTileMod.default = js.native
  def setRenderReprojectionEdges(render: Boolean): Unit = js.native
  def setTileGridForProjection(projection: ProjectionLike, tilegrid: typingsJapgolly.ol.tilegridTileGridMod.default): Unit = js.native
}

