package typingsJapgolly.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudStorage extends StObject {
  
  /** Required. The path to a directory in GCS that will eventually contain the results for this test. The requesting user must have write access on the bucket in the supplied path. */
  var gcsPath: js.UndefOr[String] = js.undefined
}
object GoogleCloudStorage {
  
  inline def apply(): GoogleCloudStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudStorage]
  }
  
  extension [Self <: GoogleCloudStorage](x: Self) {
    
    inline def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    inline def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
  }
}
