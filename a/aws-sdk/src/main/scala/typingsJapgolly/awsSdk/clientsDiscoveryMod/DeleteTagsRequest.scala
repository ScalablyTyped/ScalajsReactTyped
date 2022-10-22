package typingsJapgolly.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsRequest extends StObject {
  
  /**
    * A list of configuration items with tags that you want to delete.
    */
  var configurationIds: ConfigurationIdList
  
  /**
    * Tags that you want to delete from one or more configuration items. Specify the tags that you want to delete in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
    */
  var tags: js.UndefOr[TagSet] = js.undefined
}
object DeleteTagsRequest {
  
  inline def apply(configurationIds: ConfigurationIdList): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsRequest]
  }
  
  extension [Self <: DeleteTagsRequest](x: Self) {
    
    inline def setConfigurationIds(value: ConfigurationIdList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdsVarargs(value: ConfigurationId*): Self = StObject.set(x, "configurationIds", js.Array(value*))
    
    inline def setTags(value: TagSet): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
