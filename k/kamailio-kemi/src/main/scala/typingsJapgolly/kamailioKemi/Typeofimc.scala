package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofimc extends js.Object {
  def imc_manager(): Double
}

object Typeofimc {
  @scala.inline
  def apply(imc_manager: CallbackTo[Double]): Typeofimc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imc_manager")(imc_manager.toJsFn)
    __obj.asInstanceOf[Typeofimc]
  }
}

