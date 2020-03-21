package typingsJapgolly.inboxsdk.mod.User

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInstance extends js.Object {
  def getAccountSwitcherContactList(): js.Array[Contact]
  def getEmailAddress(): String
  def getLanguage(): String
  def isConversationViewDisabled(): Boolean
  def isUsingGmailMaterialUI(): Boolean
}

object UserInstance {
  @scala.inline
  def apply(
    getAccountSwitcherContactList: CallbackTo[js.Array[Contact]],
    getEmailAddress: CallbackTo[String],
    getLanguage: CallbackTo[String],
    isConversationViewDisabled: CallbackTo[Boolean],
    isUsingGmailMaterialUI: CallbackTo[Boolean]
  ): UserInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAccountSwitcherContactList")(getAccountSwitcherContactList.toJsFn)
    __obj.updateDynamic("getEmailAddress")(getEmailAddress.toJsFn)
    __obj.updateDynamic("getLanguage")(getLanguage.toJsFn)
    __obj.updateDynamic("isConversationViewDisabled")(isConversationViewDisabled.toJsFn)
    __obj.updateDynamic("isUsingGmailMaterialUI")(isUsingGmailMaterialUI.toJsFn)
    __obj.asInstanceOf[UserInstance]
  }
}

