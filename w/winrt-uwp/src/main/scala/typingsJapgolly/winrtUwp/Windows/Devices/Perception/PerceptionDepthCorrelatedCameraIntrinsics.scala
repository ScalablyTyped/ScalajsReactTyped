package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import typingsJapgolly.winrtUwp.Windows.Foundation.Numerics.Vector3
import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.anon.Results
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides convenience methods to facilitate geometric math for a camera device, combining the intrinsic properties of that camera with correlated depth frames to provide screen-space pixel to camera-space coordinate projections. */
trait PerceptionDepthCorrelatedCameraIntrinsics extends StObject {
  
  /**
    * Unprojects all pixels in an image from camera image space out into the coordinate frame of the camera device, using the corresponding depth values from a correlated depth camera.
    * @param depthFrame The depth frame containing the depth value to use when projecting the points into camera space. The coordinates of each pixel in the image will be mapped from camera image space to depth image space, and then used to look up the depth in this depth frame.
    */
  def unprojectAllPixelsAtCorrelatedDepthAsync(depthFrame: PerceptionDepthFrame): Results
  
  /**
    * Unprojects a point in camera image space out into the coordinate frame of the camera device, using the corresponding depth from a correlated depth camera.
    * @param pixelCoordinate A point, relative to the camera frame.
    * @param depthFrame The depth frame containing the depth value to use when projecting the point into camera space. The pixelCoordinate will be mapped from camera image space to depth image space, and then used to look up the depth in depthFrame.
    * @return An unprojected coordinate, relative to the coordinate system of the camera device. The coordinate is located in front of the camera, at the depth of the corresponding pixel in depthFrame.
    */
  def unprojectPixelAtCorrelatedDepth(pixelCoordinate: Point, depthFrame: PerceptionDepthFrame): Vector3
  
  /**
    * Unprojects a set of points in camera image space out into the coordinate frame of the camera device, using the corresponding depth values from a correlated depth camera.
    * @param sourceCoordinates A set of points, relative to the camera frame.
    * @param depthFrame The depth frame containing the depth value to use when projecting the points into camera space. The pixelCoordinate will be mapped from camera image space to depth image space, and then used to look up the depth in depthFrame.
    * @return A set of coordinates, relative to the coordinate system of the camera device and with correlated depth values.
    */
  def unprojectPixelsAtCorrelatedDepth(sourceCoordinates: Point, depthFrame: PerceptionDepthFrame): Vector3
  
  /**
    * Unprojects a region of pixels in an image from camera image space out into the coordinate frame of the camera device, using the corresponding depth values from a correlated depth camera.
    * @param region The region of pixels to project from camera image space out into the coordinate frame of the camera device.
    * @param depthFrame The depth frame containing the depth value to use when projecting the points into camera space. The pixelCoordinates will be mapped from camera image space to depth image space, and then used to look up the depth in depthFrame.
    */
  def unprojectRegionPixelsAtCorrelatedDepthAsync(region: Rect, depthFrame: PerceptionDepthFrame): Results
}
object PerceptionDepthCorrelatedCameraIntrinsics {
  
  inline def apply(
    unprojectAllPixelsAtCorrelatedDepthAsync: PerceptionDepthFrame => Results,
    unprojectPixelAtCorrelatedDepth: (Point, PerceptionDepthFrame) => Vector3,
    unprojectPixelsAtCorrelatedDepth: (Point, PerceptionDepthFrame) => Vector3,
    unprojectRegionPixelsAtCorrelatedDepthAsync: (Rect, PerceptionDepthFrame) => Results
  ): PerceptionDepthCorrelatedCameraIntrinsics = {
    val __obj = js.Dynamic.literal(unprojectAllPixelsAtCorrelatedDepthAsync = js.Any.fromFunction1(unprojectAllPixelsAtCorrelatedDepthAsync), unprojectPixelAtCorrelatedDepth = js.Any.fromFunction2(unprojectPixelAtCorrelatedDepth), unprojectPixelsAtCorrelatedDepth = js.Any.fromFunction2(unprojectPixelsAtCorrelatedDepth), unprojectRegionPixelsAtCorrelatedDepthAsync = js.Any.fromFunction2(unprojectRegionPixelsAtCorrelatedDepthAsync))
    __obj.asInstanceOf[PerceptionDepthCorrelatedCameraIntrinsics]
  }
  
  extension [Self <: PerceptionDepthCorrelatedCameraIntrinsics](x: Self) {
    
    inline def setUnprojectAllPixelsAtCorrelatedDepthAsync(value: PerceptionDepthFrame => Results): Self = StObject.set(x, "unprojectAllPixelsAtCorrelatedDepthAsync", js.Any.fromFunction1(value))
    
    inline def setUnprojectPixelAtCorrelatedDepth(value: (Point, PerceptionDepthFrame) => Vector3): Self = StObject.set(x, "unprojectPixelAtCorrelatedDepth", js.Any.fromFunction2(value))
    
    inline def setUnprojectPixelsAtCorrelatedDepth(value: (Point, PerceptionDepthFrame) => Vector3): Self = StObject.set(x, "unprojectPixelsAtCorrelatedDepth", js.Any.fromFunction2(value))
    
    inline def setUnprojectRegionPixelsAtCorrelatedDepthAsync(value: (Rect, PerceptionDepthFrame) => Results): Self = StObject.set(x, "unprojectRegionPixelsAtCorrelatedDepthAsync", js.Any.fromFunction2(value))
  }
}
