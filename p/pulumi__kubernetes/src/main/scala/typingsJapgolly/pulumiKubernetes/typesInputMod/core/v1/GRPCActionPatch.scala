package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GRPCActionPatch extends StObject {
  
  /**
    * Port number of the gRPC service. Number must be in the range 1 to 65535.
    */
  var port: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
    *
    * If this is not specified, the default behavior is defined by gRPC.
    */
  var service: js.UndefOr[Input[String]] = js.undefined
}
object GRPCActionPatch {
  
  inline def apply(): GRPCActionPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GRPCActionPatch]
  }
  
  extension [Self <: GRPCActionPatch](x: Self) {
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setService(value: Input[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
