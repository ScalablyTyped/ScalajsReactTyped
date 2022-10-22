package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedInstancesModificationResult extends StObject {
  
  /**
    * The ID for the Reserved Instances that were created as part of the modification request. This field is only available when the modification is fulfilled.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
  
  /**
    * The target Reserved Instances configurations supplied as part of the modification request.
    */
  var TargetConfiguration: js.UndefOr[ReservedInstancesConfiguration] = js.undefined
}
object ReservedInstancesModificationResult {
  
  inline def apply(): ReservedInstancesModificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesModificationResult]
  }
  
  extension [Self <: ReservedInstancesModificationResult](x: Self) {
    
    inline def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
    
    inline def setTargetConfiguration(value: ReservedInstancesConfiguration): Self = StObject.set(x, "TargetConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTargetConfigurationUndefined: Self = StObject.set(x, "TargetConfiguration", js.undefined)
  }
}
