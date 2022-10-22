package typingsJapgolly.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldCount extends StObject {
  
  /**
    * The number of unique floorplans.
    */
  var floorplanCount: js.UndefOr[FloorplanCount] = js.undefined
  
  /**
    * The number of unique interiors per floorplan.
    */
  var interiorCountPerFloorplan: js.UndefOr[InteriorCountPerFloorplan] = js.undefined
}
object WorldCount {
  
  inline def apply(): WorldCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldCount]
  }
  
  extension [Self <: WorldCount](x: Self) {
    
    inline def setFloorplanCount(value: FloorplanCount): Self = StObject.set(x, "floorplanCount", value.asInstanceOf[js.Any])
    
    inline def setFloorplanCountUndefined: Self = StObject.set(x, "floorplanCount", js.undefined)
    
    inline def setInteriorCountPerFloorplan(value: InteriorCountPerFloorplan): Self = StObject.set(x, "interiorCountPerFloorplan", value.asInstanceOf[js.Any])
    
    inline def setInteriorCountPerFloorplanUndefined: Self = StObject.set(x, "interiorCountPerFloorplan", js.undefined)
  }
}
