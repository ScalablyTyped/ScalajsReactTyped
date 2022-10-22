package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ObjectSharingInformation")
@js.native
open class ObjectSharingInformation ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ObjectSharingInformation
object ObjectSharingInformation {
  
  @JSGlobal("SP.ObjectSharingInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getListItemSharingInformation(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    listID: typingsJapgolly.sharepoint.SP.Guid,
    itemID: Double,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean
  ): typingsJapgolly.sharepoint.SP.ObjectSharingInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("getListItemSharingInformation")(context.asInstanceOf[js.Any], listID.asInstanceOf[js.Any], itemID.asInstanceOf[js.Any], excludeCurrentUser.asInstanceOf[js.Any], excludeSiteAdmin.asInstanceOf[js.Any], excludeSecurityGroups.asInstanceOf[js.Any], retrieveAnonymousLinks.asInstanceOf[js.Any], retrieveUserInfoDetails.asInstanceOf[js.Any], checkForAccessRequests.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ObjectSharingInformation]
  
  /* static member */
  inline def getObjectSharingInformation(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    securableObject: typingsJapgolly.sharepoint.SP.SecurableObject,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean,
    retrievePermissionLevels: Boolean
  ): typingsJapgolly.sharepoint.SP.ObjectSharingInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectSharingInformation")(context.asInstanceOf[js.Any], securableObject.asInstanceOf[js.Any], excludeCurrentUser.asInstanceOf[js.Any], excludeSiteAdmin.asInstanceOf[js.Any], excludeSecurityGroups.asInstanceOf[js.Any], retrieveAnonymousLinks.asInstanceOf[js.Any], retrieveUserInfoDetails.asInstanceOf[js.Any], checkForAccessRequests.asInstanceOf[js.Any], retrievePermissionLevels.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ObjectSharingInformation]
  
  /* static member */
  inline def getWebSharingInformation(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    excludeCurrentUser: Boolean,
    excludeSiteAdmin: Boolean,
    excludeSecurityGroups: Boolean,
    retrieveAnonymousLinks: Boolean,
    retrieveUserInfoDetails: Boolean,
    checkForAccessRequests: Boolean
  ): typingsJapgolly.sharepoint.SP.ObjectSharingInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSharingInformation")(context.asInstanceOf[js.Any], excludeCurrentUser.asInstanceOf[js.Any], excludeSiteAdmin.asInstanceOf[js.Any], excludeSecurityGroups.asInstanceOf[js.Any], retrieveAnonymousLinks.asInstanceOf[js.Any], retrieveUserInfoDetails.asInstanceOf[js.Any], checkForAccessRequests.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ObjectSharingInformation]
}
