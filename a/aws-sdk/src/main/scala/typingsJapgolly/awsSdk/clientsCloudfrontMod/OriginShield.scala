package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginShield extends StObject {
  
  /**
    * A flag that specifies whether Origin Shield is enabled. When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your origin. When it’s disabled, CloudFront might send requests directly to your origin from multiple edge locations or regional edge caches.
    */
  var Enabled: Boolean
  
  /**
    * The Amazon Web Services Region for Origin Shield. Specify the Amazon Web Services Region that has the lowest latency to your origin. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2. When you enable CloudFront Origin Shield, you must specify the Amazon Web Services Region for Origin Shield. For the list of Amazon Web Services Regions that you can specify, and for help choosing the best Region for your origin, see Choosing the Amazon Web Services Region for Origin Shield in the Amazon CloudFront Developer Guide.
    */
  var OriginShieldRegion: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.OriginShieldRegion] = js.undefined
}
object OriginShield {
  
  inline def apply(Enabled: Boolean): OriginShield = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginShield]
  }
  
  extension [Self <: OriginShield](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setOriginShieldRegion(value: OriginShieldRegion): Self = StObject.set(x, "OriginShieldRegion", value.asInstanceOf[js.Any])
    
    inline def setOriginShieldRegionUndefined: Self = StObject.set(x, "OriginShieldRegion", js.undefined)
  }
}
