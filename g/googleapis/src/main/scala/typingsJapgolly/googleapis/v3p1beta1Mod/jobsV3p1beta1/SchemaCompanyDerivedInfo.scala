package typingsJapgolly.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Derived details about the company.
  */
@js.native
trait SchemaCompanyDerivedInfo extends js.Object {
  /**
    * A structured headquarters location of the company, resolved from
    * Company.hq_location if provided.
    */
  var headquartersLocation: js.UndefOr[SchemaLocation] = js.native
}

object SchemaCompanyDerivedInfo {
  @scala.inline
  def apply(headquartersLocation: SchemaLocation = null): SchemaCompanyDerivedInfo = {
    val __obj = js.Dynamic.literal()
    if (headquartersLocation != null) __obj.updateDynamic("headquartersLocation")(headquartersLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompanyDerivedInfo]
  }
}

