package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisFirehoseTransformationMod {
  type FirehoseTransformationCallback = typingsJapgolly.awsLambda.handlerMod.Callback[
    typingsJapgolly.awsLambda.kinesisFirehoseTransformationMod.FirehoseTransformationResult
  ]
  type FirehoseTransformationHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.kinesisFirehoseTransformationMod.FirehoseTransformationEvent, 
    typingsJapgolly.awsLambda.kinesisFirehoseTransformationMod.FirehoseTransformationResult
  ]
}
