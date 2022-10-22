package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseHostsResult extends StObject {
  
  /**
    * The IDs of the Dedicated Hosts that were successfully released.
    */
  var Successful: js.UndefOr[ResponseHostIdList] = js.undefined
  
  /**
    * The IDs of the Dedicated Hosts that could not be released, including an error message.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.undefined
}
object ReleaseHostsResult {
  
  inline def apply(): ReleaseHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseHostsResult]
  }
  
  extension [Self <: ReleaseHostsResult](x: Self) {
    
    inline def setSuccessful(value: ResponseHostIdList): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: String*): Self = StObject.set(x, "Successful", js.Array(value*))
    
    inline def setUnsuccessful(value: UnsuccessfulItemList): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    inline def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value*))
  }
}
