package typingsJapgolly.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginConfig extends StObject {
  
  var Args: typingsJapgolly.dockerode.mod.Args
  
  var Description: String
  
  var Documentation: String
  
  var Entrypoint: js.Array[String]
  
  var Env: js.Array[PluginEnv]
  
  var Interface: Any
  
  var Linux: typingsJapgolly.dockerode.mod.Linux
  
  var Mounts: js.Array[PluginMount]
  
  var Network: typingsJapgolly.dockerode.mod.Network
  
  var PropagatedMount: String
  
  var User: js.UndefOr[typingsJapgolly.dockerode.mod.User] = js.undefined
  
  var WorkDir: String
  
  var rootfs: Any
}
object PluginConfig {
  
  inline def apply(
    Args: Args,
    Description: String,
    Documentation: String,
    Entrypoint: js.Array[String],
    Env: js.Array[PluginEnv],
    Interface: Any,
    Linux: Linux,
    Mounts: js.Array[PluginMount],
    Network: Network,
    PropagatedMount: String,
    WorkDir: String,
    rootfs: Any
  ): PluginConfig = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Documentation = Documentation.asInstanceOf[js.Any], Entrypoint = Entrypoint.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any], Linux = Linux.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Network = Network.asInstanceOf[js.Any], PropagatedMount = PropagatedMount.asInstanceOf[js.Any], WorkDir = WorkDir.asInstanceOf[js.Any], rootfs = rootfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConfig]
  }
  
  extension [Self <: PluginConfig](x: Self) {
    
    inline def setArgs(value: Args): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "Documentation", value.asInstanceOf[js.Any])
    
    inline def setEntrypoint(value: js.Array[String]): Self = StObject.set(x, "Entrypoint", value.asInstanceOf[js.Any])
    
    inline def setEntrypointVarargs(value: String*): Self = StObject.set(x, "Entrypoint", js.Array(value*))
    
    inline def setEnv(value: js.Array[PluginEnv]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    inline def setEnvVarargs(value: PluginEnv*): Self = StObject.set(x, "Env", js.Array(value*))
    
    inline def setInterface(value: Any): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
    
    inline def setLinux(value: Linux): Self = StObject.set(x, "Linux", value.asInstanceOf[js.Any])
    
    inline def setMounts(value: js.Array[PluginMount]): Self = StObject.set(x, "Mounts", value.asInstanceOf[js.Any])
    
    inline def setMountsVarargs(value: PluginMount*): Self = StObject.set(x, "Mounts", js.Array(value*))
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
    
    inline def setPropagatedMount(value: String): Self = StObject.set(x, "PropagatedMount", value.asInstanceOf[js.Any])
    
    inline def setRootfs(value: Any): Self = StObject.set(x, "rootfs", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    inline def setWorkDir(value: String): Self = StObject.set(x, "WorkDir", value.asInstanceOf[js.Any])
  }
}
