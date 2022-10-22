package typingsJapgolly.officeJs.Office

import typingsJapgolly.officeJs.Office.MailboxEnums.DelegatePermissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the properties of an appointment or message in a shared folder.
  *
  * For more information on how this object is used, see the
  * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/delegate-access | delegate access} article.
  *
  * @remarks
  * [Api set: Mailbox 1.8]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait SharedProperties extends StObject {
  
  /**
    * The permissions that the delegate has on a shared folder.
    */
  var delegatePermissions: DelegatePermissions
  
  /**
    * The email address of the owner of a shared item.
    */
  var owner: String
  
  /**
    * The location of the owner's mailbox for the delegate's access. This location may differ based on the Outlook client.
    *
    * Use with `targetRestUrl` to construct the REST operation's URL.
    *
    * Example usage: `targetRestUrl + "/{api_version}/users/" + targetMailbox + "/{REST_operation}"`
    */
  var targetMailbox: String
  
  /**
    * The REST API's base URL (currently https://outlook.office.com/api).
    *
    * Use with `targetMailbox` to construct the REST operation's URL.
    *
    * Example usage: `targetRestUrl + "/{api_version}/users/" + targetMailbox + "/{REST_operation}"`
    */
  var targetRestUrl: String
}
object SharedProperties {
  
  inline def apply(
    delegatePermissions: DelegatePermissions,
    owner: String,
    targetMailbox: String,
    targetRestUrl: String
  ): SharedProperties = {
    val __obj = js.Dynamic.literal(delegatePermissions = delegatePermissions.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], targetMailbox = targetMailbox.asInstanceOf[js.Any], targetRestUrl = targetRestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProperties]
  }
  
  extension [Self <: SharedProperties](x: Self) {
    
    inline def setDelegatePermissions(value: DelegatePermissions): Self = StObject.set(x, "delegatePermissions", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setTargetMailbox(value: String): Self = StObject.set(x, "targetMailbox", value.asInstanceOf[js.Any])
    
    inline def setTargetRestUrl(value: String): Self = StObject.set(x, "targetRestUrl", value.asInstanceOf[js.Any])
  }
}
