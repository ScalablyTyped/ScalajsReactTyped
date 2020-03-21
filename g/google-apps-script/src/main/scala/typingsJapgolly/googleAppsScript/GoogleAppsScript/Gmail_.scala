package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.UsersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.AutoForwarding
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.BatchDeleteMessagesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.BatchModifyMessagesRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Delegate
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Draft
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Filter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.FilterAction
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.FilterCriteria
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ForwardingAddress
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ImapSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Label
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.LabelColor
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.Message
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePart
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePartBody
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.MessagePartHeader
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ModifyMessageRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ModifyThreadRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.PopSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SendAs
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SmimeInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.SmtpMsa
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.VacationSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gmail_ extends js.Object {
  var Users: js.UndefOr[UsersCollection] = js.undefined
  // Create a new instance of AutoForwarding
  def newAutoForwarding(): AutoForwarding
  // Create a new instance of BatchDeleteMessagesRequest
  def newBatchDeleteMessagesRequest(): BatchDeleteMessagesRequest
  // Create a new instance of BatchModifyMessagesRequest
  def newBatchModifyMessagesRequest(): BatchModifyMessagesRequest
  // Create a new instance of Delegate
  def newDelegate(): Delegate
  // Create a new instance of Draft
  def newDraft(): Draft
  // Create a new instance of Filter
  def newFilter(): Filter
  // Create a new instance of FilterAction
  def newFilterAction(): FilterAction
  // Create a new instance of FilterCriteria
  def newFilterCriteria(): FilterCriteria
  // Create a new instance of ForwardingAddress
  def newForwardingAddress(): ForwardingAddress
  // Create a new instance of ImapSettings
  def newImapSettings(): ImapSettings
  // Create a new instance of Label
  def newLabel(): Label
  // Create a new instance of LabelColor
  def newLabelColor(): LabelColor
  // Create a new instance of Message
  def newMessage(): Message
  // Create a new instance of MessagePart
  def newMessagePart(): MessagePart
  // Create a new instance of MessagePartBody
  def newMessagePartBody(): MessagePartBody
  // Create a new instance of MessagePartHeader
  def newMessagePartHeader(): MessagePartHeader
  // Create a new instance of ModifyMessageRequest
  def newModifyMessageRequest(): ModifyMessageRequest
  // Create a new instance of ModifyThreadRequest
  def newModifyThreadRequest(): ModifyThreadRequest
  // Create a new instance of PopSettings
  def newPopSettings(): PopSettings
  // Create a new instance of SendAs
  def newSendAs(): SendAs
  // Create a new instance of SmimeInfo
  def newSmimeInfo(): SmimeInfo
  // Create a new instance of SmtpMsa
  def newSmtpMsa(): SmtpMsa
  // Create a new instance of VacationSettings
  def newVacationSettings(): VacationSettings
  // Create a new instance of WatchRequest
  def newWatchRequest(): WatchRequest
}

object Gmail_ {
  @scala.inline
  def apply(
    newAutoForwarding: CallbackTo[AutoForwarding],
    newBatchDeleteMessagesRequest: CallbackTo[BatchDeleteMessagesRequest],
    newBatchModifyMessagesRequest: CallbackTo[BatchModifyMessagesRequest],
    newDelegate: CallbackTo[Delegate],
    newDraft: CallbackTo[Draft],
    newFilter: CallbackTo[Filter],
    newFilterAction: CallbackTo[FilterAction],
    newFilterCriteria: CallbackTo[FilterCriteria],
    newForwardingAddress: CallbackTo[ForwardingAddress],
    newImapSettings: CallbackTo[ImapSettings],
    newLabel: CallbackTo[Label],
    newLabelColor: CallbackTo[LabelColor],
    newMessage: CallbackTo[Message],
    newMessagePart: CallbackTo[MessagePart],
    newMessagePartBody: CallbackTo[MessagePartBody],
    newMessagePartHeader: CallbackTo[MessagePartHeader],
    newModifyMessageRequest: CallbackTo[ModifyMessageRequest],
    newModifyThreadRequest: CallbackTo[ModifyThreadRequest],
    newPopSettings: CallbackTo[PopSettings],
    newSendAs: CallbackTo[SendAs],
    newSmimeInfo: CallbackTo[SmimeInfo],
    newSmtpMsa: CallbackTo[SmtpMsa],
    newVacationSettings: CallbackTo[VacationSettings],
    newWatchRequest: CallbackTo[WatchRequest],
    Users: UsersCollection = null
  ): Gmail_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAutoForwarding")(newAutoForwarding.toJsFn)
    __obj.updateDynamic("newBatchDeleteMessagesRequest")(newBatchDeleteMessagesRequest.toJsFn)
    __obj.updateDynamic("newBatchModifyMessagesRequest")(newBatchModifyMessagesRequest.toJsFn)
    __obj.updateDynamic("newDelegate")(newDelegate.toJsFn)
    __obj.updateDynamic("newDraft")(newDraft.toJsFn)
    __obj.updateDynamic("newFilter")(newFilter.toJsFn)
    __obj.updateDynamic("newFilterAction")(newFilterAction.toJsFn)
    __obj.updateDynamic("newFilterCriteria")(newFilterCriteria.toJsFn)
    __obj.updateDynamic("newForwardingAddress")(newForwardingAddress.toJsFn)
    __obj.updateDynamic("newImapSettings")(newImapSettings.toJsFn)
    __obj.updateDynamic("newLabel")(newLabel.toJsFn)
    __obj.updateDynamic("newLabelColor")(newLabelColor.toJsFn)
    __obj.updateDynamic("newMessage")(newMessage.toJsFn)
    __obj.updateDynamic("newMessagePart")(newMessagePart.toJsFn)
    __obj.updateDynamic("newMessagePartBody")(newMessagePartBody.toJsFn)
    __obj.updateDynamic("newMessagePartHeader")(newMessagePartHeader.toJsFn)
    __obj.updateDynamic("newModifyMessageRequest")(newModifyMessageRequest.toJsFn)
    __obj.updateDynamic("newModifyThreadRequest")(newModifyThreadRequest.toJsFn)
    __obj.updateDynamic("newPopSettings")(newPopSettings.toJsFn)
    __obj.updateDynamic("newSendAs")(newSendAs.toJsFn)
    __obj.updateDynamic("newSmimeInfo")(newSmimeInfo.toJsFn)
    __obj.updateDynamic("newSmtpMsa")(newSmtpMsa.toJsFn)
    __obj.updateDynamic("newVacationSettings")(newVacationSettings.toJsFn)
    __obj.updateDynamic("newWatchRequest")(newWatchRequest.toJsFn)
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gmail_]
  }
}

