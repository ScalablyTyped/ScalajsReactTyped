package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskImageVolumeDescription extends js.Object {
  /**
    * The volume identifier.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The size of the volume, in GiB.
    */
  var Size: js.UndefOr[Long] = js.native
}

object DiskImageVolumeDescription {
  @scala.inline
  def apply(Id: String = null, Size: Int | scala.Double = null): DiskImageVolumeDescription = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskImageVolumeDescription]
  }
}

