package typingsJapgolly.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineDeclaration extends js.Object {
  /**
    * Represents information about the S3 bucket where artifacts are stored for the pipeline.  You must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  var artifactStore: js.UndefOr[ArtifactStore] = js.native
  /**
    * A mapping of artifactStore objects and their corresponding AWS Regions. There must be an artifact store for the pipeline Region and for each cross-region action in the pipeline.  You must include either artifactStore or artifactStores in your pipeline, but you cannot use both. If you create a cross-region action in your pipeline, you must use artifactStores. 
    */
  var artifactStores: js.UndefOr[ArtifactStoreMap] = js.native
  /**
    * The name of the action to be performed.
    */
  var name: PipelineName = js.native
  /**
    * The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no actionRoleArn, or to use to assume roles for actions with an actionRoleArn.
    */
  var roleArn: RoleArn = js.native
  /**
    * The stage in which to perform the action.
    */
  var stages: PipelineStageDeclarationList = js.native
  /**
    * The version number of the pipeline. A new pipeline always has a version number of 1. This number is incremented when a pipeline is updated.
    */
  var version: js.UndefOr[PipelineVersion] = js.native
}

object PipelineDeclaration {
  @scala.inline
  def apply(
    name: PipelineName,
    roleArn: RoleArn,
    stages: PipelineStageDeclarationList,
    artifactStore: ArtifactStore = null,
    artifactStores: ArtifactStoreMap = null,
    version: Int | Double = null
  ): PipelineDeclaration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
    if (artifactStore != null) __obj.updateDynamic("artifactStore")(artifactStore.asInstanceOf[js.Any])
    if (artifactStores != null) __obj.updateDynamic("artifactStores")(artifactStores.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineDeclaration]
  }
}

