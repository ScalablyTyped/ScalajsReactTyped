package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCallMetadata extends StObject {
  
  /** Metadata specific for the Meet call. */
  var meetMetadata: js.UndefOr[AppsDynamiteSharedMeetMetadata] = js.undefined
}
object AppsDynamiteSharedCallMetadata {
  
  inline def apply(): AppsDynamiteSharedCallMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCallMetadata]
  }
  
  extension [Self <: AppsDynamiteSharedCallMetadata](x: Self) {
    
    inline def setMeetMetadata(value: AppsDynamiteSharedMeetMetadata): Self = StObject.set(x, "meetMetadata", value.asInstanceOf[js.Any])
    
    inline def setMeetMetadataUndefined: Self = StObject.set(x, "meetMetadata", js.undefined)
  }
}
