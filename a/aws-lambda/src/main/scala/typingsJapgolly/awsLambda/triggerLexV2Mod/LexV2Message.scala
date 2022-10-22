package typingsJapgolly.awsLambda.triggerLexV2Mod

import typingsJapgolly.awsLambda.awsLambdaStrings.CustomPayload
import typingsJapgolly.awsLambda.awsLambdaStrings.PlainText_
import typingsJapgolly.awsLambda.awsLambdaStrings.SSML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ContentMessage
  - typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ImageResponseCardMessage
*/
trait LexV2Message extends StObject
object LexV2Message {
  
  inline def LexV2ContentMessage(content: String, contentType: CustomPayload | PlainText_ | SSML): typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ContentMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ContentMessage]
  }
  
  inline def LexV2ImageResponseCardMessage(imageResponseCard: LexV2ImageResponseCard): typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ImageResponseCardMessage = {
    val __obj = js.Dynamic.literal(contentType = "ImageResponseCard", imageResponseCard = imageResponseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.awsLambda.triggerLexV2Mod.LexV2ImageResponseCardMessage]
  }
}
