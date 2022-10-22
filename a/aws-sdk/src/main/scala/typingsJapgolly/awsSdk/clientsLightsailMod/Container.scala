package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  /**
    * The launch command for the container.
    */
  var command: js.UndefOr[StringList] = js.undefined
  
  /**
    * The environment variables of the container.
    */
  var environment: js.UndefOr[Environment] = js.undefined
  
  /**
    * The name of the image used for the container. Container images sourced from your Lightsail container service, that are registered and stored on your service, start with a colon (:). For example, if your container service name is container-service-1, the container image label is mystaticsite, and you want to use the third (3) version of the registered container image, then you should specify :container-service-1.mystaticsite.3. To use the latest version of a container image, specify latest instead of a version number (for example, :container-service-1.mystaticsite.latest). Lightsail will automatically use the highest numbered version of the registered container image. Container images sourced from a public registry like Docker Hub don't start with a colon. For example, nginx:latest or nginx.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * The open firewall ports of the container.
    */
  var ports: js.UndefOr[PortMap] = js.undefined
}
object Container {
  
  inline def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setCommand(value: StringList): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setPorts(value: PortMap): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
  }
}
