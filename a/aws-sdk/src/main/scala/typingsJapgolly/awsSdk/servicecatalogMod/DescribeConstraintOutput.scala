package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConstraintOutput extends js.Object {
  /**
    * Information about the constraint.
    */
  var ConstraintDetail: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.ConstraintDetail] = js.native
  /**
    * The constraint parameters.
    */
  var ConstraintParameters: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.ConstraintParameters] = js.native
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.Status] = js.native
}

object DescribeConstraintOutput {
  @scala.inline
  def apply(
    ConstraintDetail: ConstraintDetail = null,
    ConstraintParameters: ConstraintParameters = null,
    Status: Status = null
  ): DescribeConstraintOutput = {
    val __obj = js.Dynamic.literal()
    if (ConstraintDetail != null) __obj.updateDynamic("ConstraintDetail")(ConstraintDetail.asInstanceOf[js.Any])
    if (ConstraintParameters != null) __obj.updateDynamic("ConstraintParameters")(ConstraintParameters.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConstraintOutput]
  }
}

