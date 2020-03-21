package typingsJapgolly.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProperties extends js.Object {
  /**
    * The command that is passed to the container. This parameter maps to Cmd in the Create a container section of the Docker Remote API and the COMMAND parameter to docker run. For more information, see https://docs.docker.com/engine/reference/builder/#cmd.
    */
  var command: js.UndefOr[StringList] = js.native
  /**
    * The environment variables to pass to a container. This parameter maps to Env in the Create a container section of the Docker Remote API and the --env option to docker run.  We do not recommend using plaintext environment variables for sensitive information, such as credential data.   Environment variables must not start with AWS_BATCH; this naming convention is reserved for variables that are set by the AWS Batch service. 
    */
  var environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The image used to start a container. This string is passed directly to the Docker daemon. Images in the Docker Hub registry are available by default. Other repositories are specified with  repository-url/image:tag . Up to 255 letters (uppercase and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs are allowed. This parameter maps to Image in the Create a container section of the Docker Remote API and the IMAGE parameter of docker run.   Images in Amazon ECR repositories use the full registry and repository URI (for example, 012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;).   Images in official repositories on Docker Hub use a single name (for example, ubuntu or mongo).   Images in other repositories on Docker Hub are qualified with an organization name (for example, amazon/amazon-ecs-agent).   Images in other online repositories are qualified further by a domain name (for example, quay.io/assemblyline/ubuntu).  
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The instance type to use for a multi-node parallel job. Currently all node groups in a multi-node parallel job must use the same instance type. This parameter is not valid for single-node container jobs.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the container can assume for AWS permissions.
    */
  var jobRoleArn: js.UndefOr[String] = js.native
  /**
    * Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  var linuxParameters: js.UndefOr[LinuxParameters] = js.native
  /**
    * The hard limit (in MiB) of memory to present to the container. If your container attempts to exceed the memory specified here, the container is killed. This parameter maps to Memory in the Create a container section of the Docker Remote API and the --memory option to docker run. You must specify at least 4 MiB of memory for a job.  If you are trying to maximize your resource utilization by providing your jobs as much memory as possible for a particular instance type, see Memory Management in the AWS Batch User Guide. 
    */
  var memory: js.UndefOr[Integer] = js.native
  /**
    * The mount points for data volumes in your container. This parameter maps to Volumes in the Create a container section of the Docker Remote API and the --volume option to docker run.
    */
  var mountPoints: js.UndefOr[MountPoints] = js.native
  /**
    * When this parameter is true, the container is given elevated privileges on the host container instance (similar to the root user). This parameter maps to Privileged in the Create a container section of the Docker Remote API and the --privileged option to docker run.
    */
  var privileged: js.UndefOr[Boolean] = js.native
  /**
    * When this parameter is true, the container is given read-only access to its root file system. This parameter maps to ReadonlyRootfs in the Create a container section of the Docker Remote API and the --read-only option to docker run.
    */
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.native
  /**
    * The type and amount of a resource to assign to a container. Currently, the only supported resource is GPU.
    */
  var resourceRequirements: js.UndefOr[ResourceRequirements] = js.native
  /**
    * A list of ulimits to set in the container. This parameter maps to Ulimits in the Create a container section of the Docker Remote API and the --ulimit option to docker run.
    */
  var ulimits: js.UndefOr[Ulimits] = js.native
  /**
    * The user name to use inside the container. This parameter maps to User in the Create a container section of the Docker Remote API and the --user option to docker run.
    */
  var user: js.UndefOr[String] = js.native
  /**
    * The number of vCPUs reserved for the container. This parameter maps to CpuShares in the Create a container section of the Docker Remote API and the --cpu-shares option to docker run. Each vCPU is equivalent to 1,024 CPU shares. You must specify at least one vCPU.
    */
  var vcpus: js.UndefOr[Integer] = js.native
  /**
    * A list of data volumes used in a job.
    */
  var volumes: js.UndefOr[Volumes] = js.native
}

object ContainerProperties {
  @scala.inline
  def apply(
    command: StringList = null,
    environment: EnvironmentVariables = null,
    image: String = null,
    instanceType: String = null,
    jobRoleArn: String = null,
    linuxParameters: LinuxParameters = null,
    memory: Int | Double = null,
    mountPoints: MountPoints = null,
    privileged: js.UndefOr[scala.Boolean] = js.undefined,
    readonlyRootFilesystem: js.UndefOr[scala.Boolean] = js.undefined,
    resourceRequirements: ResourceRequirements = null,
    ulimits: Ulimits = null,
    user: String = null,
    vcpus: Int | Double = null,
    volumes: Volumes = null
  ): ContainerProperties = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (jobRoleArn != null) __obj.updateDynamic("jobRoleArn")(jobRoleArn.asInstanceOf[js.Any])
    if (linuxParameters != null) __obj.updateDynamic("linuxParameters")(linuxParameters.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (mountPoints != null) __obj.updateDynamic("mountPoints")(mountPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(privileged)) __obj.updateDynamic("privileged")(privileged.asInstanceOf[js.Any])
    if (!js.isUndefined(readonlyRootFilesystem)) __obj.updateDynamic("readonlyRootFilesystem")(readonlyRootFilesystem.asInstanceOf[js.Any])
    if (resourceRequirements != null) __obj.updateDynamic("resourceRequirements")(resourceRequirements.asInstanceOf[js.Any])
    if (ulimits != null) __obj.updateDynamic("ulimits")(ulimits.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (vcpus != null) __obj.updateDynamic("vcpus")(vcpus.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProperties]
  }
}

