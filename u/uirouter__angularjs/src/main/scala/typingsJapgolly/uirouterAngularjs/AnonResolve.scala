package typingsJapgolly.uirouterAngularjs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResolve extends js.Object {
  def resolve(): js.Any
}

object AnonResolve {
  @scala.inline
  def apply(resolve: CallbackTo[js.Any]): AnonResolve = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(resolve.toJsFn)
    __obj.asInstanceOf[AnonResolve]
  }
}

