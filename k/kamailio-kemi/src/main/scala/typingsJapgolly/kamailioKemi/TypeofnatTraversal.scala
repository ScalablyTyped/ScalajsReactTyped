package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofnatTraversal extends js.Object {
  def client_nat_test(tests: Double): Double
  def fix_contact(): Double
  def nat_keepalive(): Double
}

object TypeofnatTraversal {
  @scala.inline
  def apply(
    client_nat_test: Double => CallbackTo[Double],
    fix_contact: CallbackTo[Double],
    nat_keepalive: CallbackTo[Double]
  ): TypeofnatTraversal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client_nat_test")(js.Any.fromFunction1((t0: scala.Double) => client_nat_test(t0).runNow()))
    __obj.updateDynamic("fix_contact")(fix_contact.toJsFn)
    __obj.updateDynamic("nat_keepalive")(nat_keepalive.toJsFn)
    __obj.asInstanceOf[TypeofnatTraversal]
  }
}

