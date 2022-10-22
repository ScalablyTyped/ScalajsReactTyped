package typingsJapgolly.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvisionedCapacityDescriptionMod {
  
  trait ProvisionedCapacityDescription extends StObject {
    
    /**
      * <p>The ID that identifies the provisioned capacity unit.</p>
      */
    var CapacityId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).</p>
      */
    var ExpirationDate: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).</p>
      */
    var StartDate: js.UndefOr[String] = js.undefined
  }
  object ProvisionedCapacityDescription {
    
    inline def apply(): ProvisionedCapacityDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedCapacityDescription]
    }
    
    extension [Self <: ProvisionedCapacityDescription](x: Self) {
      
      inline def setCapacityId(value: String): Self = StObject.set(x, "CapacityId", value.asInstanceOf[js.Any])
      
      inline def setCapacityIdUndefined: Self = StObject.set(x, "CapacityId", js.undefined)
      
      inline def setExpirationDate(value: String): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
      
      inline def setStartDate(value: String): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    }
  }
  
  type UnmarshalledProvisionedCapacityDescription = ProvisionedCapacityDescription
}
