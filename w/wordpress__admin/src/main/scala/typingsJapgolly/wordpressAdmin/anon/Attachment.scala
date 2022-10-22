package typingsJapgolly.wordpressAdmin.anon

import org.scalajs.dom.Selection
import typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachments
import typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.PostImage
import typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  var Attachment: typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachment
  
  var Attachments: typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachments
  
  var PostImage: typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.PostImage
  
  var Query: typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Query
  
  var Selection: org.scalajs.dom.Selection
}
object Attachment {
  
  inline def apply(
    Attachment: typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachment,
    Attachments: Attachments,
    PostImage: PostImage,
    Query: Query,
    Selection: Selection
  ): Attachment = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any], Attachments = Attachments.asInstanceOf[js.Any], PostImage = PostImage.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setAttachment(value: typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachments(value: Attachments): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setPostImage(value: PostImage): Self = StObject.set(x, "PostImage", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
  }
}
