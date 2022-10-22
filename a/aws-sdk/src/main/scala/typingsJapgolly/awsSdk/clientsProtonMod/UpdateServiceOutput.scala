package typingsJapgolly.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceOutput extends StObject {
  
  /**
    * The service detail data that's returned by Proton.
    */
  var service: Service
}
object UpdateServiceOutput {
  
  inline def apply(service: Service): UpdateServiceOutput = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceOutput]
  }
  
  extension [Self <: UpdateServiceOutput](x: Self) {
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
