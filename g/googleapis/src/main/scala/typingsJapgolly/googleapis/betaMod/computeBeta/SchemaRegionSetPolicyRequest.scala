package typingsJapgolly.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionSetPolicyRequest extends js.Object {
  /**
    * Flatten Policy to create a backwacd compatible wire-format. Deprecated.
    * Use &#39;policy&#39; to specify bindings.
    */
  var bindings: js.UndefOr[js.Array[SchemaBinding]] = js.native
  /**
    * Flatten Policy to create a backward compatible wire-format. Deprecated.
    * Use &#39;policy&#39; to specify the etag.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * REQUIRED: The complete policy to be applied to the &#39;resource&#39;.
    * The size of the policy is limited to a few 10s of KB. An empty policy is
    * in general a valid policy but certain services (like Projects) might
    * reject them.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
}

object SchemaRegionSetPolicyRequest {
  @scala.inline
  def apply(bindings: js.Array[SchemaBinding] = null, etag: String = null, policy: SchemaPolicy = null): SchemaRegionSetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionSetPolicyRequest]
  }
}

