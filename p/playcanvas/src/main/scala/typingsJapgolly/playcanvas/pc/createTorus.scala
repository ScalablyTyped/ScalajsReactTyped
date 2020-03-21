package typingsJapgolly.playcanvas.pc

import typingsJapgolly.playcanvas.AnonRingRadius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.createTorus")
@js.native
object createTorus extends js.Object {
  /**
    * @function
    * @name pc.createTorus
    * @description Creates a procedural torus-shaped mesh.
    *
    * The size, shape and tesselation properties of the torus can be controlled via function parameters.
    * By default, the function will create a torus in the XZ-plane with a tube radius of 0.2, a ring radius
    * of 0.3, 20 segments and 30 sides.
    *
    * Note that the torus is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the torus's mesh.
    * @param {pc.GraphicsDevice} device - The graphics device used to manage the mesh.
    * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
    * @param {number} [opts.tubeRadius] - The radius of the tube forming the body of the torus (defaults to 0.2).
    * @param {number} [opts.ringRadius] - The radius from the centre of the torus to the centre of the tube (defaults to 0.3).
    * @param {number} [opts.segments] - The number of radial divisions forming cross-sections of the torus ring (defaults to 20).
    * @param {number} [opts.sides] - The number of divisions around the tubular body of the torus ring (defaults to 30).
    * @returns {pc.Mesh} A new torus-shaped mesh.
    */
  def apply(device: GraphicsDevice): Mesh = js.native
  def apply(device: GraphicsDevice, opts: AnonRingRadius): Mesh = js.native
}

