package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexingResource extends StObject {
  
  var datasources: DatasourcesResource
}
object IndexingResource {
  
  inline def apply(datasources: DatasourcesResource): IndexingResource = {
    val __obj = js.Dynamic.literal(datasources = datasources.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexingResource]
  }
  
  extension [Self <: IndexingResource](x: Self) {
    
    inline def setDatasources(value: DatasourcesResource): Self = StObject.set(x, "datasources", value.asInstanceOf[js.Any])
  }
}
