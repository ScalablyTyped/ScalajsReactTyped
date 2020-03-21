package typingsJapgolly.pulumiAws.inputMod.batch

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentComputeResources extends js.Object {
  /**
    * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details.
    */
  var allocationStrategy: js.UndefOr[Input[String]] = js.native
  /**
    * Integer of minimum percentage that a Spot Instance price must be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. This parameter is required for SPOT compute environments.
    */
  var bidPercentage: js.UndefOr[Input[Double]] = js.native
  /**
    * The desired number of EC2 vCPUS in the compute environment.
    */
  var desiredVcpus: js.UndefOr[Input[Double]] = js.native
  /**
    * The EC2 key pair that is used for instances launched in the compute environment.
    */
  var ec2KeyPair: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
    */
  var imageId: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment.
    */
  var instanceRole: Input[String] = js.native
  /**
    * A list of instance types that may be launched.
    */
  var instanceTypes: Input[js.Array[Input[String]]] = js.native
  /**
    * The launch template to use for your compute resources. See details below.
    */
  var launchTemplate: js.UndefOr[Input[ComputeEnvironmentComputeResourcesLaunchTemplate]] = js.native
  /**
    * The maximum number of EC2 vCPUs that an environment can reach.
    */
  var maxVcpus: Input[Double] = js.native
  /**
    * The minimum number of EC2 vCPUs that an environment should maintain.
    */
  var minVcpus: Input[Double] = js.native
  /**
    * A list of EC2 security group that are associated with instances launched in the compute environment.
    */
  var securityGroupIds: Input[js.Array[Input[String]]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments.
    */
  var spotIamFleetRole: js.UndefOr[Input[String]] = js.native
  /**
    * A list of VPC subnets into which the compute resources are launched.
    */
  var subnets: Input[js.Array[Input[String]]] = js.native
  /**
    * Key-value pair tags to be applied to resources that are launched in the compute environment.
    */
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  var `type`: Input[String] = js.native
}

object ComputeEnvironmentComputeResources {
  @scala.inline
  def apply(
    instanceRole: Input[String],
    instanceTypes: Input[js.Array[Input[String]]],
    maxVcpus: Input[Double],
    minVcpus: Input[Double],
    securityGroupIds: Input[js.Array[Input[String]]],
    subnets: Input[js.Array[Input[String]]],
    `type`: Input[String],
    allocationStrategy: Input[String] = null,
    bidPercentage: Input[Double] = null,
    desiredVcpus: Input[Double] = null,
    ec2KeyPair: Input[String] = null,
    imageId: Input[String] = null,
    launchTemplate: Input[ComputeEnvironmentComputeResourcesLaunchTemplate] = null,
    spotIamFleetRole: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ComputeEnvironmentComputeResources = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], maxVcpus = maxVcpus.asInstanceOf[js.Any], minVcpus = minVcpus.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (allocationStrategy != null) __obj.updateDynamic("allocationStrategy")(allocationStrategy.asInstanceOf[js.Any])
    if (bidPercentage != null) __obj.updateDynamic("bidPercentage")(bidPercentage.asInstanceOf[js.Any])
    if (desiredVcpus != null) __obj.updateDynamic("desiredVcpus")(desiredVcpus.asInstanceOf[js.Any])
    if (ec2KeyPair != null) __obj.updateDynamic("ec2KeyPair")(ec2KeyPair.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (launchTemplate != null) __obj.updateDynamic("launchTemplate")(launchTemplate.asInstanceOf[js.Any])
    if (spotIamFleetRole != null) __obj.updateDynamic("spotIamFleetRole")(spotIamFleetRole.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentComputeResources]
  }
}

