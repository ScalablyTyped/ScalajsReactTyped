package typingsJapgolly.nvd3.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Utils extends StObject {
  
  /* Default color chooser uses a color scale of 20 colors from D3  https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors */
  def defaultColor(): js.Array[String]
  
  def getColor(arg: Any): js.Array[String]
  
  def state(): State
  
  var symbolMap: SymbolMap
  
  /* Binds callback function to run when window is resized */
  def windowResize(listener: js.Function1[/* ev */ Event, Any]): Unit
  
  /* Gets the browser window size */
  def windowSize(): Size
}
object Utils {
  
  inline def apply(
    defaultColor: CallbackTo[js.Array[String]],
    getColor: Any => js.Array[String],
    state: CallbackTo[State],
    symbolMap: SymbolMap,
    windowResize: js.Function1[/* ev */ Event, Any] => Callback,
    windowSize: CallbackTo[Size]
  ): Utils = {
    val __obj = js.Dynamic.literal(defaultColor = defaultColor.toJsFn, getColor = js.Any.fromFunction1(getColor), state = state.toJsFn, symbolMap = symbolMap.asInstanceOf[js.Any], windowResize = js.Any.fromFunction1((t0: js.Function1[/* ev */ Event, Any]) => windowResize(t0).runNow()), windowSize = windowSize.toJsFn)
    __obj.asInstanceOf[Utils]
  }
  
  extension [Self <: Utils](x: Self) {
    
    inline def setDefaultColor(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "defaultColor", value.toJsFn)
    
    inline def setGetColor(value: Any => js.Array[String]): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setState(value: CallbackTo[State]): Self = StObject.set(x, "state", value.toJsFn)
    
    inline def setSymbolMap(value: SymbolMap): Self = StObject.set(x, "symbolMap", value.asInstanceOf[js.Any])
    
    inline def setWindowResize(value: js.Function1[/* ev */ Event, Any] => Callback): Self = StObject.set(x, "windowResize", js.Any.fromFunction1((t0: js.Function1[/* ev */ Event, Any]) => value(t0).runNow()))
    
    inline def setWindowSize(value: CallbackTo[Size]): Self = StObject.set(x, "windowSize", value.toJsFn)
  }
}
