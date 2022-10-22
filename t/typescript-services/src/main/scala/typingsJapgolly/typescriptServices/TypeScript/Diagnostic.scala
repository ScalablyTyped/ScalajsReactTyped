package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostic
  extends StObject
     with Location {
  
  /* private */ var _additionalLocations: Any
  
  /* private */ var _arguments: Any
  
  /* private */ var _diagnosticKey: Any
  
  def additionalLocations(): js.Array[Location]
  
  def arguments(): js.Array[Any]
  
  def diagnosticKey(): String
  
  def info(): DiagnosticInfo
  
  def message(): String
  
  def text(): String
  
  def toJSON(key: Any): Any
}
object Diagnostic {
  
  inline def apply(
    _additionalLocations: Any,
    _arguments: Any,
    _diagnosticKey: Any,
    _fileName: Any,
    _length: Any,
    _lineMap: Any,
    _start: Any,
    additionalLocations: CallbackTo[js.Array[Location]],
    arguments: CallbackTo[js.Array[Any]],
    character: CallbackTo[Double],
    diagnosticKey: CallbackTo[String],
    fileName: CallbackTo[String],
    info: CallbackTo[DiagnosticInfo],
    length: CallbackTo[Double],
    line: CallbackTo[Double],
    lineMap: CallbackTo[LineMap],
    message: CallbackTo[String],
    start: CallbackTo[Double],
    text: CallbackTo[String],
    toJSON: Any => Any
  ): Diagnostic = {
    val __obj = js.Dynamic.literal(_additionalLocations = _additionalLocations.asInstanceOf[js.Any], _arguments = _arguments.asInstanceOf[js.Any], _diagnosticKey = _diagnosticKey.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], additionalLocations = additionalLocations.toJsFn, arguments = arguments.toJsFn, character = character.toJsFn, diagnosticKey = diagnosticKey.toJsFn, fileName = fileName.toJsFn, info = info.toJsFn, length = length.toJsFn, line = line.toJsFn, lineMap = lineMap.toJsFn, message = message.toJsFn, start = start.toJsFn, text = text.toJsFn, toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[Diagnostic]
  }
  
  extension [Self <: Diagnostic](x: Self) {
    
    inline def setAdditionalLocations(value: CallbackTo[js.Array[Location]]): Self = StObject.set(x, "additionalLocations", value.toJsFn)
    
    inline def setArguments(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "arguments", value.toJsFn)
    
    inline def setDiagnosticKey(value: CallbackTo[String]): Self = StObject.set(x, "diagnosticKey", value.toJsFn)
    
    inline def setInfo(value: CallbackTo[DiagnosticInfo]): Self = StObject.set(x, "info", value.toJsFn)
    
    inline def setMessage(value: CallbackTo[String]): Self = StObject.set(x, "message", value.toJsFn)
    
    inline def setText(value: CallbackTo[String]): Self = StObject.set(x, "text", value.toJsFn)
    
    inline def setToJSON(value: Any => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    inline def set_additionalLocations(value: Any): Self = StObject.set(x, "_additionalLocations", value.asInstanceOf[js.Any])
    
    inline def set_arguments(value: Any): Self = StObject.set(x, "_arguments", value.asInstanceOf[js.Any])
    
    inline def set_diagnosticKey(value: Any): Self = StObject.set(x, "_diagnosticKey", value.asInstanceOf[js.Any])
  }
}
