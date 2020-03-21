package typingsJapgolly.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOperationInfo extends js.Object {
  /**
    * 
    The ID of the API request that triggered this operation.
    
    */
  var ClientRequestId: js.UndefOr[string] = js.native
  /**
    * 
    ARN of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  /**
    * 
    The time that the operation was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * 
    The time at which the operation finished.
    
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * 
    Describes the error if the operation fails.
    
    */
  var ErrorInfo: js.UndefOr[typingsJapgolly.awsSdk.kafkaMod.ErrorInfo] = js.native
  /**
    * 
    ARN of the cluster operation.
    
    */
  var OperationArn: js.UndefOr[string] = js.native
  /**
    * 
    State of the cluster operation.
    
    */
  var OperationState: js.UndefOr[string] = js.native
  /**
    * 
    Type of the cluster operation.
    
    */
  var OperationType: js.UndefOr[string] = js.native
  /**
    * 
    Information about cluster attributes before a cluster is updated.
    
    */
  var SourceClusterInfo: js.UndefOr[MutableClusterInfo] = js.native
  /**
    * 
    Information about cluster attributes after a cluster is updated.
    
    */
  var TargetClusterInfo: js.UndefOr[MutableClusterInfo] = js.native
}

object ClusterOperationInfo {
  @scala.inline
  def apply(
    ClientRequestId: string = null,
    ClusterArn: string = null,
    CreationTime: js.Date = null,
    EndTime: js.Date = null,
    ErrorInfo: ErrorInfo = null,
    OperationArn: string = null,
    OperationState: string = null,
    OperationType: string = null,
    SourceClusterInfo: MutableClusterInfo = null,
    TargetClusterInfo: MutableClusterInfo = null
  ): ClusterOperationInfo = {
    val __obj = js.Dynamic.literal()
    if (ClientRequestId != null) __obj.updateDynamic("ClientRequestId")(ClientRequestId.asInstanceOf[js.Any])
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ErrorInfo != null) __obj.updateDynamic("ErrorInfo")(ErrorInfo.asInstanceOf[js.Any])
    if (OperationArn != null) __obj.updateDynamic("OperationArn")(OperationArn.asInstanceOf[js.Any])
    if (OperationState != null) __obj.updateDynamic("OperationState")(OperationState.asInstanceOf[js.Any])
    if (OperationType != null) __obj.updateDynamic("OperationType")(OperationType.asInstanceOf[js.Any])
    if (SourceClusterInfo != null) __obj.updateDynamic("SourceClusterInfo")(SourceClusterInfo.asInstanceOf[js.Any])
    if (TargetClusterInfo != null) __obj.updateDynamic("TargetClusterInfo")(TargetClusterInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOperationInfo]
  }
}

