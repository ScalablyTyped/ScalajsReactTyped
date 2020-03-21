package typingsJapgolly.pulumiAws.inputMod.cloudfront

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOrderedCacheBehavior extends js.Object {
  /**
    * Controls which HTTP methods CloudFront
    * processes and forwards to your Amazon S3 bucket or your custom origin.
    */
  var allowedMethods: Input[js.Array[Input[String]]] = js.native
  /**
    * Controls whether CloudFront caches the
    * response to requests using the specified HTTP methods.
    */
  var cachedMethods: Input[js.Array[Input[String]]] = js.native
  /**
    * Whether you want CloudFront to automatically
    * compress content for web requests that include `Accept-Encoding: gzip` in
    * the request header (default: `false`).
    */
  var compress: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The default amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * in the absence of an `Cache-Control max-age` or `Expires` header. Defaults to
    * 1 day.
    */
  var defaultTtl: js.UndefOr[Input[Double]] = js.native
  /**
    * Field level encryption configuration ID
    */
  var fieldLevelEncryptionId: js.UndefOr[Input[String]] = js.native
  /**
    * The forwarded values configuration that specifies how CloudFront
    * handles query strings, cookies and headers (maximum one).
    */
  var forwardedValues: Input[DistributionOrderedCacheBehaviorForwardedValues] = js.native
  /**
    * A config block that triggers a lambda function with
    * specific actions. Defined below, maximum 4.
    */
  var lambdaFunctionAssociations: js.UndefOr[
    Input[js.Array[Input[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]]]
  ] = js.native
  /**
    * The maximum amount of time (in seconds) that an
    * object is in a CloudFront cache before CloudFront forwards another request
    * to your origin to determine whether the object has been updated. Only
    * effective in the presence of `Cache-Control max-age`, `Cache-Control
    * s-maxage`, and `Expires` headers. Defaults to 365 days.
    */
  var maxTtl: js.UndefOr[Input[Double]] = js.native
  /**
    * The minimum amount of time that you want objects to
    * stay in CloudFront caches before CloudFront queries your origin to see
    * whether the object has been updated. Defaults to 0 seconds.
    */
  var minTtl: js.UndefOr[Input[Double]] = js.native
  /**
    * The pattern (for example, `images/ *.jpg)` that
    * specifies which requests you want this cache behavior to apply to.
    */
  var pathPattern: Input[String] = js.native
  /**
    * Indicates whether you want to distribute
    * media files in Microsoft Smooth Streaming format using the origin that is
    * associated with this cache behavior.
    */
  var smoothStreaming: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The value of ID for the origin that you want
    * CloudFront to route requests to when a request matches the path pattern
    * either for a cache behavior or for the default cache behavior.
    */
  var targetOriginId: Input[String] = js.native
  /**
    * The AWS accounts, if any, that you want to
    * allow to create signed URLs for private content.
    */
  var trustedSigners: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Use this element to specify the
    * protocol that users can use to access the files in the origin specified by
    * TargetOriginId when a request matches the path pattern in PathPattern. One
    * of `allow-all`, `https-only`, or `redirect-to-https`.
    */
  var viewerProtocolPolicy: Input[String] = js.native
}

object DistributionOrderedCacheBehavior {
  @scala.inline
  def apply(
    allowedMethods: Input[js.Array[Input[String]]],
    cachedMethods: Input[js.Array[Input[String]]],
    forwardedValues: Input[DistributionOrderedCacheBehaviorForwardedValues],
    pathPattern: Input[String],
    targetOriginId: Input[String],
    viewerProtocolPolicy: Input[String],
    compress: Input[Boolean] = null,
    defaultTtl: Input[Double] = null,
    fieldLevelEncryptionId: Input[String] = null,
    lambdaFunctionAssociations: Input[js.Array[Input[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]]] = null,
    maxTtl: Input[Double] = null,
    minTtl: Input[Double] = null,
    smoothStreaming: Input[Boolean] = null,
    trustedSigners: Input[js.Array[Input[String]]] = null
  ): DistributionOrderedCacheBehavior = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], cachedMethods = cachedMethods.asInstanceOf[js.Any], forwardedValues = forwardedValues.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any], targetOriginId = targetOriginId.asInstanceOf[js.Any], viewerProtocolPolicy = viewerProtocolPolicy.asInstanceOf[js.Any])
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (defaultTtl != null) __obj.updateDynamic("defaultTtl")(defaultTtl.asInstanceOf[js.Any])
    if (fieldLevelEncryptionId != null) __obj.updateDynamic("fieldLevelEncryptionId")(fieldLevelEncryptionId.asInstanceOf[js.Any])
    if (lambdaFunctionAssociations != null) __obj.updateDynamic("lambdaFunctionAssociations")(lambdaFunctionAssociations.asInstanceOf[js.Any])
    if (maxTtl != null) __obj.updateDynamic("maxTtl")(maxTtl.asInstanceOf[js.Any])
    if (minTtl != null) __obj.updateDynamic("minTtl")(minTtl.asInstanceOf[js.Any])
    if (smoothStreaming != null) __obj.updateDynamic("smoothStreaming")(smoothStreaming.asInstanceOf[js.Any])
    if (trustedSigners != null) __obj.updateDynamic("trustedSigners")(trustedSigners.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrderedCacheBehavior]
  }
}

