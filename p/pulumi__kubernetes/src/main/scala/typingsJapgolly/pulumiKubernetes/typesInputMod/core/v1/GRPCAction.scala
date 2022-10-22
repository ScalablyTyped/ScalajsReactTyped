package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GRPCAction extends StObject {
  
  /**
    * Port number of the gRPC service. Number must be in the range 1 to 65535.
    */
  var port: Input[Double]
  
  /**
    * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
    *
    * If this is not specified, the default behavior is defined by gRPC.
    */
  var service: js.UndefOr[Input[String]] = js.undefined
}
object GRPCAction {
  
  inline def apply(port: Input[Double]): GRPCAction = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRPCAction]
  }
  
  extension [Self <: GRPCAction](x: Self) {
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setService(value: Input[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
