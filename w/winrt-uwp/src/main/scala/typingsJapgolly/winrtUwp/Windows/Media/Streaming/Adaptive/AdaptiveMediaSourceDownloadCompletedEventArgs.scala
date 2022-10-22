package typingsJapgolly.winrtUwp.Windows.Media.Streaming.Adaptive

import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Web.Http.HttpResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DownloadCompleted event. */
trait AdaptiveMediaSourceDownloadCompletedEventArgs extends StObject {
  
  /** Gets the http response message, if any, returned from the completed media download request. */
  var httpResponseMessage: HttpResponseMessage
  
  /** Gets the byte range length of the completed media download request. */
  var resourceByteRangeLength: Double
  
  /** Gets the byte range offset of the completed media download request. */
  var resourceByteRangeOffset: Double
  
  /** Gets the resource type of the completed media download request. */
  var resourceType: AdaptiveMediaSourceResourceType
  
  /** Gets the resource URI of the completed media download request. */
  var resourceUri: Uri
}
object AdaptiveMediaSourceDownloadCompletedEventArgs {
  
  inline def apply(
    httpResponseMessage: HttpResponseMessage,
    resourceByteRangeLength: Double,
    resourceByteRangeOffset: Double,
    resourceType: AdaptiveMediaSourceResourceType,
    resourceUri: Uri
  ): AdaptiveMediaSourceDownloadCompletedEventArgs = {
    val __obj = js.Dynamic.literal(httpResponseMessage = httpResponseMessage.asInstanceOf[js.Any], resourceByteRangeLength = resourceByteRangeLength.asInstanceOf[js.Any], resourceByteRangeOffset = resourceByteRangeOffset.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadCompletedEventArgs]
  }
  
  extension [Self <: AdaptiveMediaSourceDownloadCompletedEventArgs](x: Self) {
    
    inline def setHttpResponseMessage(value: HttpResponseMessage): Self = StObject.set(x, "httpResponseMessage", value.asInstanceOf[js.Any])
    
    inline def setResourceByteRangeLength(value: Double): Self = StObject.set(x, "resourceByteRangeLength", value.asInstanceOf[js.Any])
    
    inline def setResourceByteRangeOffset(value: Double): Self = StObject.set(x, "resourceByteRangeOffset", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: AdaptiveMediaSourceResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceUri(value: Uri): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
  }
}
