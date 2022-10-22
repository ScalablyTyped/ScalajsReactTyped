package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
  */
trait ContainerStatePatch extends StObject {
  
  /**
    * Details about a running container
    */
  var running: ContainerStateRunningPatch
  
  /**
    * Details about a terminated container
    */
  var terminated: ContainerStateTerminatedPatch
  
  /**
    * Details about a waiting container
    */
  var waiting: ContainerStateWaitingPatch
}
object ContainerStatePatch {
  
  inline def apply(
    running: ContainerStateRunningPatch,
    terminated: ContainerStateTerminatedPatch,
    waiting: ContainerStateWaitingPatch
  ): ContainerStatePatch = {
    val __obj = js.Dynamic.literal(running = running.asInstanceOf[js.Any], terminated = terminated.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStatePatch]
  }
  
  extension [Self <: ContainerStatePatch](x: Self) {
    
    inline def setRunning(value: ContainerStateRunningPatch): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setTerminated(value: ContainerStateTerminatedPatch): Self = StObject.set(x, "terminated", value.asInstanceOf[js.Any])
    
    inline def setWaiting(value: ContainerStateWaitingPatch): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
  }
}
