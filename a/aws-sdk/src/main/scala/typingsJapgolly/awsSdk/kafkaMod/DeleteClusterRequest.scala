package typingsJapgolly.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string = js.native
  /**
    * 
    The current version of the MSK cluster.
    
    */
  var CurrentVersion: js.UndefOr[string] = js.native
}

object DeleteClusterRequest {
  @scala.inline
  def apply(ClusterArn: string, CurrentVersion: string = null): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    if (CurrentVersion != null) __obj.updateDynamic("CurrentVersion")(CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
}

