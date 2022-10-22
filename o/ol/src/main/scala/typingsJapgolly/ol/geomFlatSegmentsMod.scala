package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatSegmentsMod {
  
  @JSImport("ol/geom/flat/segments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forEach[T](
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    callback: js.Function2[/* p0 */ Coordinate, /* p1 */ Coordinate, T]
  ): T | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T | Boolean]
}
