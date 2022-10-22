package typingsJapgolly.bingmaps.Microsoft.Maps.Directions

import typingsJapgolly.bingmaps.Microsoft.Maps.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRouteSubLeg extends StObject {
  
  /** The location of the last waypoint of the sub leg. */
  var actualEnd: Location
  
  /** The location of the first waypoint of the sub leg. */
  var actualStart: Location
  
  /** The description of the last waypoint of the sub leg. */
  var endDescription: String
  
  /** The description of the first waypoint of the sub leg. */
  var startDescription: String
}
object IRouteSubLeg {
  
  inline def apply(actualEnd: Location, actualStart: Location, endDescription: String, startDescription: String): IRouteSubLeg = {
    val __obj = js.Dynamic.literal(actualEnd = actualEnd.asInstanceOf[js.Any], actualStart = actualStart.asInstanceOf[js.Any], endDescription = endDescription.asInstanceOf[js.Any], startDescription = startDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteSubLeg]
  }
  
  extension [Self <: IRouteSubLeg](x: Self) {
    
    inline def setActualEnd(value: Location): Self = StObject.set(x, "actualEnd", value.asInstanceOf[js.Any])
    
    inline def setActualStart(value: Location): Self = StObject.set(x, "actualStart", value.asInstanceOf[js.Any])
    
    inline def setEndDescription(value: String): Self = StObject.set(x, "endDescription", value.asInstanceOf[js.Any])
    
    inline def setStartDescription(value: String): Self = StObject.set(x, "startDescription", value.asInstanceOf[js.Any])
  }
}
