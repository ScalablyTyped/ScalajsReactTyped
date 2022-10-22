package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutPoint extends StObject {
  
  /** The transformed input point. */ var outPoint: Point
  
  /** True if inPoint was transformed successfully; otherwise, false. */ var returnValue: Boolean
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
