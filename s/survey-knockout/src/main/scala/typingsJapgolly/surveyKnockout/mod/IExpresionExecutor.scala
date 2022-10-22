package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExpresionExecutor extends StObject {
  
  /*
    * This call back runs on executing expression if there is at least one async function
    */
  def onComplete(res: Any): Unit
}
object IExpresionExecutor {
  
  inline def apply(onComplete: Any => Callback): IExpresionExecutor = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1((t0: Any) => onComplete(t0).runNow()))
    __obj.asInstanceOf[IExpresionExecutor]
  }
  
  extension [Self <: IExpresionExecutor](x: Self) {
    
    inline def setOnComplete(value: Any => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
