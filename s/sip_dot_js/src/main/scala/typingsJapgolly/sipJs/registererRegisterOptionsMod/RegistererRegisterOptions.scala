package typingsJapgolly.sipJs.registererRegisterOptionsMod

import typingsJapgolly.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsJapgolly.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistererRegisterOptions extends js.Object {
  /** See `core` API. */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
}

object RegistererRegisterOptions {
  @scala.inline
  def apply(requestDelegate: OutgoingRequestDelegate = null, requestOptions: RequestOptions = null): RegistererRegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (requestDelegate != null) __obj.updateDynamic("requestDelegate")(requestDelegate.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistererRegisterOptions]
  }
}

