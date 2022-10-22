package typingsJapgolly.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicePoolsResult extends StObject {
  
  /**
    * Information about the device pools.
    */
  var devicePools: js.UndefOr[DevicePools] = js.undefined
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDevicePoolsResult {
  
  inline def apply(): ListDevicePoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicePoolsResult]
  }
  
  extension [Self <: ListDevicePoolsResult](x: Self) {
    
    inline def setDevicePools(value: DevicePools): Self = StObject.set(x, "devicePools", value.asInstanceOf[js.Any])
    
    inline def setDevicePoolsUndefined: Self = StObject.set(x, "devicePools", js.undefined)
    
    inline def setDevicePoolsVarargs(value: DevicePool*): Self = StObject.set(x, "devicePools", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
