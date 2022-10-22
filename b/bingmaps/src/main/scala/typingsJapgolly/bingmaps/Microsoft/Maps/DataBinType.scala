package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataBinType extends StObject
@JSGlobal("Microsoft.Maps.DataBinType")
@js.native
object DataBinType extends StObject {
  
  /* Renders data bins as circles in a square grid. */
  @js.native
  sealed trait circle
    extends StObject
       with DataBinType
  
  /* Renders data bins as circles in a hexagonal grid. */
  @js.native
  sealed trait hexCircle
    extends StObject
       with DataBinType
  
  /* Renders data bins as hexagons with a flat top edge. */
  @js.native
  sealed trait hexagon
    extends StObject
       with DataBinType
  
  /* Renders data bins as hexagons with a pointy top corner. */
  @js.native
  sealed trait pointyHexagon
    extends StObject
       with DataBinType
  
  /* Renders data bins as a square grid. */
  @js.native
  sealed trait square
    extends StObject
       with DataBinType
}
