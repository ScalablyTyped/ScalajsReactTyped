package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  def fromJS(expose: js.Function2[/* width */ Double, /* height */ Double, Any]): Unit
  
  val height: Double
  
  val width: Double
}
object Size {
  
  inline def apply(
    fromJS: js.Function2[/* width */ Double, /* height */ Double, Any] => Callback,
    height: Double,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1((t0: js.Function2[/* width */ Double, /* height */ Double, Any]) => fromJS(t0).runNow()), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setFromJS(value: js.Function2[/* width */ Double, /* height */ Double, Any] => Callback): Self = StObject.set(x, "fromJS", js.Any.fromFunction1((t0: js.Function2[/* width */ Double, /* height */ Double, Any]) => value(t0).runNow()))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
