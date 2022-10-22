package typingsJapgolly.winrtUwp.Windows.Media.Streaming.Adaptive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DownloadRequested event. */
trait AdaptiveMediaSourceDownloadRequestedEventArgs extends StObject {
  
  /**
    * Gets a deferral that can be used to defer the completion of the DownloadRequested event so that the app can asynchronously download media content.
    * @return A deferral that can be used to defer the completion of the DownloadRequested event.
    */
  def getDeferral(): AdaptiveMediaSourceDownloadRequestedDeferral
  
  /** Gets the byte range length of the media download request. */
  var resourceByteRangeLength: Double
  
  /** Gets the byte range offset of the media download request. */
  var resourceByteRangeOffset: Double
  
  /** Gets the resource type of the media download request. */
  var resourceType: AdaptiveMediaSourceResourceType
  
  /** Gets the resource URI of the media download request. */
  var resourceUri: Uri
  
  /** Gets an AdaptiveMediaSourceDownloadResult object representing the result of the media download request. */
  var result: AdaptiveMediaSourceDownloadResult
}
object AdaptiveMediaSourceDownloadRequestedEventArgs {
  
  inline def apply(
    getDeferral: CallbackTo[AdaptiveMediaSourceDownloadRequestedDeferral],
    resourceByteRangeLength: Double,
    resourceByteRangeOffset: Double,
    resourceType: AdaptiveMediaSourceResourceType,
    resourceUri: Uri,
    result: AdaptiveMediaSourceDownloadResult
  ): AdaptiveMediaSourceDownloadRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, resourceByteRangeLength = resourceByteRangeLength.asInstanceOf[js.Any], resourceByteRangeOffset = resourceByteRangeOffset.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadRequestedEventArgs]
  }
  
  extension [Self <: AdaptiveMediaSourceDownloadRequestedEventArgs](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[AdaptiveMediaSourceDownloadRequestedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setResourceByteRangeLength(value: Double): Self = StObject.set(x, "resourceByteRangeLength", value.asInstanceOf[js.Any])
    
    inline def setResourceByteRangeOffset(value: Double): Self = StObject.set(x, "resourceByteRangeOffset", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: AdaptiveMediaSourceResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceUri(value: Uri): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResult(value: AdaptiveMediaSourceDownloadResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
