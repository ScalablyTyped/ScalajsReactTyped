package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2GcsDestination extends StObject {
  
  /**
    * The Google Cloud Storage URIs for the output. A URI is of the form: gs://bucket/object-prefix-or-name Whether a prefix or name is used depends on the use case. The requesting user
    * must have "write-permission" to the bucket.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2GcsDestination {
  
  inline def apply(): GoogleCloudDialogflowV2GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2GcsDestination]
  }
  
  extension [Self <: GoogleCloudDialogflowV2GcsDestination](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
