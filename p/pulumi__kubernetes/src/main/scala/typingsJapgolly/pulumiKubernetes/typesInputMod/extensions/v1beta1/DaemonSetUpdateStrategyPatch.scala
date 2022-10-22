package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DaemonSetUpdateStrategyPatch extends StObject {
  
  /**
    * Rolling update config params. Present only if type = "RollingUpdate".
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateDaemonSetPatch]] = js.undefined
  
  /**
    * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is OnDelete.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object DaemonSetUpdateStrategyPatch {
  
  inline def apply(): DaemonSetUpdateStrategyPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaemonSetUpdateStrategyPatch]
  }
  
  extension [Self <: DaemonSetUpdateStrategyPatch](x: Self) {
    
    inline def setRollingUpdate(value: Input[RollingUpdateDaemonSetPatch]): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    inline def setRollingUpdateUndefined: Self = StObject.set(x, "rollingUpdate", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
