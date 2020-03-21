package typingsJapgolly.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTag extends js.Object {
  /**
    * The resource tag key.
    */
  var Key: ResourceTagKey = js.native
  /**
    * The resource tag value.
    */
  var Value: js.UndefOr[ResourceTagValue] = js.native
}

object ResourceTag {
  @scala.inline
  def apply(Key: ResourceTagKey, Value: ResourceTagValue = null): ResourceTag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
}

