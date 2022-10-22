package typingsJapgolly.dockerode.mod

import typingsJapgolly.dockerode.dockerodeStrings.host
import typingsJapgolly.dockerode.dockerodeStrings.ingress
import typingsJapgolly.dockerode.dockerodeStrings.sctp
import typingsJapgolly.dockerode.dockerodeStrings.tcp
import typingsJapgolly.dockerode.dockerodeStrings.udp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortConfig extends StObject {
  
  var Name: js.UndefOr[String] = js.undefined
  
  var Protocol: js.UndefOr[tcp | udp | sctp] = js.undefined
  
  var PublishMode: js.UndefOr[ingress | host] = js.undefined
  
  var PublishedPort: js.UndefOr[Double] = js.undefined
  
  var TargetPort: js.UndefOr[Double] = js.undefined
}
object PortConfig {
  
  inline def apply(): PortConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortConfig]
  }
  
  extension [Self <: PortConfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProtocol(value: tcp | udp | sctp): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setPublishMode(value: ingress | host): Self = StObject.set(x, "PublishMode", value.asInstanceOf[js.Any])
    
    inline def setPublishModeUndefined: Self = StObject.set(x, "PublishMode", js.undefined)
    
    inline def setPublishedPort(value: Double): Self = StObject.set(x, "PublishedPort", value.asInstanceOf[js.Any])
    
    inline def setPublishedPortUndefined: Self = StObject.set(x, "PublishedPort", js.undefined)
    
    inline def setTargetPort(value: Double): Self = StObject.set(x, "TargetPort", value.asInstanceOf[js.Any])
    
    inline def setTargetPortUndefined: Self = StObject.set(x, "TargetPort", js.undefined)
  }
}
