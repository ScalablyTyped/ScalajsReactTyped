package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateRunning is a running state of a container.
  */
trait ContainerStateRunningPatch extends StObject {
  
  /**
    * Time at which the container was last (re-)started
    */
  var startedAt: String
}
object ContainerStateRunningPatch {
  
  inline def apply(startedAt: String): ContainerStateRunningPatch = {
    val __obj = js.Dynamic.literal(startedAt = startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateRunningPatch]
  }
  
  extension [Self <: ContainerStateRunningPatch](x: Self) {
    
    inline def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
  }
}
