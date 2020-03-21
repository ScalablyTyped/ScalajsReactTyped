package typingsJapgolly.awsLambda.codepipelineCloudwatchStageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.awsLambdaStrings.STARTED
  - typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED
  - typingsJapgolly.awsLambda.awsLambdaStrings.RESUMED
  - typingsJapgolly.awsLambda.awsLambdaStrings.FAILED
  - typingsJapgolly.awsLambda.awsLambdaStrings.CANCELED
*/
trait CodePipelineStageState extends js.Object

object CodePipelineStageState {
  @scala.inline
  def CANCELED: typingsJapgolly.awsLambda.awsLambdaStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def FAILED: typingsJapgolly.awsLambda.awsLambdaStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def RESUMED: typingsJapgolly.awsLambda.awsLambdaStrings.RESUMED = this.cast("RESUMED")
  @scala.inline
  def STARTED: typingsJapgolly.awsLambda.awsLambdaStrings.STARTED = this.cast("STARTED")
  @scala.inline
  def SUCCEEDED: typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED = this.cast("SUCCEEDED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

