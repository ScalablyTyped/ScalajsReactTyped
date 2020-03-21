package typingsJapgolly.threeTdsLoader

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.three.mod.Quaternion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofQuaternion extends Instantiable0[Quaternion] {
  /**
  	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
  	 */
  def slerp(
    qa: typingsJapgolly.three.quaternionMod.Quaternion,
    qb: typingsJapgolly.three.quaternionMod.Quaternion,
    qm: typingsJapgolly.three.quaternionMod.Quaternion,
    t: Double
  ): typingsJapgolly.three.quaternionMod.Quaternion = js.native
  def slerpFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double,
    t: Double
  ): typingsJapgolly.three.quaternionMod.Quaternion = js.native
}

