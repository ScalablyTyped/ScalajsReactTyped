package typingsJapgolly.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllocationsrequiringfileextension extends js.Object {
  var `allocations requiring file extension`: Double
  var `blocks allocated`: Double
  var `blocks freed`: Double
  var `checkpoint size`: Double
  var `file allocation unit size`: Double
  var `file bytes available for reuse`: Double
  var `file magic number`: Double
  var `file major version number`: Double
  var `file size in bytes`: Double
  var `minor version number`: Double
}

object AnonAllocationsrequiringfileextension {
  @scala.inline
  def apply(
    `allocations requiring file extension`: Double,
    `blocks allocated`: Double,
    `blocks freed`: Double,
    `checkpoint size`: Double,
    `file allocation unit size`: Double,
    `file bytes available for reuse`: Double,
    `file magic number`: Double,
    `file major version number`: Double,
    `file size in bytes`: Double,
    `minor version number`: Double
  ): AnonAllocationsrequiringfileextension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allocations requiring file extension")(`allocations requiring file extension`.asInstanceOf[js.Any])
    __obj.updateDynamic("blocks allocated")(`blocks allocated`.asInstanceOf[js.Any])
    __obj.updateDynamic("blocks freed")(`blocks freed`.asInstanceOf[js.Any])
    __obj.updateDynamic("checkpoint size")(`checkpoint size`.asInstanceOf[js.Any])
    __obj.updateDynamic("file allocation unit size")(`file allocation unit size`.asInstanceOf[js.Any])
    __obj.updateDynamic("file bytes available for reuse")(`file bytes available for reuse`.asInstanceOf[js.Any])
    __obj.updateDynamic("file magic number")(`file magic number`.asInstanceOf[js.Any])
    __obj.updateDynamic("file major version number")(`file major version number`.asInstanceOf[js.Any])
    __obj.updateDynamic("file size in bytes")(`file size in bytes`.asInstanceOf[js.Any])
    __obj.updateDynamic("minor version number")(`minor version number`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllocationsrequiringfileextension]
  }
}

