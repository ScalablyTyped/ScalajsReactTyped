package typingsJapgolly.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetInstance extends StObject {
  
  /**
    * The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Determines whether this recommendation is the defaulted Amazon Web Services recommendation.
    */
  var DefaultTargetInstance: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The expected cost to operate this instance type on a monthly basis.
    */
  var EstimatedMonthlyCost: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated savings that result from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The expected utilization metrics for target instance type.
    */
  var ExpectedResourceUtilization: js.UndefOr[ResourceUtilization] = js.undefined
  
  /**
    * Explains the actions that you might need to take to successfully migrate your workloads from the current instance type to the recommended instance type. 
    */
  var PlatformDifferences: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.PlatformDifferences] = js.undefined
  
  /**
    * Details on the target instance type. 
    */
  var ResourceDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.ResourceDetails] = js.undefined
}
object TargetInstance {
  
  inline def apply(): TargetInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstance]
  }
  
  extension [Self <: TargetInstance](x: Self) {
    
    inline def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDefaultTargetInstance(value: GenericBoolean): Self = StObject.set(x, "DefaultTargetInstance", value.asInstanceOf[js.Any])
    
    inline def setDefaultTargetInstanceUndefined: Self = StObject.set(x, "DefaultTargetInstance", js.undefined)
    
    inline def setEstimatedMonthlyCost(value: GenericString): Self = StObject.set(x, "EstimatedMonthlyCost", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlyCostUndefined: Self = StObject.set(x, "EstimatedMonthlyCost", js.undefined)
    
    inline def setEstimatedMonthlySavings(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavings", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlySavingsUndefined: Self = StObject.set(x, "EstimatedMonthlySavings", js.undefined)
    
    inline def setExpectedResourceUtilization(value: ResourceUtilization): Self = StObject.set(x, "ExpectedResourceUtilization", value.asInstanceOf[js.Any])
    
    inline def setExpectedResourceUtilizationUndefined: Self = StObject.set(x, "ExpectedResourceUtilization", js.undefined)
    
    inline def setPlatformDifferences(value: PlatformDifferences): Self = StObject.set(x, "PlatformDifferences", value.asInstanceOf[js.Any])
    
    inline def setPlatformDifferencesUndefined: Self = StObject.set(x, "PlatformDifferences", js.undefined)
    
    inline def setPlatformDifferencesVarargs(value: PlatformDifference*): Self = StObject.set(x, "PlatformDifferences", js.Array(value*))
    
    inline def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceDetailsUndefined: Self = StObject.set(x, "ResourceDetails", js.undefined)
  }
}
