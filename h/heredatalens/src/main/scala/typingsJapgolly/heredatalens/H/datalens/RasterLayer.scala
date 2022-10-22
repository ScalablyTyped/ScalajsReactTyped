package typingsJapgolly.heredatalens.H.datalens

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsJapgolly.heredatalens.H.datalens.Service.Data
import typingsJapgolly.heremaps.H.map.layer.TileLayer
import typingsJapgolly.heremaps.H.map.provider.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides pixel-wise rendering of data.
  * Layer used when you need to visualize more than 10k points. The layer requires source data to be located in pixel coordinates.
  * The rendering is implemented by drawing directly on a canvas.  The layer is often used together with a Data Lens query which groups rows by pixels.
  * This reduces the amount of data delivered to the client.
  */
@js.native
trait RasterLayer
  extends StObject
     with TileLayer {
  
  /**
    * This method cancels a previously requested tile.
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - zoom level
    */
  /* InferMemberOverrides */
  override def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
  
  /**
    * Force re-rendering of the layer.
    * In the case where the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): Unit = js.native
  
  /**
    * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - The zoom level for which the tile is requested
    * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
    * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
    */
  /* InferMemberOverrides */
  override def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit = js.native
}
object RasterLayer {
  
  /**
    * Defines data processing and rendering options for RasterLayer.
    * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
    * By default this step is processed with RasterLayer.defaultDataToRows.
    * This behavior can be changed by defining the dataToRows callback.
    * To collect the rows for a tile including buffer, the rows must be translated to RasterLayer.TilePoint.
    * This translation must be specified with the rowToTilePoint callback. The final rendering on the tile canvas must be defined in renderTile.
    */
  trait Options extends StObject {
    
    /**
      * The buffer is a value (in pixels) that defines an extra area around each tile to capture data points from.
      * This is done to avoid drawing edges between tiles. For example, if data points represented with circles with a maximum radius of 10 pixels, then the buffer must be 10 pixels.
      */
    var buffer: js.UndefOr[js.Function1[/* zoom */ Zoom, Double]] = js.undefined
    
    /** Defines how the input tile data is split by rows. You can specify this callback to define client-side aggregation and filtering. This callback is called for each tile. */
    var dataToRows: js.UndefOr[
        js.Function4[
          /* data */ Data, 
          /* x */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.X, 
          /* y */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Y, 
          /* zoom */ Zoom, 
          js.Array[Row]
        ]
      ] = js.undefined
    
    /**
      * Defines how tile data is represented on a canvas. Input points for each tile are collected with respect to the buffer.
      * For progressive rendering this callback may be called more than once for the tile.
      */
    var renderTile: js.UndefOr[
        js.Function3[
          /* points */ js.Array[TilePoint], 
          /* canvas */ HTMLCanvasElement, 
          /* zoom */ Zoom, 
          Unit
        ]
      ] = js.undefined
    
    /** Defines how the row is translated to the RasterLayer.TilePoint. This callback is called for each row that is returned from dataToRows. */
    var rowToTilePoint: js.UndefOr[js.Function3[/* row */ Row, /* x */ X, /* y */ Y, TilePoint]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBuffer(value: /* zoom */ Zoom => Double): Self = StObject.set(x, "buffer", js.Any.fromFunction1(value))
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setDataToRows(
        value: (/* data */ Data, /* x */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.X, /* y */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Y, /* zoom */ Zoom) => js.Array[Row]
      ): Self = StObject.set(x, "dataToRows", js.Any.fromFunction4(value))
      
      inline def setDataToRowsUndefined: Self = StObject.set(x, "dataToRows", js.undefined)
      
      inline def setRenderTile(
        value: (/* points */ js.Array[TilePoint], /* canvas */ HTMLCanvasElement, /* zoom */ Zoom) => Callback
      ): Self = StObject.set(x, "renderTile", js.Any.fromFunction3((t0: /* points */ js.Array[TilePoint], t1: /* canvas */ HTMLCanvasElement, t2: /* zoom */ Zoom) => (value(t0, t1, t2)).runNow()))
      
      inline def setRenderTileUndefined: Self = StObject.set(x, "renderTile", js.undefined)
      
      inline def setRowToTilePoint(value: (/* row */ Row, /* x */ X, /* y */ Y) => TilePoint): Self = StObject.set(x, "rowToTilePoint", js.Any.fromFunction3(value))
      
      inline def setRowToTilePointUndefined: Self = StObject.set(x, "rowToTilePoint", js.undefined)
    }
  }
  
  /**
    * Slice of data (eg Data Lens query data row) that represents a data point.
    * Each row is transformed into TilePoint and passed to renderTile callback. By default each row is an Object where property names correspond to data column names.
    * This representation can be changed with the dataToRows callback.
    */
  type Row = Double
  
  /**
    * Defines the input data format for heat map rendering.
    * To collect data rows for each tile with respect to the buffer, each row must be represented as a point within the map tile.
    */
  trait TilePoint extends StObject {
    
    /** Reference to source data row */
    var data: js.UndefOr[Row] = js.undefined
    
    /** Row relative to tile */
    var x: Double
    
    /** Column relative to tile */
    var y: Double
  }
  object TilePoint {
    
    inline def apply(x: Double, y: Double): TilePoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TilePoint]
    }
    
    extension [Self <: TilePoint](x: Self) {
      
      inline def setData(value: Row): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Tile X coordinate (column)
    * Coordinate in XYZ tile numbering scheme.
    */
  type X = Double
  
  /**
    * Tile Y coordinate (row)
    * Coordinate in XYZ tile numbering scheme.
    */
  type Y = Double
}
