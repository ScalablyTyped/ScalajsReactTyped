package typingsJapgolly.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateUserStackResult extends js.Object {
  /**
    * The list of UserStackAssociationError objects.
    */
  var errors: js.UndefOr[UserStackAssociationErrorList] = js.native
}

object BatchAssociateUserStackResult {
  @scala.inline
  def apply(errors: UserStackAssociationErrorList = null): BatchAssociateUserStackResult = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateUserStackResult]
  }
}

