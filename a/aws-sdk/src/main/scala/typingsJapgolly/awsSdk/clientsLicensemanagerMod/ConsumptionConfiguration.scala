package typingsJapgolly.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumptionConfiguration extends StObject {
  
  /**
    * Details about a borrow configuration.
    */
  var BorrowConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsLicensemanagerMod.BorrowConfiguration] = js.undefined
  
  /**
    * Details about a provisional configuration.
    */
  var ProvisionalConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsLicensemanagerMod.ProvisionalConfiguration] = js.undefined
  
  /**
    * Renewal frequency.
    */
  var RenewType: js.UndefOr[typingsJapgolly.awsSdk.clientsLicensemanagerMod.RenewType] = js.undefined
}
object ConsumptionConfiguration {
  
  inline def apply(): ConsumptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumptionConfiguration]
  }
  
  extension [Self <: ConsumptionConfiguration](x: Self) {
    
    inline def setBorrowConfiguration(value: BorrowConfiguration): Self = StObject.set(x, "BorrowConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBorrowConfigurationUndefined: Self = StObject.set(x, "BorrowConfiguration", js.undefined)
    
    inline def setProvisionalConfiguration(value: ProvisionalConfiguration): Self = StObject.set(x, "ProvisionalConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProvisionalConfigurationUndefined: Self = StObject.set(x, "ProvisionalConfiguration", js.undefined)
    
    inline def setRenewType(value: RenewType): Self = StObject.set(x, "RenewType", value.asInstanceOf[js.Any])
    
    inline def setRenewTypeUndefined: Self = StObject.set(x, "RenewType", js.undefined)
  }
}
