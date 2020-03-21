package typingsJapgolly.pulumiAws.inputMod.elasticsearch

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEbsOptions extends js.Object {
  /**
    * Whether EBS volumes are attached to data nodes in the domain.
    */
  var ebsEnabled: Input[Boolean] = js.native
  /**
    * The baseline input/output (I/O) performance of EBS volumes
    * attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The size of EBS volumes attached to data nodes (in GB).
    * **Required** if `ebsEnabled` is set to `true`.
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of EBS volumes attached to data nodes.
    */
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object DomainEbsOptions {
  @scala.inline
  def apply(
    ebsEnabled: Input[Boolean],
    iops: Input[Double] = null,
    volumeSize: Input[Double] = null,
    volumeType: Input[String] = null
  ): DomainEbsOptions = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEbsOptions]
  }
}

