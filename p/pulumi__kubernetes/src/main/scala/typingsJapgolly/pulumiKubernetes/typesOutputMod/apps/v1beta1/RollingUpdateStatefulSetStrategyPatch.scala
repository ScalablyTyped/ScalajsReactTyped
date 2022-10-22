package typingsJapgolly.pulumiKubernetes.typesOutputMod.apps.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
  */
trait RollingUpdateStatefulSetStrategyPatch extends StObject {
  
  /**
    * Partition indicates the ordinal at which the StatefulSet should be partitioned.
    */
  var partition: Double
}
object RollingUpdateStatefulSetStrategyPatch {
  
  inline def apply(partition: Double): RollingUpdateStatefulSetStrategyPatch = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategyPatch]
  }
  
  extension [Self <: RollingUpdateStatefulSetStrategyPatch](x: Self) {
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}
