package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeComparisonInfo extends StObject {
  
  def addMessage(message: String): Unit
  
  var flags: TypeRelationshipFlags
  
  /* private */ var indent: Any
  
  /* private */ def indentString(): Any
  
  var message: String
  
  var onlyCaptureFirstError: Boolean
  
  var stringConstantVal: AST
}
object TypeComparisonInfo {
  
  inline def apply(
    addMessage: String => Callback,
    flags: TypeRelationshipFlags,
    indent: Any,
    indentString: CallbackTo[Any],
    message: String,
    onlyCaptureFirstError: Boolean,
    stringConstantVal: AST
  ): TypeComparisonInfo = {
    val __obj = js.Dynamic.literal(addMessage = js.Any.fromFunction1((t0: String) => addMessage(t0).runNow()), flags = flags.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], indentString = indentString.toJsFn, message = message.asInstanceOf[js.Any], onlyCaptureFirstError = onlyCaptureFirstError.asInstanceOf[js.Any], stringConstantVal = stringConstantVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeComparisonInfo]
  }
  
  extension [Self <: TypeComparisonInfo](x: Self) {
    
    inline def setAddMessage(value: String => Callback): Self = StObject.set(x, "addMessage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setFlags(value: TypeRelationshipFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setIndent(value: Any): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentString(value: CallbackTo[Any]): Self = StObject.set(x, "indentString", value.toJsFn)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOnlyCaptureFirstError(value: Boolean): Self = StObject.set(x, "onlyCaptureFirstError", value.asInstanceOf[js.Any])
    
    inline def setStringConstantVal(value: AST): Self = StObject.set(x, "stringConstantVal", value.asInstanceOf[js.Any])
  }
}
