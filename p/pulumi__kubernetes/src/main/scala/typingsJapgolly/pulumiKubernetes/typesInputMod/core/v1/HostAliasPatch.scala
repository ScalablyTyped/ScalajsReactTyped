package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var hostnames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * IP address of the host file entry.
    */
  var ip: js.UndefOr[Input[String]] = js.undefined
}
object HostAliasPatch {
  
  inline def apply(): HostAliasPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostAliasPatch]
  }
  
  extension [Self <: HostAliasPatch](x: Self) {
    
    inline def setHostnames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "hostnames", value.asInstanceOf[js.Any])
    
    inline def setHostnamesUndefined: Self = StObject.set(x, "hostnames", js.undefined)
    
    inline def setHostnamesVarargs(value: Input[String]*): Self = StObject.set(x, "hostnames", js.Array(value*))
    
    inline def setIp(value: Input[String]): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
  }
}
