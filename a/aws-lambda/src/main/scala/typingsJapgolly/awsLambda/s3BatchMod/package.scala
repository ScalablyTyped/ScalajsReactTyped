package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object s3BatchMod {
  type S3BatchCallback = typingsJapgolly.awsLambda.handlerMod.Callback[typingsJapgolly.awsLambda.s3BatchMod.S3BatchResult]
  type S3BatchHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.s3BatchMod.S3BatchEvent, 
    typingsJapgolly.awsLambda.s3BatchMod.S3BatchResult
  ]
}
