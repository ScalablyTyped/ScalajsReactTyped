package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.AnonQIsNum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var qContent: AnonQIsNum
}

object Variable {
  @scala.inline
  def apply(qContent: AnonQIsNum): Variable = {
    val __obj = js.Dynamic.literal(qContent = qContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Variable]
  }
}

