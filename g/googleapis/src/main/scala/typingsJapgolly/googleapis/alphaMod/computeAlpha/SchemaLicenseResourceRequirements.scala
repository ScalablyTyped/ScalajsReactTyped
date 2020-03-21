package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLicenseResourceRequirements extends js.Object {
  /**
    * Minimum number of guest cpus required to use the Instance. Enforced at
    * Instance creation and Instance start.
    */
  var minGuestCpuCount: js.UndefOr[Double] = js.native
  /**
    * Minimum memory required to use the Instance. Enforced at Instance
    * creation and Instance start.
    */
  var minMemoryMb: js.UndefOr[Double] = js.native
}

object SchemaLicenseResourceRequirements {
  @scala.inline
  def apply(minGuestCpuCount: Int | Double = null, minMemoryMb: Int | Double = null): SchemaLicenseResourceRequirements = {
    val __obj = js.Dynamic.literal()
    if (minGuestCpuCount != null) __obj.updateDynamic("minGuestCpuCount")(minGuestCpuCount.asInstanceOf[js.Any])
    if (minMemoryMb != null) __obj.updateDynamic("minMemoryMb")(minMemoryMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLicenseResourceRequirements]
  }
}

