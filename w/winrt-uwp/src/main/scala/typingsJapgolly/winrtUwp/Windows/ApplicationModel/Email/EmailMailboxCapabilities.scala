package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities associated with an email mailbox. */
trait EmailMailboxCapabilities extends StObject {
  
  /** Gets a Boolean value indicating if folders can be created in the mailbox. */
  var canCreateFolder: Boolean
  
  /** Gets a Boolean value indicating if folders can be deleted from the mailbox. */
  var canDeleteFolder: Boolean
  
  /** Gets a Boolean value indicating if folders in the mailbox can be emptied. */
  var canEmptyFolder: Boolean
  
  var canForwardMeetings: Any
  
  /* unmapped type */
  var canGetAndSetExternalAutoReplies: Any
  
  /* unmapped type */
  var canGetAndSetInternalAutoReplies: Any
  
  /* unmapped type */
  /** Gets a Boolean value indicating if folders in the mailbox can be moved. */
  var canMoveFolder: Boolean
  
  var canProposeNewTimeForMeetings: Any
  
  /* unmapped type */
  /** Gets a Boolean value that indicates whether the email mailbox is capable of resolving recipients. */
  var canResolveRecipients: Boolean
  
  var canServerSearchFolders: Any
  
  /* unmapped type */
  var canServerSearchMailbox: Any
  
  /* unmapped type */
  var canSmartSend: Any
  
  /* unmapped type */
  var canUpdateMeetingResponses: Any
  
  /* unmapped type */
  /** Gets a Boolean value that indicates whether the email mailbox is capable of validating certificates. */
  var canValidateCertificates: Boolean
}
object EmailMailboxCapabilities {
  
  inline def apply(
    canCreateFolder: Boolean,
    canDeleteFolder: Boolean,
    canEmptyFolder: Boolean,
    canForwardMeetings: Any,
    canGetAndSetExternalAutoReplies: Any,
    canGetAndSetInternalAutoReplies: Any,
    canMoveFolder: Boolean,
    canProposeNewTimeForMeetings: Any,
    canResolveRecipients: Boolean,
    canServerSearchFolders: Any,
    canServerSearchMailbox: Any,
    canSmartSend: Any,
    canUpdateMeetingResponses: Any,
    canValidateCertificates: Boolean
  ): EmailMailboxCapabilities = {
    val __obj = js.Dynamic.literal(canCreateFolder = canCreateFolder.asInstanceOf[js.Any], canDeleteFolder = canDeleteFolder.asInstanceOf[js.Any], canEmptyFolder = canEmptyFolder.asInstanceOf[js.Any], canForwardMeetings = canForwardMeetings.asInstanceOf[js.Any], canGetAndSetExternalAutoReplies = canGetAndSetExternalAutoReplies.asInstanceOf[js.Any], canGetAndSetInternalAutoReplies = canGetAndSetInternalAutoReplies.asInstanceOf[js.Any], canMoveFolder = canMoveFolder.asInstanceOf[js.Any], canProposeNewTimeForMeetings = canProposeNewTimeForMeetings.asInstanceOf[js.Any], canResolveRecipients = canResolveRecipients.asInstanceOf[js.Any], canServerSearchFolders = canServerSearchFolders.asInstanceOf[js.Any], canServerSearchMailbox = canServerSearchMailbox.asInstanceOf[js.Any], canSmartSend = canSmartSend.asInstanceOf[js.Any], canUpdateMeetingResponses = canUpdateMeetingResponses.asInstanceOf[js.Any], canValidateCertificates = canValidateCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxCapabilities]
  }
  
  extension [Self <: EmailMailboxCapabilities](x: Self) {
    
    inline def setCanCreateFolder(value: Boolean): Self = StObject.set(x, "canCreateFolder", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteFolder(value: Boolean): Self = StObject.set(x, "canDeleteFolder", value.asInstanceOf[js.Any])
    
    inline def setCanEmptyFolder(value: Boolean): Self = StObject.set(x, "canEmptyFolder", value.asInstanceOf[js.Any])
    
    inline def setCanForwardMeetings(value: Any): Self = StObject.set(x, "canForwardMeetings", value.asInstanceOf[js.Any])
    
    inline def setCanGetAndSetExternalAutoReplies(value: Any): Self = StObject.set(x, "canGetAndSetExternalAutoReplies", value.asInstanceOf[js.Any])
    
    inline def setCanGetAndSetInternalAutoReplies(value: Any): Self = StObject.set(x, "canGetAndSetInternalAutoReplies", value.asInstanceOf[js.Any])
    
    inline def setCanMoveFolder(value: Boolean): Self = StObject.set(x, "canMoveFolder", value.asInstanceOf[js.Any])
    
    inline def setCanProposeNewTimeForMeetings(value: Any): Self = StObject.set(x, "canProposeNewTimeForMeetings", value.asInstanceOf[js.Any])
    
    inline def setCanResolveRecipients(value: Boolean): Self = StObject.set(x, "canResolveRecipients", value.asInstanceOf[js.Any])
    
    inline def setCanServerSearchFolders(value: Any): Self = StObject.set(x, "canServerSearchFolders", value.asInstanceOf[js.Any])
    
    inline def setCanServerSearchMailbox(value: Any): Self = StObject.set(x, "canServerSearchMailbox", value.asInstanceOf[js.Any])
    
    inline def setCanSmartSend(value: Any): Self = StObject.set(x, "canSmartSend", value.asInstanceOf[js.Any])
    
    inline def setCanUpdateMeetingResponses(value: Any): Self = StObject.set(x, "canUpdateMeetingResponses", value.asInstanceOf[js.Any])
    
    inline def setCanValidateCertificates(value: Boolean): Self = StObject.set(x, "canValidateCertificates", value.asInstanceOf[js.Any])
  }
}
