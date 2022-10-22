package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var exec: js.UndefOr[Input[ExecActionPatch]] = js.undefined
  
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: js.UndefOr[Input[HTTPGetActionPatch]] = js.undefined
  
  /**
    * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
    */
  var tcpSocket: js.UndefOr[Input[TCPSocketActionPatch]] = js.undefined
}
object LifecycleHandlerPatch {
  
  inline def apply(): LifecycleHandlerPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleHandlerPatch]
  }
  
  extension [Self <: LifecycleHandlerPatch](x: Self) {
    
    inline def setExec(value: Input[ExecActionPatch]): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    inline def setHttpGet(value: Input[HTTPGetActionPatch]): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    inline def setHttpGetUndefined: Self = StObject.set(x, "httpGet", js.undefined)
    
    inline def setTcpSocket(value: Input[TCPSocketActionPatch]): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
    
    inline def setTcpSocketUndefined: Self = StObject.set(x, "tcpSocket", js.undefined)
  }
}
