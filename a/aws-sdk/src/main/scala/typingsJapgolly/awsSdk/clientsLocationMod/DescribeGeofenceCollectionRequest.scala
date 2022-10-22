package typingsJapgolly.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGeofenceCollectionRequest extends StObject {
  
  /**
    * The name of the geofence collection.
    */
  var CollectionName: ResourceName
}
object DescribeGeofenceCollectionRequest {
  
  inline def apply(CollectionName: ResourceName): DescribeGeofenceCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGeofenceCollectionRequest]
  }
  
  extension [Self <: DescribeGeofenceCollectionRequest](x: Self) {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
  }
}
