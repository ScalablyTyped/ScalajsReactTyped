package typingsJapgolly.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * A value that specifies the TagKey, the name of the tag. Tag keys must be unique for the resource to which they are attached.
    */
  var Key: js.UndefOr[TagKey] = js.native
  /**
    * A value that specifies the TagValue, the value assigned to the corresponding tag key. Tag values can be null and don't have to be unique in a tag set. For example, you can have a key-value pair in a tag set of finances : April and also of payroll : April.
    */
  var Value: js.UndefOr[TagValue] = js.native
}

object Tag {
  @scala.inline
  def apply(Key: TagKey = null, Value: TagValue = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

