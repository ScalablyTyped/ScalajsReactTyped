package typingsJapgolly.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryPolicyRequest extends StObject {
  
  /**
    * The AWS account ID associated with the public registry that contains the repository. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository with the policy to retrieve.
    */
  var repositoryName: RepositoryName
}
object GetRepositoryPolicyRequest {
  
  inline def apply(repositoryName: RepositoryName): GetRepositoryPolicyRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryPolicyRequest]
  }
  
  extension [Self <: GetRepositoryPolicyRequest](x: Self) {
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
