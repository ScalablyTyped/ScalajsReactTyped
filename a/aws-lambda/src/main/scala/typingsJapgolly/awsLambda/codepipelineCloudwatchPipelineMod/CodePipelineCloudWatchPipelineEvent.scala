package typingsJapgolly.awsLambda.codepipelineCloudwatchPipelineMod

import typingsJapgolly.awsLambda.AnonPipeline
import typingsJapgolly.awsLambda.awsLambdaStrings.`CodePipeline Pipeline Execution State Change`
import typingsJapgolly.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typingsJapgolly.awsLambda.codepipelineCloudwatchMod.CodePipelineCloudWatchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePipelineCloudWatchPipelineEvent extends CodePipelineCloudWatchEvent {
  var account: String
  var detail: AnonPipeline
  var `detail-type`: `CodePipeline Pipeline Execution State Change`
  var id: String
  var region: String
  var resources: js.Array[String]
  var source: awsDotcodepipeline
  var time: String
  var version: String
}

object CodePipelineCloudWatchPipelineEvent {
  @scala.inline
  def apply(
    account: String,
    detail: AnonPipeline,
    `detail-type`: `CodePipeline Pipeline Execution State Change`,
    id: String,
    region: String,
    resources: js.Array[String],
    source: awsDotcodepipeline,
    time: String,
    version: String
  ): CodePipelineCloudWatchPipelineEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineCloudWatchPipelineEvent]
  }
}

