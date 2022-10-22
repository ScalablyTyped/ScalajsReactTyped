package typingsJapgolly.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLaunchConfigurationTemplatesRequest extends StObject {
  
  /**
    * Request to disconnect Source Server from service by Server ID.
    */
  var launchConfigurationTemplateIDs: js.UndefOr[LaunchConfigurationTemplateIDs] = js.undefined
  
  /**
    * Request to disconnect Source Server from service by Server ID.
    */
  var maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined
  
  /**
    * Request to disconnect Source Server from service by Server ID.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeLaunchConfigurationTemplatesRequest {
  
  inline def apply(): DescribeLaunchConfigurationTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchConfigurationTemplatesRequest]
  }
  
  extension [Self <: DescribeLaunchConfigurationTemplatesRequest](x: Self) {
    
    inline def setLaunchConfigurationTemplateIDs(value: LaunchConfigurationTemplateIDs): Self = StObject.set(x, "launchConfigurationTemplateIDs", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationTemplateIDsUndefined: Self = StObject.set(x, "launchConfigurationTemplateIDs", js.undefined)
    
    inline def setLaunchConfigurationTemplateIDsVarargs(value: LaunchConfigurationTemplateID*): Self = StObject.set(x, "launchConfigurationTemplateIDs", js.Array(value*))
    
    inline def setMaxResults(value: StrictlyPositiveInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
