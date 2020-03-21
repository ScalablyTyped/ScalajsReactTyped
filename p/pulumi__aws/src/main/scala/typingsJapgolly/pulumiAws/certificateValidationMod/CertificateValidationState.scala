package typingsJapgolly.pulumiAws.certificateValidationMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateValidationState extends js.Object {
  /**
    * The ARN of the certificate that is being validated.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
    */
  val validationRecordFqdns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object CertificateValidationState {
  @scala.inline
  def apply(certificateArn: Input[String] = null, validationRecordFqdns: Input[js.Array[Input[String]]] = null): CertificateValidationState = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (validationRecordFqdns != null) __obj.updateDynamic("validationRecordFqdns")(validationRecordFqdns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateValidationState]
  }
}

