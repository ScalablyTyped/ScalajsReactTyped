package typingsJapgolly.p5.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  /**
    *   Sets a camera's position and orientation. This is
    *   equivalent to calling camera() on a p5.Camera
    *   object.
    */
  def camera(): Unit
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
    *   Sets an orthographic projection for a p5.Camera
    *   object and sets parameters for that projection
    *   according to ortho() syntax.
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
    *   Sets a perspective projection for a p5.Camera
    *   object and sets parameters for that projection
    *   according to perspective() syntax.
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
}

object Camera {
  @scala.inline
  def apply(
    camera: Callback,
    lookAt: (Double, Double, Double) => Callback,
    move: (Double, Double, Double) => Callback,
    ortho: Callback,
    pan: Double => Callback,
    perspective: Callback,
    setPosition: (Double, Double, Double) => Callback,
    tilt: Double => Callback
  ): Camera = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("camera")(camera.toJsFn)
    __obj.updateDynamic("lookAt")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => lookAt(t0, t1, t2).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => move(t0, t1, t2).runNow()))
    __obj.updateDynamic("ortho")(ortho.toJsFn)
    __obj.updateDynamic("pan")(js.Any.fromFunction1((t0: scala.Double) => pan(t0).runNow()))
    __obj.updateDynamic("perspective")(perspective.toJsFn)
    __obj.updateDynamic("setPosition")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => setPosition(t0, t1, t2).runNow()))
    __obj.updateDynamic("tilt")(js.Any.fromFunction1((t0: scala.Double) => tilt(t0).runNow()))
    __obj.asInstanceOf[Camera]
  }
}

