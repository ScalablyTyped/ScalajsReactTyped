package typingsJapgolly.awsSdk.anon

import typingsJapgolly.awsSdk.clientsEc2Mod.Boolean
import typingsJapgolly.awsSdk.clientsEc2Mod.Filter
import typingsJapgolly.awsSdk.clientsEc2Mod.FilterList
import typingsJapgolly.awsSdk.clientsEc2Mod.Integer
import typingsJapgolly.awsSdk.clientsEc2Mod.OwnerStringList
import typingsJapgolly.awsSdk.clientsEc2Mod.RestorableByStringList
import typingsJapgolly.awsSdk.clientsEc2Mod.SnapshotId
import typingsJapgolly.awsSdk.clientsEc2Mod.SnapshotIdStringList
import typingsJapgolly.awsSdk.clientsEc2Mod.String
import typingsJapgolly.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeSnapshotsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeSnapshotsRequestw extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    description - A description of the snapshot.    encrypted - Indicates whether the snapshot is encrypted (true | false)    owner-alias - The owner alias, from an Amazon-maintained list (amazon). This is not the user-configured Amazon Web Services account alias set using the IAM console. We recommend that you use the related parameter instead of this filter.    owner-id - The Amazon Web Services account ID of the owner. We recommend that you use the related parameter instead of this filter.    progress - The progress of the snapshot, as a percentage (for example, 80%).    snapshot-id - The snapshot ID.    start-time - The time stamp when the snapshot was initiated.    status - The status of the snapshot (pending | completed | error).    storage-tier - The storage tier of the snapshot (archive | standard).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    volume-id - The ID of the volume the snapshot is for.    volume-size - The size of the volume, in GiB.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of snapshot results returned by DescribeSnapshots in paginated output. When this parameter is used, DescribeSnapshots only returns MaxResults results in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another DescribeSnapshots request with the returned NextToken value. This value can be between 5 and 1,000; if MaxResults is given a value larger than 1,000, only 1,000 results are returned. If this parameter is not used, then DescribeSnapshots returns all results. You cannot specify this parameter and the snapshot IDs parameter in the same request.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The NextToken value returned from a previous paginated DescribeSnapshots request where MaxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the NextToken value. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Scopes the results to snapshots with the specified owners. You can specify a combination of Amazon Web Services account IDs, self, and amazon.
    */
  var OwnerIds: js.UndefOr[OwnerStringList] = js.undefined
  
  /**
    * The IDs of the Amazon Web Services accounts that can create volumes from the snapshot.
    */
  var RestorableByUserIds: js.UndefOr[RestorableByStringList] = js.undefined
  
  /**
    * The snapshot IDs. Default: Describes the snapshots for which you have create volume permissions.
    */
  var SnapshotIds: js.UndefOr[SnapshotIdStringList] = js.undefined
}
object DescribeSnapshotsRequestw {
  
  inline def apply(): DescribeSnapshotsRequestw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsRequestw]
  }
  
  extension [Self <: DescribeSnapshotsRequestw](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOwnerIds(value: OwnerStringList): Self = StObject.set(x, "OwnerIds", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdsUndefined: Self = StObject.set(x, "OwnerIds", js.undefined)
    
    inline def setOwnerIdsVarargs(value: String*): Self = StObject.set(x, "OwnerIds", js.Array(value*))
    
    inline def setRestorableByUserIds(value: RestorableByStringList): Self = StObject.set(x, "RestorableByUserIds", value.asInstanceOf[js.Any])
    
    inline def setRestorableByUserIdsUndefined: Self = StObject.set(x, "RestorableByUserIds", js.undefined)
    
    inline def setRestorableByUserIdsVarargs(value: String*): Self = StObject.set(x, "RestorableByUserIds", js.Array(value*))
    
    inline def setSnapshotIds(value: SnapshotIdStringList): Self = StObject.set(x, "SnapshotIds", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdsUndefined: Self = StObject.set(x, "SnapshotIds", js.undefined)
    
    inline def setSnapshotIdsVarargs(value: SnapshotId*): Self = StObject.set(x, "SnapshotIds", js.Array(value*))
  }
}
