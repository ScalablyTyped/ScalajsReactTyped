package typingsJapgolly.nodeZendesk.mod.Tickets

import typingsJapgolly.nodeZendesk.mod.Attachments.Model
import typingsJapgolly.nodeZendesk.mod.PaginablePayload
import typingsJapgolly.nodeZendesk.mod.PersistableModel
import typingsJapgolly.nodeZendesk.mod.Requests.Comments.RequestType
import typingsJapgolly.nodeZendesk.mod.Users.Role
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Comments {
  
  object CommentsUsers {
    
    trait ResponseModel
      extends StObject
         with typingsJapgolly.nodeZendesk.mod.Requests.Comments.CommentsUsers.ResponseModel {
      
      val role: Role
    }
    object ResponseModel {
      
      inline def apply(agent: Boolean, id: ZendeskID, name: String, role: Role): typingsJapgolly.nodeZendesk.mod.Tickets.Comments.CommentsUsers.ResponseModel = {
        val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], organization_id = null, photo = null)
        __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Tickets.Comments.CommentsUsers.ResponseModel]
      }
      
      extension [Self <: typingsJapgolly.nodeZendesk.mod.Tickets.Comments.CommentsUsers.ResponseModel](x: Self) {
        
        inline def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait ListPayload
    extends StObject
       with PaginablePayload {
    
    var comments: js.Array[typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ResponseModel]
  }
  object ListPayload {
    
    inline def apply(comments: js.Array[typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ResponseModel], count: Double): typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ListPayload = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], next_page = null, previous_page = null)
      __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ListPayload]
    }
    
    extension [Self <: typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ListPayload](x: Self) {
      
      inline def setComments(value: js.Array[typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ResponseModel]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsVarargs(value: typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ResponseModel*): Self = StObject.set(x, "comments", js.Array(value*))
    }
  }
  
  trait Metadata extends StObject {
    
    var flag_options: Any
    
    var flags: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Metadata {
    
    inline def apply(flag_options: Any): Metadata = {
      val __obj = js.Dynamic.literal(flag_options = flag_options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setFlag_options(value: Any): Self = StObject.set(x, "flag_options", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: js.Array[Double]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFlagsVarargs(value: Double*): Self = StObject.set(x, "flags", js.Array(value*))
    }
  }
  
  object Organizations {
    
    trait ResponseModel
      extends StObject
         with PersistableModel {
      
      val name: String
    }
    object ResponseModel {
      
      inline def apply(id: ZendeskID, name: String): typingsJapgolly.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel]
      }
      
      extension [Self <: typingsJapgolly.nodeZendesk.mod.Tickets.Comments.Organizations.ResponseModel](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait ResponseModel
    extends StObject
       with typingsJapgolly.nodeZendesk.mod.Requests.Comments.ResponseModel
  object ResponseModel {
    
    inline def apply(
      attachments: js.Array[Model],
      author_id: ZendeskID,
      body: String,
      created_at: String,
      html_body: String,
      id: ZendeskID,
      plain_body: String,
      public: Boolean,
      request_id: Double,
      `type`: RequestType,
      url: String
    ): typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ResponseModel = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], author_id = author_id.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plain_body = plain_body.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ResponseModel]
    }
  }
}
