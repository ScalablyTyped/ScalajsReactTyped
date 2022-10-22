package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeNodeResources is a set of resource limits for scheduling of volumes.
  */
trait VolumeNodeResources extends StObject {
  
  /**
    * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
    */
  var count: js.UndefOr[Input[Double]] = js.undefined
}
object VolumeNodeResources {
  
  inline def apply(): VolumeNodeResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeNodeResources]
  }
  
  extension [Self <: VolumeNodeResources](x: Self) {
    
    inline def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
