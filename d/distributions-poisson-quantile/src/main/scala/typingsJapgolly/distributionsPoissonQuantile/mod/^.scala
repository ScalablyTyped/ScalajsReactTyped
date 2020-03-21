package typingsJapgolly.distributionsPoissonQuantile.mod

import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypefloat32
import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypefloat64
import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypeint16
import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypeint32
import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypeint8
import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypeuint16
import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypeuint32
import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypeuint8
import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypeuint8clamped
import typingsJapgolly.distributionsPoissonQuantile.Optionsdtypeundefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("distributions-poisson-quantile", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(p: js.Array[Double]): js.Array[Double] = js.native
  def apply(p: js.Array[Double], options: Optionsdtypeundefined): js.Array[Double] = js.native
  /**
    * Evaluates the quantile function for a Poisson distribution.
    * @param p input value
    * @param options function options
    * @returns quantile function value(s)
    */
  def apply(p: Double): Double | Data | Matrix = js.native
  def apply(p: Double, options: Options): Double | Data | Matrix = js.native
  def apply(p: Data): scala.scalajs.js.typedarray.Float64Array = js.native
  def apply(p: Data, options: Optionsdtypefloat32): scala.scalajs.js.typedarray.Float32Array = js.native
  def apply(p: Data, options: Optionsdtypefloat64): scala.scalajs.js.typedarray.Float64Array = js.native
  def apply(p: Data, options: Optionsdtypeint16): scala.scalajs.js.typedarray.Int16Array = js.native
  def apply(p: Data, options: Optionsdtypeint32): scala.scalajs.js.typedarray.Int32Array = js.native
  def apply(p: Data, options: Optionsdtypeint8): scala.scalajs.js.typedarray.Int8Array = js.native
  def apply(p: Data, options: Optionsdtypeuint16): scala.scalajs.js.typedarray.Uint16Array = js.native
  def apply(p: Data, options: Optionsdtypeuint32): scala.scalajs.js.typedarray.Uint32Array = js.native
  def apply(p: Data, options: Optionsdtypeuint8): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(p: Data, options: Optionsdtypeuint8clamped): scala.scalajs.js.typedarray.Uint8ClampedArray = js.native
  def apply(p: Data, options: Options): Double | Data | Matrix = js.native
  def apply(p: MatrixLike): Matrix = js.native
  def apply(p: MatrixLike, options: Options): Matrix = js.native
}

