package typingsJapgolly.numeric

import typingsJapgolly.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHinv extends js.Object {
  var Hinv: Matrix
}

object AnonHinv {
  @scala.inline
  def apply(Hinv: Matrix): AnonHinv = {
    val __obj = js.Dynamic.literal(Hinv = Hinv.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHinv]
  }
}

