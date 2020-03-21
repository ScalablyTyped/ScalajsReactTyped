package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {
  /**
    * An object that contains a list of errors, along with information to help you identify the self-service action.
    */
  var FailedServiceActionAssociations: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.FailedServiceActionAssociations] = js.native
}

object BatchDisassociateServiceActionFromProvisioningArtifactOutput {
  @scala.inline
  def apply(FailedServiceActionAssociations: FailedServiceActionAssociations = null): BatchDisassociateServiceActionFromProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    if (FailedServiceActionAssociations != null) __obj.updateDynamic("FailedServiceActionAssociations")(FailedServiceActionAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactOutput]
  }
}

