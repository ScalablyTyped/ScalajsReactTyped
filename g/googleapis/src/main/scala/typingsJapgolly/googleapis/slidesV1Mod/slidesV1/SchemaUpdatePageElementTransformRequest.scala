package typingsJapgolly.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the transform of a page element.  Updating the transform of a group
  * will change the absolute transform of the page elements in that group,
  * which can change their visual appearance. See the documentation for
  * PageElement.transform for more details.
  */
@js.native
trait SchemaUpdatePageElementTransformRequest extends js.Object {
  /**
    * The apply mode of the transform update.
    */
  var applyMode: js.UndefOr[String] = js.native
  /**
    * The object ID of the page element to update.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The input transform matrix used to update the page element.
    */
  var transform: js.UndefOr[SchemaAffineTransform] = js.native
}

object SchemaUpdatePageElementTransformRequest {
  @scala.inline
  def apply(applyMode: String = null, objectId: String = null, transform: SchemaAffineTransform = null): SchemaUpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    if (applyMode != null) __obj.updateDynamic("applyMode")(applyMode.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdatePageElementTransformRequest]
  }
}

