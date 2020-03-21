package typingsJapgolly.convertUnits.mod

import typingsJapgolly.convertUnits.AnonAbbr
import typingsJapgolly.convertUnits.AnonCutOffNumber
import typingsJapgolly.convertUnits.AnonMeasure
import typingsJapgolly.convertUnits.AnonPlural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Convert extends js.Object {
  def describe[T /* <: unit */](abbr: T): AnonMeasure[T] = js.native
  def from(from: unit): this.type = js.native
  def getUnit[T /* <: unit */](abbr: T): AnonAbbr[T] = js.native
  def list(): js.Array[unit] = js.native
  def list(measure: measure): js.Array[unit] = js.native
  def measures(): js.Array[measure] = js.native
  def possibilities(): js.Array[unit] = js.native
  def possibilities(measure: measure): js.Array[unit] = js.native
  /* private */ def throwUnsupportedUnitError(what: String): Unit = js.native
  def to(to: unit): Double = js.native
  def toBest(): AnonPlural = js.native
  def toBest(options: AnonCutOffNumber): AnonPlural = js.native
}

