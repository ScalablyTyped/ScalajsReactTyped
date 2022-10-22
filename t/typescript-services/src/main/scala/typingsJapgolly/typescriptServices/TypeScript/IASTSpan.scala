package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IASTSpan extends StObject {
  
  var _end: Double
  
  var _start: Double
  
  def end(): Double
  
  def start(): Double
}
object IASTSpan {
  
  inline def apply(_end: Double, _start: Double, end: CallbackTo[Double], start: CallbackTo[Double]): IASTSpan = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = end.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[IASTSpan]
  }
  
  extension [Self <: IASTSpan](x: Self) {
    
    inline def setEnd(value: CallbackTo[Double]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setStart(value: CallbackTo[Double]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def set_end(value: Double): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_start(value: Double): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
  }
}
