package typingsJapgolly.awsSdkBucketEndpointMiddleware

import typingsJapgolly.awsSdkBucketEndpointMiddleware.buildBucketEndpointMiddlewareMod.bucketEndpointMiddlewareConfiguration
import typingsJapgolly.awsSdkBucketEndpointMiddleware.buildBucketHostnameMod.BucketHostnameParameters
import typingsJapgolly.awsSdkBucketEndpointMiddleware.buildBucketHostnameMod.BucketHostname_
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/bucket-endpoint-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bucketEndpointMiddleware(): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")().asInstanceOf[BuildMiddleware[Any, Any]]
  inline def bucketEndpointMiddleware(
    hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint: bucketEndpointMiddlewareConfiguration
  ): BuildMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketEndpointMiddleware")(hasForcePathStylePreformedBucketEndpointUseAccelerateEndpointUseDualstackEndpoint.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Any, Any]]
  
  inline def bucketHostname(
    hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible: BucketHostnameParameters
  ): BucketHostname_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bucketHostname")(hasAccelerateEndpointBaseHostnameBucketNameDualstackEndpointPathStyleEndpointSslCompatible.asInstanceOf[js.Any]).asInstanceOf[BucketHostname_]
}
