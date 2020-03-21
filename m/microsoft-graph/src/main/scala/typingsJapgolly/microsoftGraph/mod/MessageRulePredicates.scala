package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageRulePredicates extends js.Object {
  /**
    * Represents the strings that should appear in the body of an incoming message in order for the condition or exception to
    * apply.
    */
  var bodyContains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Represents the strings that should appear in the body or subject of an incoming message in order for the condition or
    * exception to apply.
    */
  var bodyOrSubjectContains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Represents the categories that an incoming message should be labeled with in order for the condition or exception to
    * apply.
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  // Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
  var fromAddresses: js.UndefOr[js.Array[Recipient]] = js.undefined
  // Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
  var hasAttachments: js.UndefOr[Boolean] = js.undefined
  /**
    * Represents the strings that appear in the headers of an incoming message in order for the condition or exception to
    * apply.
    */
  var headerContains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal,
    * high.
    */
  var importance: js.UndefOr[Importance] = js.undefined
  // Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
  var isApprovalRequest: js.UndefOr[Boolean] = js.undefined
  // Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
  var isAutomaticForward: js.UndefOr[Boolean] = js.undefined
  // Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
  var isAutomaticReply: js.UndefOr[Boolean] = js.undefined
  // Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  // Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
  var isMeetingRequest: js.UndefOr[Boolean] = js.undefined
  // Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
  var isMeetingResponse: js.UndefOr[Boolean] = js.undefined
  // Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
  var isNonDeliveryReport: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or
    * exception to apply.
    */
  var isPermissionControlled: js.UndefOr[Boolean] = js.undefined
  // Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
  var isReadReceipt: js.UndefOr[Boolean] = js.undefined
  // Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
  var isSigned: js.UndefOr[Boolean] = js.undefined
  // Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
  var isVoicemail: js.UndefOr[Boolean] = js.undefined
  /**
    * Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to
    * apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply,
    * replyToAll, review.
    */
  var messageActionFlag: js.UndefOr[MessageActionFlag] = js.undefined
  /**
    * Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or
    * exception to apply.
    */
  var notSentToMe: js.UndefOr[Boolean] = js.undefined
  /**
    * Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in
    * order for the condition or exception to apply.
    */
  var recipientContains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Represents the strings that appear in the from property of an incoming message in order for the condition or exception
    * to apply.
    */
  var senderContains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to
    * apply. The possible values are: normal, personal, private, confidential.
    */
  var sensitivity: js.UndefOr[Sensitivity] = js.undefined
  /**
    * Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentCcMe: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition
    * or exception to apply.
    */
  var sentOnlyToMe: js.UndefOr[Boolean] = js.undefined
  /**
    * Represents the email addresses that an incoming message must have been sent to in order for the condition or exception
    * to apply.
    */
  var sentToAddresses: js.UndefOr[js.Array[Recipient]] = js.undefined
  /**
    * Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentToMe: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming
    * message in order for the condition or exception to apply.
    */
  var sentToOrCcMe: js.UndefOr[Boolean] = js.undefined
  /**
    * Represents the strings that appear in the subject of an incoming message in order for the condition or exception to
    * apply.
    */
  var subjectContains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the
    * condition or exception to apply.
    */
  var withinSizeRange: js.UndefOr[SizeRange] = js.undefined
}

