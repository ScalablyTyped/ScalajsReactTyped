package typingsJapgolly.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicePipelineProvisionedResourcesOutput extends StObject {
  
  /**
    * A token that indicates the location of the next provisioned resource in the array of provisioned resources, after the current requested list of provisioned resources.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * An array of provisioned resources for a service and pipeline.
    */
  var provisionedResources: ProvisionedResourceList
}
object ListServicePipelineProvisionedResourcesOutput {
  
  inline def apply(provisionedResources: ProvisionedResourceList): ListServicePipelineProvisionedResourcesOutput = {
    val __obj = js.Dynamic.literal(provisionedResources = provisionedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServicePipelineProvisionedResourcesOutput]
  }
  
  extension [Self <: ListServicePipelineProvisionedResourcesOutput](x: Self) {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProvisionedResources(value: ProvisionedResourceList): Self = StObject.set(x, "provisionedResources", value.asInstanceOf[js.Any])
    
    inline def setProvisionedResourcesVarargs(value: ProvisionedResource*): Self = StObject.set(x, "provisionedResources", js.Array(value*))
  }
}
