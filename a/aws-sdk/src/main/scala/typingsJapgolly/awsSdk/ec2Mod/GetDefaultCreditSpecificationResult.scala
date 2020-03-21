package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultCreditSpecificationResult extends js.Object {
  /**
    * The default credit option for CPU usage of the instance family.
    */
  var InstanceFamilyCreditSpecification: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.InstanceFamilyCreditSpecification] = js.native
}

object GetDefaultCreditSpecificationResult {
  @scala.inline
  def apply(InstanceFamilyCreditSpecification: InstanceFamilyCreditSpecification = null): GetDefaultCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceFamilyCreditSpecification != null) __obj.updateDynamic("InstanceFamilyCreditSpecification")(InstanceFamilyCreditSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultCreditSpecificationResult]
  }
}

