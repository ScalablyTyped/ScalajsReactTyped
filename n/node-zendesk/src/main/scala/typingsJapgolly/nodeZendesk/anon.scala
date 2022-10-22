package typingsJapgolly.nodeZendesk

import typingsJapgolly.nodeZendesk.mod.Tickets.CreateModel
import typingsJapgolly.nodeZendesk.mod.Users._UpdateIdPayload
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attachment extends StObject {
    
    var attachment: js.UndefOr[typingsJapgolly.nodeZendesk.mod.Attachments.Attachment] = js.undefined
    
    var attachments: js.UndefOr[js.Array[typingsJapgolly.nodeZendesk.mod.Attachments.Attachment]] = js.undefined
    
    var token: String
  }
  object Attachment {
    
    inline def apply(token: String): Attachment = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attachment]
    }
    
    extension [Self <: Attachment](x: Self) {
      
      inline def setAttachment(value: typingsJapgolly.nodeZendesk.mod.Attachments.Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      inline def setAttachments(value: js.Array[typingsJapgolly.nodeZendesk.mod.Attachments.Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: typingsJapgolly.nodeZendesk.mod.Attachments.Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait Body extends StObject {
    
    var body: String
    
    var html_body: String
    
    var public: js.UndefOr[Boolean] = js.undefined
    
    var scoped_body: js.UndefOr[Any] = js.undefined
  }
  object Body {
    
    inline def apply(body: String, html_body: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], html_body = html_body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHtml_body(value: String): Self = StObject.set(x, "html_body", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setScoped_body(value: Any): Self = StObject.set(x, "scoped_body", value.asInstanceOf[js.Any])
      
      inline def setScoped_bodyUndefined: Self = StObject.set(x, "scoped_body", js.undefined)
    }
  }
  
  trait Comment extends StObject {
    
    var comment: Body
    
    var ticket: CreateModel
  }
  object Comment {
    
    inline def apply(comment: Body, ticket: CreateModel): Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setComment(value: Body): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setTicket(value: CreateModel): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
    }
  }
  
  trait Externalids
    extends StObject
       with _UpdateIdPayload {
    
    var external_ids: js.Array[ZendeskID]
  }
  object Externalids {
    
    inline def apply(external_ids: js.Array[ZendeskID]): Externalids = {
      val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[Externalids]
    }
    
    extension [Self <: Externalids](x: Self) {
      
      inline def setExternal_ids(value: js.Array[ZendeskID]): Self = StObject.set(x, "external_ids", value.asInstanceOf[js.Any])
      
      inline def setExternal_idsVarargs(value: ZendeskID*): Self = StObject.set(x, "external_ids", js.Array(value*))
    }
  }
  
  trait Filename extends StObject {
    
    var filename: String
    
    var token: js.UndefOr[String] = js.undefined
  }
  object Filename {
    
    inline def apply(filename: String): Filename = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filename]
    }
    
    extension [Self <: Filename](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait Ids
    extends StObject
       with _UpdateIdPayload {
    
    var ids: js.Array[ZendeskID]
  }
  object Ids {
    
    inline def apply(ids: js.Array[ZendeskID]): Ids = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ids]
    }
    
    extension [Self <: Ids](x: Self) {
      
      inline def setIds(value: js.Array[ZendeskID]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: ZendeskID*): Self = StObject.set(x, "ids", js.Array(value*))
    }
  }
}
