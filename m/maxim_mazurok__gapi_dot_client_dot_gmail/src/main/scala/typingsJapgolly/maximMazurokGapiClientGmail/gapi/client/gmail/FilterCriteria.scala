package typingsJapgolly.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCriteria extends StObject {
  
  /** Whether the response should exclude chats. */
  var excludeChats: js.UndefOr[Boolean] = js.undefined
  
  /** The sender's display name or email address. */
  var from: js.UndefOr[String] = js.undefined
  
  /** Whether the message has any attachment. */
  var hasAttachment: js.UndefOr[Boolean] = js.undefined
  
  /** Only return messages not matching the specified query. Supports the same query format as the Gmail search box. For example, `"from:someuser@example.com rfc822msgid: is:unread"`. */
  var negatedQuery: js.UndefOr[String] = js.undefined
  
  /** Only return messages matching the specified query. Supports the same query format as the Gmail search box. For example, `"from:someuser@example.com rfc822msgid: is:unread"`. */
  var query: js.UndefOr[String] = js.undefined
  
  /** The size of the entire RFC822 message in bytes, including all headers and attachments. */
  var size: js.UndefOr[Double] = js.undefined
  
  /** How the message size in bytes should be in relation to the size field. */
  var sizeComparison: js.UndefOr[String] = js.undefined
  
  /** Case-insensitive phrase found in the message's subject. Trailing and leading whitespace are be trimmed and adjacent spaces are collapsed. */
  var subject: js.UndefOr[String] = js.undefined
  
  /**
    * The recipient's display name or email address. Includes recipients in the "to", "cc", and "bcc" header fields. You can use simply the local part of the email address. For example,
    * "example" and "example@" both match "example@gmail.com". This field is case-insensitive.
    */
  var to: js.UndefOr[String] = js.undefined
}
object FilterCriteria {
  
  inline def apply(): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriteria]
  }
  
  extension [Self <: FilterCriteria](x: Self) {
    
    inline def setExcludeChats(value: Boolean): Self = StObject.set(x, "excludeChats", value.asInstanceOf[js.Any])
    
    inline def setExcludeChatsUndefined: Self = StObject.set(x, "excludeChats", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setHasAttachment(value: Boolean): Self = StObject.set(x, "hasAttachment", value.asInstanceOf[js.Any])
    
    inline def setHasAttachmentUndefined: Self = StObject.set(x, "hasAttachment", js.undefined)
    
    inline def setNegatedQuery(value: String): Self = StObject.set(x, "negatedQuery", value.asInstanceOf[js.Any])
    
    inline def setNegatedQueryUndefined: Self = StObject.set(x, "negatedQuery", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeComparison(value: String): Self = StObject.set(x, "sizeComparison", value.asInstanceOf[js.Any])
    
    inline def setSizeComparisonUndefined: Self = StObject.set(x, "sizeComparison", js.undefined)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
