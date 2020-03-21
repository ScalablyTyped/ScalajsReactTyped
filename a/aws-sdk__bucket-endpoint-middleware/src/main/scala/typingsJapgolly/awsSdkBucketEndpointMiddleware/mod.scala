package typingsJapgolly.awsSdkBucketEndpointMiddleware

import typingsJapgolly.awsSdkBucketEndpointMiddleware.bucketEndpointMiddlewareMod.bucketEndpointMiddlewareConfiguration
import typingsJapgolly.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostnameParameters
import typingsJapgolly.awsSdkBucketEndpointMiddleware.bucketHostnameMod.BucketHostname_
import typingsJapgolly.awsSdkTypes.middlewareMod.BuildMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/bucket-endpoint-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def bucketEndpointMiddleware(): BuildMiddleware[_, _, _] = js.native
  def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[_, _, _] = js.native
  def bucketHostname(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname_ = js.native
}

