package typingsJapgolly.onfleetNodeOnfleet.hubsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hub extends js.Object {
  def get(): js.Promise[js.Array[OnfleetHub]]
}

object Hub {
  @scala.inline
  def apply(get: CallbackTo[js.Promise[js.Array[OnfleetHub]]]): Hub = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.asInstanceOf[Hub]
  }
}

