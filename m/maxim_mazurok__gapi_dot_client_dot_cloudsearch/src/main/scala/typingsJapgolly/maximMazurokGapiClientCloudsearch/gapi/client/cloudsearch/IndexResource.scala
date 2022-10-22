package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexResource extends StObject {
  
  var datasources: DatasourcesResource
}
object IndexResource {
  
  inline def apply(datasources: DatasourcesResource): IndexResource = {
    val __obj = js.Dynamic.literal(datasources = datasources.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexResource]
  }
  
  extension [Self <: IndexResource](x: Self) {
    
    inline def setDatasources(value: DatasourcesResource): Self = StObject.set(x, "datasources", value.asInstanceOf[js.Any])
  }
}
