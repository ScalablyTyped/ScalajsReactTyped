package typingsJapgolly.heredatalens.H.datalens.RasterLayer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsJapgolly.heredatalens.H.datalens.Service.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines data processing and rendering options for RasterLayer.
  * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with RasterLayer.defaultDataToRows.
  * This behavior can be changed by defining the dataToRows callback.
  * To collect the rows for a tile including buffer, the rows must be translated to RasterLayer.TilePoint.
  * This translation must be specified with the rowToTilePoint callback. The final rendering on the tile canvas must be defined in renderTile.
  */
trait Options extends js.Object {
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
  @scala.inline
  def apply(
    buffer: /* zoom */ Zoom => CallbackTo[Double] = null,
    dataToRows: (/* data */ Data, /* x */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.X, /* y */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Y, /* zoom */ Zoom) => CallbackTo[js.Array[Row]] = null,
    renderTile: (/* points */ js.Array[TilePoint], /* canvas */ HTMLCanvasElement, /* zoom */ Zoom) => Callback = null,
    rowToTilePoint: (/* row */ Row, /* x */ X, /* y */ Y) => CallbackTo[TilePoint] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(js.Any.fromFunction1((t0: /* zoom */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom) => buffer(t0).runNow()))
    if (dataToRows != null) __obj.updateDynamic("dataToRows")(js.Any.fromFunction4((t0: /* data */ typingsJapgolly.heredatalens.H.datalens.Service.Data, t1: /* x */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.X, t2: /* y */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Y, t3: /* zoom */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom) => dataToRows(t0, t1, t2, t3).runNow()))
    if (renderTile != null) __obj.updateDynamic("renderTile")(js.Any.fromFunction3((t0: /* points */ js.Array[typingsJapgolly.heredatalens.H.datalens.RasterLayer.TilePoint], t1: /* canvas */ org.scalajs.dom.raw.HTMLCanvasElement, t2: /* zoom */ typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom) => renderTile(t0, t1, t2).runNow()))
    if (rowToTilePoint != null) __obj.updateDynamic("rowToTilePoint")(js.Any.fromFunction3((t0: /* row */ typingsJapgolly.heredatalens.H.datalens.RasterLayer.Row, t1: /* x */ typingsJapgolly.heredatalens.H.datalens.RasterLayer.X, t2: /* y */ typingsJapgolly.heredatalens.H.datalens.RasterLayer.Y) => rowToTilePoint(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options]
  }
}

