package typingsJapgolly.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVodSourceRequest extends StObject {
  
  /**
    * A list of HTTP package configurations for the VOD source on this account.
    */
  var HttpPackageConfigurations: typingsJapgolly.awsSdk.clientsMediatailorMod.HttpPackageConfigurations
  
  /**
    * The identifier for the source location you are working on.
    */
  var SourceLocationName: string
  
  /**
    * The identifier for the VOD source you are working on.
    */
  var VodSourceName: string
}
object UpdateVodSourceRequest {
  
  inline def apply(
    HttpPackageConfigurations: HttpPackageConfigurations,
    SourceLocationName: string,
    VodSourceName: string
  ): UpdateVodSourceRequest = {
    val __obj = js.Dynamic.literal(HttpPackageConfigurations = HttpPackageConfigurations.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any], VodSourceName = VodSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVodSourceRequest]
  }
  
  extension [Self <: UpdateVodSourceRequest](x: Self) {
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceName(value: string): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
  }
}
