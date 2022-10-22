package typingsJapgolly.p5.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  /**
    *   Sets the camera's position and orientation.
    *   Accepts the same parameters as the global
    *   camera(). More information on this function can be
    *   found there.
    */
  def camera(): Unit
  
  /**
    *   x coordinate representing center of the sketch
    */
  var centerX: Double
  
  /**
    *   y coordinate representing center of the sketch
    */
  var centerY: Double
  
  /**
    *   z coordinate representing center of the sketch
    */
  var centerZ: Double
  
  /**
    *   camera position value on x axis
    */
  var eyeX: Double
  
  /**
    *   camera position value on y axis
    */
  var eyeY: Double
  
  /**
    *   camera position value on z axis
    */
  var eyeZ: Double
  
  /**
    *   Sets the camera's frustum. Accepts the same
    *   parameters as the global frustum(). More
    *   information on this function can be found there.
    */
  def frustum(): Unit
  
  /**
    *   Reorients the camera to look at a position in
    *   world space.
    *   @param x x position of a point in world space
    *   @param y y position of a point in world space
    *   @param z z position of a point in world space
    */
  def lookAt(x: Double, y: Double, z: Double): Unit
  
  /**
    *   Move camera along its local axes while maintaining
    *   current camera orientation.
    *   @param x amount to move along camera's left-right
    *   axis
    *   @param y amount to move along camera's up-down
    *   axis
    *   @param z amount to move along camera's
    *   forward-backward axis
    */
  def move(x: Double, y: Double, z: Double): Unit
  
  /**
    *   Sets an orthographic projection. Accepts the same
    *   parameters as the global ortho(). More information
    *   on this function can be found there.
    */
  def ortho(): Unit
  
  /**
    *   Panning rotates the camera view to the left and
    *   right.
    *   @param angle amount to rotate camera in current
    *   angleMode units. Greater than 0 values rotate
    *   counterclockwise (to the left).
    */
  def pan(angle: Double): Unit
  
  /**
    *   Sets a perspective projection. Accepts the same
    *   parameters as the global perspective(). More
    *   information on this function can be found there.
    */
  def perspective(): Unit
  
  /**
    *   Set camera position in world-space while
    *   maintaining current camera orientation.
    *   @param x x position of a point in world space
    *   @param y y position of a point in world space
    *   @param z z position of a point in world space
    */
  def setPosition(x: Double, y: Double, z: Double): Unit
  
  /**
    *   Tilting rotates the camera view up and down.
    *   @param angle amount to rotate camera in current
    *   angleMode units. Greater than 0 values rotate
    *   counterclockwise (to the left).
    */
  def tilt(angle: Double): Unit
  
  /**
    *   x component of direction 'up' from camera
    */
  var upX: Double
  
  /**
    *   y component of direction 'up' from camera
    */
  var upY: Double
  
  /**
    *   z component of direction 'up' from camera
    */
  var upZ: Double
}
object Camera {
  
  inline def apply(
    camera: Callback,
    centerX: Double,
    centerY: Double,
    centerZ: Double,
    eyeX: Double,
    eyeY: Double,
    eyeZ: Double,
    frustum: Callback,
    lookAt: (Double, Double, Double) => Callback,
    move: (Double, Double, Double) => Callback,
    ortho: Callback,
    pan: Double => Callback,
    perspective: Callback,
    setPosition: (Double, Double, Double) => Callback,
    tilt: Double => Callback,
    upX: Double,
    upY: Double,
    upZ: Double
  ): Camera = {
    val __obj = js.Dynamic.literal(camera = camera.toJsFn, centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], centerZ = centerZ.asInstanceOf[js.Any], eyeX = eyeX.asInstanceOf[js.Any], eyeY = eyeY.asInstanceOf[js.Any], eyeZ = eyeZ.asInstanceOf[js.Any], frustum = frustum.toJsFn, lookAt = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (lookAt(t0, t1, t2)).runNow()), move = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (move(t0, t1, t2)).runNow()), ortho = ortho.toJsFn, pan = js.Any.fromFunction1((t0: Double) => pan(t0).runNow()), perspective = perspective.toJsFn, setPosition = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setPosition(t0, t1, t2)).runNow()), tilt = js.Any.fromFunction1((t0: Double) => tilt(t0).runNow()), upX = upX.asInstanceOf[js.Any], upY = upY.asInstanceOf[js.Any], upZ = upZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  extension [Self <: Camera](x: Self) {
    
    inline def setCamera(value: Callback): Self = StObject.set(x, "camera", value.toJsFn)
    
    inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setCenterZ(value: Double): Self = StObject.set(x, "centerZ", value.asInstanceOf[js.Any])
    
    inline def setEyeX(value: Double): Self = StObject.set(x, "eyeX", value.asInstanceOf[js.Any])
    
    inline def setEyeY(value: Double): Self = StObject.set(x, "eyeY", value.asInstanceOf[js.Any])
    
    inline def setEyeZ(value: Double): Self = StObject.set(x, "eyeZ", value.asInstanceOf[js.Any])
    
    inline def setFrustum(value: Callback): Self = StObject.set(x, "frustum", value.toJsFn)
    
    inline def setLookAt(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "lookAt", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setMove(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "move", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOrtho(value: Callback): Self = StObject.set(x, "ortho", value.toJsFn)
    
    inline def setPan(value: Double => Callback): Self = StObject.set(x, "pan", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPerspective(value: Callback): Self = StObject.set(x, "perspective", value.toJsFn)
    
    inline def setSetPosition(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setTilt(value: Double => Callback): Self = StObject.set(x, "tilt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpX(value: Double): Self = StObject.set(x, "upX", value.asInstanceOf[js.Any])
    
    inline def setUpY(value: Double): Self = StObject.set(x, "upY", value.asInstanceOf[js.Any])
    
    inline def setUpZ(value: Double): Self = StObject.set(x, "upZ", value.asInstanceOf[js.Any])
  }
}
