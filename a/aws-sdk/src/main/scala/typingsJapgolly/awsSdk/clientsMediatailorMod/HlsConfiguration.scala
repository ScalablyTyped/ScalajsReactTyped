package typingsJapgolly.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsConfiguration extends StObject {
  
  /**
    * The URL that is used to initiate a playback session for devices that support Apple HLS. The session uses server-side reporting.
    */
  var ManifestEndpointPrefix: js.UndefOr[string] = js.undefined
}
object HlsConfiguration {
  
  inline def apply(): HlsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsConfiguration]
  }
  
  extension [Self <: HlsConfiguration](x: Self) {
    
    inline def setManifestEndpointPrefix(value: string): Self = StObject.set(x, "ManifestEndpointPrefix", value.asInstanceOf[js.Any])
    
    inline def setManifestEndpointPrefixUndefined: Self = StObject.set(x, "ManifestEndpointPrefix", js.undefined)
  }
}
