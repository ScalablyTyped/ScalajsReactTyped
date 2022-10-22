package typingsJapgolly.heredatalens.H.datalens

import typingsJapgolly.heremaps.H.map.provider.RemoteTileProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how to access layer data (shapes, geometries) using the Data Lens REST API.
  * This provider defines the interface for accessing shape layers via the Data Lens REST API. The input data is provided as vector tiles in the MapBox format (Protobuf).
  * Data is loaded by tiles.
  */
@js.native
trait SpatialTileProvider
  extends StObject
     with RemoteTileProvider {
  
  /**
    * Updates the layer name to be used in the next call of the Data Lens REST API. Note that new data will be fetched only after the reload method is called.
    */
  def setLayerName(layerName: String): Unit = js.native
  
  /**
    * Updates the query's dynamic parameters to be used in the next call of the Data Lens REST API. Note that new data will be fetched only after the reload method is called.
    * This method is normally used when updating your visualization.
    */
  def setQueryParams(): Unit = js.native
  def setQueryParams(queryParams: Any): Unit = js.native
}
object SpatialTileProvider {
  
  /**
    * Defines layer name and data accessibility parameters for SpatialTileProvider
    * This defines the layer name and dynamic parameters required for fetching tiled geometry data with the Data Lens REST API. Other options from Provider.Options are available.
    */
  trait Options extends StObject {
    
    /** The name of the layer to fetch with the Data Lens REST API query */
    var layerName: String
    
    /** The query's dynamic parameters. The dynamic parameters can be used to filter data provided by the query. */
    var queryParams: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(layerName: String): Options = {
      val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: Any): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    }
  }
}
