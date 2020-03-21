package typingsJapgolly.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionCustomErrorResponse extends js.Object {
  /**
    * The minimum amount of time you want
    * HTTP error codes to stay in CloudFront caches before CloudFront queries your
    * origin to see whether the object has been updated.
    */
  var errorCachingMinTtl: js.UndefOr[Double] = js.native
  /**
    * The 4xx or 5xx HTTP status code that you want to
    * customize.
    */
  var errorCode: Double = js.native
  /**
    * The HTTP status code that you want CloudFront
    * to return with the custom error page to the viewer.
    */
  var responseCode: js.UndefOr[Double] = js.native
  /**
    * The path of the custom error page (for
    * example, `/custom_404.html`).
    */
  var responsePagePath: js.UndefOr[String] = js.native
}

object DistributionCustomErrorResponse {
  @scala.inline
  def apply(
    errorCode: Double,
    errorCachingMinTtl: Int | Double = null,
    responseCode: Int | Double = null,
    responsePagePath: String = null
  ): DistributionCustomErrorResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    if (errorCachingMinTtl != null) __obj.updateDynamic("errorCachingMinTtl")(errorCachingMinTtl.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    if (responsePagePath != null) __obj.updateDynamic("responsePagePath")(responsePagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionCustomErrorResponse]
  }
}

