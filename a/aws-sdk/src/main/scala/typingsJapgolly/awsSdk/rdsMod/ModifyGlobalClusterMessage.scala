package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyGlobalClusterMessage extends js.Object {
  /**
    *  Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive.  Constraints:   Must match the identifier of an existing global database cluster.  
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
  /**
    *  The new cluster identifier for the global database cluster when modifying a global database cluster. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
    */
  var NewGlobalClusterIdentifier: js.UndefOr[String] = js.native
}

object ModifyGlobalClusterMessage {
  @scala.inline
  def apply(
    DeletionProtection: js.UndefOr[scala.Boolean] = js.undefined,
    GlobalClusterIdentifier: String = null,
    NewGlobalClusterIdentifier: String = null
  ): ModifyGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.asInstanceOf[js.Any])
    if (GlobalClusterIdentifier != null) __obj.updateDynamic("GlobalClusterIdentifier")(GlobalClusterIdentifier.asInstanceOf[js.Any])
    if (NewGlobalClusterIdentifier != null) __obj.updateDynamic("NewGlobalClusterIdentifier")(NewGlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyGlobalClusterMessage]
  }
}

