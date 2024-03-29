package typingsJapgolly.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RouteAvoidance extends StObject
@JSGlobal("Microsoft.Maps.Directions.RouteAvoidance")
@js.native
object RouteAvoidance extends StObject {
  
  /** Avoid using airlines when calculating the route. This option only affects routes with a transitRouteMode that have the culture set to ja-jp. */
  @js.native
  sealed trait avoidAirline
    extends StObject
       with RouteAvoidance
  
  /** Avoid using bullet trains when calculating the route. This option only affects routes with a transitRouteMode that have the culture set to ja-jp. */
  @js.native
  sealed trait avoidBulletTrain
    extends StObject
       with RouteAvoidance
  
  /** Avoid using express trains when calculating the route. This option only affects routes with a transitRouteMode that have the culture set to ja-jp. */
  @js.native
  sealed trait avoidExpressTrain
    extends StObject
       with RouteAvoidance
  
  /** Avoid using limited access highways when calculating the route. */
  @js.native
  sealed trait avoidHighways
    extends StObject
       with RouteAvoidance
  
  /** Avoid using roads with tolls when calculating the route. */
  @js.native
  sealed trait avoidToll
    extends StObject
       with RouteAvoidance
  
  /** Reduce the use of limited access highways when calculating the route. */
  @js.native
  sealed trait minimizeHighways
    extends StObject
       with RouteAvoidance
  
  /** Reduce the use of roads with tolls when calculating the route. */
  @js.native
  sealed trait minimizeToll
    extends StObject
       with RouteAvoidance
  
  /** Calculate the best route using any travel option available. */
  @js.native
  sealed trait none
    extends StObject
       with RouteAvoidance
}
