package typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutQuotaBytesByService extends js.Object {
  var bytesUsed: js.UndefOr[String] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
}

object AboutQuotaBytesByService {
  @scala.inline
  def apply(bytesUsed: String = null, serviceName: String = null): AboutQuotaBytesByService = {
    val __obj = js.Dynamic.literal()
    if (bytesUsed != null) __obj.updateDynamic("bytesUsed")(bytesUsed.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboutQuotaBytesByService]
  }
}

