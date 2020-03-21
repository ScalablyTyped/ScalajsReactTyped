package typingsJapgolly.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigurationTemplateMessage extends js.Object {
  /**
    * The name of the application to delete the configuration template from.
    */
  var ApplicationName: typingsJapgolly.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * The name of the configuration template to delete.
    */
  var TemplateName: ConfigurationTemplateName = js.native
}

object DeleteConfigurationTemplateMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, TemplateName: ConfigurationTemplateName): DeleteConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConfigurationTemplateMessage]
  }
}

