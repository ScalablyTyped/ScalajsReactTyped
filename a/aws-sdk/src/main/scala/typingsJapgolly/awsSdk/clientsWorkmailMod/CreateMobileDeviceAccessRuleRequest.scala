package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMobileDeviceAccessRuleRequest extends StObject {
  
  /**
    * The idempotency token for the client request.
    */
  var ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined
  
  /**
    * The rule description.
    */
  var Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined
  
  /**
    * Device models that the rule will match.
    */
  var DeviceModels: js.UndefOr[DeviceModelList] = js.undefined
  
  /**
    * Device operating systems that the rule will match.
    */
  var DeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined
  
  /**
    * Device types that the rule will match.
    */
  var DeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined
  
  /**
    * Device user agents that the rule will match.
    */
  var DeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined
  
  /**
    * The effect of the rule when it matches. Allowed values are ALLOW or DENY.
    */
  var Effect: MobileDeviceAccessRuleEffect
  
  /**
    * The rule name.
    */
  var Name: MobileDeviceAccessRuleName
  
  /**
    * Device models that the rule will not match. All other device models will match.
    */
  var NotDeviceModels: js.UndefOr[DeviceModelList] = js.undefined
  
  /**
    * Device operating systems that the rule will not match. All other device operating systems will match.
    */
  var NotDeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined
  
  /**
    * Device types that the rule will not match. All other device types will match.
    */
  var NotDeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined
  
  /**
    * Device user agents that the rule will not match. All other device user agents will match.
    */
  var NotDeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined
  
  /**
    * The WorkMail organization under which the rule will be created.
    */
  var OrganizationId: typingsJapgolly.awsSdk.clientsWorkmailMod.OrganizationId
}
object CreateMobileDeviceAccessRuleRequest {
  
  inline def apply(
    Effect: MobileDeviceAccessRuleEffect,
    Name: MobileDeviceAccessRuleName,
    OrganizationId: OrganizationId
  ): CreateMobileDeviceAccessRuleRequest = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMobileDeviceAccessRuleRequest]
  }
  
  extension [Self <: CreateMobileDeviceAccessRuleRequest](x: Self) {
    
    inline def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: MobileDeviceAccessRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceModels(value: DeviceModelList): Self = StObject.set(x, "DeviceModels", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelsUndefined: Self = StObject.set(x, "DeviceModels", js.undefined)
    
    inline def setDeviceModelsVarargs(value: DeviceModel*): Self = StObject.set(x, "DeviceModels", js.Array(value*))
    
    inline def setDeviceOperatingSystems(value: DeviceOperatingSystemList): Self = StObject.set(x, "DeviceOperatingSystems", value.asInstanceOf[js.Any])
    
    inline def setDeviceOperatingSystemsUndefined: Self = StObject.set(x, "DeviceOperatingSystems", js.undefined)
    
    inline def setDeviceOperatingSystemsVarargs(value: DeviceOperatingSystem*): Self = StObject.set(x, "DeviceOperatingSystems", js.Array(value*))
    
    inline def setDeviceTypes(value: DeviceTypeList): Self = StObject.set(x, "DeviceTypes", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypesUndefined: Self = StObject.set(x, "DeviceTypes", js.undefined)
    
    inline def setDeviceTypesVarargs(value: DeviceType*): Self = StObject.set(x, "DeviceTypes", js.Array(value*))
    
    inline def setDeviceUserAgents(value: DeviceUserAgentList): Self = StObject.set(x, "DeviceUserAgents", value.asInstanceOf[js.Any])
    
    inline def setDeviceUserAgentsUndefined: Self = StObject.set(x, "DeviceUserAgents", js.undefined)
    
    inline def setDeviceUserAgentsVarargs(value: DeviceUserAgent*): Self = StObject.set(x, "DeviceUserAgents", js.Array(value*))
    
    inline def setEffect(value: MobileDeviceAccessRuleEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setName(value: MobileDeviceAccessRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNotDeviceModels(value: DeviceModelList): Self = StObject.set(x, "NotDeviceModels", value.asInstanceOf[js.Any])
    
    inline def setNotDeviceModelsUndefined: Self = StObject.set(x, "NotDeviceModels", js.undefined)
    
    inline def setNotDeviceModelsVarargs(value: DeviceModel*): Self = StObject.set(x, "NotDeviceModels", js.Array(value*))
    
    inline def setNotDeviceOperatingSystems(value: DeviceOperatingSystemList): Self = StObject.set(x, "NotDeviceOperatingSystems", value.asInstanceOf[js.Any])
    
    inline def setNotDeviceOperatingSystemsUndefined: Self = StObject.set(x, "NotDeviceOperatingSystems", js.undefined)
    
    inline def setNotDeviceOperatingSystemsVarargs(value: DeviceOperatingSystem*): Self = StObject.set(x, "NotDeviceOperatingSystems", js.Array(value*))
    
    inline def setNotDeviceTypes(value: DeviceTypeList): Self = StObject.set(x, "NotDeviceTypes", value.asInstanceOf[js.Any])
    
    inline def setNotDeviceTypesUndefined: Self = StObject.set(x, "NotDeviceTypes", js.undefined)
    
    inline def setNotDeviceTypesVarargs(value: DeviceType*): Self = StObject.set(x, "NotDeviceTypes", js.Array(value*))
    
    inline def setNotDeviceUserAgents(value: DeviceUserAgentList): Self = StObject.set(x, "NotDeviceUserAgents", value.asInstanceOf[js.Any])
    
    inline def setNotDeviceUserAgentsUndefined: Self = StObject.set(x, "NotDeviceUserAgents", js.undefined)
    
    inline def setNotDeviceUserAgentsVarargs(value: DeviceUserAgent*): Self = StObject.set(x, "NotDeviceUserAgents", js.Array(value*))
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
