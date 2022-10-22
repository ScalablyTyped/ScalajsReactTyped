package typingsJapgolly.plugapi.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogObject extends StObject {
  
  def log(): Unit
}
object LogObject {
  
  inline def apply(log: Callback): LogObject = {
    val __obj = js.Dynamic.literal(log = log.toJsFn)
    __obj.asInstanceOf[LogObject]
  }
  
  extension [Self <: LogObject](x: Self) {
    
    inline def setLog(value: Callback): Self = StObject.set(x, "log", value.toJsFn)
  }
}
