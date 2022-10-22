package typingsJapgolly.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConditionObject extends StObject {
  
  var context: js.UndefOr[Question] = js.undefined
  
  var name: String
  
  var question: Question
  
  var text: String
}
object IConditionObject {
  
  inline def apply(name: String, question: Question, text: String): IConditionObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConditionObject]
  }
  
  extension [Self <: IConditionObject](x: Self) {
    
    inline def setContext(value: Question): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuestion(value: Question): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
