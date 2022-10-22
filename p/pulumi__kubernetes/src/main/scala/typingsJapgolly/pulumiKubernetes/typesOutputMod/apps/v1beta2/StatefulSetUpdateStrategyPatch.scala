package typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
  */
trait StatefulSetUpdateStrategyPatch extends StObject {
  
  /**
    * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
    */
  var rollingUpdate: RollingUpdateStatefulSetStrategyPatch
  
  /**
    * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
    */
  var `type`: String
}
object StatefulSetUpdateStrategyPatch {
  
  inline def apply(rollingUpdate: RollingUpdateStatefulSetStrategyPatch, `type`: String): StatefulSetUpdateStrategyPatch = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetUpdateStrategyPatch]
  }
  
  extension [Self <: StatefulSetUpdateStrategyPatch](x: Self) {
    
    inline def setRollingUpdate(value: RollingUpdateStatefulSetStrategyPatch): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
