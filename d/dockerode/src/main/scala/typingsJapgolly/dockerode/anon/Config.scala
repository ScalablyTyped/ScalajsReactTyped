package typingsJapgolly.dockerode.anon

import typingsJapgolly.dockerode.dockerodeStrings.config
import typingsJapgolly.dockerode.dockerodeStrings.container
import typingsJapgolly.dockerode.dockerodeStrings.daemon
import typingsJapgolly.dockerode.dockerodeStrings.image
import typingsJapgolly.dockerode.dockerodeStrings.local
import typingsJapgolly.dockerode.dockerodeStrings.network
import typingsJapgolly.dockerode.dockerodeStrings.node
import typingsJapgolly.dockerode.dockerodeStrings.plugin
import typingsJapgolly.dockerode.dockerodeStrings.secret
import typingsJapgolly.dockerode.dockerodeStrings.service
import typingsJapgolly.dockerode.dockerodeStrings.swarm
import typingsJapgolly.dockerode.dockerodeStrings.volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[js.Array[String]] = js.undefined
  
  var daemon: js.UndefOr[js.Array[String]] = js.undefined
  
  var event: js.UndefOr[js.Array[String]] = js.undefined
  
  var image: js.UndefOr[js.Array[String]] = js.undefined
  
  var label: js.UndefOr[js.Array[String]] = js.undefined
  
  var network: js.UndefOr[js.Array[String]] = js.undefined
  
  var node: js.UndefOr[js.Array[String]] = js.undefined
  
  var plugin: js.UndefOr[js.Array[String]] = js.undefined
  
  var scope: js.UndefOr[js.Array[local | swarm]] = js.undefined
  
  var secret: js.UndefOr[js.Array[String]] = js.undefined
  
  var service: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[
    js.Array[
      container | image | volume | network | daemon | plugin | service | node | secret | config
    ]
  ] = js.undefined
  
  var volume: js.UndefOr[js.Array[String]] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setContainer(value: js.Array[String]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContainerVarargs(value: String*): Self = StObject.set(x, "container", js.Array(value*))
    
    inline def setDaemon(value: js.Array[String]): Self = StObject.set(x, "daemon", value.asInstanceOf[js.Any])
    
    inline def setDaemonUndefined: Self = StObject.set(x, "daemon", js.undefined)
    
    inline def setDaemonVarargs(value: String*): Self = StObject.set(x, "daemon", js.Array(value*))
    
    inline def setEvent(value: js.Array[String]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: String*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setImage(value: js.Array[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: String*): Self = StObject.set(x, "image", js.Array(value*))
    
    inline def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setNetwork(value: js.Array[String]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNetworkVarargs(value: String*): Self = StObject.set(x, "network", js.Array(value*))
    
    inline def setNode(value: js.Array[String]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setNodeVarargs(value: String*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setPlugin(value: js.Array[String]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    inline def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value*))
    
    inline def setScope(value: js.Array[local | swarm]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: (local | swarm)*): Self = StObject.set(x, "scope", js.Array(value*))
    
    inline def setSecret(value: js.Array[String]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setSecretVarargs(value: String*): Self = StObject.set(x, "secret", js.Array(value*))
    
    inline def setService(value: js.Array[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setServiceVarargs(value: String*): Self = StObject.set(x, "service", js.Array(value*))
    
    inline def setType(
      value: js.Array[
          container | image | volume | network | daemon | plugin | service | node | secret | config
        ]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(
      value: (container | image | volume | network | daemon | plugin | service | node | secret | config)*
    ): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setVolume(value: js.Array[String]): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    inline def setVolumeVarargs(value: String*): Self = StObject.set(x, "volume", js.Array(value*))
  }
}
