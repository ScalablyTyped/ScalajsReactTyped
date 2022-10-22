package typingsJapgolly.novaEditorNode

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAssistant extends StObject {
  
  def provideTasks(): AssistantArray[Task]
  
  var resolveTaskAction: js.UndefOr[
    js.Function1[
      /* context */ TaskActionResolveContext[Transferrable], 
      ResolvedTaskAction | js.Promise[ResolvedTaskAction]
    ]
  ] = js.undefined
}
object TaskAssistant {
  
  inline def apply(provideTasks: CallbackTo[AssistantArray[Task]]): TaskAssistant = {
    val __obj = js.Dynamic.literal(provideTasks = provideTasks.toJsFn)
    __obj.asInstanceOf[TaskAssistant]
  }
  
  extension [Self <: TaskAssistant](x: Self) {
    
    inline def setProvideTasks(value: CallbackTo[AssistantArray[Task]]): Self = StObject.set(x, "provideTasks", value.toJsFn)
    
    inline def setResolveTaskAction(
      value: /* context */ TaskActionResolveContext[Transferrable] => ResolvedTaskAction | js.Promise[ResolvedTaskAction]
    ): Self = StObject.set(x, "resolveTaskAction", js.Any.fromFunction1(value))
    
    inline def setResolveTaskActionUndefined: Self = StObject.set(x, "resolveTaskAction", js.undefined)
  }
}
