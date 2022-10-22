package typingsJapgolly.winrt.anon

import typingsJapgolly.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutPoint extends StObject {
  
  var outPoint: Point
  
  var returnValue: Boolean
}
object OutPoint {
  
  inline def apply(outPoint: Point, returnValue: Boolean): OutPoint = {
    val __obj = js.Dynamic.literal(outPoint = outPoint.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutPoint]
  }
  
  extension [Self <: OutPoint](x: Self) {
    
    inline def setOutPoint(value: Point): Self = StObject.set(x, "outPoint", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
