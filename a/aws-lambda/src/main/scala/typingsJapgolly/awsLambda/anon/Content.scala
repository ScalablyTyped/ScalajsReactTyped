package typingsJapgolly.awsLambda.anon

import typingsJapgolly.awsLambda.awsLambdaStrings.CustomPayload
import typingsJapgolly.awsLambda.awsLambdaStrings.PlainText_
import typingsJapgolly.awsLambda.awsLambdaStrings.SSML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var contentType: PlainText_ | SSML | CustomPayload
}
object Content {
  
  inline def apply(content: String, contentType: PlainText_ | SSML | CustomPayload): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: PlainText_ | SSML | CustomPayload): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
  }
}
