package typingsJapgolly.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupConfigurationOutput extends StObject {
  
  /**
    * The service configuration associated with the specified group. For details about the service configuration syntax, see Service configurations for resource groups.
    */
  var GroupConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupsMod.GroupConfiguration] = js.undefined
}
object GetGroupConfigurationOutput {
  
  inline def apply(): GetGroupConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupConfigurationOutput]
  }
  
  extension [Self <: GetGroupConfigurationOutput](x: Self) {
    
    inline def setGroupConfiguration(value: GroupConfiguration): Self = StObject.set(x, "GroupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setGroupConfigurationUndefined: Self = StObject.set(x, "GroupConfiguration", js.undefined)
  }
}
