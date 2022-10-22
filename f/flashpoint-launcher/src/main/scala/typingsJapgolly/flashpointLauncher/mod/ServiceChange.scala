package typingsJapgolly.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceChange extends StObject {
  
  var newState: ProcessState
  
  var oldState: ProcessState
  
  var process: ManagedChildProcess
}
object ServiceChange {
  
  inline def apply(newState: ProcessState, oldState: ProcessState, process: ManagedChildProcess): ServiceChange = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceChange]
  }
  
  extension [Self <: ServiceChange](x: Self) {
    
    inline def setNewState(value: ProcessState): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setOldState(value: ProcessState): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setProcess(value: ManagedChildProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
  }
}
