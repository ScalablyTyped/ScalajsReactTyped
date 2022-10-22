package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.anon.TargetCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides convenience methods to map pixel coordinates in camera image space to depth image space. */
trait PerceptionDepthCorrelatedCoordinateMapper extends StObject {
  
  /**
    * Maps all pixels in an image from camera image space to depth image space.
    * @param depthFrame The depth frame to map the pixels to.
    */
  def mapAllPixelsToTargetAsync(depthFrame: PerceptionDepthFrame): TargetCoordinates
  
  /**
    * Maps a pixel from camera image space to depth image space.
    * @param sourcePixelCoordinate A pixel coordinate, in camera image space.
    * @param depthFrame The depth frame to map the pixel to.
    * @return Returns the mapping of the pixel coordinate to depth image space.
    */
  def mapPixelToTarget(sourcePixelCoordinate: Point, depthFrame: PerceptionDepthFrame): Point
  
  /**
    * Maps a set of pixels from camera image space to depth image space.
    * @param sourceCoordinates A set of pixel coordinates, in camera image space.
    * @param depthFrame The depth frame to map the pixels to.
    * @return The mapping of the pixel coordinate to depth image space.
    */
  def mapPixelsToTarget(sourceCoordinates: Point, depthFrame: PerceptionDepthFrame): Point
  
  /**
    * Maps a region of pixels from camera image space to depth image space.
    * @param region The region of pixels to map from camera image space to depth image space.
    * @param depthFrame The depth frame to map the region of pixels to.
    */
  def mapRegionOfPixelsToTargetAsync(region: Rect, depthFrame: PerceptionDepthFrame): TargetCoordinates
}
object PerceptionDepthCorrelatedCoordinateMapper {
  
  inline def apply(
    mapAllPixelsToTargetAsync: PerceptionDepthFrame => TargetCoordinates,
    mapPixelToTarget: (Point, PerceptionDepthFrame) => Point,
    mapPixelsToTarget: (Point, PerceptionDepthFrame) => Point,
    mapRegionOfPixelsToTargetAsync: (Rect, PerceptionDepthFrame) => TargetCoordinates
  ): PerceptionDepthCorrelatedCoordinateMapper = {
    val __obj = js.Dynamic.literal(mapAllPixelsToTargetAsync = js.Any.fromFunction1(mapAllPixelsToTargetAsync), mapPixelToTarget = js.Any.fromFunction2(mapPixelToTarget), mapPixelsToTarget = js.Any.fromFunction2(mapPixelsToTarget), mapRegionOfPixelsToTargetAsync = js.Any.fromFunction2(mapRegionOfPixelsToTargetAsync))
    __obj.asInstanceOf[PerceptionDepthCorrelatedCoordinateMapper]
  }
  
  extension [Self <: PerceptionDepthCorrelatedCoordinateMapper](x: Self) {
    
    inline def setMapAllPixelsToTargetAsync(value: PerceptionDepthFrame => TargetCoordinates): Self = StObject.set(x, "mapAllPixelsToTargetAsync", js.Any.fromFunction1(value))
    
    inline def setMapPixelToTarget(value: (Point, PerceptionDepthFrame) => Point): Self = StObject.set(x, "mapPixelToTarget", js.Any.fromFunction2(value))
    
    inline def setMapPixelsToTarget(value: (Point, PerceptionDepthFrame) => Point): Self = StObject.set(x, "mapPixelsToTarget", js.Any.fromFunction2(value))
    
    inline def setMapRegionOfPixelsToTargetAsync(value: (Rect, PerceptionDepthFrame) => TargetCoordinates): Self = StObject.set(x, "mapRegionOfPixelsToTargetAsync", js.Any.fromFunction2(value))
  }
}
