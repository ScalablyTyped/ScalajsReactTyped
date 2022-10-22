package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Span extends StObject {
  
  var ctxt: Double
  
  var end: Double
  
  var start: Double
}
object Span {
  
  inline def apply(ctxt: Double, end: Double, start: Double): Span = {
    val __obj = js.Dynamic.literal(ctxt = ctxt.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Span]
  }
  
  extension [Self <: Span](x: Self) {
    
    inline def setCtxt(value: Double): Self = StObject.set(x, "ctxt", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
