package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAggregatedAssociationOverview extends StObject {
  
  /**
    * Detailed status information about the aggregated associations.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  
  /**
    * The number of associations for the managed node(s).
    */
  var InstanceAssociationStatusAggregatedCount: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.InstanceAssociationStatusAggregatedCount] = js.undefined
}
object InstanceAggregatedAssociationOverview {
  
  inline def apply(): InstanceAggregatedAssociationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAggregatedAssociationOverview]
  }
  
  extension [Self <: InstanceAggregatedAssociationOverview](x: Self) {
    
    inline def setDetailedStatus(value: StatusName): Self = StObject.set(x, "DetailedStatus", value.asInstanceOf[js.Any])
    
    inline def setDetailedStatusUndefined: Self = StObject.set(x, "DetailedStatus", js.undefined)
    
    inline def setInstanceAssociationStatusAggregatedCount(value: InstanceAssociationStatusAggregatedCount): Self = StObject.set(x, "InstanceAssociationStatusAggregatedCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceAssociationStatusAggregatedCountUndefined: Self = StObject.set(x, "InstanceAssociationStatusAggregatedCount", js.undefined)
  }
}
