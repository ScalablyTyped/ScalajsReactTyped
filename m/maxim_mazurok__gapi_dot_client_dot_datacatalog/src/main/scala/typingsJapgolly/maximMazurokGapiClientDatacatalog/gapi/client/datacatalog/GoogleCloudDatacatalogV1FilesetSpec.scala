package typingsJapgolly.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1FilesetSpec extends StObject {
  
  /** Fields specific to a Dataplex fileset and present only in the Dataplex fileset entries. */
  var dataplexFileset: js.UndefOr[GoogleCloudDatacatalogV1DataplexFilesetSpec] = js.undefined
}
object GoogleCloudDatacatalogV1FilesetSpec {
  
  inline def apply(): GoogleCloudDatacatalogV1FilesetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1FilesetSpec]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1FilesetSpec](x: Self) {
    
    inline def setDataplexFileset(value: GoogleCloudDatacatalogV1DataplexFilesetSpec): Self = StObject.set(x, "dataplexFileset", value.asInstanceOf[js.Any])
    
    inline def setDataplexFilesetUndefined: Self = StObject.set(x, "dataplexFileset", js.undefined)
  }
}
