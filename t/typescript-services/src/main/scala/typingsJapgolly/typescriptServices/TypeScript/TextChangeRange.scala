package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextChangeRange extends StObject {
  
  /* private */ var _newLength: Any
  
  /* private */ var _span: Any
  
  def isUnchanged(): Boolean
  
  def newLength(): Double
  
  def newSpan(): TextSpan
  
  def span(): TextSpan
}
object TextChangeRange {
  
  inline def apply(
    _newLength: Any,
    _span: Any,
    isUnchanged: CallbackTo[Boolean],
    newLength: CallbackTo[Double],
    newSpan: CallbackTo[TextSpan],
    span: CallbackTo[TextSpan]
  ): TextChangeRange = {
    val __obj = js.Dynamic.literal(_newLength = _newLength.asInstanceOf[js.Any], _span = _span.asInstanceOf[js.Any], isUnchanged = isUnchanged.toJsFn, newLength = newLength.toJsFn, newSpan = newSpan.toJsFn, span = span.toJsFn)
    __obj.asInstanceOf[TextChangeRange]
  }
  
  extension [Self <: TextChangeRange](x: Self) {
    
    inline def setIsUnchanged(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUnchanged", value.toJsFn)
    
    inline def setNewLength(value: CallbackTo[Double]): Self = StObject.set(x, "newLength", value.toJsFn)
    
    inline def setNewSpan(value: CallbackTo[TextSpan]): Self = StObject.set(x, "newSpan", value.toJsFn)
    
    inline def setSpan(value: CallbackTo[TextSpan]): Self = StObject.set(x, "span", value.toJsFn)
    
    inline def set_newLength(value: Any): Self = StObject.set(x, "_newLength", value.asInstanceOf[js.Any])
    
    inline def set_span(value: Any): Self = StObject.set(x, "_span", value.asInstanceOf[js.Any])
  }
}
