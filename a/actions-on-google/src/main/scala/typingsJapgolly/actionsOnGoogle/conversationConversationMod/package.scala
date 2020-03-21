package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object conversationConversationMod {
  type ExceptionHandler[TUserStorage, TConversation /* <: typingsJapgolly.actionsOnGoogle.conversationConversationMod.Conversation[TUserStorage] */] = js.Function2[/* conv */ TConversation, /* error */ js.Error, js.Promise[js.Any] | js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.actionsOnGoogle.responseMod.RichResponse
    - typingsJapgolly.actionsOnGoogle.richMod.RichResponseItem
    - typingsJapgolly.actionsOnGoogle.responseMod.Image
    - typingsJapgolly.actionsOnGoogle.responseMod.Suggestions
    - typingsJapgolly.actionsOnGoogle.responseMod.MediaObject
    - typingsJapgolly.actionsOnGoogle.helperMod.Helper[
  typingsJapgolly.actionsOnGoogle.conversationConversationMod.Intent, 
  typingsJapgolly.actionsOnGoogle.commonMod.JsonObject]
  */
  type Response = typingsJapgolly.actionsOnGoogle.conversationConversationMod._Response | (typingsJapgolly.actionsOnGoogle.helperMod.Helper[
    typingsJapgolly.actionsOnGoogle.conversationConversationMod.Intent, 
    typingsJapgolly.actionsOnGoogle.commonMod.JsonObject
  ]) | typingsJapgolly.actionsOnGoogle.htmlMod.HtmlResponse[typingsJapgolly.actionsOnGoogle.commonMod.JsonObject] | java.lang.String
  type Traversed = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
