package typingsJapgolly.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateRequest extends js.Object {
  /**
    * The content of the email, composed of a subject line, an HTML part, and a text-only part.
    */
  var Template: typingsJapgolly.awsSdk.sesMod.Template = js.native
}

object CreateTemplateRequest {
  @scala.inline
  def apply(Template: Template): CreateTemplateRequest = {
    val __obj = js.Dynamic.literal(Template = Template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTemplateRequest]
  }
}

