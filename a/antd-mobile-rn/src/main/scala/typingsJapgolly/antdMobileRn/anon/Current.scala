package typingsJapgolly.antdMobileRn.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: Double
  
  var indicatorStyle: Null
  
  var mode: String
  
  def onChange(): Unit
  
  var simple: Boolean
  
  var styles: StringDictionary[RegisteredStyle[Any]]
  
  var total: Double
}
object Current {
  
  inline def apply(
    current: Double,
    indicatorStyle: Null,
    mode: String,
    onChange: Callback,
    simple: Boolean,
    styles: StringDictionary[RegisteredStyle[Any]],
    total: Double
  ): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = onChange.toJsFn, simple = simple.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  extension [Self <: Current](x: Self) {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setIndicatorStyle(value: Null): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
