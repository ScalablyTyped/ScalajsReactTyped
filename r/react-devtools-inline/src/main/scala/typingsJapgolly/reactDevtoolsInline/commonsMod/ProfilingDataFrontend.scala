package typingsJapgolly.reactDevtoolsInline.commonsMod

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilingDataFrontend extends StObject {
  
  var dataForRoots: Map[Double, ProfilingDataForRootFrontend]
  
  var imported: Boolean
  
  var timelineData: js.Array[TimelineData]
}
object ProfilingDataFrontend {
  
  inline def apply(
    dataForRoots: Map[Double, ProfilingDataForRootFrontend],
    imported: Boolean,
    timelineData: js.Array[TimelineData]
  ): ProfilingDataFrontend = {
    val __obj = js.Dynamic.literal(dataForRoots = dataForRoots.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], timelineData = timelineData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingDataFrontend]
  }
  
  extension [Self <: ProfilingDataFrontend](x: Self) {
    
    inline def setDataForRoots(value: Map[Double, ProfilingDataForRootFrontend]): Self = StObject.set(x, "dataForRoots", value.asInstanceOf[js.Any])
    
    inline def setImported(value: Boolean): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setTimelineData(value: js.Array[TimelineData]): Self = StObject.set(x, "timelineData", value.asInstanceOf[js.Any])
    
    inline def setTimelineDataVarargs(value: TimelineData*): Self = StObject.set(x, "timelineData", js.Array(value*))
  }
}
