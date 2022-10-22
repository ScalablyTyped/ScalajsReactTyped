package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionsLogger extends StObject {
  
  def log(severity: VerboseLevel, msg: String): Unit
  
  var time: Double | Null
  
  var verboseLevel: VerboseLevel
}
object CaptionsLogger {
  
  inline def apply(log: (VerboseLevel, String) => Callback, verboseLevel: VerboseLevel): CaptionsLogger = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction2((t0: VerboseLevel, t1: String) => (log(t0, t1)).runNow()), verboseLevel = verboseLevel.asInstanceOf[js.Any], time = null)
    __obj.asInstanceOf[CaptionsLogger]
  }
  
  extension [Self <: CaptionsLogger](x: Self) {
    
    inline def setLog(value: (VerboseLevel, String) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: VerboseLevel, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setVerboseLevel(value: VerboseLevel): Self = StObject.set(x, "verboseLevel", value.asInstanceOf[js.Any])
  }
}
