package typingsJapgolly.sparkpost.mod

import typingsJapgolly.sparkpost.anon.Email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineContent extends StObject {
  
  /** JSON array of attachments. */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /** "deals@company.com" or JSON object composed of the “name” and “email” fields “from” : { “name” : “My Company”, “email” : "deals@company.com" } used to compose the email’s “From” header */
  var from: js.UndefOr[String | Email] = js.undefined
  
  /** JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To” */
  var headers: js.UndefOr[Any] = js.undefined
  
  /** HTML content for the email’s text/html MIME part  At a minimum, html, text, or push is required. */
  var html: js.UndefOr[String] = js.undefined
  
  /** JSON array of inline images. */
  var inline_images: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**  Content of push notifications  At a minimum, html, text, or push is required.  SparkPost Enterprise API only. */
  var push: js.UndefOr[PushData] = js.undefined
  
  /** Email address used to compose the email’s “Reply-To” header */
  var reply_to: js.UndefOr[String] = js.undefined
  
  /** Email subject line  required for email transmissions  Expected in the UTF-8 charset without RFC2047 encoding. Substitution syntax is supported. */
  var subject: js.UndefOr[String] = js.undefined
  
  /** Text content for the email’s text/plain MIME part  At a minimum, html, text, or push is required. */
  var text: js.UndefOr[String] = js.undefined
}
object InlineContent {
  
  inline def apply(): InlineContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineContent]
  }
  
  extension [Self <: InlineContent](x: Self) {
    
    inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setFrom(value: String | Email): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setInline_images(value: js.Array[Attachment]): Self = StObject.set(x, "inline_images", value.asInstanceOf[js.Any])
    
    inline def setInline_imagesUndefined: Self = StObject.set(x, "inline_images", js.undefined)
    
    inline def setInline_imagesVarargs(value: Attachment*): Self = StObject.set(x, "inline_images", js.Array(value*))
    
    inline def setPush(value: PushData): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setReply_to(value: String): Self = StObject.set(x, "reply_to", value.asInstanceOf[js.Any])
    
    inline def setReply_toUndefined: Self = StObject.set(x, "reply_to", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
