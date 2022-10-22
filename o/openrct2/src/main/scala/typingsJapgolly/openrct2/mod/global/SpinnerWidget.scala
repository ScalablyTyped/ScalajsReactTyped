package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import typingsJapgolly.openrct2.openrct2Strings.spinner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinnerWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onDecrement: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onIncrement: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: spinner
}
object SpinnerWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): SpinnerWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spinner")
    __obj.asInstanceOf[SpinnerWidget]
  }
  
  extension [Self <: SpinnerWidget](x: Self) {
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnDecrement(value: Callback): Self = StObject.set(x, "onDecrement", value.toJsFn)
    
    inline def setOnDecrementUndefined: Self = StObject.set(x, "onDecrement", js.undefined)
    
    inline def setOnIncrement(value: Callback): Self = StObject.set(x, "onIncrement", value.toJsFn)
    
    inline def setOnIncrementUndefined: Self = StObject.set(x, "onIncrement", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: spinner): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