object MessageRulePredicates {
  @scala.inline
  def apply(
    bodyContains: js.Array[String] = null,
    bodyOrSubjectContains: js.Array[String] = null,
    categories: js.Array[String] = null,
    fromAddresses: js.Array[Recipient] = null,
    hasAttachments: js.UndefOr[Boolean] = js.undefined,
    headerContains: js.Array[String] = null,
    importance: Importance = null,
    isApprovalRequest: js.UndefOr[Boolean] = js.undefined,
    isAutomaticForward: js.UndefOr[Boolean] = js.undefined,
    isAutomaticReply: js.UndefOr[Boolean] = js.undefined,
    isEncrypted: js.UndefOr[Boolean] = js.undefined,
    isMeetingRequest: js.UndefOr[Boolean] = js.undefined,
    isMeetingResponse: js.UndefOr[Boolean] = js.undefined,
    isNonDeliveryReport: js.UndefOr[Boolean] = js.undefined,
    isPermissionControlled: js.UndefOr[Boolean] = js.undefined,
    isReadReceipt: js.UndefOr[Boolean] = js.undefined,
    isSigned: js.UndefOr[Boolean] = js.undefined,
    isVoicemail: js.UndefOr[Boolean] = js.undefined,
    messageActionFlag: MessageActionFlag = null,
    notSentToMe: js.UndefOr[Boolean] = js.undefined,
    recipientContains: js.Array[String] = null,
    senderContains: js.Array[String] = null,
    sensitivity: Sensitivity = null,
    sentCcMe: js.UndefOr[Boolean] = js.undefined,
    sentOnlyToMe: js.UndefOr[Boolean] = js.undefined,
    sentToAddresses: js.Array[Recipient] = null,
    sentToMe: js.UndefOr[Boolean] = js.undefined,
    sentToOrCcMe: js.UndefOr[Boolean] = js.undefined,
    subjectContains: js.Array[String] = null,
    withinSizeRange: SizeRange = null
  ): MessageRulePredicates = {
    val __obj = js.Dynamic.literal()
    if (bodyContains != null) __obj.updateDynamic("bodyContains")(bodyContains.asInstanceOf[js.Any])
    if (bodyOrSubjectContains != null) __obj.updateDynamic("bodyOrSubjectContains")(bodyOrSubjectContains.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (fromAddresses != null) __obj.updateDynamic("fromAddresses")(fromAddresses.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAttachments)) __obj.updateDynamic("hasAttachments")(hasAttachments.asInstanceOf[js.Any])
    if (headerContains != null) __obj.updateDynamic("headerContains")(headerContains.asInstanceOf[js.Any])
    if (importance != null) __obj.updateDynamic("importance")(importance.asInstanceOf[js.Any])
    if (!js.isUndefined(isApprovalRequest)) __obj.updateDynamic("isApprovalRequest")(isApprovalRequest.asInstanceOf[js.Any])
    if (!js.isUndefined(isAutomaticForward)) __obj.updateDynamic("isAutomaticForward")(isAutomaticForward.asInstanceOf[js.Any])
    if (!js.isUndefined(isAutomaticReply)) __obj.updateDynamic("isAutomaticReply")(isAutomaticReply.asInstanceOf[js.Any])
    if (!js.isUndefined(isEncrypted)) __obj.updateDynamic("isEncrypted")(isEncrypted.asInstanceOf[js.Any])
    if (!js.isUndefined(isMeetingRequest)) __obj.updateDynamic("isMeetingRequest")(isMeetingRequest.asInstanceOf[js.Any])
    if (!js.isUndefined(isMeetingResponse)) __obj.updateDynamic("isMeetingResponse")(isMeetingResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(isNonDeliveryReport)) __obj.updateDynamic("isNonDeliveryReport")(isNonDeliveryReport.asInstanceOf[js.Any])
    if (!js.isUndefined(isPermissionControlled)) __obj.updateDynamic("isPermissionControlled")(isPermissionControlled.asInstanceOf[js.Any])
    if (!js.isUndefined(isReadReceipt)) __obj.updateDynamic("isReadReceipt")(isReadReceipt.asInstanceOf[js.Any])
    if (!js.isUndefined(isSigned)) __obj.updateDynamic("isSigned")(isSigned.asInstanceOf[js.Any])
    if (!js.isUndefined(isVoicemail)) __obj.updateDynamic("isVoicemail")(isVoicemail.asInstanceOf[js.Any])
    if (messageActionFlag != null) __obj.updateDynamic("messageActionFlag")(messageActionFlag.asInstanceOf[js.Any])
    if (!js.isUndefined(notSentToMe)) __obj.updateDynamic("notSentToMe")(notSentToMe.asInstanceOf[js.Any])
    if (recipientContains != null) __obj.updateDynamic("recipientContains")(recipientContains.asInstanceOf[js.Any])
    if (senderContains != null) __obj.updateDynamic("senderContains")(senderContains.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(sentCcMe)) __obj.updateDynamic("sentCcMe")(sentCcMe.asInstanceOf[js.Any])
    if (!js.isUndefined(sentOnlyToMe)) __obj.updateDynamic("sentOnlyToMe")(sentOnlyToMe.asInstanceOf[js.Any])
    if (sentToAddresses != null) __obj.updateDynamic("sentToAddresses")(sentToAddresses.asInstanceOf[js.Any])
    if (!js.isUndefined(sentToMe)) __obj.updateDynamic("sentToMe")(sentToMe.asInstanceOf[js.Any])
    if (!js.isUndefined(sentToOrCcMe)) __obj.updateDynamic("sentToOrCcMe")(sentToOrCcMe.asInstanceOf[js.Any])
    if (subjectContains != null) __obj.updateDynamic("subjectContains")(subjectContains.asInstanceOf[js.Any])
    if (withinSizeRange != null) __obj.updateDynamic("withinSizeRange")(withinSizeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRulePredicates]
  }
}

