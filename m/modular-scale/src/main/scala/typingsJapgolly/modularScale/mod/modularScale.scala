package typingsJapgolly.modularScale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait modularScale extends js.Object {
  def apply(step: Double): Double = js.native
  def apply(step: Double, relative: Boolean): Double = js.native
  def steps(steps: Double): js.Array[Double] = js.native
  def steps(steps: Double, relative: Boolean): js.Array[Double] = js.native
}

