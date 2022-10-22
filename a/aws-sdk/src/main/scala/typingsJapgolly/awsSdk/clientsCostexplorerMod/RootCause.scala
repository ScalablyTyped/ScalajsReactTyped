package typingsJapgolly.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootCause extends StObject {
  
  /**
    * The member account value that's associated with the cost anomaly. 
    */
  var LinkedAccount: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Web Services Region that's associated with the cost anomaly. 
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Web Service name that's associated with the cost anomaly. 
    */
  var Service: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The UsageType value that's associated with the cost anomaly. 
    */
  var UsageType: js.UndefOr[GenericString] = js.undefined
}
object RootCause {
  
  inline def apply(): RootCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootCause]
  }
  
  extension [Self <: RootCause](x: Self) {
    
    inline def setLinkedAccount(value: GenericString): Self = StObject.set(x, "LinkedAccount", value.asInstanceOf[js.Any])
    
    inline def setLinkedAccountUndefined: Self = StObject.set(x, "LinkedAccount", js.undefined)
    
    inline def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setService(value: GenericString): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
    
    inline def setUsageType(value: GenericString): Self = StObject.set(x, "UsageType", value.asInstanceOf[js.Any])
    
    inline def setUsageTypeUndefined: Self = StObject.set(x, "UsageType", js.undefined)
  }
}
