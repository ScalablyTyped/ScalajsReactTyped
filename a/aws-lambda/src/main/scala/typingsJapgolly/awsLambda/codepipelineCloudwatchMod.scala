package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.handlerMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-lambda/trigger/codepipeline-cloudwatch", JSImport.Namespace)
@js.native
object codepipelineCloudwatchMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent
    - typingsJapgolly.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent
    - typingsJapgolly.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent
  */
  trait CodePipelineCloudWatchEvent extends js.Object
  
  type CodePipelineCloudWatchHandler = Handler[CodePipelineCloudWatchEvent, Unit]
}

