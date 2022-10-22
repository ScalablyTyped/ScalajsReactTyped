package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationException extends StObject {
  
  /**
    * The name of the Config rule.
    */
  var ConfigRuleName: typingsJapgolly.awsSdk.clientsConfigserviceMod.ConfigRuleName
  
  /**
    * The time when the remediation exception will be deleted.
    */
  var ExpirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An explanation of an remediation exception.
    */
  var Message: js.UndefOr[StringWithCharLimit1024] = js.undefined
  
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: StringWithCharLimit1024
  
  /**
    * The type of a resource.
    */
  var ResourceType: StringWithCharLimit256
}
object RemediationException {
  
  inline def apply(
    ConfigRuleName: ConfigRuleName,
    ResourceId: StringWithCharLimit1024,
    ResourceType: StringWithCharLimit256
  ): RemediationException = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationException]
  }
  
  extension [Self <: RemediationException](x: Self) {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    inline def setMessage(value: StringWithCharLimit1024): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setResourceId(value: StringWithCharLimit1024): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
