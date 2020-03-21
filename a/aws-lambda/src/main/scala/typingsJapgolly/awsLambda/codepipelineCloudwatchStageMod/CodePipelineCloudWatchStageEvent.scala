package typingsJapgolly.awsLambda.codepipelineCloudwatchStageMod

import typingsJapgolly.awsLambda.AnonStage
import typingsJapgolly.awsLambda.awsLambdaStrings.`CodePipeline Stage Execution State Change`
import typingsJapgolly.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typingsJapgolly.awsLambda.codepipelineCloudwatchMod.CodePipelineCloudWatchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePipelineCloudWatchStageEvent extends CodePipelineCloudWatchEvent {
  var account: String
  var detail: AnonStage
  var `detail-type`: `CodePipeline Stage Execution State Change`
  var id: String
  var region: String
  var resources: js.Array[String]
  var source: awsDotcodepipeline
  var time: String
  var version: String
}

object CodePipelineCloudWatchStageEvent {
  @scala.inline
  def apply(
    account: String,
    detail: AnonStage,
    `detail-type`: `CodePipeline Stage Execution State Change`,
    id: String,
    region: String,
    resources: js.Array[String],
    source: awsDotcodepipeline,
    time: String,
    version: String
  ): CodePipelineCloudWatchStageEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineCloudWatchStageEvent]
  }
}

