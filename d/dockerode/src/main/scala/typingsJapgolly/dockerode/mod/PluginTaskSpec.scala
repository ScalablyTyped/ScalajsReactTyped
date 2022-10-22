package typingsJapgolly.dockerode.mod

import typingsJapgolly.dockerode.dockerodeStrings.plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginTaskSpec
  extends StObject
     with TaskSpecBase
     with TaskSpec {
  
  var PluginSpec: typingsJapgolly.dockerode.mod.PluginSpec
  
  @JSName("Runtime")
  var Runtime_PluginTaskSpec: plugin
}
object PluginTaskSpec {
  
  inline def apply(PluginSpec: PluginSpec): PluginTaskSpec = {
    val __obj = js.Dynamic.literal(PluginSpec = PluginSpec.asInstanceOf[js.Any], Runtime = "plugin")
    __obj.asInstanceOf[PluginTaskSpec]
  }
  
  extension [Self <: PluginTaskSpec](x: Self) {
    
    inline def setPluginSpec(value: PluginSpec): Self = StObject.set(x, "PluginSpec", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: plugin): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
  }
}
