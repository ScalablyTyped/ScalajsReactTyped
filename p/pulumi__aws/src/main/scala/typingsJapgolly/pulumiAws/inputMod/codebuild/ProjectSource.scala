package typingsJapgolly.pulumiAws.inputMod.codebuild

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSource extends js.Object {
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. Auth blocks are documented below.
    */
  var auths: js.UndefOr[Input[js.Array[Input[ProjectSourceAuth]]]] = js.native
  /**
    * The build spec declaration to use for this build project's related builds.
    */
  var buildspec: js.UndefOr[Input[String]] = js.native
  /**
    * Truncate git history to this many commits.
    */
  var gitCloneDepth: js.UndefOr[Input[Double]] = js.native
  /**
    * Information about the Git submodules configuration for an AWS CodeBuild build project. Git submodules config blocks are documented below. This option is only valid when the `type` is `CODECOMMIT`.
    */
  var gitSubmodulesConfig: js.UndefOr[Input[ProjectSourceGitSubmodulesConfig]] = js.native
  /**
    * Ignore SSL warnings when connecting to source control.
    */
  var insecureSsl: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The location of the source code from git or s3.
    */
  var location: js.UndefOr[Input[String]] = js.native
  /**
    * Set to `true` to report the status of a build's start and finish to your source provider. This option is only valid when your source provider is `GITHUB`, `BITBUCKET`, or `GITHUB_ENTERPRISE`.
    */
  var reportBuildStatus: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of repository that contains the source code to be built. Valid values for this parameter are: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET` or `S3`.
    */
  var `type`: Input[String] = js.native
}

object ProjectSource {
  @scala.inline
  def apply(
    `type`: Input[String],
    auths: Input[js.Array[Input[ProjectSourceAuth]]] = null,
    buildspec: Input[String] = null,
    gitCloneDepth: Input[Double] = null,
    gitSubmodulesConfig: Input[ProjectSourceGitSubmodulesConfig] = null,
    insecureSsl: Input[Boolean] = null,
    location: Input[String] = null,
    reportBuildStatus: Input[Boolean] = null
  ): ProjectSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (auths != null) __obj.updateDynamic("auths")(auths.asInstanceOf[js.Any])
    if (buildspec != null) __obj.updateDynamic("buildspec")(buildspec.asInstanceOf[js.Any])
    if (gitCloneDepth != null) __obj.updateDynamic("gitCloneDepth")(gitCloneDepth.asInstanceOf[js.Any])
    if (gitSubmodulesConfig != null) __obj.updateDynamic("gitSubmodulesConfig")(gitSubmodulesConfig.asInstanceOf[js.Any])
    if (insecureSsl != null) __obj.updateDynamic("insecureSsl")(insecureSsl.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (reportBuildStatus != null) __obj.updateDynamic("reportBuildStatus")(reportBuildStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSource]
  }
}

