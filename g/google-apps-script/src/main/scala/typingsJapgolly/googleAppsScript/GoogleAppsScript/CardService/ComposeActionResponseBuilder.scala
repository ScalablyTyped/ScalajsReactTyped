package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.GmailDraft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for ComposeActionResponse objects.
  *
  * Note: This object isn't related to compose actions that are
  * used to extend the compose UI. Rather,
  * this builder creates responses to an Action that composes draft messages when a specific
  * UI element is selected.
  */
trait ComposeActionResponseBuilder extends StObject {
  
  def build(): ComposeActionResponse
  
  def setGmailDraft(draft: GmailDraft): ComposeActionResponseBuilder
}
object ComposeActionResponseBuilder {
  
  inline def apply(
    build: CallbackTo[ComposeActionResponse],
    setGmailDraft: GmailDraft => ComposeActionResponseBuilder
  ): ComposeActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, setGmailDraft = js.Any.fromFunction1(setGmailDraft))
    __obj.asInstanceOf[ComposeActionResponseBuilder]
  }
  
  extension [Self <: ComposeActionResponseBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[ComposeActionResponse]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setSetGmailDraft(value: GmailDraft => ComposeActionResponseBuilder): Self = StObject.set(x, "setGmailDraft", js.Any.fromFunction1(value))
  }
}
