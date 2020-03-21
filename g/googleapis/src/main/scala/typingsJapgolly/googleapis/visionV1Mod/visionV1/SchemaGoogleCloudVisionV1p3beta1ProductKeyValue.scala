package typingsJapgolly.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product label represented as a key-value pair.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1ProductKeyValue extends js.Object {
  /**
    * The key of the label attached to the product. Cannot be empty and cannot
    * exceed 128 bytes.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The value of the label attached to the product. Cannot be empty and
    * cannot exceed 128 bytes.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1ProductKeyValue {
  @scala.inline
  def apply(key: String = null, value: String = null): SchemaGoogleCloudVisionV1p3beta1ProductKeyValue = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1ProductKeyValue]
  }
}

