package typingsJapgolly.winrtUwp.Windows.Media.Streaming.Adaptive

import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the results of a resource download operation. */
trait AdaptiveMediaSourceDownloadResult extends StObject {
  
  /** Gets or sets a buffer containing the downloaded resource. */
  var buffer: IBuffer
  
  /** Gets or sets a string that identifies the MIME content type of the downloaded resource. */
  var contentType: String
  
  /** Gets or sets an integer value that represents extended status information about the resource download operation. */
  var extendedStatus: Double
  
  /** Gets or sets an input stream containing the downloaded resource. */
  var inputStream: IInputStream
  
  /** Gets or sets the Uniform Resource Identifier (URI) of the downloaded resource. */
  var resourceUri: Uri
}
object AdaptiveMediaSourceDownloadResult {
  
  inline def apply(
    buffer: IBuffer,
    contentType: String,
    extendedStatus: Double,
    inputStream: IInputStream,
    resourceUri: Uri
  ): AdaptiveMediaSourceDownloadResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], extendedStatus = extendedStatus.asInstanceOf[js.Any], inputStream = inputStream.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadResult]
  }
  
  extension [Self <: AdaptiveMediaSourceDownloadResult](x: Self) {
    
    inline def setBuffer(value: IBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatus(value: Double): Self = StObject.set(x, "extendedStatus", value.asInstanceOf[js.Any])
    
    inline def setInputStream(value: IInputStream): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
    
    inline def setResourceUri(value: Uri): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
  }
}
