package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClusterPlacementType extends StObject
@JSGlobal("Microsoft.Maps.ClusterPlacementType")
@js.native
object ClusterPlacementType extends StObject {
  
  /**
    * This method is the simplest way to represent a cluster. It places the cluster at the first location in the cluster. This method may not accurately
    * represent the data but requires little processing power.
    */
  @js.native
  sealed trait FirstLocation
    extends StObject
       with ClusterPlacementType
  
  /**
    * Mean Average placement calculates the average position of a group of coordinates. This method creates a more realistic representation of the data,
    * however requires more processing power and increases the chances of pushpins overlapping.
    */
  @js.native
  sealed trait MeanAverage
    extends StObject
       with ClusterPlacementType
}
