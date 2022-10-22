package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geomGeometryMod.default
import typingsJapgolly.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sphereMod {
  
  @JSImport("ol/sphere", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/sphere", "DEFAULT_RADIUS")
  @js.native
  val DEFAULT_RADIUS: Double = js.native
  
  inline def getArea(geometry: default): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getArea")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getArea(geometry: default, opt_options: SphereMetricOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getArea")(geometry.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDistance(c1: js.Array[Any], c2: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDistance(c1: js.Array[Any], c2: js.Array[Any], opt_radius: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any], opt_radius.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLength(geometry: default): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getLength(geometry: default, opt_options: SphereMetricOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(geometry.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def offset(c1: Coordinate, distance: Double, bearing: Double): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(c1.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  inline def offset(c1: Coordinate, distance: Double, bearing: Double, opt_radius: Double): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(c1.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], bearing.asInstanceOf[js.Any], opt_radius.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  trait SphereMetricOptions extends StObject {
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object SphereMetricOptions {
    
    inline def apply(): SphereMetricOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SphereMetricOptions]
    }
    
    extension [Self <: SphereMetricOptions](x: Self) {
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
