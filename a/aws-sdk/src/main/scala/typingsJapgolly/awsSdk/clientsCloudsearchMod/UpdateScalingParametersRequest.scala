package typingsJapgolly.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScalingParametersRequest extends StObject {
  
  var DomainName: typingsJapgolly.awsSdk.clientsCloudsearchMod.DomainName
  
  var ScalingParameters: typingsJapgolly.awsSdk.clientsCloudsearchMod.ScalingParameters
}
object UpdateScalingParametersRequest {
  
  inline def apply(DomainName: DomainName, ScalingParameters: ScalingParameters): UpdateScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingParametersRequest]
  }
  
  extension [Self <: UpdateScalingParametersRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setScalingParameters(value: ScalingParameters): Self = StObject.set(x, "ScalingParameters", value.asInstanceOf[js.Any])
  }
}
