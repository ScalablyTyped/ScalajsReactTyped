package typingsJapgolly.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateCertificateRequest extends js.Object {
  /**
    * The ARN of the ACM certificate that you want to disassociate from your MediaConvert resource.
    */
  var Arn: string = js.native
}

object DisassociateCertificateRequest {
  @scala.inline
  def apply(Arn: string): DisassociateCertificateRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateCertificateRequest]
  }
}

