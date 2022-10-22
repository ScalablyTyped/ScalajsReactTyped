package typingsJapgolly.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RouteMode extends StObject
@JSGlobal("Microsoft.Maps.Directions.RouteMode")
@js.native
object RouteMode extends StObject {
  
  /** Driving directions are calculated. */
  @js.native
  sealed trait driving
    extends StObject
       with RouteMode
  
  /** Transit directions are calculated. */
  @js.native
  sealed trait transit
    extends StObject
       with RouteMode
  
  /** Driving directions using truck attributes are calculationed. */
  @js.native
  sealed trait truck
    extends StObject
       with RouteMode
  
  /** Walking directions are calculated. */
  @js.native
  sealed trait walking
    extends StObject
       with RouteMode
}
