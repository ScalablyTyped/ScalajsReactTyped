package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewaySummary extends StObject {
  
  /**
    * The ARN of the gateway.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.Arn] = js.undefined
  
  /**
    * The description of the gateway.
    */
  var Description: js.UndefOr[GatewayDescription] = js.undefined
  
  /**
    * The ARN of the gateway group that the gateway is associated to.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the gateway.
    */
  var Name: js.UndefOr[GatewayName] = js.undefined
  
  /**
    * The software version of the gateway. The gateway automatically updates its software version during normal operation.
    */
  var SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
}
object GatewaySummary {
  
  inline def apply(): GatewaySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewaySummary]
  }
  
  extension [Self <: GatewaySummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: GatewayDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGatewayGroupArn(value: Arn): Self = StObject.set(x, "GatewayGroupArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayGroupArnUndefined: Self = StObject.set(x, "GatewayGroupArn", js.undefined)
    
    inline def setName(value: GatewayName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSoftwareVersion(value: GatewayVersion): Self = StObject.set(x, "SoftwareVersion", value.asInstanceOf[js.Any])
    
    inline def setSoftwareVersionUndefined: Self = StObject.set(x, "SoftwareVersion", js.undefined)
  }
}
