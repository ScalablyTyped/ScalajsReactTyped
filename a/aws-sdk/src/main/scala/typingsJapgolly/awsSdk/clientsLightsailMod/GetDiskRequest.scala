package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDiskRequest extends StObject {
  
  /**
    * The name of the disk (e.g., my-disk).
    */
  var diskName: ResourceName
}
object GetDiskRequest {
  
  inline def apply(diskName: ResourceName): GetDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiskRequest]
  }
  
  extension [Self <: GetDiskRequest](x: Self) {
    
    inline def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
  }
}
