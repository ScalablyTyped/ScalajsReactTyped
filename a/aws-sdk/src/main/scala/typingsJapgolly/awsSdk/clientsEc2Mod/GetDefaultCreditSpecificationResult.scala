package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultCreditSpecificationResult extends StObject {
  
  /**
    * The default credit option for CPU usage of the instance family.
    */
  var InstanceFamilyCreditSpecification: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.InstanceFamilyCreditSpecification] = js.undefined
}
object GetDefaultCreditSpecificationResult {
  
  inline def apply(): GetDefaultCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultCreditSpecificationResult]
  }
  
  extension [Self <: GetDefaultCreditSpecificationResult](x: Self) {
    
    inline def setInstanceFamilyCreditSpecification(value: InstanceFamilyCreditSpecification): Self = StObject.set(x, "InstanceFamilyCreditSpecification", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyCreditSpecificationUndefined: Self = StObject.set(x, "InstanceFamilyCreditSpecification", js.undefined)
  }
}
