package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  def fromJS(expose: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, Any]): Unit
  
  val unit: YogaUnit | Double
  
  val value: Double
}
object Value {
  
  inline def apply(
    fromJS: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, Any] => Callback,
    unit: YogaUnit | Double,
    value: Double
  ): Value = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1((t0: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, Any]) => fromJS(t0).runNow()), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setFromJS(value: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, Any] => Callback): Self = StObject.set(x, "fromJS", js.Any.fromFunction1((t0: js.Function2[/* unit */ YogaUnit | Double, /* value */ Double, Any]) => value(t0).runNow()))
    
    inline def setUnit(value: YogaUnit | Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
