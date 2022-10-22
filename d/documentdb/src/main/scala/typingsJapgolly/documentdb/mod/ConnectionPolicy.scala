package typingsJapgolly.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionPolicy extends StObject {
  
  /**
    * Flag to disable SSL verification for the requests.
    *
    * SSL verification is enabled by default. Don't set this when targeting production endpoints.
    *
    * This is intended to be used only when targeting emulator endpoint to avoid failing your requests with SSL related error.
    */
  var DisableSSLVerification: Boolean
  
  /** Flag to enable/disable automatic redirecting of requests based on read/write operations. */
  var EnableEndpointDiscovery: Boolean
  
  /** Attachment content (aka media) download mode.  */
  var MediaReadMode: typingsJapgolly.documentdb.mod.MediaReadMode
  
  /** Time to wait for response from network peer for attachment content (aka media) operations. Represented in milliseconds. */
  var MediaRequestTimeout: Double
  
  /** List of azure regions to be used as preferred locations for read requests. */
  var PreferredLocations: js.Array[Any]
  
  /** Request timeout (time to wait for response from network peer). Represented in milliseconds. */
  var RequestTimeout: Double
  
  /** RetryOptions instance which defines several configurable properties used during retry. */
  var RetryOptions: typingsJapgolly.documentdb.mod.RetryOptions
}
object ConnectionPolicy {
  
  inline def apply(
    DisableSSLVerification: Boolean,
    EnableEndpointDiscovery: Boolean,
    MediaReadMode: MediaReadMode,
    MediaRequestTimeout: Double,
    PreferredLocations: js.Array[Any],
    RequestTimeout: Double,
    RetryOptions: RetryOptions
  ): ConnectionPolicy = {
    val __obj = js.Dynamic.literal(DisableSSLVerification = DisableSSLVerification.asInstanceOf[js.Any], EnableEndpointDiscovery = EnableEndpointDiscovery.asInstanceOf[js.Any], MediaReadMode = MediaReadMode.asInstanceOf[js.Any], MediaRequestTimeout = MediaRequestTimeout.asInstanceOf[js.Any], PreferredLocations = PreferredLocations.asInstanceOf[js.Any], RequestTimeout = RequestTimeout.asInstanceOf[js.Any], RetryOptions = RetryOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPolicy]
  }
  
  extension [Self <: ConnectionPolicy](x: Self) {
    
    inline def setDisableSSLVerification(value: Boolean): Self = StObject.set(x, "DisableSSLVerification", value.asInstanceOf[js.Any])
    
    inline def setEnableEndpointDiscovery(value: Boolean): Self = StObject.set(x, "EnableEndpointDiscovery", value.asInstanceOf[js.Any])
    
    inline def setMediaReadMode(value: MediaReadMode): Self = StObject.set(x, "MediaReadMode", value.asInstanceOf[js.Any])
    
    inline def setMediaRequestTimeout(value: Double): Self = StObject.set(x, "MediaRequestTimeout", value.asInstanceOf[js.Any])
    
    inline def setPreferredLocations(value: js.Array[Any]): Self = StObject.set(x, "PreferredLocations", value.asInstanceOf[js.Any])
    
    inline def setPreferredLocationsVarargs(value: Any*): Self = StObject.set(x, "PreferredLocations", js.Array(value*))
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "RequestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
  }
}
