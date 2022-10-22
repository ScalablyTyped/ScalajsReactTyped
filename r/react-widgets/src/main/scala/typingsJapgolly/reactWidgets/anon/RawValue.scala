package typingsJapgolly.reactWidgets.anon

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawValue extends StObject {
  
  var lastValue: js.UndefOr[Double] = js.undefined
  
  var originalEvent: (ReactEventFrom[(HTMLDivElement | HTMLButtonElement) & Element]) | Null
  
  var rawValue: Double
}
object RawValue {
  
  inline def apply(rawValue: Double): RawValue = {
    val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any], originalEvent = null)
    __obj.asInstanceOf[RawValue]
  }
  
  extension [Self <: RawValue](x: Self) {
    
    inline def setLastValue(value: Double): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setLastValueUndefined: Self = StObject.set(x, "lastValue", js.undefined)
    
    inline def setOriginalEvent(value: ReactEventFrom[(HTMLDivElement | HTMLButtonElement) & Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventNull: Self = StObject.set(x, "originalEvent", null)
    
    inline def setRawValue(value: Double): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
  }
}
