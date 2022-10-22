package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailTips extends StObject {
  
  // Mail tips for automatic reply if it has been set up by the recipient.
  var automaticReplies: js.UndefOr[NullableOption[AutomaticRepliesMailTips]] = js.undefined
  
  // A custom mail tip that can be set on the recipient's mailbox.
  var customMailTip: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders,
    * rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders.
    */
  var deliveryRestricted: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The email address of the recipient to get mailtips for.
  var emailAddress: js.UndefOr[NullableOption[EmailAddress]] = js.undefined
  
  // Errors that occur during the getMailTips action.
  var error: js.UndefOr[NullableOption[MailTipsError]] = js.undefined
  
  // The number of external members if the recipient is a distribution list.
  var externalMemberCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list
    * and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a
    * recipient requires approval of the recipient's manager.
    */
  var isModerated: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The mailbox full status of the recipient.
  var mailboxFull: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The maximum message size that has been configured for the recipient's organization or mailbox.
  var maxMessageSize: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For
    * example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator
    * wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their
    * message may leave the organization, helping them make the correct decisions about wording, tone and content.
    */
  var recipientScope: js.UndefOr[NullableOption[RecipientScopeType]] = js.undefined
  
  // Recipients suggested based on previous contexts where they appear in the same message.
  var recipientSuggestions: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  // The number of members if the recipient is a distribution list.
  var totalMemberCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object MailTips {
  
  inline def apply(): MailTips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailTips]
  }
  
  extension [Self <: MailTips](x: Self) {
    
    inline def setAutomaticReplies(value: NullableOption[AutomaticRepliesMailTips]): Self = StObject.set(x, "automaticReplies", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRepliesNull: Self = StObject.set(x, "automaticReplies", null)
    
    inline def setAutomaticRepliesUndefined: Self = StObject.set(x, "automaticReplies", js.undefined)
    
    inline def setCustomMailTip(value: NullableOption[String]): Self = StObject.set(x, "customMailTip", value.asInstanceOf[js.Any])
    
    inline def setCustomMailTipNull: Self = StObject.set(x, "customMailTip", null)
    
    inline def setCustomMailTipUndefined: Self = StObject.set(x, "customMailTip", js.undefined)
    
    inline def setDeliveryRestricted(value: NullableOption[Boolean]): Self = StObject.set(x, "deliveryRestricted", value.asInstanceOf[js.Any])
    
    inline def setDeliveryRestrictedNull: Self = StObject.set(x, "deliveryRestricted", null)
    
    inline def setDeliveryRestrictedUndefined: Self = StObject.set(x, "deliveryRestricted", js.undefined)
    
    inline def setEmailAddress(value: NullableOption[EmailAddress]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setError(value: NullableOption[MailTipsError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExternalMemberCount(value: NullableOption[Double]): Self = StObject.set(x, "externalMemberCount", value.asInstanceOf[js.Any])
    
    inline def setExternalMemberCountNull: Self = StObject.set(x, "externalMemberCount", null)
    
    inline def setExternalMemberCountUndefined: Self = StObject.set(x, "externalMemberCount", js.undefined)
    
    inline def setIsModerated(value: NullableOption[Boolean]): Self = StObject.set(x, "isModerated", value.asInstanceOf[js.Any])
    
    inline def setIsModeratedNull: Self = StObject.set(x, "isModerated", null)
    
    inline def setIsModeratedUndefined: Self = StObject.set(x, "isModerated", js.undefined)
    
    inline def setMailboxFull(value: NullableOption[Boolean]): Self = StObject.set(x, "mailboxFull", value.asInstanceOf[js.Any])
    
    inline def setMailboxFullNull: Self = StObject.set(x, "mailboxFull", null)
    
    inline def setMailboxFullUndefined: Self = StObject.set(x, "mailboxFull", js.undefined)
    
    inline def setMaxMessageSize(value: NullableOption[Double]): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
    
    inline def setMaxMessageSizeNull: Self = StObject.set(x, "maxMessageSize", null)
    
    inline def setMaxMessageSizeUndefined: Self = StObject.set(x, "maxMessageSize", js.undefined)
    
    inline def setRecipientScope(value: NullableOption[RecipientScopeType]): Self = StObject.set(x, "recipientScope", value.asInstanceOf[js.Any])
    
    inline def setRecipientScopeNull: Self = StObject.set(x, "recipientScope", null)
    
    inline def setRecipientScopeUndefined: Self = StObject.set(x, "recipientScope", js.undefined)
    
    inline def setRecipientSuggestions(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "recipientSuggestions", value.asInstanceOf[js.Any])
    
    inline def setRecipientSuggestionsNull: Self = StObject.set(x, "recipientSuggestions", null)
    
    inline def setRecipientSuggestionsUndefined: Self = StObject.set(x, "recipientSuggestions", js.undefined)
    
    inline def setRecipientSuggestionsVarargs(value: Recipient*): Self = StObject.set(x, "recipientSuggestions", js.Array(value*))
    
    inline def setTotalMemberCount(value: NullableOption[Double]): Self = StObject.set(x, "totalMemberCount", value.asInstanceOf[js.Any])
    
    inline def setTotalMemberCountNull: Self = StObject.set(x, "totalMemberCount", null)
    
    inline def setTotalMemberCountUndefined: Self = StObject.set(x, "totalMemberCount", js.undefined)
  }
}
