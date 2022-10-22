package typingsJapgolly.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentContent extends StObject {
  
  /**
    * Text in the body of a Comment on a case.
    */
  var body: CommentBody
  
  /**
    * Type of the text in the box of a Comment on a case.
    */
  var contentType: CommentBodyTextType
}
object CommentContent {
  
  inline def apply(body: CommentBody, contentType: CommentBodyTextType): CommentContent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentContent]
  }
  
  extension [Self <: CommentContent](x: Self) {
    
    inline def setBody(value: CommentBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: CommentBodyTextType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
  }
}
