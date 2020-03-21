package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPreservedStatePreservedDisk extends js.Object {
  /**
    * These stateful disks will never be deleted during autohealing, update,
    * instance recreate operations. This flag is used to configure if the disk
    * should be deleted after it is no longer used by the group, e.g. when the
    * given instance or the whole MIG is deleted. Note: disks attached in
    * READ_ONLY mode cannot be auto-deleted.
    */
  var autoDelete: js.UndefOr[String] = js.native
  /**
    * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If
    * not specified, the default is to attach the disk in READ_WRITE mode.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The URL of the disk resource that is stateful and should be attached to
    * the VM instance.
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaPreservedStatePreservedDisk {
  @scala.inline
  def apply(autoDelete: String = null, mode: String = null, source: String = null): SchemaPreservedStatePreservedDisk = {
    val __obj = js.Dynamic.literal()
    if (autoDelete != null) __obj.updateDynamic("autoDelete")(autoDelete.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPreservedStatePreservedDisk]
  }
}

