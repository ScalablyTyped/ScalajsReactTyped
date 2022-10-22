package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortStatus extends StObject {
  
  /**
    * Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use
    *   CamelCase names
    * - cloud provider specific error values must have names that comply with the
    *   format foo.example.com/CamelCase.
    */
  var error: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Port is the port number of the service port of which status is recorded here
    */
  var port: Input[Double]
  
  /**
    * Protocol is the protocol of the service port of which status is recorded here The supported values are: "TCP", "UDP", "SCTP"
    */
  var protocol: Input[String]
}
object PortStatus {
  
  inline def apply(port: Input[Double], protocol: Input[String]): PortStatus = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortStatus]
  }
  
  extension [Self <: PortStatus](x: Self) {
    
    inline def setError(value: Input[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
