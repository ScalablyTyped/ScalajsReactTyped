package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for UpdateDraftActionResponse objects.
  */
trait UpdateDraftActionResponseBuilder extends StObject {
  
  def build(): UpdateDraftActionResponse
  
  def setUpdateDraftBccRecipientsAction(updateDraftBccRecipientsAction: UpdateDraftBccRecipientsAction): UpdateDraftActionResponseBuilder
  
  def setUpdateDraftBodyAction(updateDraftBodyAction: UpdateDraftBodyAction): UpdateDraftActionResponseBuilder
  
  def setUpdateDraftCcRecipientsAction(updateDraftCcRecipientsAction: UpdateDraftCcRecipientsAction): UpdateDraftActionResponseBuilder
  
  def setUpdateDraftSubjectAction(updateDraftSubjectAction: UpdateDraftSubjectAction): UpdateDraftActionResponseBuilder
  
  def setUpdateDraftToRecipientsAction(updateDraftToRecipientsAction: UpdateDraftToRecipientsAction): UpdateDraftActionResponseBuilder
}
object UpdateDraftActionResponseBuilder {
  
  inline def apply(
    build: CallbackTo[UpdateDraftActionResponse],
    setUpdateDraftBccRecipientsAction: UpdateDraftBccRecipientsAction => UpdateDraftActionResponseBuilder,
    setUpdateDraftBodyAction: UpdateDraftBodyAction => UpdateDraftActionResponseBuilder,
    setUpdateDraftCcRecipientsAction: UpdateDraftCcRecipientsAction => UpdateDraftActionResponseBuilder,
    setUpdateDraftSubjectAction: UpdateDraftSubjectAction => UpdateDraftActionResponseBuilder,
    setUpdateDraftToRecipientsAction: UpdateDraftToRecipientsAction => UpdateDraftActionResponseBuilder
  ): UpdateDraftActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, setUpdateDraftBccRecipientsAction = js.Any.fromFunction1(setUpdateDraftBccRecipientsAction), setUpdateDraftBodyAction = js.Any.fromFunction1(setUpdateDraftBodyAction), setUpdateDraftCcRecipientsAction = js.Any.fromFunction1(setUpdateDraftCcRecipientsAction), setUpdateDraftSubjectAction = js.Any.fromFunction1(setUpdateDraftSubjectAction), setUpdateDraftToRecipientsAction = js.Any.fromFunction1(setUpdateDraftToRecipientsAction))
    __obj.asInstanceOf[UpdateDraftActionResponseBuilder]
  }
  
  extension [Self <: UpdateDraftActionResponseBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[UpdateDraftActionResponse]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setSetUpdateDraftBccRecipientsAction(value: UpdateDraftBccRecipientsAction => UpdateDraftActionResponseBuilder): Self = StObject.set(x, "setUpdateDraftBccRecipientsAction", js.Any.fromFunction1(value))
    
    inline def setSetUpdateDraftBodyAction(value: UpdateDraftBodyAction => UpdateDraftActionResponseBuilder): Self = StObject.set(x, "setUpdateDraftBodyAction", js.Any.fromFunction1(value))
    
    inline def setSetUpdateDraftCcRecipientsAction(value: UpdateDraftCcRecipientsAction => UpdateDraftActionResponseBuilder): Self = StObject.set(x, "setUpdateDraftCcRecipientsAction", js.Any.fromFunction1(value))
    
    inline def setSetUpdateDraftSubjectAction(value: UpdateDraftSubjectAction => UpdateDraftActionResponseBuilder): Self = StObject.set(x, "setUpdateDraftSubjectAction", js.Any.fromFunction1(value))
    
    inline def setSetUpdateDraftToRecipientsAction(value: UpdateDraftToRecipientsAction => UpdateDraftActionResponseBuilder): Self = StObject.set(x, "setUpdateDraftToRecipientsAction", js.Any.fromFunction1(value))
  }
}
