package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateTerminated is a terminated state of a container.
  */
trait ContainerStateTerminatedPatch extends StObject {
  
  /**
    * Container's ID in the format '<type>://<container_id>'
    */
  var containerID: String
  
  /**
    * Exit status from the last termination of the container
    */
  var exitCode: Double
  
  /**
    * Time at which the container last terminated
    */
  var finishedAt: String
  
  /**
    * Message regarding the last termination of the container
    */
  var message: String
  
  /**
    * (brief) reason from the last termination of the container
    */
  var reason: String
  
  /**
    * Signal from the last termination of the container
    */
  var signal: Double
  
  /**
    * Time at which previous execution of the container started
    */
  var startedAt: String
}
object ContainerStateTerminatedPatch {
  
  inline def apply(
    containerID: String,
    exitCode: Double,
    finishedAt: String,
    message: String,
    reason: String,
    signal: Double,
    startedAt: String
  ): ContainerStateTerminatedPatch = {
    val __obj = js.Dynamic.literal(containerID = containerID.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateTerminatedPatch]
  }
  
  extension [Self <: ContainerStateTerminatedPatch](x: Self) {
    
    inline def setContainerID(value: String): Self = StObject.set(x, "containerID", value.asInstanceOf[js.Any])
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setFinishedAt(value: String): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: Double): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
  }
}
