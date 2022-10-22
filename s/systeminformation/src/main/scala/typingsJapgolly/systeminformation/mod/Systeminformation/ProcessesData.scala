package typingsJapgolly.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessesData extends StObject {
  
  var all: Double
  
  var blocked: Double
  
  var list: js.Array[ProcessesProcessData]
  
  var running: Double
  
  var sleeping: Double
  
  var unknown: Double
}
object ProcessesData {
  
  inline def apply(
    all: Double,
    blocked: Double,
    list: js.Array[ProcessesProcessData],
    running: Double,
    sleeping: Double,
    unknown: Double
  ): ProcessesData = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesData]
  }
  
  extension [Self <: ProcessesData](x: Self) {
    
    inline def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setBlocked(value: Double): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setList(value: js.Array[ProcessesProcessData]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: ProcessesProcessData*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setRunning(value: Double): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setSleeping(value: Double): Self = StObject.set(x, "sleeping", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
