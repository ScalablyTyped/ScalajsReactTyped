package typingsJapgolly.angularOdataResources.OData

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /* private */ def escapeIllegalChars(haystack: Any): Any
  
  def execute(): String
  
  def executeWithType(): Any
  
  def executeWithUndefinedType(): Any
  
  /* private */ def generateDate(date: Any): Any
  
  /* private */ var illegalChars: Any
  
  /* private */ var `type`: Any
  
  /* private */ var value: Any
}
object Value {
  
  inline def apply(
    escapeIllegalChars: Any => Any,
    execute: CallbackTo[String],
    executeWithType: CallbackTo[Any],
    executeWithUndefinedType: CallbackTo[Any],
    generateDate: Any => Any,
    illegalChars: Any,
    `type`: Any,
    value: Any
  ): Value = {
    val __obj = js.Dynamic.literal(escapeIllegalChars = js.Any.fromFunction1(escapeIllegalChars), execute = execute.toJsFn, executeWithType = executeWithType.toJsFn, executeWithUndefinedType = executeWithUndefinedType.toJsFn, generateDate = js.Any.fromFunction1(generateDate), illegalChars = illegalChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setEscapeIllegalChars(value: Any => Any): Self = StObject.set(x, "escapeIllegalChars", js.Any.fromFunction1(value))
    
    inline def setExecute(value: CallbackTo[String]): Self = StObject.set(x, "execute", value.toJsFn)
    
    inline def setExecuteWithType(value: CallbackTo[Any]): Self = StObject.set(x, "executeWithType", value.toJsFn)
    
    inline def setExecuteWithUndefinedType(value: CallbackTo[Any]): Self = StObject.set(x, "executeWithUndefinedType", value.toJsFn)
    
    inline def setGenerateDate(value: Any => Any): Self = StObject.set(x, "generateDate", js.Any.fromFunction1(value))
    
    inline def setIllegalChars(value: Any): Self = StObject.set(x, "illegalChars", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
