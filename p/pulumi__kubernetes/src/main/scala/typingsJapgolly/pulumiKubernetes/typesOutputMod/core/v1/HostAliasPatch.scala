package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.
  */
trait HostAliasPatch extends StObject {
  
  /**
    * Hostnames for the above IP address.
    */
  var hostnames: js.Array[String]
  
  /**
    * IP address of the host file entry.
    */
  var ip: String
}
object HostAliasPatch {
  
  inline def apply(hostnames: js.Array[String], ip: String): HostAliasPatch = {
    val __obj = js.Dynamic.literal(hostnames = hostnames.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostAliasPatch]
  }
  
  extension [Self <: HostAliasPatch](x: Self) {
    
    inline def setHostnames(value: js.Array[String]): Self = StObject.set(x, "hostnames", value.asInstanceOf[js.Any])
    
    inline def setHostnamesVarargs(value: String*): Self = StObject.set(x, "hostnames", js.Array(value*))
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
