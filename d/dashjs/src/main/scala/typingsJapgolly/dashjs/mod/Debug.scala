package typingsJapgolly.dashjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  def getLogger(): Logger
  
  def setCalleeNameVisible(flag: Boolean): Unit
  
  def setLogTimestampVisible(flag: Boolean): Unit
}
object Debug {
  
  inline def apply(
    getLogger: CallbackTo[Logger],
    setCalleeNameVisible: Boolean => Callback,
    setLogTimestampVisible: Boolean => Callback
  ): Debug = {
    val __obj = js.Dynamic.literal(getLogger = getLogger.toJsFn, setCalleeNameVisible = js.Any.fromFunction1((t0: Boolean) => setCalleeNameVisible(t0).runNow()), setLogTimestampVisible = js.Any.fromFunction1((t0: Boolean) => setLogTimestampVisible(t0).runNow()))
    __obj.asInstanceOf[Debug]
  }
  
  extension [Self <: Debug](x: Self) {
    
    inline def setGetLogger(value: CallbackTo[Logger]): Self = StObject.set(x, "getLogger", value.toJsFn)
    
    inline def setSetCalleeNameVisible(value: Boolean => Callback): Self = StObject.set(x, "setCalleeNameVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetLogTimestampVisible(value: Boolean => Callback): Self = StObject.set(x, "setLogTimestampVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
