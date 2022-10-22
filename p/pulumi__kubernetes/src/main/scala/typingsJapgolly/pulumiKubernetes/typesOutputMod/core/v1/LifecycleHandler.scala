package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
  */
trait LifecycleHandler extends StObject {
  
  /**
    * Exec specifies the action to take.
    */
  var exec: ExecAction
  
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: HTTPGetAction
  
  /**
    * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
    */
  var tcpSocket: TCPSocketAction
}
object LifecycleHandler {
  
  inline def apply(exec: ExecAction, httpGet: HTTPGetAction, tcpSocket: TCPSocketAction): LifecycleHandler = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], tcpSocket = tcpSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHandler]
  }
  
  extension [Self <: LifecycleHandler](x: Self) {
    
    inline def setExec(value: ExecAction): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setHttpGet(value: HTTPGetAction): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    inline def setTcpSocket(value: TCPSocketAction): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
  }
}
