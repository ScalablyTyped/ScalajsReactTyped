package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
  */
trait LifecycleHandlerPatch extends StObject {
  
  /**
    * Exec specifies the action to take.
    */
  var exec: ExecActionPatch
  
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: HTTPGetActionPatch
  
  /**
    * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
    */
  var tcpSocket: TCPSocketActionPatch
}
object LifecycleHandlerPatch {
  
  inline def apply(exec: ExecActionPatch, httpGet: HTTPGetActionPatch, tcpSocket: TCPSocketActionPatch): LifecycleHandlerPatch = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], tcpSocket = tcpSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHandlerPatch]
  }
  
  extension [Self <: LifecycleHandlerPatch](x: Self) {
    
    inline def setExec(value: ExecActionPatch): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setHttpGet(value: HTTPGetActionPatch): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    inline def setTcpSocket(value: TCPSocketActionPatch): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
  }
}
