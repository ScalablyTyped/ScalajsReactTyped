package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudfrontResponseMod {
  type CloudFrontResponseCallback = typingsJapgolly.awsLambda.handlerMod.Callback[typingsJapgolly.awsLambda.cloudfrontResponseMod.CloudFrontResponseResult]
  type CloudFrontResponseHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.cloudfrontResponseMod.CloudFrontResponseEvent, 
    typingsJapgolly.awsLambda.cloudfrontResponseMod.CloudFrontResponseResult
  ]
  type CloudFrontResponseResult = js.UndefOr[scala.Null | typingsJapgolly.awsLambda.cloudfrontMod.CloudFrontResultResponse]
}
