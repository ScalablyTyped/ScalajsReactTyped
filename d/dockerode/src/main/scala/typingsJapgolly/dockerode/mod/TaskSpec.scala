package typingsJapgolly.dockerode.mod

import typingsJapgolly.dockerode.anon.ContainerID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dockerode.mod.ContainerTaskSpec
  - typingsJapgolly.dockerode.mod.PluginTaskSpec
  - typingsJapgolly.dockerode.mod.NetworkAttachmentTaskSpec
*/
trait TaskSpec extends StObject
object TaskSpec {
  
  inline def ContainerTaskSpec(): typingsJapgolly.dockerode.mod.ContainerTaskSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.dockerode.mod.ContainerTaskSpec]
  }
  
  inline def NetworkAttachmentTaskSpec(NetworkAttachmentSpec: ContainerID): typingsJapgolly.dockerode.mod.NetworkAttachmentTaskSpec = {
    val __obj = js.Dynamic.literal(NetworkAttachmentSpec = NetworkAttachmentSpec.asInstanceOf[js.Any], Runtime = "attachment")
    __obj.asInstanceOf[typingsJapgolly.dockerode.mod.NetworkAttachmentTaskSpec]
  }
  
  inline def PluginTaskSpec(PluginSpec: PluginSpec): typingsJapgolly.dockerode.mod.PluginTaskSpec = {
    val __obj = js.Dynamic.literal(PluginSpec = PluginSpec.asInstanceOf[js.Any], Runtime = "plugin")
    __obj.asInstanceOf[typingsJapgolly.dockerode.mod.PluginTaskSpec]
  }
}
