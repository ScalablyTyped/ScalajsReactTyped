package typingsJapgolly.playable.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  def end(): Double
  
  var length: Double
  
  def start(): Double
}
object Length {
  
  inline def apply(end: CallbackTo[Double], length: Double, start: CallbackTo[Double]): Length = {
    val __obj = js.Dynamic.literal(end = end.toJsFn, length = length.asInstanceOf[js.Any], start = start.toJsFn)
    __obj.asInstanceOf[Length]
  }
  
  extension [Self <: Length](x: Self) {
    
    inline def setEnd(value: CallbackTo[Double]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStart(value: CallbackTo[Double]): Self = StObject.set(x, "start", value.toJsFn)
  }
}
