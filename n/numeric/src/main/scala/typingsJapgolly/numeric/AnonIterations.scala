package typingsJapgolly.numeric

import typingsJapgolly.numeric.mod.Scalar
import typingsJapgolly.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIterations extends js.Object {
  var iterations: Double
  var message: String
  var solution: Scalar | Vector
}

object AnonIterations {
  @scala.inline
  def apply(iterations: Double, message: String, solution: Scalar | Vector): AnonIterations = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIterations]
  }
}

