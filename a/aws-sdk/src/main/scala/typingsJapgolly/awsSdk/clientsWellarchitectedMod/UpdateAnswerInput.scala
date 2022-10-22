package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnswerInput extends StObject {
  
  /**
    * A list of choices to update on a question in your workload. The String key corresponds to the choice ID to be updated.
    */
  var ChoiceUpdates: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.ChoiceUpdates] = js.undefined
  
  var IsApplicable: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.IsApplicable] = js.undefined
  
  var LensAlias: typingsJapgolly.awsSdk.clientsWellarchitectedMod.LensAlias
  
  var Notes: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.Notes] = js.undefined
  
  var QuestionId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.QuestionId
  
  /**
    * The reason why a question is not applicable to your workload.
    */
  var Reason: js.UndefOr[AnswerReason] = js.undefined
  
  var SelectedChoices: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.SelectedChoices] = js.undefined
  
  var WorkloadId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object UpdateAnswerInput {
  
  inline def apply(LensAlias: LensAlias, QuestionId: QuestionId, WorkloadId: WorkloadId): UpdateAnswerInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any], QuestionId = QuestionId.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnswerInput]
  }
  
  extension [Self <: UpdateAnswerInput](x: Self) {
    
    inline def setChoiceUpdates(value: ChoiceUpdates): Self = StObject.set(x, "ChoiceUpdates", value.asInstanceOf[js.Any])
    
    inline def setChoiceUpdatesUndefined: Self = StObject.set(x, "ChoiceUpdates", js.undefined)
    
    inline def setIsApplicable(value: IsApplicable): Self = StObject.set(x, "IsApplicable", value.asInstanceOf[js.Any])
    
    inline def setIsApplicableUndefined: Self = StObject.set(x, "IsApplicable", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: Notes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setQuestionId(value: QuestionId): Self = StObject.set(x, "QuestionId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: AnswerReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setSelectedChoices(value: SelectedChoices): Self = StObject.set(x, "SelectedChoices", value.asInstanceOf[js.Any])
    
    inline def setSelectedChoicesUndefined: Self = StObject.set(x, "SelectedChoices", js.undefined)
    
    inline def setSelectedChoicesVarargs(value: ChoiceId*): Self = StObject.set(x, "SelectedChoices", js.Array(value*))
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
