package typingsJapgolly.jsqubits.mod

import typingsJapgolly.jsqubits.jsqubitsNumbers.`0.0000001`
import typingsJapgolly.jsqubits.mod.jsqubits.Complex
import typingsJapgolly.jsqubits.mod.jsqubits.QState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSQubitsStatic extends js.Object {
  var ALL: typingsJapgolly.jsqubits.jsqubitsStrings.ALL = js.native
  var Complex: ComplexStatic = js.native
  var Measurement: MeasurementStatic = js.native
  var ONE: Complex = js.native
  var QMath: JsqubitsmathStatic = js.native
  var QState: QStateStatic = js.native
  var StateWithAmplitude: StateWithAmplitudeStatic = js.native
  var ZERO: Complex = js.native
  var roundToZero: `0.0000001` = js.native
  def apply(bitString: String): QState = js.native
  def complex(real: Double, imaginary: Double): Complex = js.native
  def real(real: Double): Complex = js.native
}

