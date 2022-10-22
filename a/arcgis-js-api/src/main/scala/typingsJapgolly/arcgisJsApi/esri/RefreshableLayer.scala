package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshableLayer extends StObject {
  
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    */
  def refresh(): scala.Unit
  
  /**
    * Refresh interval of the layer in minutes.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    */
  var refreshInterval: Double
}
object RefreshableLayer {
  
  inline def apply(refresh: Callback, refreshInterval: Double): RefreshableLayer = {
    val __obj = js.Dynamic.literal(refresh = refresh.toJsFn, refreshInterval = refreshInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshableLayer]
  }
  
  extension [Self <: RefreshableLayer](x: Self) {
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
  }
}
