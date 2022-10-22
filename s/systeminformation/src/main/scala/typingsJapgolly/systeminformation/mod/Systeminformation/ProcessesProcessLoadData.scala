package typingsJapgolly.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessesProcessLoadData extends StObject {
  
  var cpu: Double
  
  var mem: Double
  
  var pid: Double
  
  var pids: js.Array[Double]
  
  var proc: String
}
object ProcessesProcessLoadData {
  
  inline def apply(cpu: Double, mem: Double, pid: Double, pids: js.Array[Double], proc: String): ProcessesProcessLoadData = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], proc = proc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesProcessLoadData]
  }
  
  extension [Self <: ProcessesProcessLoadData](x: Self) {
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setMem(value: Double): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPids(value: js.Array[Double]): Self = StObject.set(x, "pids", value.asInstanceOf[js.Any])
    
    inline def setPidsVarargs(value: Double*): Self = StObject.set(x, "pids", js.Array(value*))
    
    inline def setProc(value: String): Self = StObject.set(x, "proc", value.asInstanceOf[js.Any])
  }
}
