package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStatus contains details for the current status of this container.
  */
trait ContainerStatusPatch extends StObject {
  
  /**
    * Container's ID in the format '<type>://<container_id>'.
    */
  var containerID: String
  
  /**
    * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
    */
  var image: String
  
  /**
    * ImageID of the container's image.
    */
  var imageID: String
  
  /**
    * Details about the container's last termination condition.
    */
  var lastState: ContainerStatePatch
  
  /**
    * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
    */
  var name: String
  
  /**
    * Specifies whether the container has passed its readiness probe.
    */
  var ready: Boolean
  
  /**
    * The number of times the container has been restarted.
    */
  var restartCount: Double
  
  /**
    * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
    */
  var started: Boolean
  
  /**
    * Details about the container's current condition.
    */
  var state: ContainerStatePatch
}
object ContainerStatusPatch {
  
  inline def apply(
    containerID: String,
    image: String,
    imageID: String,
    lastState: ContainerStatePatch,
    name: String,
    ready: Boolean,
    restartCount: Double,
    started: Boolean,
    state: ContainerStatePatch
  ): ContainerStatusPatch = {
    val __obj = js.Dynamic.literal(containerID = containerID.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageID = imageID.asInstanceOf[js.Any], lastState = lastState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStatusPatch]
  }
  
  extension [Self <: ContainerStatusPatch](x: Self) {
    
    inline def setContainerID(value: String): Self = StObject.set(x, "containerID", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageID(value: String): Self = StObject.set(x, "imageID", value.asInstanceOf[js.Any])
    
    inline def setLastState(value: ContainerStatePatch): Self = StObject.set(x, "lastState", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setRestartCount(value: Double): Self = StObject.set(x, "restartCount", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setState(value: ContainerStatePatch): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
