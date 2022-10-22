package typingsJapgolly.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBootstrapActionsInput extends StObject {
  
  /**
    * The cluster identifier for the bootstrap actions to list.
    */
  var ClusterId: typingsJapgolly.awsSdk.clientsEmrMod.ClusterId
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrMod.Marker] = js.undefined
}
object ListBootstrapActionsInput {
  
  inline def apply(ClusterId: ClusterId): ListBootstrapActionsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBootstrapActionsInput]
  }
  
  extension [Self <: ListBootstrapActionsInput](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
