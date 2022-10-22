package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepCompletionAction extends StObject
@JSImport("azdata", "StepCompletionAction")
@js.native
object StepCompletionAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StepCompletionAction & Double] = js.native
  
  @js.native
  sealed trait GoToNextStep
    extends StObject
       with StepCompletionAction
  /* 3 */ val GoToNextStep: typingsJapgolly.azdata.mod.StepCompletionAction.GoToNextStep & Double = js.native
  
  @js.native
  sealed trait GoToStep
    extends StObject
       with StepCompletionAction
  /* 4 */ val GoToStep: typingsJapgolly.azdata.mod.StepCompletionAction.GoToStep & Double = js.native
  
  @js.native
  sealed trait QuitWithFailure
    extends StObject
       with StepCompletionAction
  /* 2 */ val QuitWithFailure: typingsJapgolly.azdata.mod.StepCompletionAction.QuitWithFailure & Double = js.native
  
  @js.native
  sealed trait QuitWithSuccess
    extends StObject
       with StepCompletionAction
  /* 1 */ val QuitWithSuccess: typingsJapgolly.azdata.mod.StepCompletionAction.QuitWithSuccess & Double = js.native
}
