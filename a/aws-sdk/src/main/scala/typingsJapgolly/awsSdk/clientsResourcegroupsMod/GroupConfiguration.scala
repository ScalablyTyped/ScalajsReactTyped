package typingsJapgolly.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupConfiguration extends StObject {
  
  /**
    * The configuration currently associated with the group and in effect.
    */
  var Configuration: js.UndefOr[GroupConfigurationList] = js.undefined
  
  /**
    * If present, the reason why a request to update the group configuration failed.
    */
  var FailureReason: js.UndefOr[GroupConfigurationFailureReason] = js.undefined
  
  /**
    * If present, the new configuration that is in the process of being applied to the group.
    */
  var ProposedConfiguration: js.UndefOr[GroupConfigurationList] = js.undefined
  
  /**
    * The current status of an attempt to update the group configuration.
    */
  var Status: js.UndefOr[GroupConfigurationStatus] = js.undefined
}
object GroupConfiguration {
  
  inline def apply(): GroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupConfiguration]
  }
  
  extension [Self <: GroupConfiguration](x: Self) {
    
    inline def setConfiguration(value: GroupConfigurationList): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setConfigurationVarargs(value: GroupConfigurationItem*): Self = StObject.set(x, "Configuration", js.Array(value*))
    
    inline def setFailureReason(value: GroupConfigurationFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setProposedConfiguration(value: GroupConfigurationList): Self = StObject.set(x, "ProposedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProposedConfigurationUndefined: Self = StObject.set(x, "ProposedConfiguration", js.undefined)
    
    inline def setProposedConfigurationVarargs(value: GroupConfigurationItem*): Self = StObject.set(x, "ProposedConfiguration", js.Array(value*))
    
    inline def setStatus(value: GroupConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
