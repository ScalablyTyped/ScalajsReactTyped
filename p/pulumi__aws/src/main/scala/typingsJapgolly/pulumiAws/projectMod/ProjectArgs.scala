package typingsJapgolly.pulumiAws.projectMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.codebuild.ProjectArtifacts
import typingsJapgolly.pulumiAws.inputMod.codebuild.ProjectCache
import typingsJapgolly.pulumiAws.inputMod.codebuild.ProjectEnvironment
import typingsJapgolly.pulumiAws.inputMod.codebuild.ProjectLogsConfig
import typingsJapgolly.pulumiAws.inputMod.codebuild.ProjectSecondaryArtifact
import typingsJapgolly.pulumiAws.inputMod.codebuild.ProjectSecondarySource
import typingsJapgolly.pulumiAws.inputMod.codebuild.ProjectSource
import typingsJapgolly.pulumiAws.inputMod.codebuild.ProjectVpcConfig
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectArgs extends js.Object {
  /**
    * Information about the project's build output artifacts. Artifact blocks are documented below.
    */
  val artifacts: Input[ProjectArtifacts] = js.native
  /**
    * Generates a publicly-accessible URL for the projects build badge. Available as `badgeUrl` attribute when enabled.
    */
  val badgeEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
    */
  val buildTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * Information about the cache storage for the project. Cache blocks are documented below.
    */
  val cache: js.UndefOr[Input[ProjectCache]] = js.native
  /**
    * A short description of the project.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
    */
  val encryptionKey: js.UndefOr[Input[String]] = js.native
  /**
    * Information about the project's build environment. Environment blocks are documented below.
    */
  val environment: Input[ProjectEnvironment] = js.native
  /**
    * Configuration for the builds to store log data to CloudWatch or S3.
    */
  val logsConfig: js.UndefOr[Input[ProjectLogsConfig]] = js.native
  /**
    * The name of the project. If `type` is set to `S3`, this is the name of the output artifact object
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * How long in minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
    */
  val queuedTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * A set of secondary artifacts to be used inside the build. Secondary artifacts blocks are documented below.
    */
  val secondaryArtifacts: js.UndefOr[Input[js.Array[Input[ProjectSecondaryArtifact]]]] = js.native
  /**
    * A set of secondary sources to be used inside the build. Secondary sources blocks are documented below.
    */
  val secondarySources: js.UndefOr[Input[js.Array[Input[ProjectSecondarySource]]]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  val serviceRole: Input[String] = js.native
  /**
    * Information about the project's input source code. Source blocks are documented below.
    */
  val source: Input[ProjectSource] = js.native
  /**
    * A version of the build input to be built for this project. If not specified, the latest version is used.
    */
  val sourceVersion: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Configuration for the builds to run inside a VPC. VPC config blocks are documented below.
    */
  val vpcConfig: js.UndefOr[Input[ProjectVpcConfig]] = js.native
}

object ProjectArgs {
  @scala.inline
  def apply(
    artifacts: Input[ProjectArtifacts],
    environment: Input[ProjectEnvironment],
    serviceRole: Input[String],
    source: Input[ProjectSource],
    badgeEnabled: Input[Boolean] = null,
    buildTimeout: Input[Double] = null,
    cache: Input[ProjectCache] = null,
    description: Input[String] = null,
    encryptionKey: Input[String] = null,
    logsConfig: Input[ProjectLogsConfig] = null,
    name: Input[String] = null,
    queuedTimeout: Input[Double] = null,
    secondaryArtifacts: Input[js.Array[Input[ProjectSecondaryArtifact]]] = null,
    secondarySources: Input[js.Array[Input[ProjectSecondarySource]]] = null,
    sourceVersion: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcConfig: Input[ProjectVpcConfig] = null
  ): ProjectArgs = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (badgeEnabled != null) __obj.updateDynamic("badgeEnabled")(badgeEnabled.asInstanceOf[js.Any])
    if (buildTimeout != null) __obj.updateDynamic("buildTimeout")(buildTimeout.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (logsConfig != null) __obj.updateDynamic("logsConfig")(logsConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (queuedTimeout != null) __obj.updateDynamic("queuedTimeout")(queuedTimeout.asInstanceOf[js.Any])
    if (secondaryArtifacts != null) __obj.updateDynamic("secondaryArtifacts")(secondaryArtifacts.asInstanceOf[js.Any])
    if (secondarySources != null) __obj.updateDynamic("secondarySources")(secondarySources.asInstanceOf[js.Any])
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectArgs]
  }
}

