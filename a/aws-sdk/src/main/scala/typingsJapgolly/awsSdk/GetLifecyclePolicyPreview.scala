package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.ecrMod.ImageIdentifierList
import typingsJapgolly.awsSdk.ecrMod.LifecyclePolicyPreviewFilter
import typingsJapgolly.awsSdk.ecrMod.LifecyclePreviewMaxResults
import typingsJapgolly.awsSdk.ecrMod.NextToken
import typingsJapgolly.awsSdk.ecrMod.RegistryId
import typingsJapgolly.awsSdk.ecrMod.RepositoryName
import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ecr.GetLifecyclePolicyPreviewRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetLifecyclePolicyPreview extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * An optional parameter that filters results based on image tag status and all tags, if tagged.
    */
  var filter: js.UndefOr[LifecyclePolicyPreviewFilter] = js.native
  /**
    * The list of imageIDs to be included.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.native
  /**
    * The maximum number of repository results returned by GetLifecyclePolicyPreviewRequest in&#x2028; paginated output. When this parameter is used, GetLifecyclePolicyPreviewRequest only returns&#x2028; maxResults results in a single page along with a nextToken&#x2028; response element. The remaining results of the initial request can be seen by sending&#x2028; another GetLifecyclePolicyPreviewRequest request with the returned nextToken&#x2028; value. This value can be between 1 and 1000. If this&#x2028; parameter is not used, then GetLifecyclePolicyPreviewRequest returns up to&#x2028; 100 results and a nextToken value, if&#x2028; applicable. This option cannot be used when you specify images with imageIds.
    */
  var maxResults: js.UndefOr[LifecyclePreviewMaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated&#x2028; GetLifecyclePolicyPreviewRequest request where maxResults was used and the&#x2028; results exceeded the value of that parameter. Pagination continues from the end of the&#x2028; previous results that returned the nextToken value. This value is&#x2028; null when there are no more results to return. This option cannot be used when you specify images with imageIds.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository.
    */
  var repositoryName: RepositoryName = js.native
}

