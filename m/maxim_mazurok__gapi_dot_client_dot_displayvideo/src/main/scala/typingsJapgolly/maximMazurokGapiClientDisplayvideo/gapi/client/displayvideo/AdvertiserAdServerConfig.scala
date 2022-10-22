package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiserAdServerConfig extends StObject {
  
  /** The configuration for advertisers that use both Campaign Manager 360 (CM360) and third-party ad servers. */
  var cmHybridConfig: js.UndefOr[CmHybridConfig] = js.undefined
  
  /** The configuration for advertisers that use third-party ad servers only. */
  var thirdPartyOnlyConfig: js.UndefOr[ThirdPartyOnlyConfig] = js.undefined
}
object AdvertiserAdServerConfig {
  
  inline def apply(): AdvertiserAdServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserAdServerConfig]
  }
  
  extension [Self <: AdvertiserAdServerConfig](x: Self) {
    
    inline def setCmHybridConfig(value: CmHybridConfig): Self = StObject.set(x, "cmHybridConfig", value.asInstanceOf[js.Any])
    
    inline def setCmHybridConfigUndefined: Self = StObject.set(x, "cmHybridConfig", js.undefined)
    
    inline def setThirdPartyOnlyConfig(value: ThirdPartyOnlyConfig): Self = StObject.set(x, "thirdPartyOnlyConfig", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyOnlyConfigUndefined: Self = StObject.set(x, "thirdPartyOnlyConfig", js.undefined)
  }
}
