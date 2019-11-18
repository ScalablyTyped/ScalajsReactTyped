package typingsJapgolly.p5.p5Mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  /**
    *   Averages the vertex normals. Used in curved
    *   surfaces
    *   @chainable
    */
  def averageNormals(): Geometry
  /**
    *   Averages pole normals. Used in spherical
    *   primitives
    *   @chainable
    */
  def averagePoleNormals(): Geometry
  def computeFaces(): Geometry
  /**
    *   computes smooth normals per vertex as an average
    *   of each face.
    *   @chainable
    */
  def computeNormals(): Geometry
  /**
    *   Modifies all vertices to be centered within the
    *   range -100 to 100.
    *   @chainable
    */
  def normalize(): Geometry
}

object Geometry {
  @scala.inline
  def apply(
    averageNormals: CallbackTo[Geometry],
    averagePoleNormals: CallbackTo[Geometry],
    computeFaces: CallbackTo[Geometry],
    computeNormals: CallbackTo[Geometry],
    normalize: CallbackTo[Geometry]
  ): Geometry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("averageNormals")(averageNormals.toJsFn)
    __obj.updateDynamic("averagePoleNormals")(averagePoleNormals.toJsFn)
    __obj.updateDynamic("computeFaces")(computeFaces.toJsFn)
    __obj.updateDynamic("computeNormals")(computeNormals.toJsFn)
    __obj.updateDynamic("normalize")(normalize.toJsFn)
    __obj.asInstanceOf[Geometry]
  }
}

