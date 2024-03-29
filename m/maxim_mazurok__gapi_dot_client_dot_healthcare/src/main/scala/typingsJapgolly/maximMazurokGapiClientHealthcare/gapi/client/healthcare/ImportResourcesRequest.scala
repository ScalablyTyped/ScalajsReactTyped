package typingsJapgolly.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportResourcesRequest extends StObject {
  
  /** The content structure in the source location. If not specified, the server treats the input source files as BUNDLE. */
  var contentStructure: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud Storage source data location and import configuration. The Healthcare Service Agent account requires the `roles/storage.objectAdmin` role on the Cloud Storage location. Each
    * Cloud Storage object should be a text file that contains the format specified in ContentStructure.
    */
  var gcsSource: js.UndefOr[GoogleCloudHealthcareV1FhirGcsSource] = js.undefined
}
object ImportResourcesRequest {
  
  inline def apply(): ImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportResourcesRequest]
  }
  
  extension [Self <: ImportResourcesRequest](x: Self) {
    
    inline def setContentStructure(value: String): Self = StObject.set(x, "contentStructure", value.asInstanceOf[js.Any])
    
    inline def setContentStructureUndefined: Self = StObject.set(x, "contentStructure", js.undefined)
    
    inline def setGcsSource(value: GoogleCloudHealthcareV1FhirGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
