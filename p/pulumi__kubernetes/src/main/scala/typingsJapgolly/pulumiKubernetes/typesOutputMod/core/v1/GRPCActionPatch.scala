package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GRPCActionPatch extends StObject {
  
  /**
    * Port number of the gRPC service. Number must be in the range 1 to 65535.
    */
  var port: Double
  
  /**
    * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
    *
    * If this is not specified, the default behavior is defined by gRPC.
    */
  var service: String
}
object GRPCActionPatch {
  
  inline def apply(port: Double, service: String): GRPCActionPatch = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRPCActionPatch]
  }
  
  extension [Self <: GRPCActionPatch](x: Self) {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
