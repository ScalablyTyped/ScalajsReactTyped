package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import typingsJapgolly.openlayers.mod.Attribution
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorTileOptions extends StObject {
  
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
      Any
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
  
  inline def apply(): VectorTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorTileOptions]
  }
  
  extension [Self <: VectorTileOptions](x: Self) {
    
    inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    inline def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value*))
    
    inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
    
    inline def setFormat(value: Feature): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setOverlaps(value: Boolean): Self = StObject.set(x, "overlaps", value.asInstanceOf[js.Any])
    
    inline def setOverlapsUndefined: Self = StObject.set(x, "overlaps", js.undefined)
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTileClass(
      value: (/* n */ VectorTile, /* coords */ TileCoord, /* state */ typingsJapgolly.openlayers.mod.Tile.State, /* s */ String, /* feature */ Feature, /* type */ TileLoadFunctionType) => Any
    ): Self = StObject.set(x, "tileClass", js.Any.fromFunction6(value))
    
    inline def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
    
    inline def setTileGrid(value: TileGrid): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
    
    inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
    
    inline def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Callback): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2((t0: /* tile */ Tile, t1: /* url */ String) => (value(t0, t1)).runNow()))
    
    inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
    
    inline def setTileUrlFunction(value: (/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection) => String): Self = StObject.set(x, "tileUrlFunction", js.Any.fromFunction3(value))
    
    inline def setTileUrlFunctionUndefined: Self = StObject.set(x, "tileUrlFunction", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
