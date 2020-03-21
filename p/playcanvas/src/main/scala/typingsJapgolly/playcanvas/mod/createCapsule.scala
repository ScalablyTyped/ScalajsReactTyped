package typingsJapgolly.playcanvas.mod

import typingsJapgolly.playcanvas.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("playcanvas", "createCapsule")
@js.native
object createCapsule extends js.Object {
  /**
    * @function
    * @name pc.createCapsule
    * @description Creates a procedural capsule-shaped mesh.
    *
    * The size, shape and tesselation properties of the capsule can be controlled via function
    * parameters. By default, the function will create a capsule standing vertically centred
    * on the XZ-plane with a radius of 0.25, a height of 1.0, 1 height segment and 10 cap
    * segments.
    *
    * Note that the capsule is created with UVs in the range of 0 to 1. Additionally, tangent information
    * is generated into the vertex buffer of the capsule's mesh.
    * @param {pc.GraphicsDevice} device - The graphics device used to manage the mesh.
    * @param {object} [opts] - An object that specifies optional inputs for the function as follows:
    * @param {number} [opts.radius] - The radius of the tube forming the body of the capsule (defaults to 0.3).
    * @param {number} [opts.height] - The length of the body of the capsule from tip to tip (defaults to 1.0).
    * @param {number} [opts.heightSegments] - The number of divisions along the tubular length of the capsule (defaults to 1).
    * @param {number} [opts.sides] - The number of divisions around the tubular body of the capsule (defaults to 20).
    * @returns {pc.Mesh} A new cylinder-shaped mesh.
    */
  def apply(device: typingsJapgolly.playcanvas.pc.GraphicsDevice): typingsJapgolly.playcanvas.pc.Mesh = js.native
  def apply(device: typingsJapgolly.playcanvas.pc.GraphicsDevice, opts: AnonHeight): typingsJapgolly.playcanvas.pc.Mesh = js.native
}

