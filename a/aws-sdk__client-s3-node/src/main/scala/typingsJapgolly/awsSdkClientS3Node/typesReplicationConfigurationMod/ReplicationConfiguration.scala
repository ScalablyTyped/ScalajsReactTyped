package typingsJapgolly.awsSdkClientS3Node.typesReplicationConfigurationMod

import typingsJapgolly.awsSdkClientS3Node.typesReplicationRuleMod.ReplicationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationConfiguration extends js.Object {
  /**
    * <p>Amazon Resource Name (ARN) of an IAM role for Amazon S3 to assume when replicating the objects.</p>
    */
  var Role: String
  /**
    * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
    */
  var Rules: js.Array[ReplicationRule] | js.Iterable[ReplicationRule]
}

object ReplicationConfiguration {
  @scala.inline
  def apply(Role: String, Rules: js.Array[ReplicationRule] | js.Iterable[ReplicationRule]): ReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplicationConfiguration]
  }
}

