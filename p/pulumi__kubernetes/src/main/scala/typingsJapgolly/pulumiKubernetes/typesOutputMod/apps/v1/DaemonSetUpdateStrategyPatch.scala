package typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
  */
trait DaemonSetUpdateStrategyPatch extends StObject {
  
  /**
    * Rolling update config params. Present only if type = "RollingUpdate".
    */
  var rollingUpdate: RollingUpdateDaemonSetPatch
  
  /**
    * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
    */
  var `type`: String
}
object DaemonSetUpdateStrategyPatch {
  
  inline def apply(rollingUpdate: RollingUpdateDaemonSetPatch, `type`: String): DaemonSetUpdateStrategyPatch = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetUpdateStrategyPatch]
  }
  
  extension [Self <: DaemonSetUpdateStrategyPatch](x: Self) {
    
    inline def setRollingUpdate(value: RollingUpdateDaemonSetPatch): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
