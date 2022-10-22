package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCacheInput extends StObject {
  
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string has a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: typingsJapgolly.awsSdk.clientsStoragegatewayMod.DiskIds
  
  var GatewayARN: typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN
}
object AddCacheInput {
  
  inline def apply(DiskIds: DiskIds, GatewayARN: GatewayARN): AddCacheInput = {
    val __obj = js.Dynamic.literal(DiskIds = DiskIds.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCacheInput]
  }
  
  extension [Self <: AddCacheInput](x: Self) {
    
    inline def setDiskIds(value: DiskIds): Self = StObject.set(x, "DiskIds", value.asInstanceOf[js.Any])
    
    inline def setDiskIdsVarargs(value: DiskId*): Self = StObject.set(x, "DiskIds", js.Array(value*))
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
