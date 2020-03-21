package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.ProjectionLike
import typingsJapgolly.openlayers.mod.Tile
import typingsJapgolly.openlayers.mod.TileCoord
import typingsJapgolly.openlayers.mod.TileLoadFunctionType
import typingsJapgolly.openlayers.mod.TileUrlFunctionType
import typingsJapgolly.openlayers.mod.VectorTile
import typingsJapgolly.openlayers.mod.format.Feature
import typingsJapgolly.openlayers.mod.olx.LogoOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import typingsJapgolly.openlayers.mod.source.State
import typingsJapgolly.openlayers.mod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[Feature] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var overlaps: js.UndefOr[Boolean] = js.undefined
  var projection: ProjectionLike
  var state: js.UndefOr[State] = js.undefined
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ VectorTile, 
      /* coords */ TileCoord, 
      /* state */ typingsJapgolly.openlayers.mod.Tile.State, 
      /* s */ String, 
      /* feature */ Feature, 
      /* type */ TileLoadFunctionType, 
      _
    ]
  ] = js.undefined
  var tileGrid: js.UndefOr[TileGrid] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var tileUrlFunction: js.UndefOr[TileUrlFunctionType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object VectorTileOptions {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    format: Feature = null,
    logo: String | LogoOptions = null,
    overlaps: js.UndefOr[Boolean] = js.undefined,
    projection: ProjectionLike = null,
    state: State = null,
    tileClass: (/* n */ VectorTile, /* coords */ TileCoord, /* state */ typingsJapgolly.openlayers.mod.Tile.State, /* s */ String, /* feature */ Feature, /* type */ TileLoadFunctionType) => CallbackTo[js.Any] = null,
    tileGrid: TileGrid = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Callback = null,
    tileUrlFunction: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => CallbackTo[String] = null,
    url: String = null,
    urls: js.Array[String] = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): VectorTileOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(overlaps)) __obj.updateDynamic("overlaps")(overlaps.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tileClass != null) __obj.updateDynamic("tileClass")(js.Any.fromFunction6((t0: /* n */ typingsJapgolly.openlayers.mod.VectorTile, t1: /* coords */ typingsJapgolly.openlayers.mod.TileCoord, t2: /* state */ typingsJapgolly.openlayers.mod.Tile.State, t3: /* s */ java.lang.String, t4: /* feature */ typingsJapgolly.openlayers.mod.format.Feature, t5: /* type */ typingsJapgolly.openlayers.mod.TileLoadFunctionType) => tileClass(t0, t1, t2, t3, t4, t5).runNow()))
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2((t0: /* tile */ typingsJapgolly.openlayers.mod.Tile, t1: /* url */ java.lang.String) => tileLoadFunction(t0, t1).runNow()))
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(js.Any.fromFunction3((t0: /* coords */ typingsJapgolly.openlayers.mod.TileCoord, t1: /* pixelRatio */ scala.Double, t2: /* proj */ typingsJapgolly.openlayers.mod.proj.Projection) => tileUrlFunction(t0, t1, t2).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileOptions]
  }
}

