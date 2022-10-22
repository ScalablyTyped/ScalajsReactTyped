package typingsJapgolly.pulumiKubernetes.typesInputMod.apps.v1beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var rollingUpdate: js.UndefOr[Input[RollingUpdateStatefulSetStrategyPatch]] = js.undefined
  
  /**
    * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object StatefulSetUpdateStrategyPatch {
  
  inline def apply(): StatefulSetUpdateStrategyPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSetUpdateStrategyPatch]
  }
  
  extension [Self <: StatefulSetUpdateStrategyPatch](x: Self) {
    
    inline def setRollingUpdate(value: Input[RollingUpdateStatefulSetStrategyPatch]): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    inline def setRollingUpdateUndefined: Self = StObject.set(x, "rollingUpdate", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
