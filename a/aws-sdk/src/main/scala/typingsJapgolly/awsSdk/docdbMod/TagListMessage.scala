package typingsJapgolly.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagListMessage extends js.Object {
  /**
    * A list of one or more tags.
    */
  var TagList: js.UndefOr[typingsJapgolly.awsSdk.docdbMod.TagList] = js.native
}

object TagListMessage {
  @scala.inline
  def apply(TagList: TagList = null): TagListMessage = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagListMessage]
  }
}

