package typingsJapgolly.awsLambda.codepipelineCloudwatchPipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.awsLambdaStrings.STARTED
  - typingsJapgolly.awsLambda.awsLambdaStrings.SUCCEEDED
  - typingsJapgolly.awsLambda.awsLambdaStrings.RESUMED
  - typingsJapgolly.awsLambda.awsLambdaStrings.FAILED
  - typingsJapgolly.awsLambda.awsLambdaStrings.CANCELED
  - typingsJapgolly.awsLambda.awsLambdaStrings.SUPERSEDED
*/
trait CodePipelineState extends js.Object

object CodePipelineState {
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
  def SUPERSEDED: typingsJapgolly.awsLambda.awsLambdaStrings.SUPERSEDED = this.cast("SUPERSEDED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

