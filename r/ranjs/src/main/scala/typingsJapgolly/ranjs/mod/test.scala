package typingsJapgolly.ranjs.mod

import typingsJapgolly.ranjs.AnonChi2
import typingsJapgolly.ranjs.AnonPassed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ranjs", "test")
@js.native
object test extends js.Object {
  def bartlett(dataSets: js.Array[js.Array[Double]], alpha: Double): AnonChi2 = js.native
  def mannWhitney(dataSets: js.Array[js.Array[Double]], alpha: Double): AnonPassed = js.native
}

