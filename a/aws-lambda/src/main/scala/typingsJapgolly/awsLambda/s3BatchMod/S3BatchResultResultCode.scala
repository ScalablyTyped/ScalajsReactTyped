package typingsJapgolly.awsLambda.s3BatchMod

import typingsJapgolly.awsLambda.awsLambdaStrings.Succeeded_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.awsLambdaStrings.Succeeded_
  - typingsJapgolly.awsLambda.awsLambdaStrings.TemporaryFailure
  - typingsJapgolly.awsLambda.awsLambdaStrings.PermanentFailure
*/
trait S3BatchResultResultCode extends js.Object

object S3BatchResultResultCode {
  @scala.inline
  def PermanentFailure: typingsJapgolly.awsLambda.awsLambdaStrings.PermanentFailure = this.cast("PermanentFailure")
  @scala.inline
  def Succeeded: Succeeded_ = this.cast("Succeeded")
  @scala.inline
  def TemporaryFailure: typingsJapgolly.awsLambda.awsLambdaStrings.TemporaryFailure = this.cast("TemporaryFailure")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

