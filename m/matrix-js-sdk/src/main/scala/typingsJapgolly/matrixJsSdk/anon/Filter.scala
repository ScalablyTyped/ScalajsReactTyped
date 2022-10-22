package typingsJapgolly.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var filter: js.UndefOr[typingsJapgolly.matrixJsSdk.mod.Filter] = js.undefined
  
  var timelineSupport: js.UndefOr[Boolean] = js.undefined
  
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setFilter(value: typingsJapgolly.matrixJsSdk.mod.Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setTimelineSupport(value: Boolean): Self = StObject.set(x, "timelineSupport", value.asInstanceOf[js.Any])
    
    inline def setTimelineSupportUndefined: Self = StObject.set(x, "timelineSupport", js.undefined)
    
    inline def setUnstableClientRelationAggregation(value: Boolean): Self = StObject.set(x, "unstableClientRelationAggregation", value.asInstanceOf[js.Any])
    
    inline def setUnstableClientRelationAggregationUndefined: Self = StObject.set(x, "unstableClientRelationAggregation", js.undefined)
  }
}
