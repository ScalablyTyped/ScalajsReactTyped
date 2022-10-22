package typingsJapgolly.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1DataplexExternalTable extends StObject {
  
  /** Name of the Data Catalog entry representing the external table. */
  var dataCatalogEntry: js.UndefOr[String] = js.undefined
  
  /** Fully qualified name (FQN) of the external table. */
  var fullyQualifiedName: js.UndefOr[String] = js.undefined
  
  /** Google Cloud resource name of the external table. */
  var googleCloudResource: js.UndefOr[String] = js.undefined
  
  /** Service in which the external table is registered. */
  var system: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1DataplexExternalTable {
  
  inline def apply(): GoogleCloudDatacatalogV1DataplexExternalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1DataplexExternalTable]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1DataplexExternalTable](x: Self) {
    
    inline def setDataCatalogEntry(value: String): Self = StObject.set(x, "dataCatalogEntry", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogEntryUndefined: Self = StObject.set(x, "dataCatalogEntry", js.undefined)
    
    inline def setFullyQualifiedName(value: String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setFullyQualifiedNameUndefined: Self = StObject.set(x, "fullyQualifiedName", js.undefined)
    
    inline def setGoogleCloudResource(value: String): Self = StObject.set(x, "googleCloudResource", value.asInstanceOf[js.Any])
    
    inline def setGoogleCloudResourceUndefined: Self = StObject.set(x, "googleCloudResource", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
