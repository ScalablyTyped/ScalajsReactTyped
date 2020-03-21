package typingsJapgolly.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "TemporalAmount")
@js.native
abstract class TemporalAmount () extends js.Object {
  def addTo[T /* <: Temporal */](temporal: T): T = js.native
  def get(unit: TemporalUnit): Double = js.native
  def subtractFrom[T /* <: Temporal */](temporal: T): T = js.native
  def units(): js.Array[TemporalUnit] = js.native
}

