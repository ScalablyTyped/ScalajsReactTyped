package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDashboardEmbedUrlRequest extends StObject {
  
  /**
    * A list of one or more dashboard IDs that you want anonymous users to have tempporary access to. Currently, the IdentityType parameter must be set to ANONYMOUS because other identity types authenticate as Amazon QuickSight or IAM users. For example, if you set "--dashboard-id dash_id1 --dashboard-id dash_id2 dash_id3 identity-type ANONYMOUS", the session can access all three dashboards.
    */
  var AdditionalDashboardIds: js.UndefOr[AdditionalDashboardIdList] = js.undefined
  
  /**
    * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID for the dashboard, also added to the Identity and Access Management (IAM) policy.
    */
  var DashboardId: RestrictiveResourceId
  
  /**
    * The authentication method that the user uses to sign in.
    */
  var IdentityType: EmbeddingIdentityType
  
  /**
    * The Amazon QuickSight namespace that contains the dashboard IDs in this request. If you're not using a custom namespace, set Namespace = default.
    */
  var Namespace: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.Namespace] = js.undefined
  
  /**
    * Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
    */
  var ResetDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
    */
  var SessionLifetimeInMinutes: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.SessionLifetimeInMinutes] = js.undefined
  
  /**
    * Adds persistence of state for the user session in an embedded dashboard. Persistence applies to the sheet and the parameter settings. These are control settings that the dashboard subscriber (Amazon QuickSight reader) chooses while viewing the dashboard. If this is set to TRUE, the settings are the same when the subscriber reopens the same dashboard URL. The state is stored in Amazon QuickSight, not in a browser cookie. If this is set to FALSE, the state of the user session is not persisted. The default is FALSE.
    */
  var StatePersistenceEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo button.
    */
  var UndoRedoDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with QUICKSIGHT identity type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one of the following:   Active Directory (AD) users or group members   Invited nonfederated users   IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect, or IAM federation.   Omit this parameter for users in the third group – IAM users and IAM role-based sessions.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}
object GetDashboardEmbedUrlRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: RestrictiveResourceId,
    IdentityType: EmbeddingIdentityType
  ): GetDashboardEmbedUrlRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], IdentityType = IdentityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDashboardEmbedUrlRequest]
  }
  
  extension [Self <: GetDashboardEmbedUrlRequest](x: Self) {
    
    inline def setAdditionalDashboardIds(value: AdditionalDashboardIdList): Self = StObject.set(x, "AdditionalDashboardIds", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDashboardIdsUndefined: Self = StObject.set(x, "AdditionalDashboardIds", js.undefined)
    
    inline def setAdditionalDashboardIdsVarargs(value: RestrictiveResourceId*): Self = StObject.set(x, "AdditionalDashboardIds", js.Array(value*))
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setIdentityType(value: EmbeddingIdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setResetDisabled(value: Boolean): Self = StObject.set(x, "ResetDisabled", value.asInstanceOf[js.Any])
    
    inline def setResetDisabledUndefined: Self = StObject.set(x, "ResetDisabled", js.undefined)
    
    inline def setSessionLifetimeInMinutes(value: SessionLifetimeInMinutes): Self = StObject.set(x, "SessionLifetimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setSessionLifetimeInMinutesUndefined: Self = StObject.set(x, "SessionLifetimeInMinutes", js.undefined)
    
    inline def setStatePersistenceEnabled(value: Boolean): Self = StObject.set(x, "StatePersistenceEnabled", value.asInstanceOf[js.Any])
    
    inline def setStatePersistenceEnabledUndefined: Self = StObject.set(x, "StatePersistenceEnabled", js.undefined)
    
    inline def setUndoRedoDisabled(value: Boolean): Self = StObject.set(x, "UndoRedoDisabled", value.asInstanceOf[js.Any])
    
    inline def setUndoRedoDisabledUndefined: Self = StObject.set(x, "UndoRedoDisabled", js.undefined)
    
    inline def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
