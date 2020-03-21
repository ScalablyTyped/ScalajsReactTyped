package typingsJapgolly.winrtUwp.Windows.Foundation.Numerics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a 3*2 floating point matrix. */
trait Matrix3x2 extends js.Object {
  /** The row one and column one element of the matrix. */
  var m11: Double
  /** The row one and column two element of the matrix. */
  var m12: Double
  /** The row two and column one element of the matrix. */
  var m21: Double
  /** The row two and column two element of the matrix. */
  var m22: Double
  /** The row three and column one element of the matrix. */
  var m31: Double
  /** The row three and column two element of the matrix. */
  var m32: Double
}

object Matrix3x2 {
  @scala.inline
  def apply(m11: Double, m12: Double, m21: Double, m22: Double, m31: Double, m32: Double): Matrix3x2 = {
    val __obj = js.Dynamic.literal(m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Matrix3x2]
  }
}

