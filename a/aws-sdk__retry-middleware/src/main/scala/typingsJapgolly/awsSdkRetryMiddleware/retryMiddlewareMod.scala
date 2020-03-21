package typingsJapgolly.awsSdkRetryMiddleware

import typingsJapgolly.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.utilMod.DelayDecider
import typingsJapgolly.awsSdkTypes.utilMod.RetryDecider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/retry-middleware/build/retryMiddleware", JSImport.Namespace)
@js.native
object retryMiddlewareMod extends js.Object {
  def retryMiddleware(maxRetries: Double): js.Function1[
    /* next */ FinalizeHandler[_, MetadataBearer, _], 
    FinalizeHandler[_, MetadataBearer, _]
  ] = js.native
  def retryMiddleware(maxRetries: Double, retryDecider: RetryDecider): js.Function1[
    /* next */ FinalizeHandler[_, MetadataBearer, _], 
    FinalizeHandler[_, MetadataBearer, _]
  ] = js.native
  def retryMiddleware(maxRetries: Double, retryDecider: RetryDecider, delayDecider: DelayDecider): js.Function1[
    /* next */ FinalizeHandler[_, MetadataBearer, _], 
    FinalizeHandler[_, MetadataBearer, _]
  ] = js.native
}

