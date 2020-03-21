package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpike extends js.Object {
  def pike_check_req(): Double
}

object Typeofpike {
  @scala.inline
  def apply(pike_check_req: CallbackTo[Double]): Typeofpike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pike_check_req")(pike_check_req.toJsFn)
    __obj.asInstanceOf[Typeofpike]
  }
}

