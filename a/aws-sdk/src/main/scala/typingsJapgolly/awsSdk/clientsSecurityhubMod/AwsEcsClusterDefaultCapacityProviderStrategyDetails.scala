package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsClusterDefaultCapacityProviderStrategyDetails extends StObject {
  
  /**
    * The minimum number of tasks to run on the specified capacity provider.
    */
  var Base: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the capacity provider.
    */
  var CapacityProvider: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The relative percentage of the total number of tasks launched that should use the capacity provider.
    */
  var Weight: js.UndefOr[Integer] = js.undefined
}
object AwsEcsClusterDefaultCapacityProviderStrategyDetails {
  
  inline def apply(): AwsEcsClusterDefaultCapacityProviderStrategyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsClusterDefaultCapacityProviderStrategyDetails]
  }
  
  extension [Self <: AwsEcsClusterDefaultCapacityProviderStrategyDetails](x: Self) {
    
    inline def setBase(value: Integer): Self = StObject.set(x, "Base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "Base", js.undefined)
    
    inline def setCapacityProvider(value: NonEmptyString): Self = StObject.set(x, "CapacityProvider", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderUndefined: Self = StObject.set(x, "CapacityProvider", js.undefined)
    
    inline def setWeight(value: Integer): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
