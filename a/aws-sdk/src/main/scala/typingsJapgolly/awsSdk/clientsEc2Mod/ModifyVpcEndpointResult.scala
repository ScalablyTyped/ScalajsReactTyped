package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcEndpointResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object ModifyVpcEndpointResult {
  
  inline def apply(): ModifyVpcEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcEndpointResult]
  }
  
  extension [Self <: ModifyVpcEndpointResult](x: Self) {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
