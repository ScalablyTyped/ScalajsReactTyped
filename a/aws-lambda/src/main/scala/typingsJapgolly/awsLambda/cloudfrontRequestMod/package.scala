package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudfrontRequestMod {
  type CloudFrontRequestCallback = typingsJapgolly.awsLambda.handlerMod.Callback[typingsJapgolly.awsLambda.cloudfrontRequestMod.CloudFrontRequestResult]
  type CloudFrontRequestHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.cloudfrontRequestMod.CloudFrontRequestEvent, 
    typingsJapgolly.awsLambda.cloudfrontRequestMod.CloudFrontRequestResult
  ]
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Null
    - typingsJapgolly.awsLambda.cloudfrontMod.CloudFrontResultResponse
    - typingsJapgolly.awsLambda.cloudfrontMod.CloudFrontRequest
  */
  type CloudFrontRequestResult = js.UndefOr[
    typingsJapgolly.awsLambda.cloudfrontRequestMod._CloudFrontRequestResult | scala.Null
  ]
}
