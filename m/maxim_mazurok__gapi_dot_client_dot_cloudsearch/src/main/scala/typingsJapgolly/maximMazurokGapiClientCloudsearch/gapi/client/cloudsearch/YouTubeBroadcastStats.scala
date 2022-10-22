package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YouTubeBroadcastStats extends StObject {
  
  /** Estimated concurrent viewer count. */
  var estimatedViewerCount: js.UndefOr[String] = js.undefined
}
object YouTubeBroadcastStats {
  
  inline def apply(): YouTubeBroadcastStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubeBroadcastStats]
  }
  
  extension [Self <: YouTubeBroadcastStats](x: Self) {
    
    inline def setEstimatedViewerCount(value: String): Self = StObject.set(x, "estimatedViewerCount", value.asInstanceOf[js.Any])
    
    inline def setEstimatedViewerCountUndefined: Self = StObject.set(x, "estimatedViewerCount", js.undefined)
  }
}
