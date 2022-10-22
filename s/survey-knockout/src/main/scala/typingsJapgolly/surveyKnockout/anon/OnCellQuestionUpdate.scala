package typingsJapgolly.surveyKnockout.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCellQuestionUpdate extends StObject {
  
  def onCellQuestionUpdate(cellQuestion: Any, column: Any, question: Any, data: Any): Unit
}
object OnCellQuestionUpdate {
  
  inline def apply(onCellQuestionUpdate: (Any, Any, Any, Any) => Callback): OnCellQuestionUpdate = {
    val __obj = js.Dynamic.literal(onCellQuestionUpdate = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (onCellQuestionUpdate(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[OnCellQuestionUpdate]
  }
  
  extension [Self <: OnCellQuestionUpdate](x: Self) {
    
    inline def setOnCellQuestionUpdate(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "onCellQuestionUpdate", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
  }
}
