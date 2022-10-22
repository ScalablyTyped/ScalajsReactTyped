package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurveyTriggerOwner extends StObject {
  
  def canBeCompleted(): Unit
  
  def copyTriggerValue(name: String, fromName: String): Any
  
  def focusQuestion(name: String): Boolean
  
  def getObjects(pages: Any, questions: Any): js.Array[Any]
  
  def setCompleted(): Unit
  
  def setTriggerValue(name: String, value: Any, isVariable: Boolean): Any
  
  def triggerExecuted(trigger: Trigger): Unit
}
object ISurveyTriggerOwner {
  
  inline def apply(
    canBeCompleted: Callback,
    copyTriggerValue: (String, String) => Any,
    focusQuestion: String => Boolean,
    getObjects: (Any, Any) => js.Array[Any],
    setCompleted: Callback,
    setTriggerValue: (String, Any, Boolean) => Any,
    triggerExecuted: Trigger => Callback
  ): ISurveyTriggerOwner = {
    val __obj = js.Dynamic.literal(canBeCompleted = canBeCompleted.toJsFn, copyTriggerValue = js.Any.fromFunction2(copyTriggerValue), focusQuestion = js.Any.fromFunction1(focusQuestion), getObjects = js.Any.fromFunction2(getObjects), setCompleted = setCompleted.toJsFn, setTriggerValue = js.Any.fromFunction3(setTriggerValue), triggerExecuted = js.Any.fromFunction1((t0: Trigger) => triggerExecuted(t0).runNow()))
    __obj.asInstanceOf[ISurveyTriggerOwner]
  }
  
  extension [Self <: ISurveyTriggerOwner](x: Self) {
    
    inline def setCanBeCompleted(value: Callback): Self = StObject.set(x, "canBeCompleted", value.toJsFn)
    
    inline def setCopyTriggerValue(value: (String, String) => Any): Self = StObject.set(x, "copyTriggerValue", js.Any.fromFunction2(value))
    
    inline def setFocusQuestion(value: String => Boolean): Self = StObject.set(x, "focusQuestion", js.Any.fromFunction1(value))
    
    inline def setGetObjects(value: (Any, Any) => js.Array[Any]): Self = StObject.set(x, "getObjects", js.Any.fromFunction2(value))
    
    inline def setSetCompleted(value: Callback): Self = StObject.set(x, "setCompleted", value.toJsFn)
    
    inline def setSetTriggerValue(value: (String, Any, Boolean) => Any): Self = StObject.set(x, "setTriggerValue", js.Any.fromFunction3(value))
    
    inline def setTriggerExecuted(value: Trigger => Callback): Self = StObject.set(x, "triggerExecuted", js.Any.fromFunction1((t0: Trigger) => value(t0).runNow()))
  }
}
