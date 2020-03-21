package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssociationStatusResult extends js.Object {
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.AssociationDescription] = js.native
}

object UpdateAssociationStatusResult {
  @scala.inline
  def apply(AssociationDescription: AssociationDescription = null): UpdateAssociationStatusResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationDescription != null) __obj.updateDynamic("AssociationDescription")(AssociationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssociationStatusResult]
  }
}

