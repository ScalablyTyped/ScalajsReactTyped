package typingsJapgolly.googleCloudStorage.aclMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleCloudCommon.utilMod.BodyResponseCallback
import typingsJapgolly.googleCloudCommon.utilMod.DecorateRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclOptions extends js.Object {
  var pathPrefix: String
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit
}

object AclOptions {
  @scala.inline
  def apply(pathPrefix: String, request: (DecorateRequestOptions, BodyResponseCallback) => Callback): AclOptions = {
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix.asInstanceOf[js.Any])
    __obj.updateDynamic("request")(js.Any.fromFunction2((t0: typingsJapgolly.googleCloudCommon.utilMod.DecorateRequestOptions, t1: typingsJapgolly.googleCloudCommon.utilMod.BodyResponseCallback) => request(t0, t1).runNow()))
    __obj.asInstanceOf[AclOptions]
  }
}

