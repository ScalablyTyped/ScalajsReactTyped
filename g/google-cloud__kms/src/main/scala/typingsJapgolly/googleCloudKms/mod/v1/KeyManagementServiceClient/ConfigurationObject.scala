package typingsJapgolly.googleCloudKms.mod.v1.KeyManagementServiceClient

import typingsJapgolly.googleCloudKms.AnonClientemail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationObject extends js.Object {
  var credentials: js.UndefOr[AnonClientemail] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var keyFilename: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
  var servicePath: js.UndefOr[String] = js.undefined
}

object ConfigurationObject {
  @scala.inline
  def apply(
    credentials: AnonClientemail = null,
    email: String = null,
    keyFilename: String = null,
    port: Int | Double = null,
    projectId: String = null,
    promise: js.Any = null,
    servicePath: String = null
  ): ConfigurationObject = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (keyFilename != null) __obj.updateDynamic("keyFilename")(keyFilename.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationObject]
  }
}

