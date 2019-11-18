package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorID extends js.Object {
  val appCodeName: java.lang.String
  val appName: java.lang.String
  val appVersion: java.lang.String
  val oscpu: java.lang.String
  val platform: java.lang.String
  val product: java.lang.String
  val productSub: java.lang.String
  val userAgent: java.lang.String
  val vendor: java.lang.String
  val vendorSub: java.lang.String
  def taintEnabled(): scala.Boolean
}

object NavigatorID {
  @scala.inline
  def apply(
    appCodeName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    oscpu: java.lang.String,
    platform: java.lang.String,
    product: java.lang.String,
    productSub: java.lang.String,
    taintEnabled: CallbackTo[scala.Boolean],
    userAgent: java.lang.String,
    vendor: java.lang.String,
    vendorSub: java.lang.String
  ): NavigatorID = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], oscpu = oscpu.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productSub = productSub.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorSub = vendorSub.asInstanceOf[js.Any])
    __obj.updateDynamic("taintEnabled")(taintEnabled.toJsFn)
    __obj.asInstanceOf[NavigatorID]
  }
}

