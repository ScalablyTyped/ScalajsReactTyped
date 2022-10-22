package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceActionOutput extends StObject {
  
  /**
    * An object containing information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.ServiceActionDetail] = js.undefined
}
object CreateServiceActionOutput {
  
  inline def apply(): CreateServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceActionOutput]
  }
  
  extension [Self <: CreateServiceActionOutput](x: Self) {
    
    inline def setServiceActionDetail(value: ServiceActionDetail): Self = StObject.set(x, "ServiceActionDetail", value.asInstanceOf[js.Any])
    
    inline def setServiceActionDetailUndefined: Self = StObject.set(x, "ServiceActionDetail", js.undefined)
  }
}
