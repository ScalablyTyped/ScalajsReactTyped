package typingsJapgolly.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStorageFree extends js.Object {
  var storageFree: js.UndefOr[String] = js.native
  var storageTotal: js.UndefOr[String] = js.native
  var volumeId: js.UndefOr[String] = js.native
}

object AnonStorageFree {
  @scala.inline
  def apply(storageFree: String = null, storageTotal: String = null, volumeId: String = null): AnonStorageFree = {
    val __obj = js.Dynamic.literal()
    if (storageFree != null) __obj.updateDynamic("storageFree")(storageFree.asInstanceOf[js.Any])
    if (storageTotal != null) __obj.updateDynamic("storageTotal")(storageTotal.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStorageFree]
  }
}

