package typingsJapgolly.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBlockPublicAccessConfigurationInput extends js.Object {
  /**
    * A configuration for Amazon EMR block public access. The configuration applies to all clusters created in your account for the current Region. The configuration specifies whether block public access is enabled. If block public access is enabled, security groups associated with the cluster cannot have rules that allow inbound traffic from 0.0.0.0/0 or ::/0 on a port, unless the port is specified as an exception using PermittedPublicSecurityGroupRuleRanges in the BlockPublicAccessConfiguration. By default, Port 22 (SSH) is an exception, and public access is allowed on this port. You can change this by updating BlockPublicSecurityGroupRules to remove the exception.
    */
  var BlockPublicAccessConfiguration: typingsJapgolly.awsSdk.emrMod.BlockPublicAccessConfiguration = js.native
}

object PutBlockPublicAccessConfigurationInput {
  @scala.inline
  def apply(BlockPublicAccessConfiguration: BlockPublicAccessConfiguration): PutBlockPublicAccessConfigurationInput = {
    val __obj = js.Dynamic.literal(BlockPublicAccessConfiguration = BlockPublicAccessConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBlockPublicAccessConfigurationInput]
  }
}

