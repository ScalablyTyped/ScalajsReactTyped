package typingsJapgolly.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceGroupsInput extends StObject {
  
  /**
    * The identifier of the cluster for which to list the instance groups.
    */
  var ClusterId: typingsJapgolly.awsSdk.clientsEmrMod.ClusterId
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrMod.Marker] = js.undefined
}
object ListInstanceGroupsInput {
  
  inline def apply(ClusterId: ClusterId): ListInstanceGroupsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceGroupsInput]
  }
  
  extension [Self <: ListInstanceGroupsInput](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
