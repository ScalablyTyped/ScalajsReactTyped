package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasLabels extends StObject {
  
  def applyLabel(name: String): Unit
  
  def labels(): AdWordsSelector[Label]
  
  def removeLabel(name: String): Unit
}
object hasLabels {
  
  inline def apply(
    applyLabel: String => Callback,
    labels: CallbackTo[AdWordsSelector[Label]],
    removeLabel: String => Callback
  ): hasLabels = {
    val __obj = js.Dynamic.literal(applyLabel = js.Any.fromFunction1((t0: String) => applyLabel(t0).runNow()), labels = labels.toJsFn, removeLabel = js.Any.fromFunction1((t0: String) => removeLabel(t0).runNow()))
    __obj.asInstanceOf[hasLabels]
  }
  
  extension [Self <: hasLabels](x: Self) {
    
    inline def setApplyLabel(value: String => Callback): Self = StObject.set(x, "applyLabel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLabels(value: CallbackTo[AdWordsSelector[Label]]): Self = StObject.set(x, "labels", value.toJsFn)
    
    inline def setRemoveLabel(value: String => Callback): Self = StObject.set(x, "removeLabel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
