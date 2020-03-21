package typingsJapgolly.reactGoogleLoginComponent.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactGoogleLoginComponent.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLoginInfo extends js.Object {
  def getAuthResponse(): AnonAccesstoken
}

object GoogleLoginInfo {
  @scala.inline
  def apply(getAuthResponse: CallbackTo[AnonAccesstoken]): GoogleLoginInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAuthResponse")(getAuthResponse.toJsFn)
    __obj.asInstanceOf[GoogleLoginInfo]
  }
}

