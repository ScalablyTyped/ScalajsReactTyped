package typingsJapgolly.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryPolicyRequest extends js.Object {
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository with the policy to retrieve.
    */
  var repositoryName: RepositoryName = js.native
}

object GetRepositoryPolicyRequest {
  @scala.inline
  def apply(repositoryName: RepositoryName, registryId: RegistryId = null): GetRepositoryPolicyRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryPolicyRequest]
  }
}

