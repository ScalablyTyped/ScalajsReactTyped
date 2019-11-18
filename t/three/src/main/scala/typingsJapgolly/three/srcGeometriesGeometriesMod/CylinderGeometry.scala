package typingsJapgolly.three.srcGeometriesGeometriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/Geometries", "CylinderGeometry")
@js.native
class CylinderGeometry protected ()
  extends typingsJapgolly.three.srcGeometriesCylinderGeometryMod.CylinderGeometry {
  /**
  	 * @param radiusTop — Radius of the cylinder at the top.
  	 * @param radiusBottom — Radius of the cylinder at the bottom.
  	 * @param height — Height of the cylinder.
  	 * @param radiusSegments — Number of segmented faces around the circumference of the cylinder.
  	 * @param heightSegments — Number of rows of faces along the height of the cylinder.
  	 * @param openEnded - A Boolean indicating whether or not to cap the ends of the cylinder.
  	 */
  def this(
    radiusTop: js.UndefOr[Double],
    radiusBottom: js.UndefOr[Double],
    height: js.UndefOr[Double],
    radiusSegments: js.UndefOr[Double],
    heightSegments: js.UndefOr[Double],
    openEnded: js.UndefOr[Boolean],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
}

