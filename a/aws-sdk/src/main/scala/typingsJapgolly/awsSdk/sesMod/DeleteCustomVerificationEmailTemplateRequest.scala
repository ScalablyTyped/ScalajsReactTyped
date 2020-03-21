package typingsJapgolly.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomVerificationEmailTemplateRequest extends js.Object {
  /**
    * The name of the custom verification email template that you want to delete.
    */
  var TemplateName: typingsJapgolly.awsSdk.sesMod.TemplateName = js.native
}

object DeleteCustomVerificationEmailTemplateRequest {
  @scala.inline
  def apply(TemplateName: TemplateName): DeleteCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCustomVerificationEmailTemplateRequest]
  }
}

