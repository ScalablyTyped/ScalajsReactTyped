package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an action that updates the email draft that the user is currently editing.
  *
  *     // A UpdateDraftActionResponse that inserts non-editable content (a link in this case) into an
  *     // email draft.
  *     var updateDraftActionResponse = CardService.newUpdateDraftActionResponseBuilder()
  *         .setUpdateDraftBodyAction(CardService.newUpdateDraftBodyAction()
  *             .addUpdateContent(
  *                     "<a href=\"https://www.google.com\">Google</a>",
  *                     ContentType.IMMUTABLE_HTML)
  *             .setUpdateType(UpdateDraftBodyType.IN_PLACE_INSERT))
  *         .build();
  *
  *     // A UpdateDraftActionResponse that inserts a link into an email draft. The added content can be
  *     // edited further.
  *     var updateDraftActionResponse = CardService.newUpdateDraftActionResponseBuilder()
  *         .setUpdateDraftBodyAction(CardService.newUpdateDraftBodyAction()
  *             .addUpdateContent(
  *                     "<a href=\"https://www.google.com\">Google</a>",
  *                     ContentType.MUTABLE_HTML)
  *             .setUpdateType(UpdateDraftBodyType.IN_PLACE_INSERT))
  *         .build();
  *
  *     // A UpdateDraftActionResponse that inserts multiple values of different types.
  *     // The example action response inserts two lines next to each other in the email
  *     // draft, at the cursor position. Each line contains the content added by
  *     // {@link UpdateDraftActionResponseBuilder#addUpdateContent}.
  *     var updateDraftActionResponse = CardService.newUpdateDraftActionResponseBuilder()
  *         .setUpdateDraftBodyAction(CardService.newUpdateDraftBodyAction()
  *             .addUpdateContent(
  *                     "<a href=\"https://www.google.com\">Google</a>",
  *                     ContentType.MUTABLE_HTML)
  *             .addUpdateContent("Above is a google link.", ContentType.PLAIN_TEXT)
  *             .setUpdateType(UpdateDraftBodyType.IN_PLACE_INSERT))
  *         .build();
  */
trait UpdateDraftActionResponse extends StObject {
  
  def printJson(): String
}
object UpdateDraftActionResponse {
  
  inline def apply(printJson: CallbackTo[String]): UpdateDraftActionResponse = {
    val __obj = js.Dynamic.literal(printJson = printJson.toJsFn)
    __obj.asInstanceOf[UpdateDraftActionResponse]
  }
  
  extension [Self <: UpdateDraftActionResponse](x: Self) {
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
  }
}
