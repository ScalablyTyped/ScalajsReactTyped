package typingsJapgolly.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The type of tag on which to filter.
    */
  var key: TagKey = js.native
  /**
    * A value for a tag key on which to filter.
    */
  var value: TagValue = js.native
}

object Tag {
  @scala.inline
  def apply(key: TagKey, value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

