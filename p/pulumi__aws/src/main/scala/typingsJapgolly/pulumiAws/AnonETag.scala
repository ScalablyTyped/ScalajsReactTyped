package typingsJapgolly.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonETag extends js.Object {
  var eTag: String = js.native
  var key: String = js.native
  var sequencer: String = js.native
  var size: Double = js.native
  var versionId: js.UndefOr[String] = js.native
}

object AnonETag {
  @scala.inline
  def apply(eTag: String, key: String, sequencer: String, size: Double, versionId: String = null): AnonETag = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequencer = sequencer.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonETag]
  }
}

