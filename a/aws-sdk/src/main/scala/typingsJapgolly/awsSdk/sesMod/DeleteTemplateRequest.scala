package typingsJapgolly.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTemplateRequest extends js.Object {
  /**
    * The name of the template to be deleted.
    */
  var TemplateName: typingsJapgolly.awsSdk.sesMod.TemplateName = js.native
}

object DeleteTemplateRequest {
  @scala.inline
  def apply(TemplateName: TemplateName): DeleteTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTemplateRequest]
  }
}

