package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageSourceManifest extends StObject {
  
  /** Google Cloud Storage bucket containing the source manifest (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). */
  var bucket: js.UndefOr[String] = js.undefined
  
  /** Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used. */
  var generation: js.UndefOr[String] = js.undefined
  
  /** Google Cloud Storage object containing the source manifest. This object must be a JSON file. */
  var `object`: js.UndefOr[String] = js.undefined
}
object StorageSourceManifest {
  
  inline def apply(): StorageSourceManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageSourceManifest]
  }
  
  extension [Self <: StorageSourceManifest](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
