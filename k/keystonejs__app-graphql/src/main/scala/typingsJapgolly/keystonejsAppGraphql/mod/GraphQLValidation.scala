package typingsJapgolly.keystonejsAppGraphql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLValidation extends js.Object {
   // TODO: fetch the correct type in apollo server validations
  def definitionLimit(limit: Double): js.Any
  def depthLimit(limit: Double): js.Any
   // TODO: fetch the correct type in apollo server validations
  def fieldLimit(limit: Double): js.Any
}

object GraphQLValidation {
  @scala.inline
  def apply(
    definitionLimit: Double => CallbackTo[js.Any],
    depthLimit: Double => CallbackTo[js.Any],
    fieldLimit: Double => CallbackTo[js.Any]
  ): GraphQLValidation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definitionLimit")(js.Any.fromFunction1((t0: scala.Double) => definitionLimit(t0).runNow()))
    __obj.updateDynamic("depthLimit")(js.Any.fromFunction1((t0: scala.Double) => depthLimit(t0).runNow()))
    __obj.updateDynamic("fieldLimit")(js.Any.fromFunction1((t0: scala.Double) => fieldLimit(t0).runNow()))
    __obj.asInstanceOf[GraphQLValidation]
  }
}

