package typingsJapgolly.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainStatus extends js.Object {
  var ARN: js.UndefOr[typingsJapgolly.awsSdk.cloudsearchMod.ARN] = js.native
  /**
    * True if the search domain is created. It can take several minutes to initialize a domain when CreateDomain is called. Newly created search domains are returned from DescribeDomains with a false value for Created until domain creation is complete.
    */
  var Created: js.UndefOr[Boolean] = js.native
  /**
    * True if the search domain has been deleted. The system must clean up resources dedicated to the search domain when DeleteDomain is called. Newly deleted search domains are returned from DescribeDomains with a true value for IsDeleted for several minutes until resource cleanup is complete.
    */
  var Deleted: js.UndefOr[Boolean] = js.native
  /**
    * The service endpoint for updating documents in a search domain.
    */
  var DocService: js.UndefOr[ServiceEndpoint] = js.native
  var DomainId: typingsJapgolly.awsSdk.cloudsearchMod.DomainId = js.native
  var DomainName: typingsJapgolly.awsSdk.cloudsearchMod.DomainName = js.native
  var Limits: js.UndefOr[typingsJapgolly.awsSdk.cloudsearchMod.Limits] = js.native
  /**
    * True if processing is being done to activate the current domain configuration.
    */
  var Processing: js.UndefOr[Boolean] = js.native
  /**
    * True if IndexDocuments needs to be called to activate the current domain configuration.
    */
  var RequiresIndexDocuments: Boolean = js.native
  /**
    * The number of search instances that are available to process search requests.
    */
  var SearchInstanceCount: js.UndefOr[InstanceCount] = js.native
  /**
    * The instance type that is being used to process search requests.
    */
  var SearchInstanceType: js.UndefOr[typingsJapgolly.awsSdk.cloudsearchMod.SearchInstanceType] = js.native
  /**
    * The number of partitions across which the search index is spread.
    */
  var SearchPartitionCount: js.UndefOr[PartitionCount] = js.native
  /**
    * The service endpoint for requesting search results from a search domain.
    */
  var SearchService: js.UndefOr[ServiceEndpoint] = js.native
}

object DomainStatus {
  @scala.inline
  def apply(
    DomainId: DomainId,
    DomainName: DomainName,
    RequiresIndexDocuments: Boolean,
    ARN: ARN = null,
    Created: js.UndefOr[scala.Boolean] = js.undefined,
    Deleted: js.UndefOr[scala.Boolean] = js.undefined,
    DocService: ServiceEndpoint = null,
    Limits: Limits = null,
    Processing: js.UndefOr[scala.Boolean] = js.undefined,
    SearchInstanceCount: Int | scala.Double = null,
    SearchInstanceType: SearchInstanceType = null,
    SearchPartitionCount: Int | scala.Double = null,
    SearchService: ServiceEndpoint = null
  ): DomainStatus = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], RequiresIndexDocuments = RequiresIndexDocuments.asInstanceOf[js.Any])
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (!js.isUndefined(Created)) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (!js.isUndefined(Deleted)) __obj.updateDynamic("Deleted")(Deleted.asInstanceOf[js.Any])
    if (DocService != null) __obj.updateDynamic("DocService")(DocService.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (!js.isUndefined(Processing)) __obj.updateDynamic("Processing")(Processing.asInstanceOf[js.Any])
    if (SearchInstanceCount != null) __obj.updateDynamic("SearchInstanceCount")(SearchInstanceCount.asInstanceOf[js.Any])
    if (SearchInstanceType != null) __obj.updateDynamic("SearchInstanceType")(SearchInstanceType.asInstanceOf[js.Any])
    if (SearchPartitionCount != null) __obj.updateDynamic("SearchPartitionCount")(SearchPartitionCount.asInstanceOf[js.Any])
    if (SearchService != null) __obj.updateDynamic("SearchService")(SearchService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainStatus]
  }
}

