package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilegridTileGridMod {
  
  @JSImport("ol/tilegrid/TileGrid", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TileGrid {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[Coordinate] = js.undefined
    
    var origins: js.UndefOr[js.Array[Coordinate]] = js.undefined
    
    var resolutions: js.Array[Double]
    
    var sizes: js.UndefOr[js.Array[Size]] = js.undefined
    
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    var tileSizes: js.UndefOr[js.Array[Size]] = js.undefined
  }
  object Options {
    
    inline def apply(resolutions: js.Array[Double]): Options = {
      val __obj = js.Dynamic.literal(resolutions = resolutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setOrigin(value: Coordinate): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value*))
      
      inline def setOrigins(value: js.Array[Coordinate]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: Coordinate*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setSizes(value: js.Array[Size]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(value: Size*): Self = StObject.set(x, "sizes", js.Array(value*))
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTileSizes(value: js.Array[Size]): Self = StObject.set(x, "tileSizes", value.asInstanceOf[js.Any])
      
      inline def setTileSizesUndefined: Self = StObject.set(x, "tileSizes", js.undefined)
      
      inline def setTileSizesVarargs(value: Size*): Self = StObject.set(x, "tileSizes", js.Array(value*))
    }
  }
  
  @js.native
  trait TileGrid extends StObject {
    
    /**
      * Call a function with each tile coordinate for a given extent and zoom level.
      */
    def forEachTileCoord(extent: Extent, zoom: Double, callback: js.Function1[/* p0 */ TileCoord, Unit]): Unit = js.native
    
    def forEachTileCoordParentTileRange(
      tileCoord: TileCoord,
      callback: js.Function2[/* p0 */ Double, /* p1 */ typingsJapgolly.ol.tileRangeMod.default, Boolean]
    ): Boolean = js.native
    def forEachTileCoordParentTileRange(
      tileCoord: TileCoord,
      callback: js.Function2[/* p0 */ Double, /* p1 */ typingsJapgolly.ol.tileRangeMod.default, Boolean],
      opt_tileRange: Unit,
      opt_extent: Extent
    ): Boolean = js.native
    def forEachTileCoordParentTileRange(
      tileCoord: TileCoord,
      callback: js.Function2[/* p0 */ Double, /* p1 */ typingsJapgolly.ol.tileRangeMod.default, Boolean],
      opt_tileRange: typingsJapgolly.ol.tileRangeMod.default
    ): Boolean = js.native
    def forEachTileCoordParentTileRange(
      tileCoord: TileCoord,
      callback: js.Function2[/* p0 */ Double, /* p1 */ typingsJapgolly.ol.tileRangeMod.default, Boolean],
      opt_tileRange: typingsJapgolly.ol.tileRangeMod.default,
      opt_extent: Extent
    ): Boolean = js.native
    
    /**
      * Get the extent for this tile grid, if it was configured.
      */
    def getExtent(): Extent = js.native
    
    def getFullTileRange(z: Double): typingsJapgolly.ol.tileRangeMod.default = js.native
    
    /**
      * Get the maximum zoom level for the grid.
      */
    def getMaxZoom(): Double = js.native
    
    /**
      * Get the minimum zoom level for the grid.
      */
    def getMinZoom(): Double = js.native
    
    /**
      * Get the origin for the grid at the given zoom level.
      */
    def getOrigin(z: Double): Coordinate = js.native
    
    /**
      * Get the resolution for the given zoom level.
      */
    def getResolution(z: Double): Double = js.native
    
    /**
      * Get the list of resolutions for the tile grid.
      */
    def getResolutions(): js.Array[Double] = js.native
    
    def getTileCoordCenter(tileCoord: TileCoord): Coordinate = js.native
    
    def getTileCoordChildTileRange(tileCoord: TileCoord): typingsJapgolly.ol.tileRangeMod.default = js.native
    def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: Unit, opt_extent: Extent): typingsJapgolly.ol.tileRangeMod.default = js.native
    def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: typingsJapgolly.ol.tileRangeMod.default): typingsJapgolly.ol.tileRangeMod.default = js.native
    def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: typingsJapgolly.ol.tileRangeMod.default, opt_extent: Extent): typingsJapgolly.ol.tileRangeMod.default = js.native
    
    /**
      * Get the extent of a tile coordinate.
      */
    def getTileCoordExtent(tileCoord: TileCoord): Extent = js.native
    def getTileCoordExtent(tileCoord: TileCoord, opt_extent: Extent): Extent = js.native
    
    /**
      * Get the tile coordinate for the given map coordinate and resolution.  This
      * method considers that coordinates that intersect tile boundaries should be
      * assigned the higher tile coordinate.
      */
    def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double): TileCoord = js.native
    def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double, opt_tileCoord: TileCoord): TileCoord = js.native
    
    /**
      * Get a tile coordinate given a map coordinate and zoom level.
      */
    def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double): TileCoord = js.native
    def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double, opt_tileCoord: TileCoord): TileCoord = js.native
    
    def getTileCoordResolution(tileCoord: TileCoord): Double = js.native
    
    /**
      * Get the extent for a tile range.
      */
    def getTileRangeExtent(z: Double, tileRange: typingsJapgolly.ol.tileRangeMod.default): Extent = js.native
    def getTileRangeExtent(z: Double, tileRange: typingsJapgolly.ol.tileRangeMod.default, opt_extent: Extent): Extent = js.native
    
    /**
      * Get a tile range for the given extent and integer zoom level.
      */
    def getTileRangeForExtentAndZ(extent: Extent, z: Double): typingsJapgolly.ol.tileRangeMod.default = js.native
    def getTileRangeForExtentAndZ(extent: Extent, z: Double, opt_tileRange: typingsJapgolly.ol.tileRangeMod.default): typingsJapgolly.ol.tileRangeMod.default = js.native
    
    /**
      * Get the tile size for a zoom level. The type of the return value matches the
      * tileSize or tileSizes that the tile grid was configured with. To always
      * get an module:ol/size~Size, run the result through module:ol/size~Size.toSize().
      */
    def getTileSize(z: Double): Double | Size = js.native
    
    def getZForResolution(resolution: Double): Double = js.native
    def getZForResolution(resolution: Double, opt_direction: Double): Double = js.native
    
    /* protected */ var maxZoom: Double = js.native
    
    /* protected */ var minZoom: Double = js.native
  }
}
