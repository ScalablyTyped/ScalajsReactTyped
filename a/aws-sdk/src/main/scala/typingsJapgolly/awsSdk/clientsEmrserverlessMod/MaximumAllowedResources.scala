package typingsJapgolly.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumAllowedResources extends StObject {
  
  /**
    * The maximum allowed CPU for an application.
    */
  var cpu: CpuSize
  
  /**
    * The maximum allowed disk for an application.
    */
  var disk: js.UndefOr[DiskSize] = js.undefined
  
  /**
    * The maximum allowed resources for an application.
    */
  var memory: MemorySize
}
object MaximumAllowedResources {
  
  inline def apply(cpu: CpuSize, memory: MemorySize): MaximumAllowedResources = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumAllowedResources]
  }
  
  extension [Self <: MaximumAllowedResources](x: Self) {
    
    inline def setCpu(value: CpuSize): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setDisk(value: DiskSize): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
    
    inline def setMemory(value: MemorySize): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
  }
}
