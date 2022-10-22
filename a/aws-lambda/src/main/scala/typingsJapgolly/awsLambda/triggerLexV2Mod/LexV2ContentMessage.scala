package typingsJapgolly.awsLambda.triggerLexV2Mod

import typingsJapgolly.awsLambda.awsLambdaStrings.CustomPayload
import typingsJapgolly.awsLambda.awsLambdaStrings.PlainText_
import typingsJapgolly.awsLambda.awsLambdaStrings.SSML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2ContentMessage
  extends StObject
     with LexV2Message {
  
  var content: String
  
  var contentType: CustomPayload | PlainText_ | SSML
}
object LexV2ContentMessage {
  
  inline def apply(content: String, contentType: CustomPayload | PlainText_ | SSML): LexV2ContentMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2ContentMessage]
  }
  
  extension [Self <: LexV2ContentMessage](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: CustomPayload | PlainText_ | SSML): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
  }
}
