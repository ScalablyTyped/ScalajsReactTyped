package typingsJapgolly.nodeZendesk.mod.Users

import typingsJapgolly.nodeZendesk.mod.AuditableModel
import typingsJapgolly.nodeZendesk.mod.PaginablePayload
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/user_identities|Zendesk User Identities}
  */
object Identities {
  
  trait CreateModel extends StObject {
    
    var primary: js.UndefOr[Boolean] = js.undefined
    
    var `type`: IdentityType
    
    var value: String
    
    var verified: js.UndefOr[Boolean] = js.undefined
  }
  object CreateModel {
    
    inline def apply(`type`: IdentityType, value: String): typingsJapgolly.nodeZendesk.mod.Users.Identities.CreateModel = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Users.Identities.CreateModel]
    }
    
    extension [Self <: typingsJapgolly.nodeZendesk.mod.Users.Identities.CreateModel](x: Self) {
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setType(value: IdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
  
  trait CreatePayload extends StObject {
    
    val identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.CreateModel
  }
  object CreatePayload {
    
    inline def apply(identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.CreateModel): typingsJapgolly.nodeZendesk.mod.Users.Identities.CreatePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Users.Identities.CreatePayload]
    }
    
    extension [Self <: typingsJapgolly.nodeZendesk.mod.Users.Identities.CreatePayload](x: Self) {
      
      inline def setIdentity(value: typingsJapgolly.nodeZendesk.mod.Users.Identities.CreateModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.deliverable
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.undeliverable
  */
  trait DeliverableState extends StObject
  object DeliverableState {
    
    inline def deliverable: typingsJapgolly.nodeZendesk.nodeZendeskStrings.deliverable = "deliverable".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.deliverable]
    
    inline def undeliverable: typingsJapgolly.nodeZendesk.nodeZendeskStrings.undeliverable = "undeliverable".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.undeliverable]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.agent_forwarding
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.email
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.facebook
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.google
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.phone_number
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.sdk
  */
  trait IdentityType extends StObject
  object IdentityType {
    
    inline def agent_forwarding: typingsJapgolly.nodeZendesk.nodeZendeskStrings.agent_forwarding = "agent_forwarding".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.agent_forwarding]
    
    inline def email: typingsJapgolly.nodeZendesk.nodeZendeskStrings.email = "email".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.email]
    
    inline def facebook: typingsJapgolly.nodeZendesk.nodeZendeskStrings.facebook = "facebook".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.facebook]
    
    inline def google: typingsJapgolly.nodeZendesk.nodeZendeskStrings.google = "google".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.google]
    
    inline def phone_number: typingsJapgolly.nodeZendesk.nodeZendeskStrings.phone_number = "phone_number".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.phone_number]
    
    inline def sdk: typingsJapgolly.nodeZendesk.nodeZendeskStrings.sdk = "sdk".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.sdk]
  }
  
  trait ListPayload
    extends StObject
       with PaginablePayload {
    
    val identities: js.Array[typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel]
  }
  object ListPayload {
    
    inline def apply(
      count: Double,
      identities: js.Array[typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel]
    ): typingsJapgolly.nodeZendesk.mod.Users.Identities.ListPayload = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], next_page = null, previous_page = null)
      __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Users.Identities.ListPayload]
    }
    
    extension [Self <: typingsJapgolly.nodeZendesk.mod.Users.Identities.ListPayload](x: Self) {
      
      inline def setIdentities(value: js.Array[typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      inline def setIdentitiesVarargs(value: typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel*): Self = StObject.set(x, "identities", js.Array(value*))
    }
  }
  
  @js.native
  trait Methods extends StObject {
    
    def create(userId: ZendeskID, identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.CreatePayload): js.Promise[typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel] = js.native
    /** Creating Identities */
    def create(
      userId: ZendeskID,
      identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.CreatePayload,
      cb: ZendeskCallback[Any, Any]
    ): typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel = js.native
    
    def delete(userId: ZendeskID, identityId: ZendeskID): js.Promise[Any] = js.native
    /** Deleting Identities */
    def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def list(userId: ZendeskID): js.Promise[typingsJapgolly.nodeZendesk.mod.Users.Identities.ListPayload] = js.native
    /** Listing Identities */
    def list(userId: ZendeskID, cb: ZendeskCallback[Any, Any]): typingsJapgolly.nodeZendesk.mod.Users.Identities.ListPayload = js.native
    
    def makePrimary(userId: ZendeskID, identityId: ZendeskID): js.Promise[typingsJapgolly.nodeZendesk.mod.Users.Identities.ListPayload] = js.native
    def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): typingsJapgolly.nodeZendesk.mod.Users.Identities.ListPayload = js.native
    
    def requestVerification(userId: ZendeskID, identityId: ZendeskID): js.Promise[Any] = js.native
    def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def show(userId: ZendeskID, identityId: ZendeskID): js.Promise[typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    /** Viewing Identities */
    def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
    
    def update(
      userId: ZendeskID,
      identityId: ZendeskID,
      identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdatePayload
    ): js.Promise[typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    /** Updating Identities */
    def update(
      userId: ZendeskID,
      identityId: ZendeskID,
      identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdatePayload,
      cb: ZendeskCallback[Any, Any]
    ): typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
    
    def verify(userId: ZendeskID, identityId: ZendeskID): js.Promise[typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponsePayload] = js.native
    def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[Any, Any]): typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponsePayload = js.native
  }
  
  trait ResponseModel
    extends StObject
       with AuditableModel {
    
    val deliverable_state: DeliverableState
    
    val primary: Boolean
    
    val `type`: IdentityType
    
    val undeliverable_count: Double
    
    val url: String
    
    val user_id: ZendeskID
    
    val value: String
    
    val verified: Boolean
  }
  object ResponseModel {
    
    inline def apply(
      created_at: String,
      deliverable_state: DeliverableState,
      id: ZendeskID,
      primary: Boolean,
      `type`: IdentityType,
      undeliverable_count: Double,
      url: String,
      user_id: ZendeskID,
      value: String,
      verified: Boolean
    ): typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], deliverable_state = deliverable_state.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], undeliverable_count = undeliverable_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], updated_at = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel]
    }
    
    extension [Self <: typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel](x: Self) {
      
      inline def setDeliverable_state(value: DeliverableState): Self = StObject.set(x, "deliverable_state", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setType(value: IdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUndeliverable_count(value: Double): Self = StObject.set(x, "undeliverable_count", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: ZendeskID): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponsePayload extends StObject {
    
    val identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel
  }
  object ResponsePayload {
    
    inline def apply(identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel): typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponsePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponsePayload]
    }
    
    extension [Self <: typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponsePayload](x: Self) {
      
      inline def setIdentity(value: typingsJapgolly.nodeZendesk.mod.Users.Identities.ResponseModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateModel extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
    
    var verified: js.UndefOr[Boolean] = js.undefined
  }
  object UpdateModel {
    
    inline def apply(): typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdateModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdateModel]
    }
    
    extension [Self <: typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdateModel](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
  
  trait UpdatePayload extends StObject {
    
    val identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdateModel
  }
  object UpdatePayload {
    
    inline def apply(identity: typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdateModel): typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdatePayload = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdatePayload]
    }
    
    extension [Self <: typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdatePayload](x: Self) {
      
      inline def setIdentity(value: typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdateModel): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
}
