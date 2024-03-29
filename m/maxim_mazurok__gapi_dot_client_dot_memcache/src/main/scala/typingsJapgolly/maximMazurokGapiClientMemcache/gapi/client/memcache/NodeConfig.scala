package typingsJapgolly.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConfig extends StObject {
  
  /** Required. Number of cpus per Memcached node. */
  var cpuCount: js.UndefOr[Double] = js.undefined
  
  /** Required. Memory size in MiB for each Memcached node. */
  var memorySizeMb: js.UndefOr[Double] = js.undefined
}
object NodeConfig {
  
  inline def apply(): NodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfig]
  }
  
  extension [Self <: NodeConfig](x: Self) {
    
    inline def setCpuCount(value: Double): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    inline def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    inline def setMemorySizeMb(value: Double): Self = StObject.set(x, "memorySizeMb", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeMbUndefined: Self = StObject.set(x, "memorySizeMb", js.undefined)
  }
}
