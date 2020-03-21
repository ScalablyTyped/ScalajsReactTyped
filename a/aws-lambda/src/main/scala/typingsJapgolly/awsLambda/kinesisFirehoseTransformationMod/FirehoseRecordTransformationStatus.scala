package typingsJapgolly.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.awsLambdaStrings.Ok
  - typingsJapgolly.awsLambda.awsLambdaStrings.Dropped
  - typingsJapgolly.awsLambda.awsLambdaStrings.ProcessingFailed
*/
trait FirehoseRecordTransformationStatus extends js.Object

object FirehoseRecordTransformationStatus {
  @scala.inline
  def Dropped: typingsJapgolly.awsLambda.awsLambdaStrings.Dropped = this.cast("Dropped")
  @scala.inline
  def Ok: typingsJapgolly.awsLambda.awsLambdaStrings.Ok = this.cast("Ok")
  @scala.inline
  def ProcessingFailed: typingsJapgolly.awsLambda.awsLambdaStrings.ProcessingFailed = this.cast("ProcessingFailed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

