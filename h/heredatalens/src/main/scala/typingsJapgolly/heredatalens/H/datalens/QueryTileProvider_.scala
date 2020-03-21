package typingsJapgolly.heredatalens.H.datalens

import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Options
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.TileParamNames
import typingsJapgolly.heremaps.H.map.provider.RemoteTileProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Providers define interfaces for layers to access data.
  * The input data can be stored locally or loaded from the network. Data can be loaded by tiles or in one chunk.
  * This provider loads tiled query data with the Data Lens REST API. Tiled queries are used to load data only for the current viewport.
  * This optimizes memory and network usage and enables progressive rendering.
  */
@JSGlobal("H.datalens.QueryTileProvider")
@js.native
class QueryTileProvider_ protected () extends RemoteTileProvider {
  /**
    * Constructor
    * @param service - Data Lens REST API service
    * @param options - Configures source query and data accessibility parameters
    */
  def this(service: Service, options: Options) = this()
  /**
    * Updates the query ID to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called.
    */
  def setQueryId(queryId: String): Unit = js.native
  def setQueryParams(): Unit = js.native
  /**
    * Updates the query's dynamic parameters to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called. This method is normally used when updating your visualization.
    */
  def setQueryParams(queryParams: js.Any): Unit = js.native
  /**
    * Updates the names of the dynamic parameters that defines tiles. This method is only needed when the query ID is updated.
    * Note that new data will be fetched only after the reload method is called.
    * @param tileParamNames - Names of the URI parameters that control the x/y/z of a tiled query
    */
  def setTileParamNames(tileParamNames: TileParamNames): Unit = js.native
}

